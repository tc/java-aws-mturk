/**
 * GetFileUploadURLResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetFileUploadURLResult  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.String fileUploadURL;

    public GetFileUploadURLResult() {
    }

    public GetFileUploadURLResult(
           com.amazonaws.mturk.requester.Request request,
           java.lang.String fileUploadURL) {
           this.request = request;
           this.fileUploadURL = fileUploadURL;
    }


    /**
     * Gets the request value for this GetFileUploadURLResult.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this GetFileUploadURLResult.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the fileUploadURL value for this GetFileUploadURLResult.
     * 
     * @return fileUploadURL
     */
    public java.lang.String getFileUploadURL() {
        return fileUploadURL;
    }


    /**
     * Sets the fileUploadURL value for this GetFileUploadURLResult.
     * 
     * @param fileUploadURL
     */
    public void setFileUploadURL(java.lang.String fileUploadURL) {
        this.fileUploadURL = fileUploadURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFileUploadURLResult)) return false;
        GetFileUploadURLResult other = (GetFileUploadURLResult) obj;
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
            ((this.fileUploadURL==null && other.getFileUploadURL()==null) || 
             (this.fileUploadURL!=null &&
              this.fileUploadURL.equals(other.getFileUploadURL())));
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
        if (getFileUploadURL() != null) {
            _hashCode += getFileUploadURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFileUploadURLResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetFileUploadURLResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUploadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "FileUploadURL"));
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
