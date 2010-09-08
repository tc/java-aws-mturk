/**
 * ApproveAssignmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class ApproveAssignmentResponse  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.OperationRequest operationRequest;

    private com.amazonaws.mturk.requester.ApproveAssignmentResult[] approveAssignmentResult;

    public ApproveAssignmentResponse() {
    }

    public ApproveAssignmentResponse(
           com.amazonaws.mturk.requester.OperationRequest operationRequest,
           com.amazonaws.mturk.requester.ApproveAssignmentResult[] approveAssignmentResult) {
           this.operationRequest = operationRequest;
           this.approveAssignmentResult = approveAssignmentResult;
    }


    /**
     * Gets the operationRequest value for this ApproveAssignmentResponse.
     * 
     * @return operationRequest
     */
    public com.amazonaws.mturk.requester.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this ApproveAssignmentResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazonaws.mturk.requester.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the approveAssignmentResult value for this ApproveAssignmentResponse.
     * 
     * @return approveAssignmentResult
     */
    public com.amazonaws.mturk.requester.ApproveAssignmentResult[] getApproveAssignmentResult() {
        return approveAssignmentResult;
    }


    /**
     * Sets the approveAssignmentResult value for this ApproveAssignmentResponse.
     * 
     * @param approveAssignmentResult
     */
    public void setApproveAssignmentResult(com.amazonaws.mturk.requester.ApproveAssignmentResult[] approveAssignmentResult) {
        this.approveAssignmentResult = approveAssignmentResult;
    }

    public com.amazonaws.mturk.requester.ApproveAssignmentResult getApproveAssignmentResult(int i) {
        return this.approveAssignmentResult[i];
    }

    public void setApproveAssignmentResult(int i, com.amazonaws.mturk.requester.ApproveAssignmentResult _value) {
        this.approveAssignmentResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApproveAssignmentResponse)) return false;
        ApproveAssignmentResponse other = (ApproveAssignmentResponse) obj;
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
            ((this.approveAssignmentResult==null && other.getApproveAssignmentResult()==null) || 
             (this.approveAssignmentResult!=null &&
              java.util.Arrays.equals(this.approveAssignmentResult, other.getApproveAssignmentResult())));
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
        if (getApproveAssignmentResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApproveAssignmentResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApproveAssignmentResult(), i);
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
        new org.apache.axis.description.TypeDesc(ApproveAssignmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">ApproveAssignmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveAssignmentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ApproveAssignmentResult"));
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
