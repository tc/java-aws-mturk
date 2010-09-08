/**
 * GetQualificationsForQualificationTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetQualificationsForQualificationTypeResponse  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.OperationRequest operationRequest;

    private com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult[] getQualificationsForQualificationTypeResult;

    public GetQualificationsForQualificationTypeResponse() {
    }

    public GetQualificationsForQualificationTypeResponse(
           com.amazonaws.mturk.requester.OperationRequest operationRequest,
           com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult[] getQualificationsForQualificationTypeResult) {
           this.operationRequest = operationRequest;
           this.getQualificationsForQualificationTypeResult = getQualificationsForQualificationTypeResult;
    }


    /**
     * Gets the operationRequest value for this GetQualificationsForQualificationTypeResponse.
     * 
     * @return operationRequest
     */
    public com.amazonaws.mturk.requester.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this GetQualificationsForQualificationTypeResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazonaws.mturk.requester.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the getQualificationsForQualificationTypeResult value for this GetQualificationsForQualificationTypeResponse.
     * 
     * @return getQualificationsForQualificationTypeResult
     */
    public com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult[] getGetQualificationsForQualificationTypeResult() {
        return getQualificationsForQualificationTypeResult;
    }


    /**
     * Sets the getQualificationsForQualificationTypeResult value for this GetQualificationsForQualificationTypeResponse.
     * 
     * @param getQualificationsForQualificationTypeResult
     */
    public void setGetQualificationsForQualificationTypeResult(com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult[] getQualificationsForQualificationTypeResult) {
        this.getQualificationsForQualificationTypeResult = getQualificationsForQualificationTypeResult;
    }

    public com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult getGetQualificationsForQualificationTypeResult(int i) {
        return this.getQualificationsForQualificationTypeResult[i];
    }

    public void setGetQualificationsForQualificationTypeResult(int i, com.amazonaws.mturk.requester.GetQualificationsForQualificationTypeResult _value) {
        this.getQualificationsForQualificationTypeResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQualificationsForQualificationTypeResponse)) return false;
        GetQualificationsForQualificationTypeResponse other = (GetQualificationsForQualificationTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationRequest==null && other.getOperationRequest()==null) || 
             (this.operationRequest!=null &&
              this.operationRequest.equals(other.getOperationRequest()))) &&
            ((this.getQualificationsForQualificationTypeResult==null && other.getGetQualificationsForQualificationTypeResult()==null) || 
             (this.getQualificationsForQualificationTypeResult!=null &&
              java.util.Arrays.equals(this.getQualificationsForQualificationTypeResult, other.getGetQualificationsForQualificationTypeResult())));
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
        if (getOperationRequest() != null) {
            _hashCode += getOperationRequest().hashCode();
        }
        if (getGetQualificationsForQualificationTypeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetQualificationsForQualificationTypeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetQualificationsForQualificationTypeResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetQualificationsForQualificationTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">GetQualificationsForQualificationTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQualificationsForQualificationTypeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationsForQualificationTypeResult"));
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
