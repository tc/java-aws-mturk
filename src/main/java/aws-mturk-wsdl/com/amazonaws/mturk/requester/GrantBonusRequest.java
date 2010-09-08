/**
 * GrantBonusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GrantBonusRequest  implements java.io.Serializable {
    private java.lang.String workerId;

    private com.amazonaws.mturk.requester.Price bonusAmount;

    private java.lang.String assignmentId;

    private java.lang.String reason;

    private java.lang.String[] responseGroup;

    public GrantBonusRequest() {
    }

    public GrantBonusRequest(
           java.lang.String workerId,
           com.amazonaws.mturk.requester.Price bonusAmount,
           java.lang.String assignmentId,
           java.lang.String reason,
           java.lang.String[] responseGroup) {
           this.workerId = workerId;
           this.bonusAmount = bonusAmount;
           this.assignmentId = assignmentId;
           this.reason = reason;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the workerId value for this GrantBonusRequest.
     * 
     * @return workerId
     */
    public java.lang.String getWorkerId() {
        return workerId;
    }


    /**
     * Sets the workerId value for this GrantBonusRequest.
     * 
     * @param workerId
     */
    public void setWorkerId(java.lang.String workerId) {
        this.workerId = workerId;
    }


    /**
     * Gets the bonusAmount value for this GrantBonusRequest.
     * 
     * @return bonusAmount
     */
    public com.amazonaws.mturk.requester.Price getBonusAmount() {
        return bonusAmount;
    }


    /**
     * Sets the bonusAmount value for this GrantBonusRequest.
     * 
     * @param bonusAmount
     */
    public void setBonusAmount(com.amazonaws.mturk.requester.Price bonusAmount) {
        this.bonusAmount = bonusAmount;
    }


    /**
     * Gets the assignmentId value for this GrantBonusRequest.
     * 
     * @return assignmentId
     */
    public java.lang.String getAssignmentId() {
        return assignmentId;
    }


    /**
     * Sets the assignmentId value for this GrantBonusRequest.
     * 
     * @param assignmentId
     */
    public void setAssignmentId(java.lang.String assignmentId) {
        this.assignmentId = assignmentId;
    }


    /**
     * Gets the reason value for this GrantBonusRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this GrantBonusRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the responseGroup value for this GrantBonusRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this GrantBonusRequest.
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
        if (!(obj instanceof GrantBonusRequest)) return false;
        GrantBonusRequest other = (GrantBonusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workerId==null && other.getWorkerId()==null) || 
             (this.workerId!=null &&
              this.workerId.equals(other.getWorkerId()))) &&
            ((this.bonusAmount==null && other.getBonusAmount()==null) || 
             (this.bonusAmount!=null &&
              this.bonusAmount.equals(other.getBonusAmount()))) &&
            ((this.assignmentId==null && other.getAssignmentId()==null) || 
             (this.assignmentId!=null &&
              this.assignmentId.equals(other.getAssignmentId()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
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
        if (getWorkerId() != null) {
            _hashCode += getWorkerId().hashCode();
        }
        if (getBonusAmount() != null) {
            _hashCode += getBonusAmount().hashCode();
        }
        if (getAssignmentId() != null) {
            _hashCode += getAssignmentId().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
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
        new org.apache.axis.description.TypeDesc(GrantBonusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GrantBonusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "WorkerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "BonusAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
