/**
 * OperationInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class OperationInformation  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String[] requiredParameters;

    private java.lang.String[] availableParameters;

    private java.lang.String[] defaultResponseGroups;

    private java.lang.String[] availableResponseGroups;

    public OperationInformation() {
    }

    public OperationInformation(
           java.lang.String name,
           java.lang.String description,
           java.lang.String[] requiredParameters,
           java.lang.String[] availableParameters,
           java.lang.String[] defaultResponseGroups,
           java.lang.String[] availableResponseGroups) {
           this.name = name;
           this.description = description;
           this.requiredParameters = requiredParameters;
           this.availableParameters = availableParameters;
           this.defaultResponseGroups = defaultResponseGroups;
           this.availableResponseGroups = availableResponseGroups;
    }


    /**
     * Gets the name value for this OperationInformation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperationInformation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this OperationInformation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OperationInformation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the requiredParameters value for this OperationInformation.
     * 
     * @return requiredParameters
     */
    public java.lang.String[] getRequiredParameters() {
        return requiredParameters;
    }


    /**
     * Sets the requiredParameters value for this OperationInformation.
     * 
     * @param requiredParameters
     */
    public void setRequiredParameters(java.lang.String[] requiredParameters) {
        this.requiredParameters = requiredParameters;
    }


    /**
     * Gets the availableParameters value for this OperationInformation.
     * 
     * @return availableParameters
     */
    public java.lang.String[] getAvailableParameters() {
        return availableParameters;
    }


    /**
     * Sets the availableParameters value for this OperationInformation.
     * 
     * @param availableParameters
     */
    public void setAvailableParameters(java.lang.String[] availableParameters) {
        this.availableParameters = availableParameters;
    }


    /**
     * Gets the defaultResponseGroups value for this OperationInformation.
     * 
     * @return defaultResponseGroups
     */
    public java.lang.String[] getDefaultResponseGroups() {
        return defaultResponseGroups;
    }


    /**
     * Sets the defaultResponseGroups value for this OperationInformation.
     * 
     * @param defaultResponseGroups
     */
    public void setDefaultResponseGroups(java.lang.String[] defaultResponseGroups) {
        this.defaultResponseGroups = defaultResponseGroups;
    }


    /**
     * Gets the availableResponseGroups value for this OperationInformation.
     * 
     * @return availableResponseGroups
     */
    public java.lang.String[] getAvailableResponseGroups() {
        return availableResponseGroups;
    }


    /**
     * Sets the availableResponseGroups value for this OperationInformation.
     * 
     * @param availableResponseGroups
     */
    public void setAvailableResponseGroups(java.lang.String[] availableResponseGroups) {
        this.availableResponseGroups = availableResponseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationInformation)) return false;
        OperationInformation other = (OperationInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.requiredParameters==null && other.getRequiredParameters()==null) || 
             (this.requiredParameters!=null &&
              java.util.Arrays.equals(this.requiredParameters, other.getRequiredParameters()))) &&
            ((this.availableParameters==null && other.getAvailableParameters()==null) || 
             (this.availableParameters!=null &&
              java.util.Arrays.equals(this.availableParameters, other.getAvailableParameters()))) &&
            ((this.defaultResponseGroups==null && other.getDefaultResponseGroups()==null) || 
             (this.defaultResponseGroups!=null &&
              java.util.Arrays.equals(this.defaultResponseGroups, other.getDefaultResponseGroups()))) &&
            ((this.availableResponseGroups==null && other.getAvailableResponseGroups()==null) || 
             (this.availableResponseGroups!=null &&
              java.util.Arrays.equals(this.availableResponseGroups, other.getAvailableResponseGroups())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRequiredParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultResponseGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultResponseGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultResponseGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableResponseGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableResponseGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableResponseGroups(), i);
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
        new org.apache.axis.description.TypeDesc(OperationInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">OperationInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequiredParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Parameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AvailableParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Parameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultResponseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "DefaultResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ResponseGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableResponseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AvailableResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ResponseGroup"));
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
