/**
 * SetWorkerAcceptLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SetWorkerAcceptLimitRequest  implements java.io.Serializable {
    private int maxWorkerAcceptLimit;

    private com.amazonaws.mturk.requester.LimitGroupType limitGroupType;

    private java.lang.String limitGroupId;

    private java.lang.String[] responseGroup;

    public SetWorkerAcceptLimitRequest() {
    }

    public SetWorkerAcceptLimitRequest(
           int maxWorkerAcceptLimit,
           com.amazonaws.mturk.requester.LimitGroupType limitGroupType,
           java.lang.String limitGroupId,
           java.lang.String[] responseGroup) {
           this.maxWorkerAcceptLimit = maxWorkerAcceptLimit;
           this.limitGroupType = limitGroupType;
           this.limitGroupId = limitGroupId;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the maxWorkerAcceptLimit value for this SetWorkerAcceptLimitRequest.
     * 
     * @return maxWorkerAcceptLimit
     */
    public int getMaxWorkerAcceptLimit() {
        return maxWorkerAcceptLimit;
    }


    /**
     * Sets the maxWorkerAcceptLimit value for this SetWorkerAcceptLimitRequest.
     * 
     * @param maxWorkerAcceptLimit
     */
    public void setMaxWorkerAcceptLimit(int maxWorkerAcceptLimit) {
        this.maxWorkerAcceptLimit = maxWorkerAcceptLimit;
    }


    /**
     * Gets the limitGroupType value for this SetWorkerAcceptLimitRequest.
     * 
     * @return limitGroupType
     */
    public com.amazonaws.mturk.requester.LimitGroupType getLimitGroupType() {
        return limitGroupType;
    }


    /**
     * Sets the limitGroupType value for this SetWorkerAcceptLimitRequest.
     * 
     * @param limitGroupType
     */
    public void setLimitGroupType(com.amazonaws.mturk.requester.LimitGroupType limitGroupType) {
        this.limitGroupType = limitGroupType;
    }


    /**
     * Gets the limitGroupId value for this SetWorkerAcceptLimitRequest.
     * 
     * @return limitGroupId
     */
    public java.lang.String getLimitGroupId() {
        return limitGroupId;
    }


    /**
     * Sets the limitGroupId value for this SetWorkerAcceptLimitRequest.
     * 
     * @param limitGroupId
     */
    public void setLimitGroupId(java.lang.String limitGroupId) {
        this.limitGroupId = limitGroupId;
    }


    /**
     * Gets the responseGroup value for this SetWorkerAcceptLimitRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this SetWorkerAcceptLimitRequest.
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
        if (!(obj instanceof SetWorkerAcceptLimitRequest)) return false;
        SetWorkerAcceptLimitRequest other = (SetWorkerAcceptLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxWorkerAcceptLimit == other.getMaxWorkerAcceptLimit() &&
            ((this.limitGroupType==null && other.getLimitGroupType()==null) || 
             (this.limitGroupType!=null &&
              this.limitGroupType.equals(other.getLimitGroupType()))) &&
            ((this.limitGroupId==null && other.getLimitGroupId()==null) || 
             (this.limitGroupId!=null &&
              this.limitGroupId.equals(other.getLimitGroupId()))) &&
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
        _hashCode += getMaxWorkerAcceptLimit();
        if (getLimitGroupType() != null) {
            _hashCode += getLimitGroupType().hashCode();
        }
        if (getLimitGroupId() != null) {
            _hashCode += getLimitGroupId().hashCode();
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
        new org.apache.axis.description.TypeDesc(SetWorkerAcceptLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetWorkerAcceptLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxWorkerAcceptLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "MaxWorkerAcceptLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "LimitGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "LimitGroupType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "LimitGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
