/*
 * Copyright 2007-2008 Amazon Technologies, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */ 


package com.amazonaws.mturk.service.axis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.xml.sax.InputSource;

import com.amazon.mechanicalturk.common.domain.XslTransformer;
import com.amazonaws.mturk.addon.BatchItemCallback;
import com.amazonaws.mturk.addon.HITDataInput;
import com.amazonaws.mturk.addon.HITDataOutput;
import com.amazonaws.mturk.addon.HITDataReader;
import com.amazonaws.mturk.addon.HITDataWriter;
import com.amazonaws.mturk.addon.HITProperties;
import com.amazonaws.mturk.addon.HITQuestion;
import com.amazonaws.mturk.addon.HITResults;
import com.amazonaws.mturk.addon.HITTypeResults;
import com.amazonaws.mturk.addon.MTurkConstants;
import com.amazonaws.mturk.addon.QAPValidator;
import com.amazonaws.mturk.dataschema.ObjectFactory;
import com.amazonaws.mturk.dataschema.QuestionFormAnswers;
import com.amazonaws.mturk.dataschema.QuestionFormAnswersType;
import com.amazonaws.mturk.requester.Assignment;
import com.amazonaws.mturk.requester.AssignmentStatus;
import com.amazonaws.mturk.requester.EventType;
import com.amazonaws.mturk.requester.GetAccountBalanceResult;
import com.amazonaws.mturk.requester.GetAssignmentsForHITResult;
import com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty;
import com.amazonaws.mturk.requester.GetQualificationRequestsResult;
import com.amazonaws.mturk.requester.GetQualificationRequestsSortProperty;
import com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult;
import com.amazonaws.mturk.requester.GetReviewableHITsResult;
import com.amazonaws.mturk.requester.GetReviewableHITsSortProperty;
import com.amazonaws.mturk.requester.HIT;
import com.amazonaws.mturk.requester.NotificationSpecification;
import com.amazonaws.mturk.requester.NotificationTransport;
import com.amazonaws.mturk.requester.Qualification;
import com.amazonaws.mturk.requester.QualificationRequest;
import com.amazonaws.mturk.requester.QualificationStatus;
import com.amazonaws.mturk.requester.QualificationType;
import com.amazonaws.mturk.requester.QualificationTypeStatus;
import com.amazonaws.mturk.requester.ReviewableHITStatus;
import com.amazonaws.mturk.requester.SearchHITsResult;
import com.amazonaws.mturk.requester.SearchHITsSortProperty;
import com.amazonaws.mturk.requester.SearchQualificationTypesResult;
import com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty;
import com.amazonaws.mturk.requester.SortDirection;
import com.amazonaws.mturk.service.exception.ServiceException;
import com.amazonaws.mturk.service.exception.ValidationException;
import com.amazonaws.mturk.util.ClientConfig;
import com.amazonaws.mturk.util.FileUtil;
import com.amazonaws.mturk.util.VelocityUtil;

/**
 * The RequesterService class provides a set of simplified APIs and convenience methods.
 * It extends the RequesterServiceRaw class.
 */
public class RequesterService extends RequesterServiceRaw {

  //-------------------------------------------------------------
  // Constants
  //-------------------------------------------------------------

  public static final int DEFAULT_PAGE_NUM = 1;
  public static final int DEFAULT_PAGE_SIZE = 10;
  public static final SortDirection DEFAULT_SORT_DIRECTION = SortDirection.Ascending;
  public static final int LOAD_ALL = -1;
  private static final int MAX_BATCH = 500;     // maximum batch size for batch chunk

  public static final long DEFAULT_ASSIGNMENT_DURATION_IN_SECONDS = (long) 60 * 60; // 1 hour
  public static final long DEFAULT_AUTO_APPROVAL_DELAY_IN_SECONDS = (long) 60 * 60 * 24 * 15; // 15 days
  public static final long DEFAULT_LIFETIME_IN_SECONDS = (long) 60 * 60 * 24 * 3; // 3 days

  // QualificationTypeIds for System Qualifications
  public static final String ABANDONMENT_RATE_QUALIFICATION_TYPE_ID = "00000000000000000070";
  public static final String APPROVAL_RATE_QUALIFICATION_TYPE_ID = "000000000000000000L0";
  public static final String REJECTION_RATE_QUALIFICATION_TYPE_ID = "000000000000000000S0";
  public static final String RETURN_RATE_QUALIFICATION_TYPE_ID = "000000000000000000E0";
  public static final String SUBMISSION_RATE_QUALIFICATION_TYPE_ID = "00000000000000000000";
  public static final String LOCALE_QUALIFICATION_TYPE_ID = "00000000000000000071";

  private static final String DATASCHEMA_PACKAGE_PREFIX = "com.amazonaws.mturk.dataschema";

  private static final AssignmentStatus[] DEFAULT_ASSIGNMENT_STATUS = new AssignmentStatus[] { 
    AssignmentStatus.Approved, 
    AssignmentStatus.Rejected,
    AssignmentStatus.Submitted
  };

  private static final AssignmentStatus[] SUBMITTED_ASSIGNMENT_STATUS = new AssignmentStatus[] { 
    AssignmentStatus.Submitted
  };  

  private static final String[] DEFAULT_ASSIGNMENT_RESPONSE_GROUP = new String [] { 
    "Minimal", 
    "AssignmentFeedback" 
  };

  private static final String[] DEFAULT_HIT_RESPONSE_GROUP = new String [] { 
    "Minimal", 
    "HITDetail", 
    "HITQuestion", 
    "HITAssignmentSummary" 
  };

  //-------------------------------------------------------------
  // Variables - Private
  //-------------------------------------------------------------

  private static Logger log = Logger.getLogger(RequesterService.class);

  //-------------------------------------------------------------
  // Constructors
  //-------------------------------------------------------------
  @Deprecated
  public RequesterService() {
    super();
  }

  public RequesterService(ClientConfig config) {
    super(config);
  }


  //-------------------------------------------------------------
  // Methods - Public
  //-------------------------------------------------------------

  /**
   * Creates a HIT using default values for the HIT properties not given as parameters.
   * The request uses the default responseGroup of "Minimal".
   * 
   * @param title
   * @param description
   * @param reward
   * @param question
   * @param maxAssignments
   * @return The created HIT
   * @throws ServiceException
   */
  public HIT createHIT(String title, String description, double reward, String question, 
      int maxAssignments) throws ServiceException {
    return this.createHIT(
        title, 
        description, // description
        reward,
        question,
        maxAssignments,
        false
    );
  }

  /**
   * Creates a HIT using defaults for the HIT properties not given as parameters.
   * The request uses either the default or full responseGroup.
   * 
   * @param title
   * @param description
   * @param reward
   * @param question
   * @param maxAssignments
   * @param getFullResponse
   * @return The created HIT
   * @throws ServiceException
   */
  public HIT createHIT(String title, String description, double reward, String question, 
      int maxAssignments, boolean getFullResponse) throws ServiceException {

    // Include HIT detail, HIT Question, and Assignment summary in response
    String[] responseGroup = null;
    if (getFullResponse == true) {
      responseGroup = new String [] { "Minimal", "HITDetail", 
          "HITQuestion", "HITAssignmentSummary" };
    }

    return super.createHIT(
        null, // HITTypeId
        title, 
        description, // description
        null, // keywords 
        question, 
        reward,
        DEFAULT_ASSIGNMENT_DURATION_IN_SECONDS,
        DEFAULT_AUTO_APPROVAL_DELAY_IN_SECONDS,
        DEFAULT_LIFETIME_IN_SECONDS,
        maxAssignments,
        null, //requesterAnnotation
        null, // qualificationRequirements
        responseGroup
    );
  }

