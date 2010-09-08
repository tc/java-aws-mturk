/**
 * GetReviewableHITsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetReviewableHITsRequest  implements java.io.Serializable {
    private java.lang.String HITTypeId;

    private com.amazonaws.mturk.requester.ReviewableHITStatus status;

    private com.amazonaws.mturk.requester.SortDirection sortDirection;

    private com.amazonaws.mturk.requester.GetReviewableHITsSortProperty sortProperty;

    private java.lang.Integer pageNumber;

    private java.lang.Integer pageSize;

    private java.lang.String[] responseGroup;

    public GetReviewableHITsRequest() {
    }

    public GetReviewableHITsRequest(
           java.lang.String HITTypeId,
           com.amazonaws.mturk.requester.ReviewableHITStatus status,
           com.amazonaws.mturk.requester.SortDirection sortDirection,
           com.amazonaws.mturk.requester.GetReviewableHITsSortProperty sortProperty,
           java.lang.Integer pageNumber,
           java.lang.Integer pageSize,
           java.lang.String[] responseGroup) {
           this.HITTypeId = HITTypeId;
           this.status = status;
           this.sortDirection = sortDirection;
           this.sortProperty = sortProperty;
           this.pageNumber = pageNumber;
           this.pageSize = pageSize;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the HITTypeId value for this GetReviewableHITsRequest.
     * 
     * @return HITTypeId
     */
    public java.lang.String getHITTypeId() {
        return HITTypeId;
    }


    /**
     * Sets the HITTypeId value for this GetReviewableHITsRequest.
     * 
     * @param HITTypeId
     */
    public void setHITTypeId(java.lang.String HITTypeId) {
        this.HITTypeId = HITTypeId;
    }


    /**
     * Gets the status value for this GetReviewableHITsRequest.
     * 
     * @return status
     */
    public com.amazonaws.mturk.requester.ReviewableHITStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetReviewableHITsRequest.
     * 
     * @param status
     */
    public void setStatus(com.amazonaws.mturk.requester.ReviewableHITStatus status) {
        this.status = status;
    }


    /**
     * Gets the sortDirection value for this GetReviewableHITsRequest.
     * 
     * @return sortDirection
     */
    public com.amazonaws.mturk.requester.SortDirection getSortDirection() {
        return sortDirection;
    }


    /**
     * Sets the sortDirection value for this GetReviewableHITsRequest.
     * 
     * @param sortDirection
     */
    public void setSortDirection(com.amazonaws.mturk.requester.SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }


    /**
     * Gets the sortProperty value for this GetReviewableHITsRequest.
     * 
     * @return sortProperty
     */
    public com.amazonaws.mturk.requester.GetReviewableHITsSortProperty getSortProperty() {
        return sortProperty;
    }


    /**
     * Sets the sortProperty value for this GetReviewableHITsRequest.
     * 
     * @param sortProperty
     */
    public void setSortProperty(com.amazonaws.mturk.requester.GetReviewableHITsSortProperty sortProperty) {
        this.sortProperty = sortProperty;
    }


    /**
     * Gets the pageNumber value for this GetReviewableHITsRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetReviewableHITsRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the pageSize value for this GetReviewableHITsRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetReviewableHITsRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the responseGroup value for this GetReviewableHITsRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this GetReviewableHITsRequest.
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
        if (!(obj instanceof GetReviewableHITsRequest)) return false;
        GetReviewableHITsRequest other = (GetReviewableHITsRequest) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getHITTypeId() != null) {
            _hashCode += getHITTypeId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetReviewableHITsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HITTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HITTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "ReviewableHITStatus"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetReviewableHITsSortProperty"));
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
