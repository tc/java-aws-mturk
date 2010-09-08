/**
 * AWSMechanicalTurkRequesterBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class AWSMechanicalTurkRequesterBindingStub extends org.apache.axis.client.Stub implements com.amazonaws.mturk.requester.AWSMechanicalTurkRequesterPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[40];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateHIT"), com.amazonaws.mturk.requester.CreateHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.CreateHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegisterHITType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RegisterHITType"), com.amazonaws.mturk.requester.RegisterHITType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RegisterHITTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.RegisterHITTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetHITTypeNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITTypeNotification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITTypeNotification"), com.amazonaws.mturk.requester.SetHITTypeNotification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITTypeNotificationResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SetHITTypeNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITTypeNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendTestEventNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SendTestEventNotification"), com.amazonaws.mturk.requester.SendTestEventNotification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SendTestEventNotificationResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SendTestEventNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisposeHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisposeHIT"), com.amazonaws.mturk.requester.DisposeHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisposeHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.DisposeHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisableHIT"), com.amazonaws.mturk.requester.DisableHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisableHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.DisableHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHIT"), com.amazonaws.mturk.requester.GetHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReviewableHITs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetReviewableHITs"), com.amazonaws.mturk.requester.GetReviewableHITs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetReviewableHITsResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetReviewableHITsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHITsForQualificationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITsForQualificationType"), com.amazonaws.mturk.requester.GetHITsForQualificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITsForQualificationTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQualificationsForQualificationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationsForQualificationType"), com.amazonaws.mturk.requester.GetQualificationsForQualificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationsForQualificationTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetHITAsReviewing");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITAsReviewing"), com.amazonaws.mturk.requester.SetHITAsReviewing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITAsReviewingResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SetHITAsReviewingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExtendHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ExtendHIT"), com.amazonaws.mturk.requester.ExtendHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ExtendHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.ExtendHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ForceExpireHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ForceExpireHIT"), com.amazonaws.mturk.requester.ForceExpireHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ForceExpireHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.ForceExpireHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApproveAssignment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ApproveAssignment"), com.amazonaws.mturk.requester.ApproveAssignment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ApproveAssignmentResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.ApproveAssignmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RejectAssignment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectAssignment"), com.amazonaws.mturk.requester.RejectAssignment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectAssignmentResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.RejectAssignmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAssignmentsForHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAssignmentsForHIT"), com.amazonaws.mturk.requester.GetAssignmentsForHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAssignmentsForHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetAssignmentsForHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFileUploadURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetFileUploadURL"), com.amazonaws.mturk.requester.GetFileUploadURL.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetFileUploadURLResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetFileUploadURLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchHITs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchHITs"), com.amazonaws.mturk.requester.SearchHITs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchHITsResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SearchHITsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GrantBonus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantBonus"), com.amazonaws.mturk.requester.GrantBonus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantBonusResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GrantBonusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBonusPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPayments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetBonusPayments"), com.amazonaws.mturk.requester.GetBonusPayments.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetBonusPaymentsResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetBonusPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeHITTypeOfHIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHIT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ChangeHITTypeOfHIT"), com.amazonaws.mturk.requester.ChangeHITTypeOfHIT.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ChangeHITTypeOfHITResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHITResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateQualificationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateQualificationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateQualificationType"), com.amazonaws.mturk.requester.CreateQualificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateQualificationTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.CreateQualificationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateQualificationTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQualificationRequests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationRequests"), com.amazonaws.mturk.requester.GetQualificationRequests.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationRequestsResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetQualificationRequestsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RejectQualificationRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectQualificationRequest"), com.amazonaws.mturk.requester.RejectQualificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectQualificationRequestResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.RejectQualificationRequestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQualificationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationType"), com.amazonaws.mturk.requester.GetQualificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetQualificationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GrantQualification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantQualification"), com.amazonaws.mturk.requester.GrantQualification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantQualificationResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GrantQualificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AssignQualification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">AssignQualification"), com.amazonaws.mturk.requester.AssignQualification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">AssignQualificationResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.AssignQualificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RevokeQualification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RevokeQualification"), com.amazonaws.mturk.requester.RevokeQualification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RevokeQualificationResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.RevokeQualificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchQualificationTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchQualificationTypes"), com.amazonaws.mturk.requester.SearchQualificationTypes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchQualificationTypesResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SearchQualificationTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateQualificationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationType"), com.amazonaws.mturk.requester.UpdateQualificationType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationTypeResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.UpdateQualificationTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQualificationScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationScore"), com.amazonaws.mturk.requester.GetQualificationScore.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationScoreResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetQualificationScoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationScoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateQualificationScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationScore"), com.amazonaws.mturk.requester.UpdateQualificationScore.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationScoreResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.UpdateQualificationScoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationScoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAccountBalance"), com.amazonaws.mturk.requester.GetAccountBalance.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAccountBalanceResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetAccountBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRequesterStatistic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetRequesterStatistic"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetRequesterStatistic"), com.amazonaws.mturk.requester.GetRequesterStatistic.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetRequesterStatisticResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetRequesterStatisticResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetRequesterStatisticResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotifyWorkers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">NotifyWorkers"), com.amazonaws.mturk.requester.NotifyWorkers.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">NotifyWorkersResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.NotifyWorkersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetWorkerAcceptLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetWorkerAcceptLimit"), com.amazonaws.mturk.requester.SetWorkerAcceptLimit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetWorkerAcceptLimitResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWorkerAcceptLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetWorkerAcceptLimit"), com.amazonaws.mturk.requester.GetWorkerAcceptLimit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetWorkerAcceptLimitResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BlockWorker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorker"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">BlockWorker"), com.amazonaws.mturk.requester.BlockWorker.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">BlockWorkerResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.BlockWorkerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorkerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnblockWorker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorker"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UnblockWorker"), com.amazonaws.mturk.requester.UnblockWorker.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UnblockWorkerResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.UnblockWorkerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorkerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Help");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Help"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Help"), com.amazonaws.mturk.requester.Help.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">HelpResponse"));
        oper.setReturnClass(com.amazonaws.mturk.requester.HelpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    public AWSMechanicalTurkRequesterBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AWSMechanicalTurkRequesterBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AWSMechanicalTurkRequesterBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>Arguments>Argument");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ArgumentsArgument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>Errors>Error");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ErrorsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>HTTPHeaders>Header");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HTTPHeadersHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>OperationInformation>AvailableParameters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>OperationInformation>AvailableResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>OperationInformation>DefaultResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>OperationInformation>RequiredParameters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>ResponseGroupInformation>Elements");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>ResponseGroupInformation>ValidOperations");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Operation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ApproveAssignment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ApproveAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ApproveAssignmentResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ApproveAssignmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Arguments");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ArgumentsArgument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>Arguments>Argument");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Argument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">AssignQualification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.AssignQualification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">AssignQualificationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.AssignQualificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">BlockWorker");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.BlockWorker.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">BlockWorkerResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.BlockWorkerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ChangeHITTypeOfHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ChangeHITTypeOfHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ChangeHITTypeOfHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateQualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateQualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">CreateQualificationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateQualificationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisableHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisableHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisableHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisableHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisposeHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisposeHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">DisposeHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisposeHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Errors");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ErrorsError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>Errors>Error");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ExtendHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ExtendHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ExtendHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ExtendHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ForceExpireHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ForceExpireHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ForceExpireHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ForceExpireHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAccountBalance");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAccountBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAccountBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAccountBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAssignmentsForHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAssignmentsForHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetAssignmentsForHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAssignmentsForHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetBonusPayments");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetBonusPayments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetBonusPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetBonusPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetFileUploadURL");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetFileUploadURL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetFileUploadURLResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetFileUploadURLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITsForQualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITsForQualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetHITsForQualificationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationRequests");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationRequests.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationRequestsResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationRequestsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationScore");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationScoreResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationScoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationsForQualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationsForQualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationsForQualificationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetRequesterStatistic");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetRequesterStatistic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetRequesterStatisticResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetRequesterStatisticResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetReviewableHITs");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetReviewableHITs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetReviewableHITsResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetReviewableHITsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetWorkerAcceptLimit");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetWorkerAcceptLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetWorkerAcceptLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantBonus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantBonus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantBonusResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantBonusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantQualification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantQualification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GrantQualificationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantQualificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Help");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Help.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">HelpRequest>HelpType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HelpRequestHelpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">HelpResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HelpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">HTTPHeaders");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HTTPHeadersHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">>HTTPHeaders>Header");
            qName2 = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Header");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Information");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Information.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">NotifyWorkers");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotifyWorkers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">NotifyWorkersResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotifyWorkersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationInformation");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.OperationInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.OperationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RegisterHITType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RegisterHITType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RegisterHITTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RegisterHITTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectAssignment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectAssignmentResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectAssignmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectQualificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectQualificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RejectQualificationRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectQualificationRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ResponseGroupInformation");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ResponseGroupInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RevokeQualification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RevokeQualification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">RevokeQualificationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RevokeQualificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchHITs");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchHITs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchHITsResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchHITsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchQualificationTypes");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchQualificationTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SearchQualificationTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchQualificationTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SendTestEventNotification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SendTestEventNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SendTestEventNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SendTestEventNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITAsReviewing");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITAsReviewing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITAsReviewingResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITAsReviewingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITTypeNotification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITTypeNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetHITTypeNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITTypeNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetWorkerAcceptLimit");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetWorkerAcceptLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetWorkerAcceptLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UnblockWorker");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UnblockWorker.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UnblockWorkerResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UnblockWorkerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationScore");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationScoreResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationScoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">UpdateQualificationTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ApproveAssignmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ApproveAssignmentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Assignment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Assignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.AssignmentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.AssignQualificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.AssignQualificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorkerRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.BlockWorkerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BlockWorkerResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.BlockWorkerResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BonusPayment");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.BonusPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ChangeHITTypeOfHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ChangeHITTypeOfHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ChangeHITTypeOfHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Comparator");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Comparator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "CreateQualificationTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.CreateQualificationTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DataPoint");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DataPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisableHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisableHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisableHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisposeHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DisposeHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.DisposeHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "EventType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.EventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ExtendHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ExtendHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ExtendHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ForceExpireHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ForceExpireHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ForceExpireHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAccountBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAccountBalanceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAssignmentsForHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAssignmentsForHITResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITSortProperty");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetBonusPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetBonusPaymentsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetBonusPaymentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetFileUploadURLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetFileUploadURLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITsForQualificationTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetHITsForQualificationTypeResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetHITsForQualificationTypeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationRequestsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationRequestsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsSortProperty");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationRequestsSortProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationScoreRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationScoreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetQualificationTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetRequesterStatisticRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetRequesterStatisticRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetReviewableHITsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetReviewableHITsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsSortProperty");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetReviewableHITsSortProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetStatisticResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetStatisticResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetWorkerAcceptLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetWorkerAcceptLimitResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GetWorkerAcceptLimitResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantBonusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantBonusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantQualificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantQualificationResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.GrantQualificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HelpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HIT");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITReviewStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HITReviewStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.HITStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "KeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.KeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "LimitGroupType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.LimitGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Locale");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Locale.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotificationTransport");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotificationTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkersRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotifyWorkersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotifyWorkersResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.NotifyWorkersResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Price.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Qualification");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.Qualification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.QualificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.QualificationRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.QualificationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationType");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.QualificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.QualificationTypeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RegisterHITTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RegisterHITTypeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignmentRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectAssignmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectAssignmentResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectAssignmentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequestRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectQualificationRequestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectQualificationRequestResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RejectQualificationRequestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequesterStatistic");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RequesterStatistic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ReviewableHITStatus");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.ReviewableHITStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RevokeQualificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RevokeQualificationResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.RevokeQualificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchHITsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchHITsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsSortProperty");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchHITsSortProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchQualificationTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchQualificationTypesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesSortProperty");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SendTestEventNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SendTestEventNotificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewingRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITAsReviewingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITAsReviewingResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITAsReviewingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITTypeNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITTypeNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITTypeNotificationResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetHITTypeNotificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetWorkerAcceptLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SortDirection");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.SortDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "TimePeriod");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.TimePeriod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorkerRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UnblockWorkerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UnblockWorkerResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UnblockWorkerResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationScoreRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationScoreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationScoreResult");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationScoreResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.amazonaws.mturk.requester.UpdateQualificationTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.amazonaws.mturk.requester.CreateHITResponse createHIT(com.amazonaws.mturk.requester.CreateHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.CreateHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.CreateHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.CreateHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.RegisterHITTypeResponse registerHITType(com.amazonaws.mturk.requester.RegisterHITType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RegisterHITType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.RegisterHITTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.RegisterHITTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.RegisterHITTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SetHITTypeNotificationResponse setHITTypeNotification(com.amazonaws.mturk.requester.SetHITTypeNotification body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetHITTypeNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SetHITTypeNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SetHITTypeNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SetHITTypeNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SendTestEventNotificationResponse sendTestEventNotification(com.amazonaws.mturk.requester.SendTestEventNotification body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SendTestEventNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SendTestEventNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SendTestEventNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SendTestEventNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.DisposeHITResponse disposeHIT(com.amazonaws.mturk.requester.DisposeHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisposeHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.DisposeHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.DisposeHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.DisposeHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.DisableHITResponse disableHIT(com.amazonaws.mturk.requester.DisableHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DisableHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.DisableHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.DisableHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.DisableHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetHITResponse getHIT(com.amazonaws.mturk.requester.GetHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetReviewableHITsResponse getReviewableHITs(com.amazonaws.mturk.requester.GetReviewableHITs body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetReviewableHITs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetReviewableHITsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetReviewableHITsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetReviewableHITsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse getHITsForQualificationType(com.amazonaws.mturk.requester.GetHITsForQualificationType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetHITsForQualificationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetHITsForQualificationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse getQualificationsForQualificationType(com.amazonaws.mturk.requester.GetQualificationsForQualificationType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQualificationsForQualificationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SetHITAsReviewingResponse setHITAsReviewing(com.amazonaws.mturk.requester.SetHITAsReviewing body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetHITAsReviewing"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SetHITAsReviewingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SetHITAsReviewingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SetHITAsReviewingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.ExtendHITResponse extendHIT(com.amazonaws.mturk.requester.ExtendHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExtendHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.ExtendHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.ExtendHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.ExtendHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.ForceExpireHITResponse forceExpireHIT(com.amazonaws.mturk.requester.ForceExpireHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ForceExpireHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.ForceExpireHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.ForceExpireHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.ForceExpireHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.ApproveAssignmentResponse approveAssignment(com.amazonaws.mturk.requester.ApproveAssignment body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApproveAssignment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.ApproveAssignmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.ApproveAssignmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.ApproveAssignmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.RejectAssignmentResponse rejectAssignment(com.amazonaws.mturk.requester.RejectAssignment body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RejectAssignment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.RejectAssignmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.RejectAssignmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.RejectAssignmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetAssignmentsForHITResponse getAssignmentsForHIT(com.amazonaws.mturk.requester.GetAssignmentsForHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAssignmentsForHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetAssignmentsForHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetAssignmentsForHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetAssignmentsForHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetFileUploadURLResponse getFileUploadURL(com.amazonaws.mturk.requester.GetFileUploadURL body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFileUploadURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetFileUploadURLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetFileUploadURLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetFileUploadURLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SearchHITsResponse searchHITs(com.amazonaws.mturk.requester.SearchHITs body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchHITs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SearchHITsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SearchHITsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SearchHITsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GrantBonusResponse grantBonus(com.amazonaws.mturk.requester.GrantBonus body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GrantBonus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GrantBonusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GrantBonusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GrantBonusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetBonusPaymentsResponse getBonusPayments(com.amazonaws.mturk.requester.GetBonusPayments body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBonusPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetBonusPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetBonusPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetBonusPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse changeHITTypeOfHIT(com.amazonaws.mturk.requester.ChangeHITTypeOfHIT body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeHITTypeOfHIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.ChangeHITTypeOfHITResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.CreateQualificationTypeResponse createQualificationType(com.amazonaws.mturk.requester.CreateQualificationType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateQualificationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.CreateQualificationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.CreateQualificationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.CreateQualificationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetQualificationRequestsResponse getQualificationRequests(com.amazonaws.mturk.requester.GetQualificationRequests body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQualificationRequests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetQualificationRequestsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetQualificationRequestsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetQualificationRequestsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.RejectQualificationRequestResponse rejectQualificationRequest(com.amazonaws.mturk.requester.RejectQualificationRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RejectQualificationRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.RejectQualificationRequestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.RejectQualificationRequestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.RejectQualificationRequestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetQualificationTypeResponse getQualificationType(com.amazonaws.mturk.requester.GetQualificationType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQualificationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetQualificationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetQualificationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetQualificationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GrantQualificationResponse grantQualification(com.amazonaws.mturk.requester.GrantQualification body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GrantQualification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GrantQualificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GrantQualificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GrantQualificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.AssignQualificationResponse assignQualification(com.amazonaws.mturk.requester.AssignQualification body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AssignQualification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.AssignQualificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.AssignQualificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.AssignQualificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.RevokeQualificationResponse revokeQualification(com.amazonaws.mturk.requester.RevokeQualification body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RevokeQualification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.RevokeQualificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.RevokeQualificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.RevokeQualificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SearchQualificationTypesResponse searchQualificationTypes(com.amazonaws.mturk.requester.SearchQualificationTypes body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchQualificationTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SearchQualificationTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SearchQualificationTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SearchQualificationTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.UpdateQualificationTypeResponse updateQualificationType(com.amazonaws.mturk.requester.UpdateQualificationType body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateQualificationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.UpdateQualificationTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.UpdateQualificationTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.UpdateQualificationTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetQualificationScoreResponse getQualificationScore(com.amazonaws.mturk.requester.GetQualificationScore body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQualificationScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetQualificationScoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetQualificationScoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetQualificationScoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.UpdateQualificationScoreResponse updateQualificationScore(com.amazonaws.mturk.requester.UpdateQualificationScore body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateQualificationScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.UpdateQualificationScoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.UpdateQualificationScoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.UpdateQualificationScoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetAccountBalanceResponse getAccountBalance(com.amazonaws.mturk.requester.GetAccountBalance body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetAccountBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetAccountBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetAccountBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetRequesterStatisticResponse getRequesterStatistic(com.amazonaws.mturk.requester.GetRequesterStatistic body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRequesterStatistic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetRequesterStatisticResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetRequesterStatisticResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetRequesterStatisticResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.NotifyWorkersResponse notifyWorkers(com.amazonaws.mturk.requester.NotifyWorkers body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NotifyWorkers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.NotifyWorkersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.NotifyWorkersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.NotifyWorkersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse setWorkerAcceptLimit(com.amazonaws.mturk.requester.SetWorkerAcceptLimit body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetWorkerAcceptLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.SetWorkerAcceptLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse getWorkerAcceptLimit(com.amazonaws.mturk.requester.GetWorkerAcceptLimit body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWorkerAcceptLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.GetWorkerAcceptLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.BlockWorkerResponse blockWorker(com.amazonaws.mturk.requester.BlockWorker body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BlockWorker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.BlockWorkerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.BlockWorkerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.BlockWorkerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.UnblockWorkerResponse unblockWorker(com.amazonaws.mturk.requester.UnblockWorker body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnblockWorker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.UnblockWorkerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.UnblockWorkerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.UnblockWorkerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazonaws.mturk.requester.HelpResponse help(com.amazonaws.mturk.requester.Help body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Help"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazonaws.mturk.requester.HelpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazonaws.mturk.requester.HelpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazonaws.mturk.requester.HelpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
