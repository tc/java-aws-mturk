/**
 * SendTestEventNotificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SendTestEventNotificationRequest  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.NotificationSpecification notification;

    private com.amazonaws.mturk.requester.EventType testEventType;

    public SendTestEventNotificationRequest() {
    }

    public SendTestEventNotificationRequest(
           com.amazonaws.mturk.requester.NotificationSpecification notification,
           com.amazonaws.mturk.requester.EventType testEventType) {
           this.notification = notification;
           this.testEventType = testEventType;
    }


    /**
     * Gets the notification value for this SendTestEventNotificationRequest.
     * 
     * @return notification
     */
    public com.amazonaws.mturk.requester.NotificationSpecification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this SendTestEventNotificationRequest.
     * 
     * @param notification
     */
    public void setNotification(com.amazonaws.mturk.requester.NotificationSpecification notification) {
        this.notification = notification;
    }


    /**
     * Gets the testEventType value for this SendTestEventNotificationRequest.
     * 
     * @return testEventType
     */
    public com.amazonaws.mturk.requester.EventType getTestEventType() {
        return testEventType;
    }


    /**
     * Sets the testEventType value for this SendTestEventNotificationRequest.
     * 
     * @param testEventType
     */
    public void setTestEventType(com.amazonaws.mturk.requester.EventType testEventType) {
        this.testEventType = testEventType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendTestEventNotificationRequest)) return false;
        SendTestEventNotificationRequest other = (SendTestEventNotificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.testEventType==null && other.getTestEventType()==null) || 
             (this.testEventType!=null &&
              this.testEventType.equals(other.getTestEventType())));
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
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getTestEventType() != null) {
            _hashCode += getTestEventType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendTestEventNotificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SendTestEventNotificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NotificationSpecification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "TestEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "EventType"));
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
