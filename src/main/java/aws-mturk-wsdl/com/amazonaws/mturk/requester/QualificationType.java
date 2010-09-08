/**
 * QualificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class QualificationType  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.String qualificationTypeId;

    private java.util.Calendar creationTime;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String keywords;

    private com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus;

    private java.lang.String test;

    private java.lang.Long testDurationInSeconds;

    private java.lang.String answerKey;

    private java.lang.Long retryDelayInSeconds;

    private java.lang.Boolean isRequestable;

    private java.lang.Boolean autoGranted;

    private java.lang.Integer autoGrantedValue;

    public QualificationType() {
    }

    public QualificationType(
           com.amazonaws.mturk.requester.Request request,
           java.lang.String qualificationTypeId,
           java.util.Calendar creationTime,
           java.lang.String name,
           java.lang.String description,
           java.lang.String keywords,
           com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus,
           java.lang.String test,
           java.lang.Long testDurationInSeconds,
           java.lang.String answerKey,
           java.lang.Long retryDelayInSeconds,
           java.lang.Boolean isRequestable,
           java.lang.Boolean autoGranted,
           java.lang.Integer autoGrantedValue) {
           this.request = request;
           this.qualificationTypeId = qualificationTypeId;
           this.creationTime = creationTime;
           this.name = name;
           this.description = description;
           this.keywords = keywords;
           this.qualificationTypeStatus = qualificationTypeStatus;
           this.test = test;
           this.testDurationInSeconds = testDurationInSeconds;
           this.answerKey = answerKey;
           this.retryDelayInSeconds = retryDelayInSeconds;
           this.isRequestable = isRequestable;
           this.autoGranted = autoGranted;
           this.autoGrantedValue = autoGrantedValue;
    }


    /**
     * Gets the request value for this QualificationType.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this QualificationType.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the qualificationTypeId value for this QualificationType.
     * 
     * @return qualificationTypeId
     */
    public java.lang.String getQualificationTypeId() {
        return qualificationTypeId;
    }


    /**
     * Sets the qualificationTypeId value for this QualificationType.
     * 
     * @param qualificationTypeId
     */
    public void setQualificationTypeId(java.lang.String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }


    /**
     * Gets the creationTime value for this QualificationType.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this QualificationType.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the name value for this QualificationType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this QualificationType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this QualificationType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QualificationType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the keywords value for this QualificationType.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this QualificationType.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the qualificationTypeStatus value for this QualificationType.
     * 
     * @return qualificationTypeStatus
     */
    public com.amazonaws.mturk.requester.QualificationTypeStatus getQualificationTypeStatus() {
        return qualificationTypeStatus;
    }


    /**
     * Sets the qualificationTypeStatus value for this QualificationType.
     * 
     * @param qualificationTypeStatus
     */
    public void setQualificationTypeStatus(com.amazonaws.mturk.requester.QualificationTypeStatus qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus;
    }


    /**
     * Gets the test value for this QualificationType.
     * 
     * @return test
     */
    public java.lang.String getTest() {
        return test;
    }


    /**
     * Sets the test value for this QualificationType.
     * 
     * @param test
     */
    public void setTest(java.lang.String test) {
        this.test = test;
    }


    /**
     * Gets the testDurationInSeconds value for this QualificationType.
     * 
     * @return testDurationInSeconds
     */
    public java.lang.Long getTestDurationInSeconds() {
        return testDurationInSeconds;
    }


    /**
     * Sets the testDurationInSeconds value for this QualificationType.
     * 
     * @param testDurationInSeconds
     */
    public void setTestDurationInSeconds(java.lang.Long testDurationInSeconds) {
        this.testDurationInSeconds = testDurationInSeconds;
    }


    /**
     * Gets the answerKey value for this QualificationType.
     * 
     * @return answerKey
     */
    public java.lang.String getAnswerKey() {
        return answerKey;
    }


    /**
     * Sets the answerKey value for this QualificationType.
     * 
     * @param answerKey
     */
    public void setAnswerKey(java.lang.String answerKey) {
        this.answerKey = answerKey;
    }


    /**
     * Gets the retryDelayInSeconds value for this QualificationType.
     * 
     * @return retryDelayInSeconds
     */
    public java.lang.Long getRetryDelayInSeconds() {
        return retryDelayInSeconds;
    }


    /**
     * Sets the retryDelayInSeconds value for this QualificationType.
     * 
     * @param retryDelayInSeconds
     */
    public void setRetryDelayInSeconds(java.lang.Long retryDelayInSeconds) {
        this.retryDelayInSeconds = retryDelayInSeconds;
    }


    /**
     * Gets the isRequestable value for this QualificationType.
     * 
     * @return isRequestable
     */
    public java.lang.Boolean getIsRequestable() {
        return isRequestable;
    }


    /**
     * Sets the isRequestable value for this QualificationType.
     * 
     * @param isRequestable
     */
    public void setIsRequestable(java.lang.Boolean isRequestable) {
        this.isRequestable = isRequestable;
    }


    /**
     * Gets the autoGranted value for this QualificationType.
     * 
     * @return autoGranted
     */
    public java.lang.Boolean getAutoGranted() {
        return autoGranted;
    }


    /**
     * Sets the autoGranted value for this QualificationType.
     * 
     * @param autoGranted
     */
    public void setAutoGranted(java.lang.Boolean autoGranted) {
        this.autoGranted = autoGranted;
    }


    /**
     * Gets the autoGrantedValue value for this QualificationType.
     * 
     * @return autoGrantedValue
     */
    public java.lang.Integer getAutoGrantedValue() {
        return autoGrantedValue;
    }


    /**
     * Sets the autoGrantedValue value for this QualificationType.
     * 
     * @param autoGrantedValue
     */
    public void setAutoGrantedValue(java.lang.Integer autoGrantedValue) {
        this.autoGrantedValue = autoGrantedValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QualificationType)) return false;
        QualificationType other = (QualificationType) obj;
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
            ((this.qualificationTypeId==null && other.getQualificationTypeId()==null) || 
             (this.qualificationTypeId!=null &&
              this.qualificationTypeId.equals(other.getQualificationTypeId()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.qualificationTypeStatus==null && other.getQualificationTypeStatus()==null) || 
             (this.qualificationTypeStatus!=null &&
              this.qualificationTypeStatus.equals(other.getQualificationTypeStatus()))) &&
            ((this.test==null && other.getTest()==null) || 
             (this.test!=null &&
              this.test.equals(other.getTest()))) &&
            ((this.testDurationInSeconds==null && other.getTestDurationInSeconds()==null) || 
             (this.testDurationInSeconds!=null &&
              this.testDurationInSeconds.equals(other.getTestDurationInSeconds()))) &&
            ((this.answerKey==null && other.getAnswerKey()==null) || 
             (this.answerKey!=null &&
              this.answerKey.equals(other.getAnswerKey()))) &&
            ((this.retryDelayInSeconds==null && other.getRetryDelayInSeconds()==null) || 
             (this.retryDelayInSeconds!=null &&
              this.retryDelayInSeconds.equals(other.getRetryDelayInSeconds()))) &&
            ((this.isRequestable==null && other.getIsRequestable()==null) || 
             (this.isRequestable!=null &&
              this.isRequestable.equals(other.getIsRequestable()))) &&
            ((this.autoGranted==null && other.getAutoGranted()==null) || 
             (this.autoGranted!=null &&
              this.autoGranted.equals(other.getAutoGranted()))) &&
            ((this.autoGrantedValue==null && other.getAutoGrantedValue()==null) || 
             (this.autoGrantedValue!=null &&
              this.autoGrantedValue.equals(other.getAutoGrantedValue())));
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
        if (getQualificationTypeId() != null) {
            _hashCode += getQualificationTypeId().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getQualificationTypeStatus() != null) {
            _hashCode += getQualificationTypeStatus().hashCode();
        }
        if (getTest() != null) {
            _hashCode += getTest().hashCode();
        }
        if (getTestDurationInSeconds() != null) {
            _hashCode += getTestDurationInSeconds().hashCode();
        }
        if (getAnswerKey() != null) {
            _hashCode += getAnswerKey().hashCode();
        }
        if (getRetryDelayInSeconds() != null) {
            _hashCode += getRetryDelayInSeconds().hashCode();
        }
        if (getIsRequestable() != null) {
            _hashCode += getIsRequestable().hashCode();
        }
        if (getAutoGranted() != null) {
            _hashCode += getAutoGranted().hashCode();
        }
        if (getAutoGrantedValue() != null) {
            _hashCode += getAutoGrantedValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualificationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeId"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Name"));
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
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Keywords"));
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
        elemField.setFieldName("testDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "TestDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("retryDelayInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RetryDelayInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRequestable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "IsRequestable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
