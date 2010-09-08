/**
 * SearchQualificationTypesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SearchQualificationTypesRequest  implements java.io.Serializable {
    private java.lang.String query;

    private boolean mustBeRequestable;

    private java.lang.Boolean mustBeOwnedByCaller;

    private com.amazonaws.mturk.requester.SortDirection sortDirection;

    private com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty sortProperty;

    private java.lang.Integer pageNumber;

    private java.lang.Integer pageSize;

    private java.lang.String[] responseGroup;

    public SearchQualificationTypesRequest() {
    }

    public SearchQualificationTypesRequest(
           java.lang.String query,
           boolean mustBeRequestable,
           java.lang.Boolean mustBeOwnedByCaller,
           com.amazonaws.mturk.requester.SortDirection sortDirection,
           com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty sortProperty,
           java.lang.Integer pageNumber,
           java.lang.Integer pageSize,
           java.lang.String[] responseGroup) {
           this.query = query;
           this.mustBeRequestable = mustBeRequestable;
           this.mustBeOwnedByCaller = mustBeOwnedByCaller;
           this.sortDirection = sortDirection;
           this.sortProperty = sortProperty;
           this.pageNumber = pageNumber;
           this.pageSize = pageSize;
           this.responseGroup = responseGroup;
    }


    /**
     * Gets the query value for this SearchQualificationTypesRequest.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SearchQualificationTypesRequest.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the mustBeRequestable value for this SearchQualificationTypesRequest.
     * 
     * @return mustBeRequestable
     */
    public boolean isMustBeRequestable() {
        return mustBeRequestable;
    }


    /**
     * Sets the mustBeRequestable value for this SearchQualificationTypesRequest.
     * 
     * @param mustBeRequestable
     */
    public void setMustBeRequestable(boolean mustBeRequestable) {
        this.mustBeRequestable = mustBeRequestable;
    }


    /**
     * Gets the mustBeOwnedByCaller value for this SearchQualificationTypesRequest.
     * 
     * @return mustBeOwnedByCaller
     */
    public java.lang.Boolean getMustBeOwnedByCaller() {
        return mustBeOwnedByCaller;
    }


    /**
     * Sets the mustBeOwnedByCaller value for this SearchQualificationTypesRequest.
     * 
     * @param mustBeOwnedByCaller
     */
    public void setMustBeOwnedByCaller(java.lang.Boolean mustBeOwnedByCaller) {
        this.mustBeOwnedByCaller = mustBeOwnedByCaller;
    }


    /**
     * Gets the sortDirection value for this SearchQualificationTypesRequest.
     * 
     * @return sortDirection
     */
    public com.amazonaws.mturk.requester.SortDirection getSortDirection() {
        return sortDirection;
    }


    /**
     * Sets the sortDirection value for this SearchQualificationTypesRequest.
     * 
     * @param sortDirection
     */
    public void setSortDirection(com.amazonaws.mturk.requester.SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }


    /**
     * Gets the sortProperty value for this SearchQualificationTypesRequest.
     * 
     * @return sortProperty
     */
    public com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty getSortProperty() {
        return sortProperty;
    }


    /**
     * Sets the sortProperty value for this SearchQualificationTypesRequest.
     * 
     * @param sortProperty
     */
    public void setSortProperty(com.amazonaws.mturk.requester.SearchQualificationTypesSortProperty sortProperty) {
        this.sortProperty = sortProperty;
    }


    /**
     * Gets the pageNumber value for this SearchQualificationTypesRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this SearchQualificationTypesRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the pageSize value for this SearchQualificationTypesRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this SearchQualificationTypesRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the responseGroup value for this SearchQualificationTypesRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this SearchQualificationTypesRequest.
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
        if (!(obj instanceof SearchQualificationTypesRequest)) return false;
        SearchQualificationTypesRequest other = (SearchQualificationTypesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            this.mustBeRequestable == other.isMustBeRequestable() &&
            ((this.mustBeOwnedByCaller==null && other.getMustBeOwnedByCaller()==null) || 
             (this.mustBeOwnedByCaller!=null &&
              this.mustBeOwnedByCaller.equals(other.getMustBeOwnedByCaller()))) &&
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        _hashCode += (isMustBeRequestable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMustBeOwnedByCaller() != null) {
            _hashCode += getMustBeOwnedByCaller().hashCode();
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
        new org.apache.axis.description.TypeDesc(SearchQualificationTypesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mustBeRequestable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "MustBeRequestable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mustBeOwnedByCaller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "MustBeOwnedByCaller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesSortProperty"));
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
