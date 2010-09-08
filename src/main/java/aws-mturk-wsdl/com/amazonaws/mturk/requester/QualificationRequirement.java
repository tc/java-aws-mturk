/**
 * QualificationRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class QualificationRequirement  implements java.io.Serializable {
    private java.lang.String qualificationTypeId;

    private com.amazonaws.mturk.requester.Comparator comparator;

    private java.lang.Integer integerValue;

    private com.amazonaws.mturk.requester.Locale localeValue;

    private java.lang.Boolean requiredToPreview;

    public QualificationRequirement() {
    }

    public QualificationRequirement(
           java.lang.String qualificationTypeId,
           com.amazonaws.mturk.requester.Comparator comparator,
           java.lang.Integer integerValue,
           com.amazonaws.mturk.requester.Locale localeValue,
           java.lang.Boolean requiredToPreview) {
           this.qualificationTypeId = qualificationTypeId;
           this.comparator = comparator;
           this.integerValue = integerValue;
           this.localeValue = localeValue;
           this.requiredToPreview = requiredToPreview;
    }


    /**
     * Gets the qualificationTypeId value for this QualificationRequirement.
     * 
     * @return qualificationTypeId
     */
    public java.lang.String getQualificationTypeId() {
        return qualificationTypeId;
    }


    /**
     * Sets the qualificationTypeId value for this QualificationRequirement.
     * 
     * @param qualificationTypeId
     */
    public void setQualificationTypeId(java.lang.String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }


    /**
     * Gets the comparator value for this QualificationRequirement.
     * 
     * @return comparator
     */
    public com.amazonaws.mturk.requester.Comparator getComparator() {
        return comparator;
    }


    /**
     * Sets the comparator value for this QualificationRequirement.
     * 
     * @param comparator
     */
    public void setComparator(com.amazonaws.mturk.requester.Comparator comparator) {
        this.comparator = comparator;
    }


    /**
     * Gets the integerValue value for this QualificationRequirement.
     * 
     * @return integerValue
     */
    public java.lang.Integer getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this QualificationRequirement.
     * 
     * @param integerValue
     */
    public void setIntegerValue(java.lang.Integer integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the localeValue value for this QualificationRequirement.
     * 
     * @return localeValue
     */
    public com.amazonaws.mturk.requester.Locale getLocaleValue() {
        return localeValue;
    }


    /**
     * Sets the localeValue value for this QualificationRequirement.
     * 
     * @param localeValue
     */
    public void setLocaleValue(com.amazonaws.mturk.requester.Locale localeValue) {
        this.localeValue = localeValue;
    }


    /**
     * Gets the requiredToPreview value for this QualificationRequirement.
     * 
     * @return requiredToPreview
     */
    public java.lang.Boolean getRequiredToPreview() {
        return requiredToPreview;
    }


    /**
     * Sets the requiredToPreview value for this QualificationRequirement.
     * 
     * @param requiredToPreview
     */
    public void setRequiredToPreview(java.lang.Boolean requiredToPreview) {
        this.requiredToPreview = requiredToPreview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QualificationRequirement)) return false;
        QualificationRequirement other = (QualificationRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualificationTypeId==null && other.getQualificationTypeId()==null) || 
             (this.qualificationTypeId!=null &&
              this.qualificationTypeId.equals(other.getQualificationTypeId()))) &&
            ((this.comparator==null && other.getComparator()==null) || 
             (this.comparator!=null &&
              this.comparator.equals(other.getComparator()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.localeValue==null && other.getLocaleValue()==null) || 
             (this.localeValue!=null &&
              this.localeValue.equals(other.getLocaleValue()))) &&
            ((this.requiredToPreview==null && other.getRequiredToPreview()==null) || 
             (this.requiredToPreview!=null &&
              this.requiredToPreview.equals(other.getRequiredToPreview())));
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
        if (getQualificationTypeId() != null) {
            _hashCode += getQualificationTypeId().hashCode();
        }
        if (getComparator() != null) {
            _hashCode += getComparator().hashCode();
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getLocaleValue() != null) {
            _hashCode += getLocaleValue().hashCode();
        }
        if (getRequiredToPreview() != null) {
            _hashCode += getRequiredToPreview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualificationRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Comparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Comparator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "IntegerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "LocaleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Locale"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredToPreview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequiredToPreview"));
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