  /**
   * Updates a HIT using defaults for the HIT properties not given as parameters.
   * 
   * @param hitId
   * @param title - if null, the HIT's current title is used
   * @param description - if null, the HIT's current description is used
   * @param reward - if null, the HIT's current reward is used
   * @return The new HITType Id
   * @throws ServiceException
   */
  public String updateHIT(String hitId, String title, String description, String keywords,
      Double reward) throws ServiceException {
    if (title == null || description == null || keywords == null || reward == null) {
      HIT currentHIT = this.getHIT(hitId);
      if (title == null) {
        title = currentHIT.getTitle();
      }
      if (description == null) {
        description = currentHIT.getDescription();
      }
      if (keywords == null) {
        keywords = currentHIT.getKeywords();
      }
      if (reward == null) {
        reward = currentHIT.getReward().getAmount().doubleValue();
      }
    }
    String newHITTypeId = this.registerHITType(
        DEFAULT_AUTO_APPROVAL_DELAY_IN_SECONDS,
        DEFAULT_ASSIGNMENT_DURATION_IN_SECONDS,
        reward,
        title,
        keywords,
        description,
        null); // qualificationRequirements
    this.changeHITTypeOfHIT(hitId, newHITTypeId);
    return newHITTypeId;
  }

  /**
   * Updates HITs in bulk.
   * 
   * @param input
   * @param newHITTypeId
   * @return Array of hitIds that were successfully updated
   * @throws ServiceException
   */
  public String[] updateHITs(String[] hitIds, String newHITTypeId) throws ServiceException {
    List<String> successes = new ArrayList<String>(hitIds.length);
    
    // split work
    log.debug(String.format("Updating %d HITs with max memory %d", hitIds.length, Runtime.getRuntime().maxMemory()));
    AsyncReply[] replies = new AsyncReply[MAX_BATCH];
    int numBatches = hitIds.length / MAX_BATCH;
    for (int curBatch=0; curBatch<=numBatches; curBatch++) {
      int iStart = curBatch * MAX_BATCH;
      int iEnd = iStart + MAX_BATCH;
      if (iEnd > hitIds.length) {
        iEnd = hitIds.length;
      }
      
      log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd)); 
            
      // submit to work queue
      for (int i=iStart; i<iEnd; i++) {
        replies[i-iStart] = super.changeHITTypeOfHITAsync(hitIds[i], newHITTypeId, null);
      }

