/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class Request  implements java.io.Serializable {
    private java.lang.String isValid;

    private com.amazonaws.mturk.requester.CreateHITRequest createHITRequest;

    private com.amazonaws.mturk.requester.RegisterHITTypeRequest registerHITTypeRequest;

    private com.amazonaws.mturk.requester.DisposeHITRequest disposeHITRequest;

    private com.amazonaws.mturk.requester.DisableHITRequest disableHITRequest;

    private com.amazonaws.mturk.requester.GetHITRequest getHITRequest;

    private com.amazonaws.mturk.requester.GetReviewableHITsRequest getReviewableHITsRequest;

    private com.amazonaws.mturk.requester.GetHITsForQualificationTypeRequest getHITsForQualificationTypeRequest;

    private com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeRequest getQualificationsForQualificationTypeRequest;

    private com.amazonaws.mturk.requester.SetHITAsReviewingRequest setHITAsReviewingRequest;

    private com.amazonaws.mturk.requester.SearchHITsRequest searchHITsRequest;

    private com.amazonaws.mturk.requester.ExtendHITRequest extendHITRequest;

    private com.amazonaws.mturk.requester.ForceExpireHITRequest forceExpireHITRequest;

    private com.amazonaws.mturk.requester.ChangeHITTypeOfHITRequest changeHITTypeOfHITRequest;

    private com.amazonaws.mturk.requester.CreateQualificationTypeRequest createQualificationTypeRequest;

    private com.amazonaws.mturk.requester.GrantQualificationRequest grantQualificationRequest;

    private com.amazonaws.mturk.requester.AssignQualificationRequest assignQualificationRequest;

    private com.amazonaws.mturk.requester.RevokeQualificationRequest revokeQualificationRequest;

    private com.amazonaws.mturk.requester.GetQualificationRequestsRequest getQualificationRequestsRequest;

    private com.amazonaws.mturk.requester.RejectQualificationRequestRequest rejectQualificationRequestRequest;

    private com.amazonaws.mturk.requester.GetQualificationTypeRequest getQualificationTypeRequest;

    private com.amazonaws.mturk.requester.SearchQualificationTypesRequest searchQualificationTypesRequest;

    private com.amazonaws.mturk.requester.UpdateQualificationTypeRequest updateQualificationTypeRequest;

    private com.amazonaws.mturk.requester.ApproveAssignmentRequest approveAssignmentRequest;

    private com.amazonaws.mturk.requester.RejectAssignmentRequest rejectAssignmentRequest;

    private com.amazonaws.mturk.requester.GetAssignmentsForHITRequest getAssignmentsForHIT;

    private com.amazonaws.mturk.requester.GetFileUploadURLRequest getFileUploadURL;

    private com.amazonaws.mturk.requester.GrantBonusRequest grantBonusRequest;

    private com.amazonaws.mturk.requester.GetBonusPaymentsRequest getBonusPaymentsRequest;

    private com.amazonaws.mturk.requester.GetAccountBalanceRequest getAccountBalanceRequest;

    private com.amazonaws.mturk.requester.NotifyWorkersRequest notifyWorkersRequest;

    private com.amazonaws.mturk.requester.SetWorkerAcceptLimitRequest setWorkerAcceptLimitRequest;

    private com.amazonaws.mturk.requester.GetWorkerAcceptLimitRequest getWorkerAcceptLimitRequest;

    private com.amazonaws.mturk.requester.BlockWorkerRequest blockWorkerRequest;

    private com.amazonaws.mturk.requester.UnblockWorkerRequest unblockWorkerRequest;

    private com.amazonaws.mturk.requester.HelpRequest helpRequest;

    private com.amazonaws.mturk.requester.ErrorsError[] errors;

    public Request() {
    }

    public Request(
           java.lang.String isValid,
           com.amazonaws.mturk.requester.CreateHITRequest createHITRequest,
           com.amazonaws.mturk.requester.RegisterHITTypeRequest registerHITTypeRequest,
           com.amazonaws.mturk.requester.DisposeHITRequest disposeHITRequest,
           com.amazonaws.mturk.requester.DisableHITRequest disableHITRequest,
           com.amazonaws.mturk.requester.GetHITRequest getHITRequest,
           com.amazonaws.mturk.requester.GetReviewableHITsRequest getReviewableHITsRequest,
           com.amazonaws.mturk.requester.GetHITsForQualificationTypeRequest getHITsForQualificationTypeRequest,
           com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeRequest getQualificationsForQualificationTypeRequest,
           com.amazonaws.mturk.requester.SetHITAsReviewingRequest setHITAsReviewingRequest,
           com.amazonaws.mturk.requester.SearchHITsRequest searchHITsRequest,
           com.amazonaws.mturk.requester.ExtendHITRequest extendHITRequest,
           com.amazonaws.mturk.requester.ForceExpireHITRequest forceExpireHITRequest,
           com.amazonaws.mturk.requester.ChangeHITTypeOfHITRequest changeHITTypeOfHITRequest,
           com.amazonaws.mturk.requester.CreateQualificationTypeRequest createQualificationTypeRequest,
           com.amazonaws.mturk.requester.GrantQualificationRequest grantQualificationRequest,
           com.amazonaws.mturk.requester.AssignQualificationRequest assignQualificationRequest,
           com.amazonaws.mturk.requester.RevokeQualificationRequest revokeQualificationRequest,
           com.amazonaws.mturk.requester.GetQualificationRequestsRequest getQualificationRequestsRequest,
           com.amazonaws.mturk.requester.RejectQualificationRequestRequest rejectQualificationRequestRequest,
           com.amazonaws.mturk.requester.GetQualificationTypeRequest getQualificationTypeRequest,
           com.amazonaws.mturk.requester.SearchQualificationTypesRequest searchQualificationTypesRequest,
           com.amazonaws.mturk.requester.UpdateQualificationTypeRequest updateQualificationTypeRequest,
           com.amazonaws.mturk.requester.ApproveAssignmentRequest approveAssignmentRequest,
           com.amazonaws.mturk.requester.RejectAssignmentRequest rejectAssignmentRequest,
           com.amazonaws.mturk.requester.GetAssignmentsForHITRequest getAssignmentsForHIT,
           com.amazonaws.mturk.requester.GetFileUploadURLRequest getFileUploadURL,
           com.amazonaws.mturk.requester.GrantBonusRequest grantBonusRequest,
           com.amazonaws.mturk.requester.GetBonusPaymentsRequest getBonusPaymentsRequest,
           com.amazonaws.mturk.requester.GetAccountBalanceRequest getAccountBalanceRequest,
           com.amazonaws.mturk.requester.NotifyWorkersRequest notifyWorkersRequest,
           com.amazonaws.mturk.requester.SetWorkerAcceptLimitRequest setWorkerAcceptLimitRequest,
           com.amazonaws.mturk.requester.GetWorkerAcceptLimitRequest getWorkerAcceptLimitRequest,
           com.amazonaws.mturk.requester.BlockWorkerRequest blockWorkerRequest,
           com.amazonaws.mturk.requester.UnblockWorkerRequest unblockWorkerRequest,
           com.amazonaws.mturk.requester.HelpRequest helpRequest,
           com.amazonaws.mturk.requester.ErrorsError[] errors) {
           this.isValid = isValid;
           this.createHITRequest = createHITRequest;
           this.registerHITTypeRequest = registerHITTypeRequest;
           this.disposeHITRequest = disposeHITRequest;
           this.disableHITRequest = disableHITRequest;
           this.getHITRequest = getHITRequest;
           this.getReviewableHITsRequest = getReviewableHITsRequest;
           this.getHITsForQualificationTypeRequest = getHITsForQualificationTypeRequest;
           this.getQualificationsForQualificationTypeRequest = getQualificationsForQualificationTypeRequest;
           this.setHITAsReviewingRequest = setHITAsReviewingRequest;
           this.searchHITsRequest = searchHITsRequest;
           this.extendHITRequest = extendHITRequest;
           this.forceExpireHITRequest = forceExpireHITRequest;
           this.changeHITTypeOfHITRequest = changeHITTypeOfHITRequest;
           this.createQualificationTypeRequest = createQualificationTypeRequest;
           this.grantQualificationRequest = grantQualificationRequest;
           this.assignQualificationRequest = assignQualificationRequest;
           this.revokeQualificationRequest = revokeQualificationRequest;
           this.getQualificationRequestsRequest = getQualificationRequestsRequest;
           this.rejectQualificationRequestRequest = rejectQualificationRequestRequest;
           this.getQualificationTypeRequest = getQualificationTypeRequest;
           this.searchQualificationTypesRequest = searchQualificationTypesRequest;
           this.updateQualificationTypeRequest = updateQualificationTypeRequest;
           this.approveAssignmentRequest = approveAssignmentRequest;
           this.rejectAssignmentRequest = rejectAssignmentRequest;
           this.getAssignmentsForHIT = getAssignmentsForHIT;
           this.getFileUploadURL = getFileUploadURL;
           this.grantBonusRequest = grantBonusRequest;
           this.getBonusPaymentsRequest = getBonusPaymentsRequest;
           this.getAccountBalanceRequest = getAccountBalanceRequest;
           this.notifyWorkersRequest = notifyWorkersRequest;
           this.setWorkerAcceptLimitRequest = setWorkerAcceptLimitRequest;
           this.getWorkerAcceptLimitRequest = getWorkerAcceptLimitRequest;
           this.blockWorkerRequest = blockWorkerRequest;
           this.unblockWorkerRequest = unblockWorkerRequest;
           this.helpRequest = helpRequest;
           this.errors = errors;
    }


    /**
     * Gets the isValid value for this Request.
     * 
     * @return isValid
     */
    public java.lang.String getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this Request.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.String isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the createHITRequest value for this Request.
     * 
     * @return createHITRequest
     */
    public com.amazonaws.mturk.requester.CreateHITRequest getCreateHITRequest() {
        return createHITRequest;
    }


    /**
     * Sets the createHITRequest value for this Request.
     * 
     * @param createHITRequest
     */
    public void setCreateHITRequest(com.amazonaws.mturk.requester.CreateHITRequest createHITRequest) {
        this.createHITRequest = createHITRequest;
    }


    /**
     * Gets the registerHITTypeRequest value for this Request.
     * 
     * @return registerHITTypeRequest
     */
    public com.amazonaws.mturk.requester.RegisterHITTypeRequest getRegisterHITTypeRequest() {
        return registerHITTypeRequest;
    }


    /**
     * Sets the registerHITTypeRequest value for this Request.
     * 
     * @param registerHITTypeRequest
     */
    public void setRegisterHITTypeRequest(com.amazonaws.mturk.requester.RegisterHITTypeRequest registerHITTypeRequest) {
        this.registerHITTypeRequest = registerHITTypeRequest;
    }


    /**
     * Gets the disposeHITRequest value for this Request.
     * 
     * @return disposeHITRequest
     */
    public com.amazonaws.mturk.requester.DisposeHITRequest getDisposeHITRequest() {
        return disposeHITRequest;
    }


    /**
     * Sets the disposeHITRequest value for this Request.
     * 
     * @param disposeHITRequest
     */
    public void setDisposeHITRequest(com.amazonaws.mturk.requester.DisposeHITRequest disposeHITRequest) {
        this.disposeHITRequest = disposeHITRequest;
    }


    /**
     * Gets the disableHITRequest value for this Request.
     * 
     * @return disableHITRequest
     */
    public com.amazonaws.mturk.requester.DisableHITRequest getDisableHITRequest() {
        return disableHITRequest;
    }


    /**
     * Sets the disableHITRequest value for this Request.
     * 
     * @param disableHITRequest
     */
    public void setDisableHITRequest(com.amazonaws.mturk.requester.DisableHITRequest disableHITRequest) {
        this.disableHITRequest = disableHITRequest;
    }


    /**
     * Gets the getHITRequest value for this Request.
     * 
     * @return getHITRequest
     */
    public com.amazonaws.mturk.requester.GetHITRequest getGetHITRequest() {
        return getHITRequest;
    }


    /**
     * Sets the getHITRequest value for this Request.
     * 
     * @param getHITRequest
     */
    public void setGetHITRequest(com.amazonaws.mturk.requester.GetHITRequest getHITRequest) {
        this.getHITRequest = getHITRequest;
    }


    /**
     * Gets the getReviewableHITsRequest value for this Request.
     * 
     * @return getReviewableHITsRequest
     */
    public com.amazonaws.mturk.requester.GetReviewableHITsRequest getGetReviewableHITsRequest() {
        return getReviewableHITsRequest;
    }


    /**
     * Sets the getReviewableHITsRequest value for this Request.
     * 
     * @param getReviewableHITsRequest
     */
    public void setGetReviewableHITsRequest(com.amazonaws.mturk.requester.GetReviewableHITsRequest getReviewableHITsRequest) {
        this.getReviewableHITsRequest = getReviewableHITsRequest;
    }


    /**
     * Gets the getHITsForQualificationTypeRequest value for this Request.
     * 
     * @return getHITsForQualificationTypeRequest
     */
    public com.amazonaws.mturk.requester.GetHITsForQualificationTypeRequest getGetHITsForQualificationTypeRequest() {
        return getHITsForQualificationTypeRequest;
    }


    /**
     * Sets the getHITsForQualificationTypeRequest value for this Request.
     * 
     * @param getHITsForQualificationTypeRequest
     */
    public void setGetHITsForQualificationTypeRequest(com.amazonaws.mturk.requester.GetHITsForQualificationTypeRequest getHITsForQualificationTypeRequest) {
        this.getHITsForQualificationTypeRequest = getHITsForQualificationTypeRequest;
    }


    /**
     * Gets the getQualificationsForQualificationTypeRequest value for this Request.
     * 
     * @return getQualificationsForQualificationTypeRequest
     */
    public com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeRequest getGetQualificationsForQualificationTypeRequest() {
        return getQualificationsForQualificationTypeRequest;
    }


    /**
     * Sets the getQualificationsForQualificationTypeRequest value for this Request.
     * 
     * @param getQualificationsForQualificationTypeRequest
     */
    public void setGetQualificationsForQualificationTypeRequest(com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeRequest getQualificationsForQualificationTypeRequest) {
        this.getQualificationsForQualificationTypeRequest = getQualificationsForQualificationTypeRequest;
    }


    /**
     * Gets the setHITAsReviewingRequest value for this Request.
     * 
     * @return setHITAsReviewingRequest
     */
    public com.amazonaws.mturk.requester.SetHITAsReviewingRequest getSetHITAsReviewingRequest() {
        return setHITAsReviewingRequest;
    }


    /**
     * Sets the setHITAsReviewingRequest value for this Request.
     * 
     * @param setHITAsReviewingRequest
     */
    public void setSetHITAsReviewingRequest(com.amazonaws.mturk.requester.SetHITAsReviewingRequest setHITAsReviewingRequest) {
        this.setHITAsReviewingRequest = setHITAsReviewingRequest;
    }


    /**
     * Gets the searchHITsRequest value for this Request.
     * 
     * @return searchHITsRequest
     */
    public com.amazonaws.mturk.requester.SearchHITsRequest getSearchHITsRequest() {
        return searchHITsRequest;
    }


    /**
     * Sets the searchHITsRequest value for this Request.
     * 
     * @param searchHITsRequest
     */
    public void setSearchHITsRequest(com.amazonaws.mturk.requester.SearchHITsRequest searchHITsRequest) {
        this.searchHITsRequest = searchHITsRequest;
    }


    /**
     * Gets the extendHITRequest value for this Request.
     * 
     * @return extendHITRequest
     */
    public com.amazonaws.mturk.requester.ExtendHITRequest getExtendHITRequest() {
        return extendHITRequest;
    }


    /**
     * Sets the extendHITRequest value for this Request.
     * 
     * @param extendHITRequest
     */
    public void setExtendHITRequest(com.amazonaws.mturk.requester.ExtendHITRequest extendHITRequest) {
        this.extendHITRequest = extendHITRequest;
    }


    /**
     * Gets the forceExpireHITRequest value for this Request.
     * 
     * @return forceExpireHITRequest
     */
    public com.amazonaws.mturk.requester.ForceExpireHITRequest getForceExpireHITRequest() {
        return forceExpireHITRequest;
    }


    /**
     * Sets the forceExpireHITRequest value for this Request.
     * 
     * @param forceExpireHITRequest
     */
    public void setForceExpireHITRequest(com.amazonaws.mturk.requester.ForceExpireHITRequest forceExpireHITRequest) {
        this.forceExpireHITRequest = forceExpireHITRequest;
    }


    /**
     * Gets the changeHITTypeOfHITRequest value for this Request.
     * 
     * @return changeHITTypeOfHITRequest
     */
    public com.amazonaws.mturk.requester.ChangeHITTypeOfHITRequest getChangeHITTypeOfHITRequest() {
        return changeHITTypeOfHITRequest;
    }


    /**
     * Sets the changeHITTypeOfHITRequest value for this Request.
     * 
     * @param changeHITTypeOfHITRequest
     */
    public void setChangeHITTypeOfHITRequest(com.amazonaws.mturk.requester.ChangeHITTypeOfHITRequest changeHITTypeOfHITRequest) {
        this.changeHITTypeOfHITRequest = changeHITTypeOfHITRequest;
    }


    /**
     * Gets the createQualificationTypeRequest value for this Request.
     * 
     * @return createQualificationTypeRequest
     */
    public com.amazonaws.mturk.requester.CreateQualificationTypeRequest getCreateQualificationTypeRequest() {
        return createQualificationTypeRequest;
    }


    /**
     * Sets the createQualificationTypeRequest value for this Request.
     * 
     * @param createQualificationTypeRequest
     */
    public void setCreateQualificationTypeRequest(com.amazonaws.mturk.requester.CreateQualificationTypeRequest createQualificationTypeRequest) {
        this.createQualificationTypeRequest = createQualificationTypeRequest;
    }


    /**
     * Gets the grantQualificationRequest value for this Request.
     * 
     * @return grantQualificationRequest
     */
    public com.amazonaws.mturk.requester.GrantQualificationRequest getGrantQualificationRequest() {
        return grantQualificationRequest;
    }


    /**
     * Sets the grantQualificationRequest value for this Request.
     * 
     * @param grantQualificationRequest
     */
    public void setGrantQualificationRequest(com.amazonaws.mturk.requester.GrantQualificationRequest grantQualificationRequest) {
        this.grantQualificationRequest = grantQualificationRequest;
    }


    /**
     * Gets the assignQualificationRequest value for this Request.
     * 
     * @return assignQualificationRequest
     */
    public com.amazonaws.mturk.requester.AssignQualificationRequest getAssignQualificationRequest() {
        return assignQualificationRequest;
    }


    /**
     * Sets the assignQualificationRequest value for this Request.
     * 
     * @param assignQualificationRequest
     */
    public void setAssignQualificationRequest(com.amazonaws.mturk.requester.AssignQualificationRequest assignQualificationRequest) {
        this.assignQualificationRequest = assignQualificationRequest;
    }


    /**
     * Gets the revokeQualificationRequest value for this Request.
     * 
     * @return revokeQualificationRequest
     */
    public com.amazonaws.mturk.requester.RevokeQualificationRequest getRevokeQualificationRequest() {
        return revokeQualificationRequest;
    }


    /**
     * Sets the revokeQualificationRequest value for this Request.
     * 
     * @param revokeQualificationRequest
     */
    public void setRevokeQualificationRequest(com.amazonaws.mturk.requester.RevokeQualificationRequest revokeQualificationRequest) {
        this.revokeQualificationRequest = revokeQualificationRequest;
    }


    /**
     * Gets the getQualificationRequestsRequest value for this Request.
     * 
     * @return getQualificationRequestsRequest
     */
    public com.amazonaws.mturk.requester.GetQualificationRequestsRequest getGetQualificationRequestsRequest() {
        return getQualificationRequestsRequest;
    }


    /**
     * Sets the getQualificationRequestsRequest value for this Request.
     * 
     * @param getQualificationRequestsRequest
     */
    public void setGetQualificationRequestsRequest(com.amazonaws.mturk.requester.GetQualificationRequestsRequest getQualificationRequestsRequest) {
        this.getQualificationRequestsRequest = getQualificationRequestsRequest;
    }


    /**
     * Gets the rejectQualificationRequestRequest value for this Request.
     * 
     * @return rejectQualificationRequestRequest
     */
    public com.amazonaws.mturk.requester.RejectQualificationRequestRequest getRejectQualificationRequestRequest() {
        return rejectQualificationRequestRequest;
    }


    /**
     * Sets the rejectQualificationRequestRequest value for this Request.
     * 
     * @param rejectQualificationRequestRequest
     */
    public void setRejectQualificationRequestRequest(com.amazonaws.mturk.requester.RejectQualificationRequestRequest rejectQualificationRequestRequest) {
        this.rejectQualificationRequestRequest = rejectQualificationRequestRequest;
    }


    /**
     * Gets the getQualificationTypeRequest value for this Request.
     * 
     * @return getQualificationTypeRequest
     */
    public com.amazonaws.mturk.requester.GetQualificationTypeRequest getGetQualificationTypeRequest() {
        return getQualificationTypeRequest;
    }


    /**
     * Sets the getQualificationTypeRequest value for this Request.
     * 
     * @param getQualificationTypeRequest
     */
    public void setGetQualificationTypeRequest(com.amazonaws.mturk.requester.GetQualificationTypeRequest getQualificationTypeRequest) {
        this.getQualificationTypeRequest = getQualificationTypeRequest;
    }


    /**
     * Gets the searchQualificationTypesRequest value for this Request.
     * 
     * @return searchQualificationTypesRequest
     */
    public com.amazonaws.mturk.requester.SearchQualificationTypesRequest getSearchQualificationTypesRequest() {
        return searchQualificationTypesRequest;
    }


    /**
     * Sets the searchQualificationTypesRequest value for this Request.
     * 
     * @param searchQualificationTypesRequest
     */
    public void setSearchQualificationTypesRequest(com.amazonaws.mturk.requester.SearchQualificationTypesRequest searchQualificationTypesRequest) {
        this.searchQualificationTypesRequest = searchQualificationTypesRequest;
    }


    /**
     * Gets the updateQualificationTypeRequest value for this Request.
     * 
     * @return updateQualificationTypeRequest
     */
    public com.amazonaws.mturk.requester.UpdateQualificationTypeRequest getUpdateQualificationTypeRequest() {
        return updateQualificationTypeRequest;
    }


    /**
     * Sets the updateQualificationTypeRequest value for this Request.
     * 
     * @param updateQualificationTypeRequest
     */
    public void setUpdateQualificationTypeRequest(com.amazonaws.mturk.requester.UpdateQualificationTypeRequest updateQualificationTypeRequest) {
        this.updateQualificationTypeRequest = updateQualificationTypeRequest;
    }


    /**
     * Gets the approveAssignmentRequest value for this Request.
     * 
     * @return approveAssignmentRequest
     */
    public com.amazonaws.mturk.requester.ApproveAssignmentRequest getApproveAssignmentRequest() {
        return approveAssignmentRequest;
    }


    /**
     * Sets the approveAssignmentRequest value for this Request.
     * 
     * @param approveAssignmentRequest
     */
    public void setApproveAssignmentRequest(com.amazonaws.mturk.requester.ApproveAssignmentRequest approveAssignmentRequest) {
        this.approveAssignmentRequest = approveAssignmentRequest;
    }


    /**
     * Gets the rejectAssignmentRequest value for this Request.
     * 
     * @return rejectAssignmentRequest
     */
    public com.amazonaws.mturk.requester.RejectAssignmentRequest getRejectAssignmentRequest() {
        return rejectAssignmentRequest;
    }


    /**
     * Sets the rejectAssignmentRequest value for this Request.
     * 
     * @param rejectAssignmentRequest
     */
    public void setRejectAssignmentRequest(com.amazonaws.mturk.requester.RejectAssignmentRequest rejectAssignmentRequest) {
        this.rejectAssignmentRequest = rejectAssignmentRequest;
    }


    /**
     * Gets the getAssignmentsForHIT value for this Request.
     * 
     * @return getAssignmentsForHIT
     */
    public com.amazonaws.mturk.requester.GetAssignmentsForHITRequest getGetAssignmentsForHIT() {
        return getAssignmentsForHIT;
    }


    /**
     * Sets the getAssignmentsForHIT value for this Request.
     * 
     * @param getAssignmentsForHIT
     */
    public void setGetAssignmentsForHIT(com.amazonaws.mturk.requester.GetAssignmentsForHITRequest getAssignmentsForHIT) {
        this.getAssignmentsForHIT = getAssignmentsForHIT;
    }


    /**
     * Gets the getFileUploadURL value for this Request.
     * 
     * @return getFileUploadURL
     */
    public com.amazonaws.mturk.requester.GetFileUploadURLRequest getGetFileUploadURL() {
        return getFileUploadURL;
    }


    /**
     * Sets the getFileUploadURL value for this Request.
     * 
     * @param getFileUploadURL
     */
    public void setGetFileUploadURL(com.amazonaws.mturk.requester.GetFileUploadURLRequest getFileUploadURL) {
        this.getFileUploadURL = getFileUploadURL;
    }


    /**
     * Gets the grantBonusRequest value for this Request.
     * 
     * @return grantBonusRequest
     */
    public com.amazonaws.mturk.requester.GrantBonusRequest getGrantBonusRequest() {
        return grantBonusRequest;
    }


    /**
     * Sets the grantBonusRequest value for this Request.
     * 
     * @param grantBonusRequest
     */
    public void setGrantBonusRequest(com.amazonaws.mturk.requester.GrantBonusRequest grantBonusRequest) {
        this.grantBonusRequest = grantBonusRequest;
    }


    /**
     * Gets the getBonusPaymentsRequest value for this Request.
     * 
     * @return getBonusPaymentsRequest
     */
    public com.amazonaws.mturk.requester.GetBonusPaymentsRequest getGetBonusPaymentsRequest() {
        return getBonusPaymentsRequest;
    }


    /**
     * Sets the getBonusPaymentsRequest value for this Request.
     * 
     * @param getBonusPaymentsRequest
     */
    public void setGetBonusPaymentsRequest(com.amazonaws.mturk.requester.GetBonusPaymentsRequest getBonusPaymentsRequest) {
        this.getBonusPaymentsRequest = getBonusPaymentsRequest;
    }


    /**
     * Gets the getAccountBalanceRequest value for this Request.
     * 
     * @return getAccountBalanceRequest
     */
    public com.amazonaws.mturk.requester.GetAccountBalanceRequest getGetAccountBalanceRequest() {
        return getAccountBalanceRequest;
    }


    /**
     * Sets the getAccountBalanceRequest value for this Request.
     * 
     * @param getAccountBalanceRequest
     */
    public void setGetAccountBalanceRequest(com.amazonaws.mturk.requester.GetAccountBalanceRequest getAccountBalanceRequest) {
        this.getAccountBalanceRequest = getAccountBalanceRequest;
    }


    /**
     * Gets the notifyWorkersRequest value for this Request.
     * 
     * @return notifyWorkersRequest
     */
    public com.amazonaws.mturk.requester.NotifyWorkersRequest getNotifyWorkersRequest() {
        return notifyWorkersRequest;
    }


    /**
     * Sets the notifyWorkersRequest value for this Request.
     * 
     * @param notifyWorkersRequest
     */
    public void setNotifyWorkersRequest(com.amazonaws.mturk.requester.NotifyWorkersRequest notifyWorkersRequest) {
        this.notifyWorkersRequest = notifyWorkersRequest;
    }


    /**
     * Gets the setWorkerAcceptLimitRequest value for this Request.
     * 
     * @return setWorkerAcceptLimitRequest
     */
    public com.amazonaws.mturk.requester.SetWorkerAcceptLimitRequest getSetWorkerAcceptLimitRequest() {
        return setWorkerAcceptLimitRequest;
    }


    /**
     * Sets the setWorkerAcceptLimitRequest value for this Request.
     * 
     * @param setWorkerAcceptLimitRequest
     */
    public void setSetWorkerAcceptLimitRequest(com.amazonaws.mturk.requester.SetWorkerAcceptLimitRequest setWorkerAcceptLimitRequest) {
        this.setWorkerAcceptLimitRequest = setWorkerAcceptLimitRequest;
    }


    /**
     * Gets the getWorkerAcceptLimitRequest value for this Request.
     * 
     * @return getWorkerAcceptLimitRequest
     */
    public com.amazonaws.mturk.requester.GetWorkerAcceptLimitRequest getGetWorkerAcceptLimitRequest() {
        return getWorkerAcceptLimitRequest;
    }


    /**
     * Sets the getWorkerAcceptLimitRequest value for this Request.
     * 
     * @param getWorkerAcceptLimitRequest
     */
    public void setGetWorkerAcceptLimitRequest(com.amazonaws.mturk.requester.GetWorkerAcceptLimitRequest getWorkerAcceptLimitRequest) {
        this.getWorkerAcceptLimitRequest = getWorkerAcceptLimitRequest;
    }


    /**
     * Gets the blockWorkerRequest value for this Request.
     * 
     * @return blockWorkerRequest
     */
    public com.amazonaws.mturk.requester.BlockWorkerRequest getBlockWorkerRequest() {
        return blockWorkerRequest;
    }


    /**
     * Sets the blockWorkerRequest value for this Request.
     * 
     * @param blockWorkerRequest
     */
    public void setBlockWorkerRequest(com.amazonaws.mturk.requester.BlockWorkerRequest blockWorkerRequest) {
        this.blockWorkerRequest = blockWorkerRequest;
    }


    /**
     * Gets the unblockWorkerRequest value for this Request.
     * 
     * @return unblockWorkerRequest
     */
    public com.amazonaws.mturk.requester.UnblockWorkerRequest getUnblockWorkerRequest() {
        return unblockWorkerRequest;
    }


    /**
     * Sets the unblockWorkerRequest value for this Request.
     * 
     * @param unblockWorkerRequest
     */
    public void setUnblockWorkerRequest(com.amazonaws.mturk.requester.UnblockWorkerRequest unblockWorkerRequest) {
        this.unblockWorkerRequest = unblockWorkerRequest;
    }


    /**
     * Gets the helpRequest value for this Request.
     * 
     * @return helpRequest
     */
    public com.amazonaws.mturk.requester.HelpRequest getHelpRequest() {
        return helpRequest;
    }


    /**
     * Sets the helpRequest value for this Request.
     * 
     * @param helpRequest
     */
    public void setHelpRequest(com.amazonaws.mturk.requester.HelpRequest helpRequest) {
        this.helpRequest = helpRequest;
    }


    /**
     * Gets the errors value for this Request.
     * 
     * @return errors
     */
    public com.amazonaws.mturk.requester.ErrorsError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Request.
     * 
     * @param errors
     */
    public void setErrors(com.amazonaws.mturk.requester.ErrorsError[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid()))) &&
            ((this.createHITRequest==null && other.getCreateHITRequest()==null) || 
             (this.createHITRequest!=null &&
              this.createHITRequest.equals(other.getCreateHITRequest()))) &&
            ((this.registerHITTypeRequest==null && other.getRegisterHITTypeRequest()==null) || 
             (this.registerHITTypeRequest!=null &&
              this.registerHITTypeRequest.equals(other.getRegisterHITTypeRequest()))) &&
            ((this.disposeHITRequest==null && other.getDisposeHITRequest()==null) || 
             (this.disposeHITRequest!=null &&
              this.disposeHITRequest.equals(other.getDisposeHITRequest()))) &&
            ((this.disableHITRequest==null && other.getDisableHITRequest()==null) || 
             (this.disableHITRequest!=null &&
              this.disableHITRequest.equals(other.getDisableHITRequest()))) &&
            ((this.getHITRequest==null && other.getGetHITRequest()==null) || 
             (this.getHITRequest!=null &&
              this.getHITRequest.equals(other.getGetHITRequest()))) &&
            ((this.getReviewableHITsRequest==null && other.getGetReviewableHITsRequest()==null) || 
             (this.getReviewableHITsRequest!=null &&
              this.getReviewableHITsRequest.equals(other.getGetReviewableHITsRequest()))) &&
            ((this.getHITsForQualificationTypeRequest==null && other.getGetHITsForQualificationTypeRequest()==null) || 
             (this.getHITsForQualificationTypeRequest!=null &&
              this.getHITsForQualificationTypeRequest.equals(other.getGetHITsForQualificationTypeRequest()))) &&
            ((this.getQualificationsForQualificationTypeRequest==null && other.getGetQualificationsForQualificationTypeRequest()==null) || 
             (this.getQualificationsForQualificationTypeRequest!=null &&
              this.getQualificationsForQualificationTypeRequest.equals(other.getGetQualificationsForQualificationTypeRequest()))) &&
            ((this.setHITAsReviewingRequest==null && other.getSetHITAsReviewingRequest()==null) || 
             (this.setHITAsReviewingRequest!=null &&
              this.setHITAsReviewingRequest.equals(other.getSetHITAsReviewingRequest()))) &&
            ((this.searchHITsRequest==null && other.getSearchHITsRequest()==null) || 
             (this.searchHITsRequest!=null &&
              this.searchHITsRequest.equals(other.getSearchHITsRequest()))) &&
            ((this.extendHITRequest==null && other.getExtendHITRequest()==null) || 
             (this.extendHITRequest!=null &&
              this.extendHITRequest.equals(other.getExtendHITRequest()))) &&
            ((this.forceExpireHITRequest==null && other.getForceExpireHITRequest()==null) || 
             (this.forceExpireHITRequest!=null &&
              this.forceExpireHITRequest.equals(other.getForceExpireHITRequest()))) &&
            ((this.changeHITTypeOfHITRequest==null && other.getChangeHITTypeOfHITRequest()==null) || 
             (this.changeHITTypeOfHITRequest!=null &&
              this.changeHITTypeOfHITRequest.equals(other.getChangeHITTypeOfHITRequest()))) &&
            ((this.createQualificationTypeRequest==null && other.getCreateQualificationTypeRequest()==null) || 
             (this.createQualificationTypeRequest!=null &&
              this.createQualificationTypeRequest.equals(other.getCreateQualificationTypeRequest()))) &&
            ((this.grantQualificationRequest==null && other.getGrantQualificationRequest()==null) || 
             (this.grantQualificationRequest!=null &&
              this.grantQualificationRequest.equals(other.getGrantQualificationRequest()))) &&
            ((this.assignQualificationRequest==null && other.getAssignQualificationRequest()==null) || 
             (this.assignQualificationRequest!=null &&
              this.assignQualificationRequest.equals(other.getAssignQualificationRequest()))) &&
            ((this.revokeQualificationRequest==null && other.getRevokeQualificationRequest()==null) || 
             (this.revokeQualificationRequest!=null &&
              this.revokeQualificationRequest.equals(other.getRevokeQualificationRequest()))) &&
            ((this.getQualificationRequestsRequest==null && other.getGetQualificationRequestsRequest()==null) || 
             (this.getQualificationRequestsRequest!=null &&
              this.getQualificationRequestsRequest.equals(other.getGetQualificationRequestsRequest()))) &&
            ((this.rejectQualificationRequestRequest==null && other.getRejectQualificationRequestRequest()==null) || 
             (this.rejectQualificationRequestRequest!=null &&
              this.rejectQualificationRequestRequest.equals(other.getRejectQualificationRequestRequest()))) &&
            ((this.getQualificationTypeRequest==null && other.getGetQualificationTypeRequest()==null) || 
             (this.getQualificationTypeRequest!=null &&
              this.getQualificationTypeRequest.equals(other.getGetQualificationTypeRequest()))) &&
            ((this.searchQualificationTypesRequest==null && other.getSearchQualificationTypesRequest()==null) || 
             (this.searchQualificationTypesRequest!=null &&
              this.searchQualificationTypesRequest.equals(other.getSearchQualificationTypesRequest()))) &&
            ((this.updateQualificationTypeRequest==null && other.getUpdateQualificationTypeRequest()==null) || 
             (this.updateQualificationTypeRequest!=null &&
              this.updateQualificationTypeRequest.equals(other.getUpdateQualificationTypeRequest()))) &&
            ((this.approveAssignmentRequest==null && other.getApproveAssignmentRequest()==null) || 
             (this.approveAssignmentRequest!=null &&
              this.approveAssignmentRequest.equals(other.getApproveAssignmentRequest()))) &&
            ((this.rejectAssignmentRequest==null && other.getRejectAssignmentRequest()==null) || 
             (this.rejectAssignmentRequest!=null &&
              this.rejectAssignmentRequest.equals(other.getRejectAssignmentRequest()))) &&
            ((this.getAssignmentsForHIT==null && other.getGetAssignmentsForHIT()==null) || 
             (this.getAssignmentsForHIT!=null &&
              this.getAssignmentsForHIT.equals(other.getGetAssignmentsForHIT()))) &&
            ((this.getFileUploadURL==null && other.getGetFileUploadURL()==null) || 
             (this.getFileUploadURL!=null &&
              this.getFileUploadURL.equals(other.getGetFileUploadURL()))) &&
            ((this.grantBonusRequest==null && other.getGrantBonusRequest()==null) || 
             (this.grantBonusRequest!=null &&
              this.grantBonusRequest.equals(other.getGrantBonusRequest()))) &&
            ((this.getBonusPaymentsRequest==null && other.getGetBonusPaymentsRequest()==null) || 
             (this.getBonusPaymentsRequest!=null &&
              this.getBonusPaymentsRequest.equals(other.getGetBonusPaymentsRequest()))) &&
            ((this.getAccountBalanceRequest==null && other.getGetAccountBalanceRequest()==null) || 
             (this.getAccountBalanceRequest!=null &&
              this.getAccountBalanceRequest.equals(other.getGetAccountBalanceRequest()))) &&
            ((this.notifyWorkersRequest==null && other.getNotifyWorkersRequest()==null) || 
             (this.notifyWorkersRequest!=null &&
              this.notifyWorkersRequest.equals(other.getNotifyWorkersRequest()))) &&
            ((this.setWorkerAcceptLimitRequest==null && other.getSetWorkerAcceptLimitRequest()==null) || 
             (this.setWorkerAcceptLimitRequest!=null &&
              this.setWorkerAcceptLimitRequest.equals(other.getSetWorkerAcceptLimitRequest()))) &&
            ((this.getWorkerAcceptLimitRequest==null && other.getGetWorkerAcceptLimitRequest()==null) || 
             (this.getWorkerAcceptLimitRequest!=null &&
              this.getWorkerAcceptLimitRequest.equals(other.getGetWorkerAcceptLimitRequest()))) &&
            ((this.blockWorkerRequest==null && other.getBlockWorkerRequest()==null) || 
             (this.blockWorkerRequest!=null &&
              this.blockWorkerRequest.equals(other.getBlockWorkerRequest()))) &&
            ((this.unblockWorkerRequest==null && other.getUnblockWorkerRequest()==null) || 
             (this.unblockWorkerRequest!=null &&
              this.unblockWorkerRequest.equals(other.getUnblockWorkerRequest()))) &&
            ((this.helpRequest==null && other.getHelpRequest()==null) || 
             (this.helpRequest!=null &&
              this.helpRequest.equals(other.getHelpRequest()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        if (getCreateHITRequest() != null) {
            _hashCode += getCreateHITRequest().hashCode();
        }
        if (getRegisterHITTypeRequest() != null) {
            _hashCode += getRegisterHITTypeRequest().hashCode();
        }
        if (getDisposeHITRequest() != null) {
            _hashCode += getDisposeHITRequest().hashCode();
        }
        if (getDisableHITRequest() != null) {
            _hashCode += getDisableHITRequest().hashCode();
        }
        if (getGetHITRequest() != null) {
            _hashCode += getGetHITRequest().hashCode();
        }
        if (getGetReviewableHITsRequest() != null) {
            _hashCode += getGetReviewableHITsRequest().hashCode();
        }
        if (getGetHITsForQualificationTypeRequest() != null) {
            _hashCode += getGetHITsForQualificationTypeRequest().hashCode();
        }
        if (getGetQualificationsForQualificationTypeRequest() != null) {
            _hashCode += getGetQualificationsForQualificationTypeRequest().hashCode();
        }
        if (getSetHITAsReviewingRequest() != null) {
            _hashCode += getSetHITAsReviewingRequest().hashCode();
        }
        if (getSearchHITsRequest() != null) {
            _hashCode += getSearchHITsRequest().hashCode();
        }
        if (getExtendHITRequest() != null) {
            _hashCode += getExtendHITRequest().hashCode();
        }
        if (getForceExpireHITRequest() != null) {
            _hashCode += getForceExpireHITRequest().hashCode();
        }
        if (getChangeHITTypeOfHITRequest() != null) {
            _hashCode += getChangeHITTypeOfHITRequest().hashCode();
        }
        if (getCreateQualificationTypeRequest() != null) {
            _hashCode += getCreateQualificationTypeRequest().hashCode();
        }
        if (getGrantQualificationRequest() != null) {
            _hashCode += getGrantQualificationRequest().hashCode();
        }
        if (getAssignQualificationRequest() != null) {
            _hashCode += getAssignQualificationRequest().hashCode();
        }
        if (getRevokeQualificationRequest() != null) {
            _hashCode += getRevokeQualificationRequest().hashCode();
        }
        if (getGetQualificationRequestsRequest() != null) {
            _hashCode += getGetQualificationRequestsRequest().hashCode();
        }
        if (getRejectQualificationRequestRequest() != null) {
            _hashCode += getRejectQualificationRequestRequest().hashCode();
        }
        if (getGetQualificationTypeRequest() != null) {
            _hashCode += getGetQualificationTypeRequest().hashCode();
        }
        if (getSearchQualificationTypesRequest() != null) {
            _hashCode += getSearchQualificationTypesRequest().hashCode();
        }
        if (getUpdateQualificationTypeRequest() != null) {
            _hashCode += getUpdateQualificationTypeRequest().hashCode();
        }
        if (getApproveAssignmentRequest() != null) {
            _hashCode += getApproveAssignmentRequest().hashCode();
        }
        if (getRejectAssignmentRequest() != null) {
            _hashCode += getRejectAssignmentRequest().hashCode();
        }
        if (getGetAssignmentsForHIT() != null) {
            _hashCode += getGetAssignmentsForHIT().hashCode();
        }
        if (getGetFileUploadURL() != null) {
            _hashCode += getGetFileUploadURL().hashCode();
        }
        if (getGrantBonusRequest() != null) {
            _hashCode += getGrantBonusRequest().hashCode();
        }
        if (getGetBonusPaymentsRequest() != null) {
            _hashCode += getGetBonusPaymentsRequest().hashCode();
        }
        if (getGetAccountBalanceRequest() != null) {
            _hashCode += getGetAccountBalanceRequest().hashCode();
        }
        if (getNotifyWorkersRequest() != null) {
            _hashCode += getNotifyWorkersRequest().hashCode();
        }
        if (getSetWorkerAcceptLimitRequest() != null) {
            _hashCode += getSetWorkerAcceptLimitRequest().hashCode();
        }
        if (getGetWorkerAcceptLimitRequest() != null) {
            _hashCode += getGetWorkerAcceptLimitRequest().hashCode();
        }
        if (getBlockWorkerRequest() != null) {
            _hashCode += getBlockWorkerRequest().hashCode();
        }
        if (getUnblockWorkerRequest() != null) {
            _hashCode += getUnblockWorkerRequest().hashCode();
        }
        if (getHelpRequest() != null) {
            _hashCode += getHelpRequest().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerHITTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disposeHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getReviewableHITsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHITsForQualificationTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQualificationsForQualificationTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setHITAsReviewingRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewingRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewingRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchHITsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceExpireHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeHITTypeOfHITRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHITRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createQualificationTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateQualificationTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateQualificationTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantQualificationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualificationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualificationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignQualificationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revokeQualificationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualificationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualificationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQualificationRequestsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectQualificationRequestRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequestRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequestRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQualificationTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchQualificationTypesRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateQualificationTypeRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationTypeRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationTypeRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveAssignmentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectAssignmentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignmentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignmentRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAssignmentsForHIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFileUploadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantBonusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBonusPaymentsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPaymentsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPaymentsRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountBalanceRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyWorkersRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkersRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkersRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setWorkerAcceptLimitRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWorkerAcceptLimitRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimitRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimitRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockWorkerRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorkerRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorkerRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unblockWorkerRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorkerRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorkerRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Errors"));
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
