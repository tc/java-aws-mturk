/**
 * GetFileUploadURLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetFileUploadURLRequest  implements java.io.Serializable {
    private java.lang.String assignmentId;

    private java.lang.String questionIdentifier;

    public GetFileUploadURLRequest() {
    }

    public GetFileUploadURLRequest(
           java.lang.String assignmentId,
           java.lang.String questionIdentifier) {
           this.assignmentId = assignmentId;
           this.questionIdentifier = questionIdentifier;
    }


    /**
     * Gets the assignmentId value for this GetFileUploadURLRequest.
     * 
     * @return assignmentId
     */
    public java.lang.String getAssignmentId() {
        return assignmentId;
    }


    /**
     * Sets the assignmentId value for this GetFileUploadURLRequest.
     * 
     * @param assignmentId
     */
    public void setAssignmentId(java.lang.String assignmentId) {
        this.assignmentId = assignmentId;
    }


    /**
     * Gets the questionIdentifier value for this GetFileUploadURLRequest.
     * 
     * @return questionIdentifier
     */
    public java.lang.String getQuestionIdentifier() {
        return questionIdentifier;
    }


    /**
     * Sets the questionIdentifier value for this GetFileUploadURLRequest.
     * 
     * @param questionIdentifier
     */
    public void setQuestionIdentifier(java.lang.String questionIdentifier) {
        this.questionIdentifier = questionIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFileUploadURLRequest)) return false;
        GetFileUploadURLRequest other = (GetFileUploadURLRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assignmentId==null && other.getAssignmentId()==null) || 
             (this.assignmentId!=null &&
              this.assignmentId.equals(other.getAssignmentId()))) &&
            ((this.questionIdentifier==null && other.getQuestionIdentifier()==null) || 
             (this.questionIdentifier!=null &&
              this.questionIdentifier.equals(other.getQuestionIdentifier())));
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
        if (getAssignmentId() != null) {
            _hashCode += getAssignmentId().hashCode();
        }
        if (getQuestionIdentifier() != null) {
            _hashCode += getQuestionIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFileUploadURLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QuestionIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
