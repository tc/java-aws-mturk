/**
 * SetWorkerAcceptLimitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SetWorkerAcceptLimitResponse  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.OperationRequest operationRequest;

    private com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult[] setWorkerAcceptLimitResult;

    public SetWorkerAcceptLimitResponse() {
    }

    public SetWorkerAcceptLimitResponse(
           com.amazonaws.mturk.requester.OperationRequest operationRequest,
           com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult[] setWorkerAcceptLimitResult) {
           this.operationRequest = operationRequest;
           this.setWorkerAcceptLimitResult = setWorkerAcceptLimitResult;
    }


    /**
     * Gets the operationRequest value for this SetWorkerAcceptLimitResponse.
     * 
     * @return operationRequest
     */
    public com.amazonaws.mturk.requester.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this SetWorkerAcceptLimitResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazonaws.mturk.requester.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the setWorkerAcceptLimitResult value for this SetWorkerAcceptLimitResponse.
     * 
     * @return setWorkerAcceptLimitResult
     */
    public com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult[] getSetWorkerAcceptLimitResult() {
        return setWorkerAcceptLimitResult;
    }


    /**
     * Sets the setWorkerAcceptLimitResult value for this SetWorkerAcceptLimitResponse.
     * 
     * @param setWorkerAcceptLimitResult
     */
    public void setSetWorkerAcceptLimitResult(com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult[] setWorkerAcceptLimitResult) {
        this.setWorkerAcceptLimitResult = setWorkerAcceptLimitResult;
    }

    public com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult getSetWorkerAcceptLimitResult(int i) {
        return this.setWorkerAcceptLimitResult[i];
    }

    public void setSetWorkerAcceptLimitResult(int i, com.amazonaws.mturk.requester.SetWorkerAcceptLimitResult _value) {
        this.setWorkerAcceptLimitResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetWorkerAcceptLimitResponse)) return false;
        SetWorkerAcceptLimitResponse other = (SetWorkerAcceptLimitResponse) obj;
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
            ((this.setWorkerAcceptLimitResult==null && other.getSetWorkerAcceptLimitResult()==null) || 
             (this.setWorkerAcceptLimitResult!=null &&
              java.util.Arrays.equals(this.setWorkerAcceptLimitResult, other.getSetWorkerAcceptLimitResult())));
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
        if (getSetWorkerAcceptLimitResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetWorkerAcceptLimitResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSetWorkerAcceptLimitResult(), i);
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
        new org.apache.axis.description.TypeDesc(SetWorkerAcceptLimitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">SetWorkerAcceptLimitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setWorkerAcceptLimitResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitResult"));
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
