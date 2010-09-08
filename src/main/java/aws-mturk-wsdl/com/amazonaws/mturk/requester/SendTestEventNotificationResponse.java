/**
 * SendTestEventNotificationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SendTestEventNotificationResponse  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.OperationRequest operationRequest;

    private com.amazonaws.mturk.requester.SendTestEventNotificationResult[] sendTestEventNotificationResult;

    public SendTestEventNotificationResponse() {
    }

    public SendTestEventNotificationResponse(
           com.amazonaws.mturk.requester.OperationRequest operationRequest,
           com.amazonaws.mturk.requester.SendTestEventNotificationResult[] sendTestEventNotificationResult) {
           this.operationRequest = operationRequest;
           this.sendTestEventNotificationResult = sendTestEventNotificationResult;
    }


    /**
     * Gets the operationRequest value for this SendTestEventNotificationResponse.
     * 
     * @return operationRequest
     */
    public com.amazonaws.mturk.requester.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this SendTestEventNotificationResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazonaws.mturk.requester.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the sendTestEventNotificationResult value for this SendTestEventNotificationResponse.
     * 
     * @return sendTestEventNotificationResult
     */
    public com.amazonaws.mturk.requester.SendTestEventNotificationResult[] getSendTestEventNotificationResult() {
        return sendTestEventNotificationResult;
    }


    /**
     * Sets the sendTestEventNotificationResult value for this SendTestEventNotificationResponse.
     * 
     * @param sendTestEventNotificationResult
     */
    public void setSendTestEventNotificationResult(com.amazonaws.mturk.requester.SendTestEventNotificationResult[] sendTestEventNotificationResult) {
        this.sendTestEventNotificationResult = sendTestEventNotificationResult;
    }

    public com.amazonaws.mturk.requester.SendTestEventNotificationResult getSendTestEventNotificationResult(int i) {
        return this.sendTestEventNotificationResult[i];
    }

    public void setSendTestEventNotificationResult(int i, com.amazonaws.mturk.requester.SendTestEventNotificationResult _value) {
        this.sendTestEventNotificationResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendTestEventNotificationResponse)) return false;
        SendTestEventNotificationResponse other = (SendTestEventNotificationResponse) obj;
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
            ((this.sendTestEventNotificationResult==null && other.getSendTestEventNotificationResult()==null) || 
             (this.sendTestEventNotificationResult!=null &&
              java.util.Arrays.equals(this.sendTestEventNotificationResult, other.getSendTestEventNotificationResult())));
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
        if (getSendTestEventNotificationResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendTestEventNotificationResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendTestEventNotificationResult(), i);
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
        new org.apache.axis.description.TypeDesc(SendTestEventNotificationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SendTestEventNotificationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTestEventNotificationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationResult"));
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
