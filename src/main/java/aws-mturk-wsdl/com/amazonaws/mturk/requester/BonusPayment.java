/**
 * BonusPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class BonusPayment  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.String workerId;

    private com.amazonaws.mturk.requester.Price bonusAmount;

    private java.lang.String assignmentId;

    private java.lang.String reason;

    private java.util.Calendar grantTime;

    public BonusPayment() {
    }

    public BonusPayment(
           com.amazonaws.mturk.requester.Request request,
           java.lang.String workerId,
           com.amazonaws.mturk.requester.Price bonusAmount,
           java.lang.String assignmentId,
           java.lang.String reason,
           java.util.Calendar grantTime) {
           this.request = request;
           this.workerId = workerId;
           this.bonusAmount = bonusAmount;
           this.assignmentId = assignmentId;
           this.reason = reason;
           this.grantTime = grantTime;
    }


    /**
     * Gets the request value for this BonusPayment.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this BonusPayment.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the workerId value for this BonusPayment.
     * 
     * @return workerId
     */
    public java.lang.String getWorkerId() {
        return workerId;
    }


    /**
     * Sets the workerId value for this BonusPayment.
     * 
     * @param workerId
     */
    public void setWorkerId(java.lang.String workerId) {
        this.workerId = workerId;
    }


    /**
     * Gets the bonusAmount value for this BonusPayment.
     * 
     * @return bonusAmount
     */
    public com.amazonaws.mturk.requester.Price getBonusAmount() {
        return bonusAmount;
    }


    /**
     * Sets the bonusAmount value for this BonusPayment.
     * 
     * @param bonusAmount
     */
    public void setBonusAmount(com.amazonaws.mturk.requester.Price bonusAmount) {
        this.bonusAmount = bonusAmount;
    }


    /**
     * Gets the assignmentId value for this BonusPayment.
     * 
     * @return assignmentId
     */
    public java.lang.String getAssignmentId() {
        return assignmentId;
    }


    /**
     * Sets the assignmentId value for this BonusPayment.
     * 
     * @param assignmentId
     */
    public void setAssignmentId(java.lang.String assignmentId) {
        this.assignmentId = assignmentId;
    }


    /**
     * Gets the reason value for this BonusPayment.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BonusPayment.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the grantTime value for this BonusPayment.
     * 
     * @return grantTime
     */
    public java.util.Calendar getGrantTime() {
        return grantTime;
    }


    /**
     * Sets the grantTime value for this BonusPayment.
     * 
     * @param grantTime
     */
    public void setGrantTime(java.util.Calendar grantTime) {
        this.grantTime = grantTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BonusPayment)) return false;
        BonusPayment other = (BonusPayment) obj;
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
            ((this.workerId==null && other.getWorkerId()==null) || 
             (this.workerId!=null &&
              this.workerId.equals(other.getWorkerId()))) &&
            ((this.bonusAmount==null && other.getBonusAmount()==null) || 
             (this.bonusAmount!=null &&
              this.bonusAmount.equals(other.getBonusAmount()))) &&
            ((this.assignmentId==null && other.getAssignmentId()==null) || 
             (this.assignmentId!=null &&
              this.assignmentId.equals(other.getAssignmentId()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.grantTime==null && other.getGrantTime()==null) || 
             (this.grantTime!=null &&
              this.grantTime.equals(other.getGrantTime())));
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
        if (getWorkerId() != null) {
            _hashCode += getWorkerId().hashCode();
        }
        if (getBonusAmount() != null) {
            _hashCode += getBonusAmount().hashCode();
        }
        if (getAssignmentId() != null) {
            _hashCode += getAssignmentId().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getGrantTime() != null) {
            _hashCode += getGrantTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BonusPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BonusPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
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
        elemField.setFieldName("bonusAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BonusAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
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
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
