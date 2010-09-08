/**
 * Assignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class Assignment  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.String assignmentId;

    private java.lang.String workerId;

    private java.lang.String HITId;

    private com.amazonaws.mturk.requester.AssignmentStatus assignmentStatus;

    private java.util.Calendar autoApprovalTime;

    private java.util.Calendar acceptTime;

    private java.util.Calendar submitTime;

    private java.util.Calendar approvalTime;

    private java.util.Calendar rejectionTime;

    private java.util.Calendar deadline;

    private java.lang.String answer;

    private java.lang.String requesterFeedback;

    public Assignment() {
    }

    public Assignment(
           com.amazonaws.mturk.requester.Request request,
           java.lang.String assignmentId,
           java.lang.String workerId,
           java.lang.String HITId,
           com.amazonaws.mturk.requester.AssignmentStatus assignmentStatus,
           java.util.Calendar autoApprovalTime,
           java.util.Calendar acceptTime,
           java.util.Calendar submitTime,
           java.util.Calendar approvalTime,
           java.util.Calendar rejectionTime,
           java.util.Calendar deadline,
           java.lang.String answer,
           java.lang.String requesterFeedback) {
           this.request = request;
           this.assignmentId = assignmentId;
           this.workerId = workerId;
           this.HITId = HITId;
           this.assignmentStatus = assignmentStatus;
           this.autoApprovalTime = autoApprovalTime;
           this.acceptTime = acceptTime;
           this.submitTime = submitTime;
           this.approvalTime = approvalTime;
           this.rejectionTime = rejectionTime;
           this.deadline = deadline;
           this.answer = answer;
           this.requesterFeedback = requesterFeedback;
    }


    /**
     * Gets the request value for this Assignment.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Assignment.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the assignmentId value for this Assignment.
     * 
     * @return assignmentId
     */
    public java.lang.String getAssignmentId() {
        return assignmentId;
    }


    /**
     * Sets the assignmentId value for this Assignment.
     * 
     * @param assignmentId
     */
    public void setAssignmentId(java.lang.String assignmentId) {
        this.assignmentId = assignmentId;
    }


    /**
     * Gets the workerId value for this Assignment.
     * 
     * @return workerId
     */
    public java.lang.String getWorkerId() {
        return workerId;
    }


    /**
     * Sets the workerId value for this Assignment.
     * 
     * @param workerId
     */
    public void setWorkerId(java.lang.String workerId) {
        this.workerId = workerId;
    }


    /**
     * Gets the HITId value for this Assignment.
     * 
     * @return HITId
     */
    public java.lang.String getHITId() {
        return HITId;
    }


    /**
     * Sets the HITId value for this Assignment.
     * 
     * @param HITId
     */
    public void setHITId(java.lang.String HITId) {
        this.HITId = HITId;
    }


    /**
     * Gets the assignmentStatus value for this Assignment.
     * 
     * @return assignmentStatus
     */
    public com.amazonaws.mturk.requester.AssignmentStatus getAssignmentStatus() {
        return assignmentStatus;
    }


    /**
     * Sets the assignmentStatus value for this Assignment.
     * 
     * @param assignmentStatus
     */
    public void setAssignmentStatus(com.amazonaws.mturk.requester.AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }


    /**
     * Gets the autoApprovalTime value for this Assignment.
     * 
     * @return autoApprovalTime
     */
    public java.util.Calendar getAutoApprovalTime() {
        return autoApprovalTime;
    }


    /**
     * Sets the autoApprovalTime value for this Assignment.
     * 
     * @param autoApprovalTime
     */
    public void setAutoApprovalTime(java.util.Calendar autoApprovalTime) {
        this.autoApprovalTime = autoApprovalTime;
    }


    /**
     * Gets the acceptTime value for this Assignment.
     * 
     * @return acceptTime
     */
    public java.util.Calendar getAcceptTime() {
        return acceptTime;
    }


    /**
     * Sets the acceptTime value for this Assignment.
     * 
     * @param acceptTime
     */
    public void setAcceptTime(java.util.Calendar acceptTime) {
        this.acceptTime = acceptTime;
    }


    /**
     * Gets the submitTime value for this Assignment.
     * 
     * @return submitTime
     */
    public java.util.Calendar getSubmitTime() {
        return submitTime;
    }


    /**
     * Sets the submitTime value for this Assignment.
     * 
     * @param submitTime
     */
    public void setSubmitTime(java.util.Calendar submitTime) {
        this.submitTime = submitTime;
    }


    /**
     * Gets the approvalTime value for this Assignment.
     * 
     * @return approvalTime
     */
    public java.util.Calendar getApprovalTime() {
        return approvalTime;
    }


    /**
     * Sets the approvalTime value for this Assignment.
     * 
     * @param approvalTime
     */
    public void setApprovalTime(java.util.Calendar approvalTime) {
        this.approvalTime = approvalTime;
    }


    /**
     * Gets the rejectionTime value for this Assignment.
     * 
     * @return rejectionTime
     */
    public java.util.Calendar getRejectionTime() {
        return rejectionTime;
    }


    /**
     * Sets the rejectionTime value for this Assignment.
     * 
     * @param rejectionTime
     */
    public void setRejectionTime(java.util.Calendar rejectionTime) {
        this.rejectionTime = rejectionTime;
    }


    /**
     * Gets the deadline value for this Assignment.
     * 
     * @return deadline
     */
    public java.util.Calendar getDeadline() {
        return deadline;
    }


    /**
     * Sets the deadline value for this Assignment.
     * 
     * @param deadline
     */
    public void setDeadline(java.util.Calendar deadline) {
        this.deadline = deadline;
    }


    /**
     * Gets the answer value for this Assignment.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this Assignment.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the requesterFeedback value for this Assignment.
     * 
     * @return requesterFeedback
     */
    public java.lang.String getRequesterFeedback() {
        return requesterFeedback;
    }


    /**
     * Sets the requesterFeedback value for this Assignment.
     * 
     * @param requesterFeedback
     */
    public void setRequesterFeedback(java.lang.String requesterFeedback) {
        this.requesterFeedback = requesterFeedback;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Assignment)) return false;
        Assignment other = (Assignment) obj;
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
            ((this.assignmentId==null && other.getAssignmentId()==null) || 
             (this.assignmentId!=null &&
              this.assignmentId.equals(other.getAssignmentId()))) &&
            ((this.workerId==null && other.getWorkerId()==null) || 
             (this.workerId!=null &&
              this.workerId.equals(other.getWorkerId()))) &&
            ((this.HITId==null && other.getHITId()==null) || 
             (this.HITId!=null &&
              this.HITId.equals(other.getHITId()))) &&
            ((this.assignmentStatus==null && other.getAssignmentStatus()==null) || 
             (this.assignmentStatus!=null &&
              this.assignmentStatus.equals(other.getAssignmentStatus()))) &&
            ((this.autoApprovalTime==null && other.getAutoApprovalTime()==null) || 
             (this.autoApprovalTime!=null &&
              this.autoApprovalTime.equals(other.getAutoApprovalTime()))) &&
            ((this.acceptTime==null && other.getAcceptTime()==null) || 
             (this.acceptTime!=null &&
              this.acceptTime.equals(other.getAcceptTime()))) &&
            ((this.submitTime==null && other.getSubmitTime()==null) || 
             (this.submitTime!=null &&
              this.submitTime.equals(other.getSubmitTime()))) &&
            ((this.approvalTime==null && other.getApprovalTime()==null) || 
             (this.approvalTime!=null &&
              this.approvalTime.equals(other.getApprovalTime()))) &&
            ((this.rejectionTime==null && other.getRejectionTime()==null) || 
             (this.rejectionTime!=null &&
              this.rejectionTime.equals(other.getRejectionTime()))) &&
            ((this.deadline==null && other.getDeadline()==null) || 
             (this.deadline!=null &&
              this.deadline.equals(other.getDeadline()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.requesterFeedback==null && other.getRequesterFeedback()==null) || 
             (this.requesterFeedback!=null &&
              this.requesterFeedback.equals(other.getRequesterFeedback())));
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
        if (getAssignmentId() != null) {
            _hashCode += getAssignmentId().hashCode();
        }
        if (getWorkerId() != null) {
            _hashCode += getWorkerId().hashCode();
        }
        if (getHITId() != null) {
            _hashCode += getHITId().hashCode();
        }
        if (getAssignmentStatus() != null) {
            _hashCode += getAssignmentStatus().hashCode();
        }
        if (getAutoApprovalTime() != null) {
            _hashCode += getAutoApprovalTime().hashCode();
        }
        if (getAcceptTime() != null) {
            _hashCode += getAcceptTime().hashCode();
        }
        if (getSubmitTime() != null) {
            _hashCode += getSubmitTime().hashCode();
        }
        if (getApprovalTime() != null) {
            _hashCode += getApprovalTime().hashCode();
        }
        if (getRejectionTime() != null) {
            _hashCode += getRejectionTime().hashCode();
        }
        if (getDeadline() != null) {
            _hashCode += getDeadline().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getRequesterFeedback() != null) {
            _hashCode += getRequesterFeedback().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Assignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Assignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "WorkerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("assignmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoApprovalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AutoApprovalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AcceptTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SubmitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApprovalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RejectionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Deadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequesterFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
