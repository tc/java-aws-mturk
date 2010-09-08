/**
 * UpdateQualificationTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class UpdateQualificationTypeRequest  implements java.io.Serializable {
    private java.lang.String qualificationTypeId;

    private java.lang.String description;

    private com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus;

    private java.lang.String test;

    private java.lang.String answerKey;

    private java.lang.Long testDurationInSeconds;

    private java.lang.Long retryDelayInSeconds;

    private java.lang.Boolean autoGranted;

    private java.lang.Integer autoGrantedValue;

    private java.lang.String[] responseGroup;

    public UpdateQualificationTypeRequest() {
    }

    public UpdateQualificationTypeRequest(
           java.lang.String qualificationTypeId,
           java.lang.String description,
           com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus,
           java.lang.String test,
           java.lang.String answerKey,
           java.lang.Long testDurationInSeconds,
           java.lang.Long retryDelayInSeconds,
           java.lang.Boolean autoGranted,
           java.lang.Integer autoGrantedValue,
           java.lang.String[] responseGroup) {
           this.qualificationTypeId = qualificationTypeId;
           this.description = description;
           this.qualificationTypeStatus = qualificationTypeStatus;
           this.test = test;
           this.answerKey = answerKey;
           this.testDurationInSeconds = testDurationInSeconds;
           this.retryDelayInSeconds = retryDelayInSeconds;
           this.autoGranted = autoGranted;
           this.autoGrantedValue = autoGrantedValue;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the qualificationTypeId value for this UpdateQualificationTypeRequest.
     * 
     * @return qualificationTypeId
     */
    public java.lang.String getQualificationTypeId() {
        return qualificationTypeId;
    }


    /**
     * Sets the qualificationTypeId value for this UpdateQualificationTypeRequest.
     * 
     * @param qualificationTypeId
     */
    public void setQualificationTypeId(java.lang.String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }


    /**
     * Gets the description value for this UpdateQualificationTypeRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateQualificationTypeRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the qualificationTypeStatus value for this UpdateQualificationTypeRequest.
     * 
     * @return qualificationTypeStatus
     */
    public com.amazonaws.mturk.requester.QualificationTypeStatus getQualificationTypeStatus() {
        return qualificationTypeStatus;
    }


    /**
     * Sets the qualificationTypeStatus value for this UpdateQualificationTypeRequest.
     * 
     * @param qualificationTypeStatus
     */
    public void setQualificationTypeStatus(com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus;
    }


    /**
     * Gets the test value for this UpdateQualificationTypeRequest.
     * 
     * @return test
     */
    public java.lang.String getTest() {
        return test;
    }


    /**
     * Sets the test value for this UpdateQualificationTypeRequest.
     * 
     * @param test
     */
    public void setTest(java.lang.String test) {
        this.test = test;
    }


    /**
     * Gets the answerKey value for this UpdateQualificationTypeRequest.
     * 
     * @return answerKey
     */
    public java.lang.String getAnswerKey() {
        return answerKey;
    }


    /**
     * Sets the answerKey value for this UpdateQualificationTypeRequest.
     * 
     * @param answerKey
     */
    public void setAnswerKey(java.lang.String answerKey) {
        this.answerKey = answerKey;
    }


    /**
     * Gets the testDurationInSeconds value for this UpdateQualificationTypeRequest.
     * 
     * @return testDurationInSeconds
     */
    public java.lang.Long getTestDurationInSeconds() {
        return testDurationInSeconds;
    }


    /**
     * Sets the testDurationInSeconds value for this UpdateQualificationTypeRequest.
     * 
     * @param testDurationInSeconds
     */
    public void setTestDurationInSeconds(java.lang.Long testDurationInSeconds) {
        this.testDurationInSeconds = testDurationInSeconds;
    }


    /**
     * Gets the retryDelayInSeconds value for this UpdateQualificationTypeRequest.
     * 
     * @return retryDelayInSeconds
     */
    public java.lang.Long getRetryDelayInSeconds() {
        return retryDelayInSeconds;
    }


    /**
     * Sets the retryDelayInSeconds value for this UpdateQualificationTypeRequest.
     * 
     * @param retryDelayInSeconds
     */
    public void setRetryDelayInSeconds(java.lang.Long retryDelayInSeconds) {
        this.retryDelayInSeconds = retryDelayInSeconds;
    }


    /**
     * Gets the autoGranted value for this UpdateQualificationTypeRequest.
     * 
     * @return autoGranted
     */
    public java.lang.Boolean getAutoGranted() {
        return autoGranted;
    }


    /**
     * Sets the autoGranted value for this UpdateQualificationTypeRequest.
     * 
     * @param autoGranted
     */
    public void setAutoGranted(java.lang.Boolean autoGranted) {
        this.autoGranted = autoGranted;
    }


    /**
     * Gets the autoGrantedValue value for this UpdateQualificationTypeRequest.
     * 
     * @return autoGrantedValue
     */
    public java.lang.Integer getAutoGrantedValue() {
        return autoGrantedValue;
    }


    /**
     * Sets the autoGrantedValue value for this UpdateQualificationTypeRequest.
     * 
     * @param autoGrantedValue
     */
    public void setAutoGrantedValue(java.lang.Integer autoGrantedValue) {
        this.autoGrantedValue = autoGrantedValue;
    }


    /**
     * Gets the responseGroup value for this UpdateQualificationTypeRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this UpdateQualificationTypeRequest.
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
        if (!(obj instanceof UpdateQualificationTypeRequest)) return false;
        UpdateQualificationTypeRequest other = (UpdateQualificationTypeRequest) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.qualificationTypeStatus==null && other.getQualificationTypeStatus()==null) || 
             (this.qualificationTypeStatus!=null &&
              this.qualificationTypeStatus.equals(other.getQualificationTypeStatus()))) &&
            ((this.test==null && other.getTest()==null) || 
             (this.test!=null &&
              this.test.equals(other.getTest()))) &&
            ((this.answerKey==null && other.getAnswerKey()==null) || 
             (this.answerKey!=null &&
              this.answerKey.equals(other.getAnswerKey()))) &&
            ((this.testDurationInSeconds==null && other.getTestDurationInSeconds()==null) || 
             (this.testDurationInSeconds!=null &&
              this.testDurationInSeconds.equals(other.getTestDurationInSeconds()))) &&
            ((this.retryDelayInSeconds==null && other.getRetryDelayInSeconds()==null) || 
             (this.retryDelayInSeconds!=null &&
              this.retryDelayInSeconds.equals(other.getRetryDelayInSeconds()))) &&
            ((this.autoGranted==null && other.getAutoGranted()==null) || 
             (this.autoGranted!=null &&
              this.autoGranted.equals(other.getAutoGranted()))) &&
            ((this.autoGrantedValue==null && other.getAutoGrantedValue()==null) || 
             (this.autoGrantedValue!=null &&
              this.autoGrantedValue.equals(other.getAutoGrantedValue()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQualificationTypeStatus() != null) {
            _hashCode += getQualificationTypeStatus().hashCode();
        }
        if (getTest() != null) {
            _hashCode += getTest().hashCode();
        }
        if (getAnswerKey() != null) {
            _hashCode += getAnswerKey().hashCode();
        }
        if (getTestDurationInSeconds() != null) {
            _hashCode += getTestDurationInSeconds().hashCode();
        }
        if (getRetryDelayInSeconds() != null) {
            _hashCode += getRetryDelayInSeconds().hashCode();
        }
        if (getAutoGranted() != null) {
            _hashCode += getAutoGranted().hashCode();
        }
        if (getAutoGrantedValue() != null) {
            _hashCode += getAutoGrantedValue().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateQualificationTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "UpdateQualificationTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("qualificationTypeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Test"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AnswerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "TestDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryDelayInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RetryDelayInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGranted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AutoGranted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGrantedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AutoGrantedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