      // wait for results
      for (int i=iStart; i<iEnd; i++) {
        try {
          replies[i-iStart].getResult();
          successes.add(hitIds[i]);
        } catch (ServiceException e) {
          // don't add it to the success list
          log.error("Error updating HIT " + hitIds[i] + " to HIT type " + newHITTypeId + ": " + e.getLocalizedMessage());
        }
      }      
    }

    return successes.toArray(new String[successes.size()]);
  }

  public void deleteHITs(String[] hitIds, boolean approve, boolean expire, BatchItemCallback callback) {
    if (hitIds != null && hitIds.length > 0) {

      DeleteHITCommand[] commands = new DeleteHITCommand[MAX_BATCH];

      log.debug(String.format("Deleting %d HITs with max memory %d", hitIds.length, Runtime.getRuntime().maxMemory()));

      int successCount=0;
      int failureCount=0;
      int numBatches = hitIds.length / MAX_BATCH;

      for (int curBatch=0; curBatch<=numBatches; curBatch++) {
        int iStart = curBatch * MAX_BATCH;
        int iEnd = iStart + MAX_BATCH;
        if (iEnd > hitIds.length) {
          iEnd = hitIds.length;
        }

        log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd));

        for (int i=iStart; i<iEnd; i++) {
          commands[i-iStart] = new DeleteHITCommand(i+1, hitIds[i], approve, expire, this, callback);
          commands[i-iStart].execute();
        }

        // calculate results
        for (int i=iStart; i<iEnd; i++) {
          if (commands[i-iStart].hasSucceeded()) {
            successCount++;        
          }
          else {
            failureCount++;
          }          
        } 
      }
      
      if (callback == null) {
        log.info("Deleted "+successCount+" HITs. " + failureCount + " HITs failed to delete.");
      }
    }
  }

  public void extendHITs(String[] hitIds, Integer maxAssignmentsIncrement, Long expirationIncrementInSeconds,
      BatchItemCallback callback) 
  throws ServiceException { 

    if (hitIds == null || hitIds.length == 0) {
      return;
    }

    if (maxAssignmentsIncrement == null && expirationIncrementInSeconds==null) {
      throw new ServiceException("Neither maxAssignmentsIncrement nor expirationIncrementInSeconds are specified");
    }
    
    log.debug(String.format("Extending %d HITs with max memory %d", hitIds.length, Runtime.getRuntime().maxMemory()));

    AsyncReply[] replies = new AsyncReply[MAX_BATCH];
    int numBatches = hitIds.length / MAX_BATCH;
    for (int curBatch=0; curBatch<=numBatches; curBatch++) {
      int iStart = curBatch * MAX_BATCH;
      int iEnd = iStart + MAX_BATCH;
      if (iEnd > hitIds.length) {
        iEnd = hitIds.length;
      }

      log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd));
      
      // submit requests to work queue      
      for (int i=iStart; i<iEnd; i++) { 
        replies[i-iStart] = super.extendHITAsync(hitIds[i], maxAssignmentsIncrement, expirationIncrementInSeconds, null);
      }

      // wait for results
      for (int i=iStart; i<iEnd; i++) {
        try {
          Object result = replies[i-iStart].getResult();

          if (callback != null) {
            callback.processItemResult(hitIds[i], true, result, null);
          }
          else {
            log.info(String.format("[%s] Successfully extended HIT (%d/%d)", 
                hitIds[i], i, hitIds.length)); 
          }
        } catch (ServiceException e) {
          if (callback != null) {
            callback.processItemResult(hitIds[i], false, null, e);
          }
          else {
            log.error(String.format("[%s] Failed to extend HIT (%d/%d): %s", 
                hitIds[i], i, hitIds.length, e.getLocalizedMessage()));
          }
        }
      }      
    }
  }

  /***
   * Approves all assignments using the Axis worker thread pool.
   * 
   * @param assignmentIds       Array of assignments to approve
   * @param requesterFeedback   Feedback (comments) for the assignments
   * @param defaultFeedback     Default feedback used when no requesterFeedback is specified for an assignment ID
   * @param callback            Callback function for item results processing
   * @throws ServiceException
   */
  public void approveAssignments(String[] assignmentIds, String[] requesterFeedback, String defaultFeedback,
      BatchItemCallback callback) 
  throws ServiceException { 

    if (assignmentIds == null || assignmentIds.length == 0) {
      return;
    }

    if (requesterFeedback != null && requesterFeedback.length != assignmentIds.length) {
      throw new ServiceException("Number of assignments to approve must match number of approval comments (requester feedback)");
    }

    // preprocess feedback comments    
    if (requesterFeedback == null) {
      requesterFeedback = new String[assignmentIds.length];
    }

    if (defaultFeedback != null) {
      for (int i=0; i<assignmentIds.length; i++) {
        if (requesterFeedback[i]==null) {
          requesterFeedback[i] = defaultFeedback;
        }
      }    
    }
    
    log.debug(String.format("Approving %d assignments with max memory %d", assignmentIds.length, Runtime.getRuntime().maxMemory()));

    AsyncReply[] replies = new AsyncReply[MAX_BATCH];
    int numBatches = assignmentIds.length / MAX_BATCH;
    for (int curBatch=0; curBatch<=numBatches; curBatch++) {
      int iStart = curBatch * MAX_BATCH;
      int iEnd = iStart + MAX_BATCH;
      if (iEnd > assignmentIds.length) {
        iEnd = assignmentIds.length;
      }

      log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd));
      
      // submit requests to work queue
      for (int i=iStart; i<iEnd; i++) {    
        replies[i-iStart] = super.approveAssignmentAsync(assignmentIds[i], requesterFeedback[i], null);
      }

      // wait for results
      for (int i=iStart; i<iEnd; i++) {
        try {
          Object result = replies[i-iStart].getResult();

          if (callback != null) {
            callback.processItemResult(assignmentIds[i], true, result, null);
          }
          else {
            log.info("[" + assignmentIds[i] + "] Assignment successfully approved " + 
                (requesterFeedback[i] != null && requesterFeedback[i].length() > 0 ? " with comment (" + requesterFeedback[i] + ")" : ""));
          }
        } catch (ServiceException e) {
          if (callback != null) {
            callback.processItemResult(assignmentIds[i], false, null, e);
          }
          else {
            log.error("Error approving assignment " + assignmentIds[i] + 
                (requesterFeedback[i] != null && requesterFeedback[i].length() > 0 ? " with comment (" + requesterFeedback[i] + ")" : "") +
                ": " + e.getLocalizedMessage());
          }
        }
      }
    }
  }   

  /**
   * Retrieves a HIT by HIT Id. The request uses full responseGroup.
   * 
   * @param hitId
   * @return A HIT object
   * @throws ServiceException
   */
  public HIT getHIT(String hitId) throws ServiceException {

    // Include HIT detail, HIT Question, and Assignment summary in response
    return super.getHIT(hitId, DEFAULT_HIT_RESPONSE_GROUP);
  }

  /**
   * Creates a Qualification Type using default values for the Qualification Type properties 
   * not given as parameters.
   * 
   * @param name
   * @param keywords
   * @param description
   * @return The created QualificationType
   * @throws ServiceException
   */
  public QualificationType createQualificationType(String name, String keywords, String description) throws ServiceException {
    return super.createQualificationType(name, keywords, description,
        QualificationTypeStatus.Active,
        (long) 0, // retryDelayInSeconds
        null,
        null,
        null, // testDurationInSeconds
        null, // autoGranted
        null // autoGrantedValue
    );
  }

  /**
   * Creates a Qualification Type with no test using default values for the Qualification Type 
   * properties not given as parameters.
   * 
   * @param qualificationTypeId
   * @param description
   * @param status
   * @return The updated QualificationType
   * @throws ServiceException
   */
  public QualificationType updateQualificationType(String qualificationTypeId, String description, 
      QualificationTypeStatus status) throws ServiceException {

    return super.updateQualificationType(qualificationTypeId, description, status, 
        null, // test 
        null, // answerKey 
        (Long) null, // testDurationInSeconds 
        (Long) null, // retryDelayInSeconds 
        (Boolean) null, // autoGranted 
        (Integer) null // autoGrantedValue
    );
  }

  /**
   * Retrieves workers' Qualifications found on the requested page for the given 
   * Qualification Type.  The request uses the default responseGroup of "Minimal".
   * 
   * @param qualificationTypeId
   * @param pageNum
   * @return An array of Qualifications
   * @throws ServiceException
   * @deprecated
   */
  public Qualification[] getQualicationsForQualificationType(String qualificationTypeId, int pageNum) throws ServiceException {
    GetQualificationsForQualificationTypeResult result = 
      super.getQualificationsForQualificationType(qualificationTypeId,
          QualificationStatus.Granted,
          pageNum,
          DEFAULT_PAGE_SIZE);

    return result.getQualification();
  }

  /**
   * Retrieves workers' Qualifications found on the requested page for the given 
   * Qualification Type.  The request uses the default responseGroup of "Minimal".
   * 
   * @param qualificationTypeId
   * @param pageNum
   * @return An array of Qualifications
   * @throws ServiceException
   */
  public Qualification[] getQualificationsForQualificationType(String qualificationTypeId, int pageNum) throws ServiceException {
    GetQualificationsForQualificationTypeResult result = 
      super.getQualificationsForQualificationType(qualificationTypeId,
          QualificationStatus.Granted,
          pageNum,
          DEFAULT_PAGE_SIZE);

    return result.getQualification();
  }  

  public Qualification[] getAllQualificationsForQualificationType(String qualificationTypeId) throws Exception {
    List<Qualification> results = new ArrayList<Qualification>();

    int pageNum = 1;

    do {     
      Qualification[] qualifications = 
        this.getQualificationsForQualificationType(qualificationTypeId, pageNum);

      if (qualifications != null) {
        // Add the results
        Collections.addAll(results, qualifications);
      } 

      if (qualifications == null || qualifications.length < DEFAULT_PAGE_SIZE) {
        // Check if we're on the last page or not
        break;
      }

    } while (true);

    return (Qualification[]) results.toArray(new Qualification[results.size()]);   
  }

  /**
   * Retrieves workers' QualificationRequests found on the first page for the given 
   * Qualification Type.  The results are sorted by SubmitTime.
   * 
   * @param qualificationTypeId
   * @return An array of QualificationRequests
   * @throws ServiceException
   */
  public QualificationRequest[] getQualificationRequests(String qualificationTypeId) 
  throws ServiceException {

    GetQualificationRequestsResult result = super.getQualificationRequests(qualificationTypeId, 
        DEFAULT_SORT_DIRECTION, 
        GetQualificationRequestsSortProperty.SubmitTime,
        DEFAULT_PAGE_NUM, 
        DEFAULT_PAGE_SIZE);

    return result.getQualificationRequest();
  }

  /**
   * Retrieves all QualificationRequests for the given 
   * Qualification Type.  The results are sorted by SubmitTime.
   * 
   * @param qualificationTypeId
   * @return An array of QualificationRequests
   * @throws ServiceException
   */
  public QualificationRequest[] getAllQualificationRequests(String qualificationTypeId) throws ServiceException {
    List<QualificationRequest> results = new ArrayList<QualificationRequest>();

    int pageNum = 1;
    QualificationRequest[] thisPage = null;

    do {
      GetQualificationRequestsResult result = super.getQualificationRequests(qualificationTypeId, 
          DEFAULT_SORT_DIRECTION, 
          GetQualificationRequestsSortProperty.SubmitTime,
          pageNum, 
          DEFAULT_PAGE_SIZE);

      if(result == null) {
        break;
      }

      thisPage = result.getQualificationRequest();

      if(thisPage != null && thisPage.length > 0) {
        Collections.addAll(results,thisPage);
      }
      pageNum++;
    } while (thisPage != null && thisPage.length >= DEFAULT_PAGE_SIZE);

    return (QualificationRequest[]) results.toArray(new QualificationRequest[results.size()]);
  }

  /**
   * Retrieves workers' Assignments found on the requested page for the given HIT.  
   * The request uses the default responseGroup of "Minimal".
   * 
   * @param hitId
   * @param pageNum
   * @return An array of Assignments
   * @throws ServiceException
   */
  public Assignment[] getAssignmentsForHIT(String hitId, int pageNum) throws ServiceException {
    return this.getAssignmentsForHIT(hitId, pageNum, false);

  }

  /**
   * Retrieves workers' Assignments found on the first page for the given HIT.  
   * The results are sorted by SubmitTime.  The request uses either the default 
   * or full responseGroup.
   * 
   * @param hitId
   * @param pageNum
   * @param getFullResponse
   * @return An array of Assignments
   * @throws ServiceException
   */
  public Assignment[] getAssignmentsForHIT(String hitId, int pageNum, boolean getFullResponse) 
  throws ServiceException {

    // Include AssignmentFeedback in response
    String[] responseGroup = null;
    if (getFullResponse == true) {
      responseGroup = DEFAULT_ASSIGNMENT_RESPONSE_GROUP;
    }

    GetAssignmentsForHITResult result = super.getAssignmentsForHIT(hitId,
        DEFAULT_SORT_DIRECTION, 
        DEFAULT_ASSIGNMENT_STATUS,
        GetAssignmentsForHITSortProperty.SubmitTime,
        pageNum, DEFAULT_PAGE_SIZE, responseGroup
    );

    return result.getAssignment(); 
  }

  /**
   * Retrieves requester's available balance.  
   * 
   * @return requester's available balance
   * @throws ServiceException
   */
  public double getAccountBalance() throws ServiceException {
    String defaultUnused = null;
    GetAccountBalanceResult result = super.getAccountBalance(defaultUnused);

    return result.getAvailableBalance().getAmount().doubleValue();
  }

  /**
   * Retrieves requester's reviewable HITs found on the requested page for the given HIT Type.
   * 
   * @param hitId
   * @param pageNum
   * @return An array of Reviewable HITs
   * @throws ServiceException
   */
  public HIT[] getReviewableHITs(String hitTypeId, int pageNum) throws ServiceException {
    ReviewableHITStatus defaultStatus = ReviewableHITStatus.Reviewable;

    GetReviewableHITsResult result = super.getReviewableHITs(
        hitTypeId,
        defaultStatus,
        DEFAULT_SORT_DIRECTION, 
        GetReviewableHITsSortProperty.CreationTime,
        pageNum, 
        DEFAULT_PAGE_SIZE
    );

    return result.getHIT(); 
  }

  /**
   * Retrieves any HITs found on the requested page.  
   * The request uses the default responseGroup of "Minimal".
   * 
   * @param pageNum
   * @return An array of HITs
   * @throws ServiceException
   */
  public HIT[] searchHITs(int pageNum) throws ServiceException {
    return this.searchHITs(pageNum, false);
  }

  /**
   * Retrieves requester's reviewable HITs found on the requested page for the given HIT Type.  
   * The request uses either the default or full responseGroup.
   * 
   * @param pageNum
   * @param getFullResponse
   * @return An array of HITs
   * @throws ServiceException
   */
  public HIT[] searchHITs(int pageNum, boolean getFullResponse) throws ServiceException {

    // Include HIT detail, HIT Question, and Assignment summary in response
    String[] responseGroup = null;
    if (getFullResponse == true) {
      responseGroup = new String [] { "Minimal", "HITDetail", 
          "HITQuestion", "HITAssignmentSummary" };
    }

    SearchHITsResult result = super.searchHITs(
        DEFAULT_SORT_DIRECTION, SearchHITsSortProperty.Expiration,
        pageNum, DEFAULT_PAGE_SIZE, responseGroup
    );

    return result.getHIT(); 
  }

  /**
   * Retrieves any Qualification Types found on the requested page.
   * 
   * @param pageNum
   * @return An array of QualificationTypes
   * @throws ServiceException
   */
  public QualificationType[] searchQualificationTypes(int pageNum) throws ServiceException {

    SearchQualificationTypesResult result = super.searchQualificationTypes(
        null, // Query
        false, // mustBeRequestable
        true, // mustBeOwnedByCaller
        DEFAULT_SORT_DIRECTION,
        SearchQualificationTypesSortProperty.Name,
        pageNum, 
        DEFAULT_PAGE_SIZE);

    return result.getQualificationType(); 
  }

  //-------------------------------------------------------------
  // Implementation - Convenience API
  //-------------------------------------------------------------

  /**
   * Sets the status of the given HIT as Reviewable.
   * 
   * @param hitId
   * @throws ServiceException
   */
  public void setHITAsReviewable(String hitId) throws ServiceException {
    super.setHITAsReviewing(hitId, 
        true // revert
    );
  }  

  /**
   * Sets the status of the given HIT as Reviewing.
   * 
   * @param hitId
   * @throws ServiceException
   */
  public void setHITAsReviewing(String hitId) throws ServiceException {
    super.setHITAsReviewing(hitId, 
        false // revert
    );
  }   

  /**
   * Retrieves all active HITs in the system.  
   * The request uses the full responseGroup.
   * 
   * @return An array of HITs
   * @throws ServiceException
   */
  public HIT[] searchAllHITs() throws ServiceException {
    List<HIT> results = new ArrayList<HIT>();

    int numHITsInAccount = this.getTotalNumHITsInAccount();

    double numHITsInAccountDouble = new Double(numHITsInAccount);
    double pageSizeDouble = new Double(DEFAULT_PAGE_SIZE);
    double numPagesDouble = Math.ceil(numHITsInAccountDouble / pageSizeDouble);

    int numPages = (new Double(numPagesDouble)).intValue();

    for (int i = 1; i <= numPages; i = i + 1)
    {
      HIT[] hits = this.searchHITs(i, true);
      Collections.addAll(results, hits);
    }

    return (HIT[]) results.toArray(new HIT[results.size()]);	
  }

  /**
   * Retrieves all active Qualifications in the system.
   * 
   * @return An array of QualificationTypes
   * @throws ServiceException
   */
  public QualificationType[] getAllQualificationTypes() throws ServiceException {
    List<QualificationType> results = new ArrayList<QualificationType>();
    int pageNum = 1;

    do {
      QualificationType[] qt = this.searchQualificationTypes(pageNum);

      if (qt != null) {
        // Add the results
        Collections.addAll(results, qt);
      }

      // Check if we're on the last page or not
      if (qt == null || qt.length < DEFAULT_PAGE_SIZE)
        break;

      pageNum++;

    } while (true);

    return (QualificationType[]) results.toArray(new QualificationType[results.size()]);		
  }

  /**
   * Retrieves all of requester's reviewable HITs of the given HIT Type.
   * 
   * @param hitTypeId
   * @return An array of Reviewable HITs
   * @throws ServiceException
   */
  public HIT[] getAllReviewableHITs(String hitTypeId) throws ServiceException {
    List<HIT> results = new ArrayList<HIT>();
    int pageNum = 1;

    do {
      HIT[] hit = this.getReviewableHITs(hitTypeId, pageNum);

      if (hit != null) {
        // Add the results
        Collections.addAll(results, hit);
      }

      // Check if we're on the last page or not
      if (hit == null || hit.length < DEFAULT_PAGE_SIZE)
        break;

      pageNum++;

    } while (true);

    return (HIT[]) results.toArray(new HIT[results.size()]);
  }

  /**
   * Retrieves all of requester's assignments for the given HIT.
   * 
   * @param hitId
   * @return An array of Assignments
   * @throws ServiceException
   */
  public Assignment[] getAllAssignmentsForHIT(String hitId) throws ServiceException {   
    return getAllAssignmentsForHIT(hitId, DEFAULT_ASSIGNMENT_STATUS);
  }

  /**
   * Retrieves all of requester's assignments for the given HIT for which rewiewable work is submitted.
   * 
   * @param hitId
   * @return An array of Assignments
   * @throws ServiceException
   */
  public Assignment[] getAllSubmittedAssignmentsForHIT(String hitId) throws ServiceException {   
    return getAllAssignmentsForHIT(hitId, SUBMITTED_ASSIGNMENT_STATUS);
  }  

  /**
   * Retrieves all of requester's assignments for the given HIT that are in a certain status
   * 
   * @param hitId
   * @return An array of Assignments
   * @throws ServiceException
   */
  public Assignment[] getAllAssignmentsForHIT(String hitId, AssignmentStatus[] status) throws ServiceException {	  

    List<Assignment> results = new ArrayList<Assignment>();
    int pageNum = 1;

    do {
      GetAssignmentsForHITResult result = super.getAssignmentsForHIT(hitId,
          DEFAULT_SORT_DIRECTION, 
          status,
          GetAssignmentsForHITSortProperty.SubmitTime,
          pageNum, DEFAULT_PAGE_SIZE, DEFAULT_ASSIGNMENT_RESPONSE_GROUP
      );
      Assignment[] assignment = result.getAssignment();

      if (assignment != null) {
        // Add the results
        Collections.addAll(results, assignment);
      }

      // Check if we're on the last page or not
      if (assignment == null || assignment.length < DEFAULT_PAGE_SIZE)
        break;

      pageNum++;

    } while (true);

    return (Assignment[]) results.toArray(new Assignment[results.size()]);    
  }

  /**
   * Creates a single checkbox Qualification Type.  The QualificationTest simply asks the worker
   * to check off the box to receive a Qualification immediately.
   * 
   * @param name
   * @param description
   * @param keywords
   * @return The created QualificationType
   * @throws ServiceException
   */
  public QualificationType createSingleCheckboxQualificationType(String name, String description, 
      String keywords) throws ServiceException {

    return super.createQualificationType(name, keywords, description, 
        QualificationTypeStatus.Active, 
        (long) 0, // retryDelayInSeconds
        getBasicCheckboxQualificationTest(name), 
        getBasicCheckboxQualificationAnswerKey(),
        (long) 60 * 60, // testDurationInSeconds 
        null,
        null // autoGrantedValue
    );
  }

  /**
   * Disposes the given Qualification Type.  The Qualification Type becomes inactive.
   * 
   * @param qualificationTypeId
   * @return The modified QualificationType
   * @throws ServiceException
   */
  public QualificationType disposeQualificationType(String qualificationTypeId) {

    return this.updateQualificationType(qualificationTypeId, 
        null, // don't change description 
        QualificationTypeStatus.Inactive 
    ); 
  }

  /**
   * Retrieves the total number of active HITs for the requester.
   * 
   * @return The total number of active HITs for the requester
   * @throws ServiceException
   */
  public int getTotalNumHITsInAccount() throws ServiceException {
    SearchHITsSortProperty defaultSortProperty = 
      SearchHITsSortProperty.Expiration;

    SearchHITsResult result = super.searchHITs(
        DEFAULT_SORT_DIRECTION, 
        defaultSortProperty,
        1, // pageNum 
        DEFAULT_PAGE_SIZE, null // responseGroup
    );

    return (result==null) ? 0 : result.getTotalNumResults();
  }	

  /**
   * Sets up an email notification setting for the given HIT Type.
   * 
   * @see http://docs.amazonwebservices.com/AWSMechanicalTurkRequester/2006-10-31/ApiReference_NotificationDataStructureArticle.html
   * @param hitTypeId
   * @param emailAddress
   * @param event
   * @throws ServiceException
   */
  public void sendTestEmailEventNotification(String hitTypeId, String emailAddress, EventType event) {
    NotificationSpecification ns = new NotificationSpecification();
    ns.setDestination(emailAddress);
    ns.setTransport(NotificationTransport.Email);
    ns.setVersion(RequesterServiceRaw.NOTIFICATION_VERSION);
    ns.setEventType(new EventType[] { event });
    super.setHITTypeNotification(hitTypeId, ns, true);  
  }

  /**
   * Extracts the QuestionFormAnswers object from the given answer XML.
   * 
   * @see http://docs.amazonwebservices.com/AWSMechanicalTurkRequester/2006-10-31/ApiReference_QuestionFormAnswersDataStructureArticle.html
   * @param answerXML
   * @return A QuestionFormAnswers object that contains the answers
   * @throws ServiceException
   */
  public static QuestionFormAnswers parseAnswers(String answerXML) {
    try {
      JAXBContext jc = JAXBContext.newInstance(RequesterService.DATASCHEMA_PACKAGE_PREFIX, 
          ObjectFactory.class.getClassLoader());
      Unmarshaller u = jc.createUnmarshaller();

      QuestionFormAnswers qfa = (QuestionFormAnswers) 
      u.unmarshal(new InputSource(new StringReader(answerXML)));

      return qfa;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static String getAnswerValue(String assignmentId, QuestionFormAnswersType.AnswerType answer) {
    return getAnswerValue(assignmentId, answer, false);
  }

  /**
   * Extracts the answer values from the given AnswerType object.  When the answer type is
   * Selections, returns the selections separated by the pipe character.  When the answer
   * type is UploadedFileKey, returns the S3 file key followed by the file's size in bytes.
   * 
   * @param assignmentId If null, the upload URL might be invalid 
   * @param answer
   * @param includeQuestionId Prepend the answer with the associated QuestionIdentifier and a tab
   * @return A String representation of the answer
   * @throws ServiceException
   */
  public static String getAnswerValue(String assignmentId, QuestionFormAnswersType.AnswerType answer, boolean includeQuestionId) {

    String result = includeQuestionId ? result = answer.getQuestionIdentifier() + "\t" : "";
    String val = "";

    if (answer.getFreeText() != null) {
      val = answer.getFreeText();
    } 
    else if (answer.getOtherSelectionText() != null) {
      val = answer.getOtherSelectionText();
    } 
    else if (answer.getSelectionIdentifier() != null
        && answer.getUploadedFileKey() == null) {

      Iterator iter = answer.getSelectionIdentifier().iterator();
      while (iter.hasNext()) {
        val += iter.next() + HITResults.MULTI_ANSWER_DELIMITER;
      }

      if (val.length() > 0) {
        val = val.substring(0, val.length() - 1);
      }
    } 
    else {

      try {     
        String url = "http://requester.mturk.com/mturk/downloadAnswer?assignmentId=" 
          + assignmentId + "&questionId=" + URLEncoder.encode(answer.getQuestionIdentifier(), "UTF-8");
        result += url;

      } catch (UnsupportedEncodingException e) {
        result += answer.getUploadedFileKey() + HITResults.MULTI_ANSWER_DELIMITER + answer.getUploadedFileSizeInBytes();

      }
    }

    if (val.length()==0) { 
      result += HITResults.EMPTY_ANSWER;   // Feature 1816806 (missing columns when value is NULL)
    }
    else {
      result += val;
    }

    return result;
  }

  @Deprecated
  public HIT[] createHITs(HITDataReader input, HITProperties props, HITQuestion question) {
    return createHITs( input, props, question, RequesterService.LOAD_ALL );
  }

  /**
   * Creates HITs in bulk.
   * 
   * @param input
   * @param properties
   * @param question
   * @param success
   * @param failure
   * @return An array of HIT objects
   * @throws ServiceException
   */
  public HIT[] createHITs(HITDataInput input, HITProperties props, HITQuestion question,
      HITDataOutput success, HITDataOutput failure) throws Exception {
    return createHITs(input, props, question, RequesterService.LOAD_ALL, success, failure);
  }

  @Deprecated
  public HIT[] createHITs(HITDataReader input, HITProperties props, HITQuestion question, int numHITToLoad) {
    String prefix = input.getFileName();
    if ( prefix == null || prefix.length() == 0 ) {
      prefix = "input";
    }

    HITDataOutput success = null;
    HITDataOutput failure = null;
    try {
      success = new HITDataWriter(prefix + ".success");
      failure = new HITDataWriter(prefix + ".failure");
      return createHITs(input,props,question,numHITToLoad,success,failure);
    }
    catch (Exception e) {
      log.error("Error loading HITs", e);
    }
    finally {
        if (success != null) {
            success.close();
        }
        if (failure != null) {
            failure.close();
        }
    }
    return null;
  }

  /**
   * Creates HITs in bulk.
   * 
   * @param input
   * @param properties
   * @param question
   * @param numHITsToLoad
   * @param success
   * @param failure
   * @return An array of HIT objects
   * @throws ServiceException
   */
  public HIT[] createHITs(HITDataInput input, HITProperties props, HITQuestion question, int numHITToLoad,
      HITDataOutput success, HITDataOutput failure) throws Exception {     
    // Create HITs
    List<HIT> hits = new ArrayList<HIT>();

    String[] fieldHeaders = new String[] { 
        HITProperties.HITField.HitId.getFieldName(), 
        HITProperties.HITField.HitTypeId.getFieldName()
    };

    boolean hasFailures = false;
    if( success != null ) {
      success.setFieldNames( fieldHeaders );
    }
    
    int numRecords;
    if (numHITToLoad != RequesterService.LOAD_ALL) {
      numRecords = Math.min(numHITToLoad, input.getNumRows()-1);
    }
    else {
      numRecords = input.getNumRows() - 1;
    }

    // submit hits to work pool
    AsyncReply[] replies = new AsyncReply[MAX_BATCH];

    // Map of HIT types created
    String hitTypeForBatch = null;
    HIT hit = null;

    // split work
    log.debug(String.format("Creating %d HITs with max memory %d", numRecords, Runtime.getRuntime().maxMemory()));

    int numBatches = numRecords / MAX_BATCH;
    for (int curBatch=0; curBatch<=numBatches; curBatch++) {
      int iStart = curBatch * MAX_BATCH;
      int iEnd = iStart + MAX_BATCH;
      if (iEnd > numRecords) {
        iEnd = numRecords;
      }

      log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd)); 

      for (int i = iStart; i < iEnd; i++) {
        // Merge the input with the question
        // Start from the second line since the first line contains the field names
        Map<String, String> inputMap = input.getRowAsMap(i + 1);   

        // Merge the input with the properties
        props.setInputMap(inputMap);

        // we need to make sure to not create multiple hittypes for matching HITs
        // due to multithreaded calls being processed at the same time
        if (hitTypeForBatch == null) {
          hitTypeForBatch = super.registerHITType(
              props.getAutoApprovalDelay(), 
              props.getAssignmentDuration(), 
              props.getRewardAmount(), 
              props.getTitle(), 
              props.getKeywords(), 
              props.getDescription(), 
              props.getQualificationRequirements());
        }

        replies[i-iStart] = super.createHITAsync(
            hitTypeForBatch,    
            null,       // title
            null,       // description
            null,       // keywords
            question.getQuestion(inputMap), 
            null,       // reward
            null,       // assignmentDurationInSeconds
            null,       // autoApprovalDelayInSeconds
            props.getLifetime(), 
            props.getMaxAssignments(), 
            props.getAnnotation(), 
            null,       // qualification requirements 
            null,       // response group
            null);      // async callback   
      }

      // wait for thread pool to finish processing these requests and evaluate results        
      for (int i = iStart; i < iEnd; i++) {
        try {
          hit = ((HIT[])replies[i-iStart].getResult())[0];         
          hits.add(hit);

          log.info("Created HIT " + (i + 1) + ": HITId=" + hit.getHITId());

          if( success != null ) {
            // Print to the success file
            HashMap<String,String> good = new HashMap<String,String>();
            good.put( fieldHeaders[0], hit.getHITId() );
            good.put( fieldHeaders[1], hit.getHITTypeId() );
            success.writeValues(good);
          }
        }
        catch (Exception e) {         
          // Validate the question
          Map<String,String> row = input.getRowAsMap(i+1);
          try {
            Map<String, String> inputMap = input.getRowAsMap(i + 1);
            QAPValidator.validate(question.getQuestion(inputMap));
            // If it passed validation, then log the exception e
            log.error("[ERROR] Error creating HIT " + (i+1) 
                + " (" + input.getRowValues(i+1)[0] + "): " + e.getLocalizedMessage());         
          }
          catch (ValidationException ve) {
            // Otherwise, log the validation exception in place of the service exception
            log.error("[ERROR] Error creating HIT " + (i+1) 
                + " (" + input.getRowValues(i+1)[0] + "): " + ve.getLocalizedMessage());
          }

          if( failure != null ) {
            // Create the failure file
            if (!hasFailures) {              
              hasFailures = true;
              failure.setFieldNames( input.getFieldNames() );
            }

            // Print to the failure file
            failure.writeValues(row);
          }
        }         
      }

    }

    if (hit != null && log.isInfoEnabled()) {
      // Print the URL at which the new HIT can be viewed at the end as well
      // so the user doesn't have to "scroll" up in case lots of HITs have been loaded
      log.info(System.getProperty("line.separator") + "You may see your HIT(s) with HITTypeId '" + hit.getHITTypeId() + "' here: ");
      log.info(System.getProperty("line.separator") + "  " + getWebsiteURL() 
          + "/mturk/preview?groupId=" + hit.getHITTypeId() + System.getProperty("line.separator"));
    }
      
    return (HIT[])hits.toArray(new HIT[hits.size()]);      
  }

  /**
   * Get the results for a HIT Type.
   * 
   * @param successget
   * @return A HITTypeResults object
   * @throws ServiceException
   */
  public HITTypeResults getHITTypeResults(HITDataInput success) {
    HITTypeResults r = null;
    try {
      r = this.getHITTypeResults(success, null);
    } catch (IOException e) {
      // There shouldn't be any IO exception here
      log.error("IOException thrown.  Did the HIT results get printed somehow?");
    }
    return r;
  }

  public void getResults(HITDataInput success, BatchItemCallback callback) {

    if (callback == null) {
      throw new IllegalArgumentException("callback may not be null");
    }

    int numRows = success.getNumRows();
    
    String[] rowValues;
    HIT hit=null;
    String hitId;

    Assignment[] assignments = null;
    AsyncReply[] hitReplies = new AsyncReply[MAX_BATCH];
    AssignmentsLoader[] assignmentLoaders = new AssignmentsLoader[MAX_BATCH];

    // split work
    log.debug(String.format("Retrieving results for %d HITs with max memory %d", 
        numRows - 1,  // take off the header row
        Runtime.getRuntime().maxMemory()));

    int numBatches = numRows / MAX_BATCH;
    for (int curBatch=0; curBatch<=numBatches; curBatch++) {
      int iStart = curBatch * MAX_BATCH;
      int iEnd = iStart + MAX_BATCH;
      if (iEnd > numRows) {
        iEnd = numRows;
      }      

      log.debug(String.format("Processing batch %d (%d to %d)", curBatch, iStart, iEnd));

      // load hits and (first) results in worker queue
      for (int i=iStart; i<iEnd; i++) {
        rowValues = success.getRowValues(i);
        hitId = rowValues[MTurkConstants.HIT_ID_FIELD_IND];
        
        // Skip header lines
        if ( hitId.equalsIgnoreCase(MTurkConstants.HIT_ID_HEADER) )
          continue;

        hitReplies[i-iStart] = super.getHITAsync(hitId, DEFAULT_HIT_RESPONSE_GROUP, null);
        
        AssignmentsLoader loader = new AssignmentsLoader(this, 
            hitId, 
            SortDirection.Ascending,
            DEFAULT_ASSIGNMENT_STATUS,
            GetAssignmentsForHITSortProperty.SubmitTime,
            DEFAULT_ASSIGNMENT_RESPONSE_GROUP,
            DEFAULT_PAGE_SIZE);      
        
        assignmentLoaders[i-iStart] = loader;
      
        // start loading the assignments for the HIT
        loader.start();
      }

      // process the results
      for (int i=iStart; i<iEnd; i++) {
        rowValues = success.getRowValues(i);
        hitId = rowValues[MTurkConstants.HIT_ID_FIELD_IND];

        // Skip header lines
        if ( hitId.equalsIgnoreCase(MTurkConstants.HIT_ID_HEADER) ) {
          continue;
        }

        try {
          hit = ((HIT[])hitReplies[i-iStart].getResult())[0];
          AssignmentsLoader loader = (AssignmentsLoader)assignmentLoaders[i-iStart];
          assignments = loader.getResults();
          callback.processItemResult(hitId, true, new HITResults(hit, assignments, this.config), null);
        }
        catch (Exception e) {
          callback.processItemResult(hitId, false, null, e);
        }
      }          
    }
  }

  /**
   * Get the results for a HIT Type and print each HIT results to a file.
   * 
   * @param success
   * @param outputFile
   * @return A HITTypeResults object
   * @throws IOException 
   * @throws ServiceException
   * @deprecated
   */
  public HITTypeResults getHITTypeResults(HITDataInput success, HITDataOutput output) throws IOException {
    int numRows = success.getNumRows();
    String[] rowValues;
    String hitId;

    ArrayList<HITResults> hitResultsArray = new ArrayList<HITResults>(numRows); 
    Assignment[] assignments = null;
    HITResults r = null;
    HITTypeResults hitTypeResults = new HITTypeResults();

    if (output != null) {
      // Print headers
      log.debug("Print each HIT results as it's retrieved");
      hitTypeResults.setHITDataOutput(output);
      hitTypeResults.writeResultsHeader();
    } else {
      log.debug("Retrieve all HIT results and return them as HITTypeResults");
    }

    // load hits and (first) results in worker queue
    AsyncReply[] hitReplies = new AsyncReply[numRows];
    AsyncReply[] assignmentReplies = new AsyncReply[numRows];
    for (int i=0; i<numRows; i++) {
      rowValues = success.getRowValues(i);
      hitId = rowValues[MTurkConstants.HIT_ID_FIELD_IND];

      // Skip header lines
      if ( hitId.equalsIgnoreCase(MTurkConstants.HIT_ID_HEADER) )
        continue;

      hitReplies[i] = super.getHITAsync(hitId, DEFAULT_HIT_RESPONSE_GROUP, null);
      assignmentReplies[i] = super.getAssignmentsForHITAsync(hitId, 
          SortDirection.Ascending,
          DEFAULT_ASSIGNMENT_STATUS,
          GetAssignmentsForHITSortProperty.SubmitTime,
          1,
          DEFAULT_PAGE_SIZE,
          DEFAULT_ASSIGNMENT_RESPONSE_GROUP,
          null);
    }

    // process the results
    for (int i=0; i<numRows; i++) {
      rowValues = success.getRowValues(i);
      hitId = rowValues[MTurkConstants.HIT_ID_FIELD_IND];

      // Skip header lines
      if ( hitId.equalsIgnoreCase(MTurkConstants.HIT_ID_HEADER) ) {
        continue;
      }

      try {
        HIT hit = ((HIT[])hitReplies[i].getResult())[0];
        assignments = new Assignment[] {};

        GetAssignmentsForHITResult result = ((GetAssignmentsForHITResult[])assignmentReplies[i].getResult())[0];
        if (result.getAssignment() != null) {
          assignments = result.getAssignment();

          // if there are more pages load them in as well, otherwise use results from first page
          if (assignments.length == DEFAULT_PAGE_SIZE && result.getTotalNumResults() > DEFAULT_PAGE_SIZE) {
            assignments = super.getAssignmentsForHITAsync(hitId, 
                SortDirection.Ascending,
                DEFAULT_ASSIGNMENT_STATUS,
                GetAssignmentsForHITSortProperty.SubmitTime,
                DEFAULT_PAGE_SIZE,
                DEFAULT_ASSIGNMENT_RESPONSE_GROUP,
                result,
                null);
          }        		
        }

        r = new HITResults(hit, assignments, this.config);

        if (output != null) {
          r.writeResults(output);
        } 
        else {
          hitResultsArray.add(r);
        }

        log.info(String.format("Retrieved HIT %d/%d, %s", i, numRows-1, hit.getHITId()));
      }
      catch (Exception e) {
        log.error(String.format("Error retrieving HIT results for HIT %d/%d (%s): %s", i, numRows-1, hitId, e.getMessage()));
      }

    }    

    if (output != null) {
      return null;

    } else {
      return new HITTypeResults(
          hitResultsArray.toArray(
              new HITResults[hitResultsArray.size()] ) );
    }
  }

  public void previewHIT(String previewFileName, HITDataInput input, HITProperties props, 
      HITQuestion question) throws ServiceException {
    try {
      String previewString = previewHIT(input, props, question);

      if (previewString != null) {
        FileUtil fts = new FileUtil(previewFileName);
        fts.saveString(previewString, false); // overwrite
      }
    }
    catch (Exception e)
    {
      throw new ServiceException("Error generating preview file " + previewFileName, e);
    }
  }

  /**
   * Return a preview of the HIT in HTML
   * 
   * @param input
   * @param properties
   * @param question
   * @return An HTML preview of the HIT
   * @throws ServiceException
   */
  public String previewHIT(HITDataInput input, HITProperties props, 
      HITQuestion question) throws Exception {   

    if (props == null || question == null)
      throw new IllegalArgumentException();

    String questionXML = null;

    if (input != null) {
      Map<String, String> inputMap = input.getRowAsMap(1);
      questionXML = question.getQuestion(inputMap);
    } else {
      questionXML = question.getQuestion();
    }

    // Validate question before preview
    QAPValidator.validate(questionXML);

    String questionPreview = XslTransformer.convertQAPtoHTML(questionXML);
    InputStream headerURL = this.getClass().getResourceAsStream("previewHITHeader.xml");
    InputStream footerURL = this.getClass().getResourceAsStream("previewHITFooter.xml");

    if (headerURL == null) {
      log.error("Error reading the preview header file.");
    }

    if (footerURL == null) {
      log.error("Error reading the preview footer file.");
    }

    BufferedReader headerReader = new BufferedReader(new InputStreamReader(headerURL));
    BufferedReader footerReader = new BufferedReader(new InputStreamReader(footerURL));     

    String thisLine = null;
    String header = "";
    String footer = "";
    while ((thisLine = headerReader.readLine()) != null) { header += thisLine + System.getProperty("line.separator"); } 
    while ((thisLine = footerReader.readLine()) != null) { footer += thisLine + System.getProperty("line.separator"); }
    headerReader.close();
    footerReader.close();       

    NumberFormat rewardFormatter = NumberFormat.getInstance();
    rewardFormatter.setMaximumFractionDigits(2);
    rewardFormatter.setMinimumFractionDigits(2);        

    Map<String, String> headerMap = new HashMap<String, String>();
    headerMap.put("requester", "[Your Requester Name Here]");
    headerMap.put("title", props.getTitle());
    headerMap.put("description", props.getDescription());
    headerMap.put("keywords", props.getKeywords());
    headerMap.put("reward", rewardFormatter.format(props.getRewardAmount()));
    String mergedHeader = VelocityUtil.doMerge(header, headerMap);

    String previewString = mergedHeader + questionPreview + footer;

    return previewString;
  }

  public void appendApplicationSignature(String signature) {
    super.appendApplicationSignature(signature, this.getPort());
  }

  //-------------------------------------------------------------
  // Methods - Public Static
  //-------------------------------------------------------------

  /**
   * Returns the URL for the Mechanical Turk website.
   *
   * @return URL
   */
  public String getWebsiteURL() {
    return this.config.getWorkerWebsiteURL();
  }

  /**
   * Formats the given double value into the currency format.
   *
   * @param value
   * @return formatted value
   */
  public static String formatCurrency(double value) {
    DecimalFormat form = new DecimalFormat("0.00"); // print up to two decimal points

    return form.format(value);
  }

  /**
   * Constructs a Question XML String that contains a single question.
   * 
   * @param question The question phrase to ask
   * @return A Question XML
   */
  public static String getBasicFreeTextQuestion(String question) {
    String q = "";
    q += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    q += "<QuestionForm xmlns=\"http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionForm.xsd\">";
    q += "  <Question>"; 
    q += "    <QuestionIdentifier>1</QuestionIdentifier>";
    q += "    <QuestionContent>";
    q += "      <Text>" + question + "</Text>";
    q += "    </QuestionContent>"; 
    q += "    <AnswerSpecification>";
    q += "      <FreeTextAnswer/>";
    q += "    </AnswerSpecification>"; 
    q += "  </Question>";
    q += "</QuestionForm>";
    return q;
  }

  //-------------------------------------------------------------
  // Methods - Protected
  //-------------------------------------------------------------

  /**
   * Constructs a QualificationTest XML String that contains a simple checkbox.
   * 
   * @param name The name of the Qualification Test
   * @return A QualificationTest XML
   */
  protected String getBasicCheckboxQualificationTest(String name) {
    String test = "";
    test += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    test += "<QuestionForm xmlns=\"http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionForm.xsd\">";
    test += "<Overview><Title>" + name + "</Title></Overview>";
    test += "<Question>";
    test += "  <QuestionIdentifier>ConfirmRequest</QuestionIdentifier>";
    test += "  <DisplayName>Confirm your request</DisplayName>";
    test += "  <IsRequired>true</IsRequired>";
    test += "  <QuestionContent><Text></Text></QuestionContent>";
    test += "  <AnswerSpecification>";
    test += "   <SelectionAnswer>";
    test += "    <StyleSuggestion>checkbox</StyleSuggestion>";
    test += "    <Selections>";
    test += "     <Selection>";
    test += "      <SelectionIdentifier>yes</SelectionIdentifier>";
    test += "      <Text>Please check the box to the left and click SUBMIT to have the qualification granted to you. If you do not want the qualification, please click CANCEL.</Text>";
    test += "     </Selection>";
    test += "    </Selections>";
    test += "   </SelectionAnswer>";
    test += "  </AnswerSpecification>";
    test += "</Question>";
    test += "</QuestionForm>";
    return test;
  }

  /**
   * Constructs a Qualification AnswerKey XML String for the simple checkbox QualificationTest.
   * The AnswerKey would assign a Qualification Score of 100 to the worker.
   * 
   * @return A Qualification AnswerKey XML
   */
  protected String getBasicCheckboxQualificationAnswerKey() {
    String answerKey = "";
    answerKey += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    answerKey += "<AnswerKey xmlns=\"http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/AnswerKey.xsd\">";
    answerKey += "<Question>";
    answerKey += "  <QuestionIdentifier>ConfirmRequest</QuestionIdentifier>";
    answerKey += "  <AnswerOption>";
    answerKey += "    <SelectionIdentifier>yes</SelectionIdentifier>";
    answerKey += "    <AnswerScore>100</AnswerScore>";
    answerKey += "  </AnswerOption>";
    answerKey += "</Question>";
    answerKey += "</AnswerKey>";
    return answerKey;
  }


}
