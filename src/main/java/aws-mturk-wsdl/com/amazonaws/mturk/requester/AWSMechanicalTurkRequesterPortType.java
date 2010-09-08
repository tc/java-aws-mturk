/**
 * AWSMechanicalTurkRequesterPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public interface AWSMechanicalTurkRequesterPortType extends java.rmi.Remote {
    public com.amazonaws.mturk.requester.CreateHITResponse createHIT(com.amazonaws.mturk.requester.CreateHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.RegisterHITTypeResponse registerHITType(com.amazonaws.mturk.requester.RegisterHITType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SetHITTypeNotificationResponse setHITTypeNotification(com.amazonaws.mturk.requester.SetHITTypeNotification body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SendTestEventNotificationResponse sendTestEventNotification(com.amazonaws.mturk.requester.SendTestEventNotification body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.DisposeHITResponse disposeHIT(com.amazonaws.mturk.requester.DisposeHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.DisableHITResponse disableHIT(com.amazonaws.mturk.requester.DisableHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetHITResponse getHIT(com.amazonaws.mturk.requester.GetHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetReviewableHITsResponse getReviewableHITs(com.amazonaws.mturk.requester.GetReviewableHITs body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse getHITsForQualificationType(com.amazonaws.mturk.requester.GetHITsForQualificationType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse getQualificationsForQualificationType(com.amazonaws.mturk.requester.GetQualificationsForQualificationType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SetHITAsReviewingResponse setHITAsReviewing(com.amazonaws.mturk.requester.SetHITAsReviewing body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.ExtendHITResponse extendHIT(com.amazonaws.mturk.requester.ExtendHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.ForceExpireHITResponse forceExpireHIT(com.amazonaws.mturk.requester.ForceExpireHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.ApproveAssignmentResponse approveAssignment(com.amazonaws.mturk.requester.ApproveAssignment body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.RejectAssignmentResponse rejectAssignment(com.amazonaws.mturk.requester.RejectAssignment body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetAssignmentsForHITResponse getAssignmentsForHIT(com.amazonaws.mturk.requester.GetAssignmentsForHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetFileUploadURLResponse getFileUploadURL(com.amazonaws.mturk.requester.GetFileUploadURL body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SearchHITsResponse searchHITs(com.amazonaws.mturk.requester.SearchHITs body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GrantBonusResponse grantBonus(com.amazonaws.mturk.requester.GrantBonus body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetBonusPaymentsResponse getBonusPayments(com.amazonaws.mturk.requester.GetBonusPayments body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse changeHITTypeOfHIT(com.amazonaws.mturk.requester.ChangeHITTypeOfHIT body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.CreateQualificationTypeResponse createQualificationType(com.amazonaws.mturk.requester.CreateQualificationType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GrantQualificationResponse grantQualification(com.amazonaws.mturk.requester.GrantQualification body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.AssignQualificationResponse assignQualification(com.amazonaws.mturk.requester.AssignQualification body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.RevokeQualificationResponse revokeQualification(com.amazonaws.mturk.requester.RevokeQualification body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetQualificationTypeResponse getQualificationType(com.amazonaws.mturk.requester.GetQualificationType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetQualificationRequestsResponse getQualificationRequests(com.amazonaws.mturk.requester.GetQualificationRequests body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.RejectQualificationRequestResponse rejectQualificationRequest(com.amazonaws.mturk.requester.RejectQualificationRequest body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.UpdateQualificationTypeResponse updateQualificationType(com.amazonaws.mturk.requester.UpdateQualificationType body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SearchQualificationTypesResponse searchQualificationTypes(com.amazonaws.mturk.requester.SearchQualificationTypes body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetQualificationScoreResponse getQualificationScore(com.amazonaws.mturk.requester.GetQualificationScore body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.UpdateQualificationScoreResponse updateQualificationScore(com.amazonaws.mturk.requester.UpdateQualificationScore body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetRequesterStatisticResponse getRequesterStatistic(com.amazonaws.mturk.requester.GetRequesterStatistic body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.NotifyWorkersResponse notifyWorkers(com.amazonaws.mturk.requester.NotifyWorkers body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetAccountBalanceResponse getAccountBalance(com.amazonaws.mturk.requester.GetAccountBalance body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse setWorkerAcceptLimit(com.amazonaws.mturk.requester.SetWorkerAcceptLimit body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse getWorkerAcceptLimit(com.amazonaws.mturk.requester.GetWorkerAcceptLimit body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.BlockWorkerResponse blockWorker(com.amazonaws.mturk.requester.BlockWorker body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.UnblockWorkerResponse unblockWorker(com.amazonaws.mturk.requester.UnblockWorker body) throws java.rmi.RemoteException;
    public com.amazonaws.mturk.requester.HelpResponse help(com.amazonaws.mturk.requester.Help body) throws java.rmi.RemoteException;
}
