/**
 * QualificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class QualificationRequest  implements java.io.Serializable {
    private java.lang.String qualificationRequestId;

    private java.lang.String qualificationTypeId;

    private java.lang.String subjectId;

    private java.lang.String test;

    private java.lang.String answer;

    private java.util.Calendar submitTime;

    public QualificationRequest() {
    }

    public QualificationRequest(
           java.lang.String qualificationRequestId,
           java.lang.String qualificationTypeId,
           java.lang.String subjectId,
           java.lang.String test,
           java.lang.String answer,
           java.util.Calendar submitTime) {
           this.qualificationRequestId = qualificationRequestId;
           this.qualificationTypeId = qualificationTypeId;
           this.subjectId = subjectId;
           this.test = test;
           this.answer = answer;
           this.submitTime = submitTime;
    }


    /**
     * Gets the qualificationRequestId value for this QualificationRequest.
     * 
     * @return qualificationRequestId
     */
    public java.lang.String getQualificationRequestId() {
        return qualificationRequestId;
    }


    /**
     * Sets the qualificationRequestId value for this QualificationRequest.
     * 
     * @param qualificationRequestId
     */
    public void setQualificationRequestId(java.lang.String qualificationRequestId) {
        this.qualificationRequestId = qualificationRequestId;
    }


    /**
     * Gets the qualificationTypeId value for this QualificationRequest.
     * 
     * @return qualificationTypeId
     */
    public java.lang.String getQualificationTypeId() {
        return qualificationTypeId;
    }


    /**
     * Sets the qualificationTypeId value for this QualificationRequest.
     * 
     * @param qualificationTypeId
     */
    public void setQualificationTypeId(java.lang.String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }


    /**
     * Gets the subjectId value for this QualificationRequest.
     * 
     * @return subjectId
     */
    public java.lang.String getSubjectId() {
        return subjectId;
    }


    /**
     * Sets the subjectId value for this QualificationRequest.
     * 
     * @param subjectId
     */
    public void setSubjectId(java.lang.String subjectId) {
        this.subjectId = subjectId;
    }


    /**
     * Gets the test value for this QualificationRequest.
     * 
     * @return test
     */
    public java.lang.String getTest() {
        return test;
    }


    /**
     * Sets the test value for this QualificationRequest.
     * 
     * @param test
     */
    public void setTest(java.lang.String test) {
        this.test = test;
    }


    /**
     * Gets the answer value for this QualificationRequest.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this QualificationRequest.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the submitTime value for this QualificationRequest.
     * 
     * @return submitTime
     */
    public java.util.Calendar getSubmitTime() {
        return submitTime;
    }


    /**
     * Sets the submitTime value for this QualificationRequest.
     * 
     * @param submitTime
     */
    public void setSubmitTime(java.util.Calendar submitTime) {
        this.submitTime = submitTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QualificationRequest)) return false;
        QualificationRequest other = (QualificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualificationRequestId==null && other.getQualificationRequestId()==null) || 
             (this.qualificationRequestId!=null &&
              this.qualificationRequestId.equals(other.getQualificationRequestId()))) &&
            ((this.qualificationTypeId==null && other.getQualificationTypeId()==null) || 
             (this.qualificationTypeId!=null &&
              this.qualificationTypeId.equals(other.getQualificationTypeId()))) &&
            ((this.subjectId==null && other.getSubjectId()==null) || 
             (this.subjectId!=null &&
              this.subjectId.equals(other.getSubjectId()))) &&
            ((this.test==null && other.getTest()==null) || 
             (this.test!=null &&
              this.test.equals(other.getTest()))) &&
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.submitTime==null && other.getSubmitTime()==null) || 
             (this.submitTime!=null &&
              this.submitTime.equals(other.getSubmitTime())));
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
        if (getQualificationRequestId() != null) {
            _hashCode += getQualificationRequestId().hashCode();
        }
        if (getQualificationTypeId() != null) {
            _hashCode += getQualificationTypeId().hashCode();
        }
        if (getSubjectId() != null) {
            _hashCode += getSubjectId().hashCode();
        }
        if (getTest() != null) {
            _hashCode += getTest().hashCode();
        }
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getSubmitTime() != null) {
            _hashCode += getSubmitTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationRequestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SubjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SubmitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
