/**
 * SetHITTypeNotificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SetHITTypeNotificationRequest  implements java.io.Serializable {
    private java.lang.String HITTypeId;

    private com.amazonaws.mturk.requester.NotificationSpecification notification;

    private java.lang.Boolean active;

    public SetHITTypeNotificationRequest() {
    }

    public SetHITTypeNotificationRequest(
           java.lang.String HITTypeId,
           com.amazonaws.mturk.requester.NotificationSpecification notification,
           java.lang.Boolean active) {
           this.HITTypeId = HITTypeId;
           this.notification = notification;
           this.active = active;
    }


    /**
     * Gets the HITTypeId value for this SetHITTypeNotificationRequest.
     * 
     * @return HITTypeId
     */
    public java.lang.String getHITTypeId() {
        return HITTypeId;
    }


    /**
     * Sets the HITTypeId value for this SetHITTypeNotificationRequest.
     * 
     * @param HITTypeId
     */
    public void setHITTypeId(java.lang.String HITTypeId) {
        this.HITTypeId = HITTypeId;
    }


    /**
     * Gets the notification value for this SetHITTypeNotificationRequest.
     * 
     * @return notification
     */
    public com.amazonaws.mturk.requester.NotificationSpecification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this SetHITTypeNotificationRequest.
     * 
     * @param notification
     */
    public void setNotification(com.amazonaws.mturk.requester.NotificationSpecification notification) {
        this.notification = notification;
    }


    /**
     * Gets the active value for this SetHITTypeNotificationRequest.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this SetHITTypeNotificationRequest.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetHITTypeNotificationRequest)) return false;
        SetHITTypeNotificationRequest other = (SetHITTypeNotificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HITTypeId==null && other.getHITTypeId()==null) || 
             (this.HITTypeId!=null &&
              this.HITTypeId.equals(other.getHITTypeId()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive())));
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
        if (getHITTypeId() != null) {
            _hashCode += getHITTypeId().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetHITTypeNotificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SetHITTypeNotificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotificationSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
