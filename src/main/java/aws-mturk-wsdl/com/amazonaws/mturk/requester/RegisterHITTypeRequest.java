/**
 * RegisterHITTypeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class RegisterHITTypeRequest  implements java.io.Serializable {
    private java.lang.Long autoApprovalDelayInSeconds;

    private long assignmentDurationInSeconds;

    private com.amazonaws.mturk.requester.Price reward;

    private java.lang.String title;

    private java.lang.String keywords;

    private java.lang.String description;

    private com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement;

    private java.lang.String[] responseGroup;

    public RegisterHITTypeRequest() {
    }

    public RegisterHITTypeRequest(
           java.lang.Long autoApprovalDelayInSeconds,
           long assignmentDurationInSeconds,
           com.amazonaws.mturk.requester.Price reward,
           java.lang.String title,
           java.lang.String keywords,
           java.lang.String description,
           com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement,
           java.lang.String[] responseGroup) {
           this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
           this.assignmentDurationInSeconds = assignmentDurationInSeconds;
           this.reward = reward;
           this.title = title;
           this.keywords = keywords;
           this.description = description;
           this.qualificationRequirement = qualificationRequirement;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the autoApprovalDelayInSeconds value for this RegisterHITTypeRequest.
     * 
     * @return autoApprovalDelayInSeconds
     */
    public java.lang.Long getAutoApprovalDelayInSeconds() {
        return autoApprovalDelayInSeconds;
    }


    /**
     * Sets the autoApprovalDelayInSeconds value for this RegisterHITTypeRequest.
     * 
     * @param autoApprovalDelayInSeconds
     */
    public void setAutoApprovalDelayInSeconds(java.lang.Long autoApprovalDelayInSeconds) {
        this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
    }


    /**
     * Gets the assignmentDurationInSeconds value for this RegisterHITTypeRequest.
     * 
     * @return assignmentDurationInSeconds
     */
    public long getAssignmentDurationInSeconds() {
        return assignmentDurationInSeconds;
    }


    /**
     * Sets the assignmentDurationInSeconds value for this RegisterHITTypeRequest.
     * 
     * @param assignmentDurationInSeconds
     */
    public void setAssignmentDurationInSeconds(long assignmentDurationInSeconds) {
        this.assignmentDurationInSeconds = assignmentDurationInSeconds;
    }


    /**
     * Gets the reward value for this RegisterHITTypeRequest.
     * 
     * @return reward
     */
    public com.amazonaws.mturk.requester.Price getReward() {
        return reward;
    }


    /**
     * Sets the reward value for this RegisterHITTypeRequest.
     * 
     * @param reward
     */
    public void setReward(com.amazonaws.mturk.requester.Price reward) {
        this.reward = reward;
    }


    /**
     * Gets the title value for this RegisterHITTypeRequest.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RegisterHITTypeRequest.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the keywords value for this RegisterHITTypeRequest.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this RegisterHITTypeRequest.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the description value for this RegisterHITTypeRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RegisterHITTypeRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the qualificationRequirement value for this RegisterHITTypeRequest.
     * 
     * @return qualificationRequirement
     */
    public com.amazonaws.mturk.requester.QualificationRequirement[] getQualificationRequirement() {
        return qualificationRequirement;
    }


    /**
     * Sets the qualificationRequirement value for this RegisterHITTypeRequest.
     * 
     * @param qualificationRequirement
     */
    public void setQualificationRequirement(com.amazonaws.mturk.requester.QualificationRequirement[] qualificationRequirement) {
        this.qualificationRequirement = qualificationRequirement;
    }

    public com.amazonaws.mturk.requester.QualificationRequirement getQualificationRequirement(int i) {
        return this.qualificationRequirement[i];
    }

    public void setQualificationRequirement(int i, com.amazonaws.mturk.requester.QualificationRequirement _value) {
        this.qualificationRequirement[i] = _value;
    }


    /**
     * Gets the responseGroup value for this RegisterHITTypeRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this RegisterHITTypeRequest.
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
        if (!(obj instanceof RegisterHITTypeRequest)) return false;
        RegisterHITTypeRequest other = (RegisterHITTypeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoApprovalDelayInSeconds==null && other.getAutoApprovalDelayInSeconds()==null) || 
             (this.autoApprovalDelayInSeconds!=null &&
              this.autoApprovalDelayInSeconds.equals(other.getAutoApprovalDelayInSeconds()))) &&
            this.assignmentDurationInSeconds == other.getAssignmentDurationInSeconds() &&
            ((this.reward==null && other.getReward()==null) || 
             (this.reward!=null &&
              this.reward.equals(other.getReward()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.qualificationRequirement==null && other.getQualificationRequirement()==null) || 
             (this.qualificationRequirement!=null &&
              java.util.Arrays.equals(this.qualificationRequirement, other.getQualificationRequirement()))) &&
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
        if (getAutoApprovalDelayInSeconds() != null) {
            _hashCode += getAutoApprovalDelayInSeconds().hashCode();
        }
        _hashCode += new Long(getAssignmentDurationInSeconds()).hashCode();
        if (getReward() != null) {
            _hashCode += getReward().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQualificationRequirement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualificationRequirement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualificationRequirement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(RegisterHITTypeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RegisterHITTypeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoApprovalDelayInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AutoApprovalDelayInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reward");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Reward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualificationRequirement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
