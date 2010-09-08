/**
 * GetAssignmentsForHITRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetAssignmentsForHITRequest  implements java.io.Serializable {
    private java.lang.String HITId;

    private com.amazonaws.mturk.requester.SortDirection sortDirection;

    private com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty sortProperty;

    private java.lang.Integer pageNumber;

    private java.lang.Integer pageSize;

    private com.amazonaws.mturk.requester.AssignmentStatus[] assignmentStatus;

    private java.lang.String[] responseGroup;

    public GetAssignmentsForHITRequest() {
    }

    public GetAssignmentsForHITRequest(
           java.lang.String HITId,
           com.amazonaws.mturk.requester.SortDirection sortDirection,
           com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty sortProperty,
           java.lang.Integer pageNumber,
           java.lang.Integer pageSize,
           com.amazonaws.mturk.requester.AssignmentStatus[] assignmentStatus,
           java.lang.String[] responseGroup) {
           this.HITId = HITId;
           this.sortDirection = sortDirection;
           this.sortProperty = sortProperty;
           this.pageNumber = pageNumber;
           this.pageSize = pageSize;
           this.assignmentStatus = assignmentStatus;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the HITId value for this GetAssignmentsForHITRequest.
     * 
     * @return HITId
     */
    public java.lang.String getHITId() {
        return HITId;
    }


    /**
     * Sets the HITId value for this GetAssignmentsForHITRequest.
     * 
     * @param HITId
     */
    public void setHITId(java.lang.String HITId) {
        this.HITId = HITId;
    }


    /**
     * Gets the sortDirection value for this GetAssignmentsForHITRequest.
     * 
     * @return sortDirection
     */
    public com.amazonaws.mturk.requester.SortDirection getSortDirection() {
        return sortDirection;
    }


    /**
     * Sets the sortDirection value for this GetAssignmentsForHITRequest.
     * 
     * @param sortDirection
     */
    public void setSortDirection(com.amazonaws.mturk.requester.SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }


    /**
     * Gets the sortProperty value for this GetAssignmentsForHITRequest.
     * 
     * @return sortProperty
     */
    public com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty getSortProperty() {
        return sortProperty;
    }


    /**
     * Sets the sortProperty value for this GetAssignmentsForHITRequest.
     * 
     * @param sortProperty
     */
    public void setSortProperty(com.amazonaws.mturk.requester.GetAssignmentsForHITSortProperty sortProperty) {
        this.sortProperty = sortProperty;
    }


    /**
     * Gets the pageNumber value for this GetAssignmentsForHITRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetAssignmentsForHITRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the pageSize value for this GetAssignmentsForHITRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetAssignmentsForHITRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the assignmentStatus value for this GetAssignmentsForHITRequest.
     * 
     * @return assignmentStatus
     */
    public com.amazonaws.mturk.requester.AssignmentStatus[] getAssignmentStatus() {
        return assignmentStatus;
    }


    /**
     * Sets the assignmentStatus value for this GetAssignmentsForHITRequest.
     * 
     * @param assignmentStatus
     */
    public void setAssignmentStatus(com.amazonaws.mturk.requester.AssignmentStatus[] assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public com.amazonaws.mturk.requester.AssignmentStatus getAssignmentStatus(int i) {
        return this.assignmentStatus[i];
    }

    public void setAssignmentStatus(int i, com.amazonaws.mturk.requester.AssignmentStatus _value) {
        this.assignmentStatus[i] = _value;
    }


    /**
     * Gets the responseGroup value for this GetAssignmentsForHITRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this GetAssignmentsForHITRequest.
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
        if (!(obj instanceof GetAssignmentsForHITRequest)) return false;
        GetAssignmentsForHITRequest other = (GetAssignmentsForHITRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HITId==null && other.getHITId()==null) || 
             (this.HITId!=null &&
              this.HITId.equals(other.getHITId()))) &&
            ((this.sortDirection==null && other.getSortDirection()==null) || 
             (this.sortDirection!=null &&
              this.sortDirection.equals(other.getSortDirection()))) &&
            ((this.sortProperty==null && other.getSortProperty()==null) || 
             (this.sortProperty!=null &&
              this.sortProperty.equals(other.getSortProperty()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.assignmentStatus==null && other.getAssignmentStatus()==null) || 
             (this.assignmentStatus!=null &&
              java.util.Arrays.equals(this.assignmentStatus, other.getAssignmentStatus()))) &&
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
        if (getHITId() != null) {
            _hashCode += getHITId().hashCode();
        }
        if (getSortDirection() != null) {
            _hashCode += getSortDirection().hashCode();
        }
        if (getSortProperty() != null) {
            _hashCode += getSortProperty().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getAssignmentStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignmentStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignmentStatus(), i);
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
        new org.apache.axis.description.TypeDesc(GetAssignmentsForHITRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SortDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SortDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SortProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITSortProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "AssignmentStatus"));
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
