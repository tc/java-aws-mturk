/**
 * GetAccountBalanceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetAccountBalanceResult  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private com.amazonaws.mturk.requester.Price availableBalance;

    private com.amazonaws.mturk.requester.Price onHoldBalance;

    public GetAccountBalanceResult() {
    }

    public GetAccountBalanceResult(
           com.amazonaws.mturk.requester.Request request,
           com.amazonaws.mturk.requester.Price availableBalance,
           com.amazonaws.mturk.requester.Price onHoldBalance) {
           this.request = request;
           this.availableBalance = availableBalance;
           this.onHoldBalance = onHoldBalance;
    }


    /**
     * Gets the request value for this GetAccountBalanceResult.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this GetAccountBalanceResult.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the availableBalance value for this GetAccountBalanceResult.
     * 
     * @return availableBalance
     */
    public com.amazonaws.mturk.requester.Price getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this GetAccountBalanceResult.
     * 
     * @param availableBalance
     */
    public void setAvailableBalance(com.amazonaws.mturk.requester.Price availableBalance) {
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the onHoldBalance value for this GetAccountBalanceResult.
     * 
     * @return onHoldBalance
     */
    public com.amazonaws.mturk.requester.Price getOnHoldBalance() {
        return onHoldBalance;
    }


    /**
     * Sets the onHoldBalance value for this GetAccountBalanceResult.
     * 
     * @param onHoldBalance
     */
    public void setOnHoldBalance(com.amazonaws.mturk.requester.Price onHoldBalance) {
        this.onHoldBalance = onHoldBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountBalanceResult)) return false;
        GetAccountBalanceResult other = (GetAccountBalanceResult) obj;
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
            ((this.availableBalance==null && other.getAvailableBalance()==null) || 
             (this.availableBalance!=null &&
              this.availableBalance.equals(other.getAvailableBalance()))) &&
            ((this.onHoldBalance==null && other.getOnHoldBalance()==null) || 
             (this.onHoldBalance!=null &&
              this.onHoldBalance.equals(other.getOnHoldBalance())));
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
        if (getAvailableBalance() != null) {
            _hashCode += getAvailableBalance().hashCode();
        }
        if (getOnHoldBalance() != null) {
            _hashCode += getOnHoldBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountBalanceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAccountBalanceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AvailableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHoldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "OnHoldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
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
