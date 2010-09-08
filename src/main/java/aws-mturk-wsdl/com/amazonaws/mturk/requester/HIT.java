/**
 * HIT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class HIT  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.String HITId;

    private java.lang.String HITTypeId;

    private java.util.Calendar creationTime;

    private java.lang.String title;

    private java.lang.String description;

    private java.lang.String question;

    private java.lang.String keywords;

    private com.amazonaws.mturk.requester.HITStatus HITStatus;

    private java.lang.Integer maxAssignments;

    private com.amazonaws.mturk.requester.Price reward;

    private java.lang.Long autoApprovalDelayInSeconds;

    private java.util.Calendar expiration;

    private java.lang.Long assignmentDurationInSeconds;

    private java.lang.Integer numberOfSimilarHITs;

    private java.lang.String requesterAnnotation;

    private com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement;

    private com.amazonaws.mturk.requester.HITReviewStatus HITReviewStatus;

    private java.lang.Integer numberOfAssignmentsPending;

    private java.lang.Integer numberOfAssignmentsAvailable;

    private java.lang.Integer numberOfAssignmentsCompleted;

    public HIT() {
    }

    public HIT(
           com.amazonaws.mturk.requester.Request request,
           java.lang.String HITId,
           java.lang.String HITTypeId,
           java.util.Calendar creationTime,
           java.lang.String title,
           java.lang.String description,
           java.lang.String question,
           java.lang.String keywords,
           com.amazonaws.mturk.requester.HITStatus HITStatus,
           java.lang.Integer maxAssignments,
           com.amazonaws.mturk.requester.Price reward,
           java.lang.Long autoApprovalDelayInSeconds,
           java.util.Calendar expiration,
           java.lang.Long assignmentDurationInSeconds,
           java.lang.Integer numberOfSimilarHITs,
           java.lang.String requesterAnnotation,
           com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement,
           com.amazonaws.mturk.requester.HITReviewStatus HITReviewStatus,
           java.lang.Integer numberOfAssignmentsPending,
           java.lang.Integer numberOfAssignmentsAvailable,
           java.lang.Integer numberOfAssignmentsCompleted) {
           this.request = request;
           this.HITId = HITId;
           this.HITTypeId = HITTypeId;
           this.creationTime = creationTime;
           this.title = title;
           this.description = description;
           this.question = question;
           this.keywords = keywords;
           this.HITStatus = HITStatus;
           this.maxAssignments = maxAssignments;
           this.reward = reward;
           this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
           this.expiration = expiration;
           this.assignmentDurationInSeconds = assignmentDurationInSeconds;
           this.numberOfSimilarHITs = numberOfSimilarHITs;
           this.requesterAnnotation = requesterAnnotation;
           this.qualificationRequirement = qualificationRequirement;
           this.HITReviewStatus = HITReviewStatus;
           this.numberOfAssignmentsPending = numberOfAssignmentsPending;
           this.numberOfAssignmentsAvailable = numberOfAssignmentsAvailable;
           this.numberOfAssignmentsCompleted = numberOfAssignmentsCompleted;
    }


    /**
     * Gets the request value for this HIT.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this HIT.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the HITId value for this HIT.
     * 
     * @return HITId
     */
    public java.lang.String getHITId() {
        return HITId;
    }


    /**
     * Sets the HITId value for this HIT.
     * 
     * @param HITId
     */
    public void setHITId(java.lang.String HITId) {
        this.HITId = HITId;
    }


    /**
     * Gets the HITTypeId value for this HIT.
     * 
     * @return HITTypeId
     */
    public java.lang.String getHITTypeId() {
        return HITTypeId;
    }


    /**
     * Sets the HITTypeId value for this HIT.
     * 
     * @param HITTypeId
     */
    public void setHITTypeId(java.lang.String HITTypeId) {
        this.HITTypeId = HITTypeId;
    }


    /**
     * Gets the creationTime value for this HIT.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this HIT.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the title value for this HIT.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this HIT.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this HIT.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HIT.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the question value for this HIT.
     * 
     * @return question
     */
    public java.lang.String getQuestion() {
        return question;
    }


    /**
     * Sets the question value for this HIT.
     * 
     * @param question
     */
    public void setQuestion(java.lang.String question) {
        this.question = question;
    }


    /**
     * Gets the keywords value for this HIT.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this HIT.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the HITStatus value for this HIT.
     * 
     * @return HITStatus
     */
    public com.amazonaws.mturk.requester.HITStatus getHITStatus() {
        return HITStatus;
    }


    /**
     * Sets the HITStatus value for this HIT.
     * 
     * @param HITStatus
     */
    public void setHITStatus(com.amazonaws.mturk.requester.HITStatus HITStatus) {
        this.HITStatus = HITStatus;
    }


    /**
     * Gets the maxAssignments value for this HIT.
     * 
     * @return maxAssignments
     */
    public java.lang.Integer getMaxAssignments() {
        return maxAssignments;
    }


    /**
     * Sets the maxAssignments value for this HIT.
     * 
     * @param maxAssignments
     */
    public void setMaxAssignments(java.lang.Integer maxAssignments) {
        this.maxAssignments = maxAssignments;
    }


    /**
     * Gets the reward value for this HIT.
     * 
     * @return reward
     */
    public com.amazonaws.mturk.requester.Price getReward() {
        return reward;
    }


    /**
     * Sets the reward value for this HIT.
     * 
     * @param reward
     */
    public void setReward(com.amazonaws.mturk.requester.Price reward) {
        this.reward = reward;
    }


    /**
     * Gets the autoApprovalDelayInSeconds value for this HIT.
     * 
     * @return autoApprovalDelayInSeconds
     */
    public java.lang.Long getAutoApprovalDelayInSeconds() {
        return autoApprovalDelayInSeconds;
    }


    /**
     * Sets the autoApprovalDelayInSeconds value for this HIT.
     * 
     * @param autoApprovalDelayInSeconds
     */
    public void setAutoApprovalDelayInSeconds(java.lang.Long autoApprovalDelayInSeconds) {
        this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
    }


    /**
     * Gets the expiration value for this HIT.
     * 
     * @return expiration
     */
    public java.util.Calendar getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this HIT.
     * 
     * @param expiration
     */
    public void setExpiration(java.util.Calendar expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the assignmentDurationInSeconds value for this HIT.
     * 
     * @return assignmentDurationInSeconds
     */
    public java.lang.Long getAssignmentDurationInSeconds() {
        return assignmentDurationInSeconds;
    }


    /**
     * Sets the assignmentDurationInSeconds value for this HIT.
     * 
     * @param assignmentDurationInSeconds
     */
    public void setAssignmentDurationInSeconds(java.lang.Long assignmentDurationInSeconds) {
        this.assignmentDurationInSeconds = assignmentDurationInSeconds;
    }


    /**
     * Gets the numberOfSimilarHITs value for this HIT.
     * 
     * @return numberOfSimilarHITs
     */
    public java.lang.Integer getNumberOfSimilarHITs() {
        return numberOfSimilarHITs;
    }


    /**
     * Sets the numberOfSimilarHITs value for this HIT.
     * 
     * @param numberOfSimilarHITs
     */
    public void setNumberOfSimilarHITs(java.lang.Integer numberOfSimilarHITs) {
        this.numberOfSimilarHITs = numberOfSimilarHITs;
    }


    /**
     * Gets the requesterAnnotation value for this HIT.
     * 
     * @return requesterAnnotation
     */
    public java.lang.String getRequesterAnnotation() {
        return requesterAnnotation;
    }


    /**
     * Sets the requesterAnnotation value for this HIT.
     * 
     * @param requesterAnnotation
     */
    public void setRequesterAnnotation(java.lang.String requesterAnnotation) {
        this.requesterAnnotation = requesterAnnotation;
    }


    /**
     * Gets the qualificationRequirement value for this HIT.
     * 
     * @return qualificationRequirement
     */
    public com.amazonaws.mturk.requester.QualificationRequirement[] getQualificationRequirement() {
        return qualificationRequirement;
    }


    /**
     * Sets the qualificationRequirement value for this HIT.
     * 
     * @param qualificationRequirement
     */
    public void setQualificationRequirement(com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement) {
        this.qualificationRequirement = qualificationRequirement;
    }

    public com.amazonaws.mturk.requester.QualificationRequirement getQualificationRequirement(int i) {
        return this.qualificationRequirement[i];
    }

    public void setQualificationRequirement(int i, com.amazonaws.mturk.requester.QualificationRequirement _value) {
        this.qualificationRequirement[i] = _value;
    }


    /**
     * Gets the HITReviewStatus value for this HIT.
     * 
     * @return HITReviewStatus
     */
    public com.amazonaws.mturk.requester.HITReviewStatus getHITReviewStatus() {
        return HITReviewStatus;
    }


    /**
     * Sets the HITReviewStatus value for this HIT.
     * 
     * @param HITReviewStatus
     */
    public void setHITReviewStatus(com.amazonaws.mturk.requester.HITReviewStatus HITReviewStatus) {
        this.HITReviewStatus = HITReviewStatus;
    }


    /**
     * Gets the numberOfAssignmentsPending value for this HIT.
     * 
     * @return numberOfAssignmentsPending
     */
    public java.lang.Integer getNumberOfAssignmentsPending() {
        return numberOfAssignmentsPending;
    }


    /**
     * Sets the numberOfAssignmentsPending value for this HIT.
     * 
     * @param numberOfAssignmentsPending
     */
    public void setNumberOfAssignmentsPending(java.lang.Integer numberOfAssignmentsPending) {
        this.numberOfAssignmentsPending = numberOfAssignmentsPending;
    }


    /**
     * Gets the numberOfAssignmentsAvailable value for this HIT.
     * 
     * @return numberOfAssignmentsAvailable
     */
    public java.lang.Integer getNumberOfAssignmentsAvailable() {
        return numberOfAssignmentsAvailable;
    }


    /**
     * Sets the numberOfAssignmentsAvailable value for this HIT.
     * 
     * @param numberOfAssignmentsAvailable
     */
    public void setNumberOfAssignmentsAvailable(java.lang.Integer numberOfAssignmentsAvailable) {
        this.numberOfAssignmentsAvailable = numberOfAssignmentsAvailable;
    }


    /**
     * Gets the numberOfAssignmentsCompleted value for this HIT.
     * 
     * @return numberOfAssignmentsCompleted
     */
    public java.lang.Integer getNumberOfAssignmentsCompleted() {
        return numberOfAssignmentsCompleted;
    }


    /**
     * Sets the numberOfAssignmentsCompleted value for this HIT.
     * 
     * @param numberOfAssignmentsCompleted
     */
    public void setNumberOfAssignmentsCompleted(java.lang.Integer numberOfAssignmentsCompleted) {
        this.numberOfAssignmentsCompleted = numberOfAssignmentsCompleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HIT)) return false;
        HIT other = (HIT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.HITId==null && other.getHITId()==null) || 
             (this.HITId!=null &&
              this.HITId.equals(other.getHITId()))) &&
            ((this.HITTypeId==null && other.getHITTypeId()==null) || 
             (this.HITTypeId!=null &&
              this.HITTypeId.equals(other.getHITTypeId()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.question==null && other.getQuestion()==null) || 
             (this.question!=null &&
              this.question.equals(other.getQuestion()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.HITStatus==null && other.getHITStatus()==null) || 
             (this.HITStatus!=null &&
              this.HITStatus.equals(other.getHITStatus()))) &&
            ((this.maxAssignments==null && other.getMaxAssignments()==null) || 
             (this.maxAssignments!=null &&
              this.maxAssignments.equals(other.getMaxAssignments()))) &&
            ((this.reward==null && other.getReward()==null) || 
             (this.reward!=null &&
              this.reward.equals(other.getReward()))) &&
            ((this.autoApprovalDelayInSeconds==null && other.getAutoApprovalDelayInSeconds()==null) || 
             (this.autoApprovalDelayInSeconds!=null &&
              this.autoApprovalDelayInSeconds.equals(other.getAutoApprovalDelayInSeconds()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.assignmentDurationInSeconds==null && other.getAssignmentDurationInSeconds()==null) || 
             (this.assignmentDurationInSeconds!=null &&
              this.assignmentDurationInSeconds.equals(other.getAssignmentDurationInSeconds()))) &&
            ((this.numberOfSimilarHITs==null && other.getNumberOfSimilarHITs()==null) || 
             (this.numberOfSimilarHITs!=null &&
              this.numberOfSimilarHITs.equals(other.getNumberOfSimilarHITs()))) &&
            ((this.requesterAnnotation==null && other.getRequesterAnnotation()==null) || 
             (this.requesterAnnotation!=null &&
              this.requesterAnnotation.equals(other.getRequesterAnnotation()))) &&
            ((this.qualificationRequirement==null && other.getQualificationRequirement()==null) || 
             (this.qualificationRequirement!=null &&
              java.util.Arrays.equals(this.qualificationRequirement, other.getQualificationRequirement()))) &&
            ((this.HITReviewStatus==null && other.getHITReviewStatus()==null) || 
             (this.HITReviewStatus!=null &&
              this.HITReviewStatus.equals(other.getHITReviewStatus()))) &&
            ((this.numberOfAssignmentsPending==null && other.getNumberOfAssignmentsPending()==null) || 
             (this.numberOfAssignmentsPending!=null &&
              this.numberOfAssignmentsPending.equals(other.getNumberOfAssignmentsPending()))) &&
            ((this.numberOfAssignmentsAvailable==null && other.getNumberOfAssignmentsAvailable()==null) || 
             (this.numberOfAssignmentsAvailable!=null &&
              this.numberOfAssignmentsAvailable.equals(other.getNumberOfAssignmentsAvailable()))) &&
            ((this.numberOfAssignmentsCompleted==null && other.getNumberOfAssignmentsCompleted()==null) || 
             (this.numberOfAssignmentsCompleted!=null &&
              this.numberOfAssignmentsCompleted.equals(other.getNumberOfAssignmentsCompleted())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getHITId() != null) {
            _hashCode += getHITId().hashCode();
        }
        if (getHITTypeId() != null) {
            _hashCode += getHITTypeId().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuestion() != null) {
            _hashCode += getQuestion().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getHITStatus() != null) {
            _hashCode += getHITStatus().hashCode();
        }
        if (getMaxAssignments() != null) {
            _hashCode += getMaxAssignments().hashCode();
        }
        if (getReward() != null) {
            _hashCode += getReward().hashCode();
        }
        if (getAutoApprovalDelayInSeconds() != null) {
            _hashCode += getAutoApprovalDelayInSeconds().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getAssignmentDurationInSeconds() != null) {
            _hashCode += getAssignmentDurationInSeconds().hashCode();
        }
        if (getNumberOfSimilarHITs() != null) {
            _hashCode += getNumberOfSimilarHITs().hashCode();
        }
        if (getRequesterAnnotation() != null) {
            _hashCode += getRequesterAnnotation().hashCode();
        }
        if (getQualificationRequirement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualificationRequirement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualificationRequirement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHITReviewStatus() != null) {
            _hashCode += getHITReviewStatus().hashCode();
        }
        if (getNumberOfAssignmentsPending() != null) {
            _hashCode += getNumberOfAssignmentsPending().hashCode();
        }
        if (getNumberOfAssignmentsAvailable() != null) {
            _hashCode += getNumberOfAssignmentsAvailable().hashCode();
        }
        if (getNumberOfAssignmentsCompleted() != null) {
            _hashCode += getNumberOfAssignmentsCompleted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HIT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HIT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("question");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Question"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "MaxAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reward");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Reward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoApprovalDelayInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AutoApprovalDelayInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfSimilarHITs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NumberOfSimilarHITs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterAnnotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequesterAnnotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITReviewStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITReviewStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITReviewStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfAssignmentsPending");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NumberOfAssignmentsPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfAssignmentsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NumberOfAssignmentsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfAssignmentsCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NumberOfAssignmentsCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
