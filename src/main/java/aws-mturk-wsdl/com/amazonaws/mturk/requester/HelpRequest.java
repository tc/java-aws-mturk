/**
 * HelpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class HelpRequest  implements java.io.Serializable {
    private java.lang.String[] about;

    private com.amazonaws.mturk.requester.HelpRequestHelpType helpType;

    private java.lang.String[] responseGroup;

    public HelpRequest() {
    }

    public HelpRequest(
           java.lang.String[] about,
           com.amazonaws.mturk.requester.HelpRequestHelpType helpType,
           java.lang.String[] responseGroup) {
           this.about = about;
           this.helpType = helpType;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the about value for this HelpRequest.
     * 
     * @return about
     */
    public java.lang.String[] getAbout() {
        return about;
    }


    /**
     * Sets the about value for this HelpRequest.
     * 
     * @param about
     */
    public void setAbout(java.lang.String[] about) {
        this.about = about;
    }

    public java.lang.String getAbout(int i) {
        return this.about[i];
    }

    public void setAbout(int i, java.lang.String _value) {
        this.about[i] = _value;
    }


    /**
     * Gets the helpType value for this HelpRequest.
     * 
     * @return helpType
     */
    public com.amazonaws.mturk.requester.HelpRequestHelpType getHelpType() {
        return helpType;
    }


    /**
     * Sets the helpType value for this HelpRequest.
     * 
     * @param helpType
     */
    public void setHelpType(com.amazonaws.mturk.requester.HelpRequestHelpType helpType) {
        this.helpType = helpType;
    }


    /**
     * Gets the responseGroup value for this HelpRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this HelpRequest.
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
        if (!(obj instanceof HelpRequest)) return false;
        HelpRequest other = (HelpRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              java.util.Arrays.equals(this.about, other.getAbout()))) &&
            ((this.helpType==null && other.getHelpType()==null) || 
             (this.helpType!=null &&
              this.helpType.equals(other.getHelpType()))) &&
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
        if (getAbout() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbout());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbout(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHelpType() != null) {
            _hashCode += getHelpType().hashCode();
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
        new org.apache.axis.description.TypeDesc(HelpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "About"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HelpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">HelpRequest>HelpType"));
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
