/**
 * AssignQualificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class AssignQualificationRequest  implements java.io.Serializable {
    private java.lang.String qualificationTypeId;

    private java.lang.String workerId;

    private java.lang.Integer integerValue;

    private java.lang.Boolean sendNotification;

    private java.lang.String[] responseGroup;

    public AssignQualificationRequest() {
    }

    public AssignQualificationRequest(
           java.lang.String qualificationTypeId,
           java.lang.String workerId,
           java.lang.Integer integerValue,
           java.lang.Boolean sendNotification,
           java.lang.String[] responseGroup) {
           this.qualificationTypeId = qualificationTypeId;
           this.workerId = workerId;
           this.integerValue = integerValue;
           this.sendNotification = sendNotification;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the qualificationTypeId value for this AssignQualificationRequest.
     * 
     * @return qualificationTypeId
     */
    public java.lang.String getQualificationTypeId() {
        return qualificationTypeId;
    }


    /**
     * Sets the qualificationTypeId value for this AssignQualificationRequest.
     * 
     * @param qualificationTypeId
     */
    public void setQualificationTypeId(java.lang.String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }


    /**
     * Gets the workerId value for this AssignQualificationRequest.
     * 
     * @return workerId
     */
    public java.lang.String getWorkerId() {
        return workerId;
    }


    /**
     * Sets the workerId value for this AssignQualificationRequest.
     * 
     * @param workerId
     */
    public void setWorkerId(java.lang.String workerId) {
        this.workerId = workerId;
    }


    /**
     * Gets the integerValue value for this AssignQualificationRequest.
     * 
     * @return integerValue
     */
    public java.lang.Integer getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this AssignQualificationRequest.
     * 
     * @param integerValue
     */
    public void setIntegerValue(java.lang.Integer integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the sendNotification value for this AssignQualificationRequest.
     * 
     * @return sendNotification
     */
    public java.lang.Boolean getSendNotification() {
        return sendNotification;
    }


    /**
     * Sets the sendNotification value for this AssignQualificationRequest.
     * 
     * @param sendNotification
     */
    public void setSendNotification(java.lang.Boolean sendNotification) {
        this.sendNotification = sendNotification;
    }


    /**
     * Gets the responseGroup value for this AssignQualificationRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this AssignQualificationRequest.
     * 
     * @param responseGroup
     */
    public void setResponseGroup(java.lang.String[] responseGroup) {
        this.responseGroup = responseGroup;
    }

    public java.lang.String getResponseGroup(int i) {
        return this.responseGroup[i];
    }

    public void setResponseGroup(int i, java.lang.String _value) {
        this.responseGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignQualificationRequest)) return false;
        AssignQualificationRequest other = (AssignQualificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualificationTypeId==null && other.getQualificationTypeId()==null) || 
             (this.qualificationTypeId!=null &&
              this.qualificationTypeId.equals(other.getQualificationTypeId()))) &&
            ((this.workerId==null && other.getWorkerId()==null) || 
             (this.workerId!=null &&
              this.workerId.equals(other.getWorkerId()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.sendNotification==null && other.getSendNotification()==null) || 
             (this.sendNotification!=null &&
              this.sendNotification.equals(other.getSendNotification()))) &&
            ((this.responseGroup==null && other.getResponseGroup()==null) || 
             (this.responseGroup!=null &&
              java.util.Arrays.equals(this.responseGroup, other.getResponseGroup())));
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
        if (getQualificationTypeId() != null) {
            _hashCode += getQualificationTypeId().hashCode();
        }
        if (getWorkerId() != null) {
            _hashCode += getWorkerId().hashCode();
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getSendNotification() != null) {
            _hashCode += getSendNotification().hashCode();
        }
        if (getResponseGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroup(), i);
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
        new org.apache.axis.description.TypeDesc(AssignQualificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignQualificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "WorkerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "IntegerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ResponseGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
