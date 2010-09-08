/**
 * SearchQualificationTypesResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SearchQualificationTypesResult  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.Integer numResults;

    private java.lang.Integer totalNumResults;

    private java.lang.Integer pageNumber;

    private com.amazonaws.mturk.requester.QualificationType[] qualificationType;

    public SearchQualificationTypesResult() {
    }

    public SearchQualificationTypesResult(
           com.amazonaws.mturk.requester.Request request,
           java.lang.Integer numResults,
           java.lang.Integer totalNumResults,
           java.lang.Integer pageNumber,
           com.amazonaws.mturk.requester.QualificationType[] qualificationType) {
           this.request = request;
           this.numResults = numResults;
           this.totalNumResults = totalNumResults;
           this.pageNumber = pageNumber;
           this.qualificationType = qualificationType;
    }


    /**
     * Gets the request value for this SearchQualificationTypesResult.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this SearchQualificationTypesResult.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the numResults value for this SearchQualificationTypesResult.
     * 
     * @return numResults
     */
    public java.lang.Integer getNumResults() {
        return numResults;
    }


    /**
     * Sets the numResults value for this SearchQualificationTypesResult.
     * 
     * @param numResults
     */
    public void setNumResults(java.lang.Integer numResults) {
        this.numResults = numResults;
    }


    /**
     * Gets the totalNumResults value for this SearchQualificationTypesResult.
     * 
     * @return totalNumResults
     */
    public java.lang.Integer getTotalNumResults() {
        return totalNumResults;
    }


    /**
     * Sets the totalNumResults value for this SearchQualificationTypesResult.
     * 
     * @param totalNumResults
     */
    public void setTotalNumResults(java.lang.Integer totalNumResults) {
        this.totalNumResults = totalNumResults;
    }


    /**
     * Gets the pageNumber value for this SearchQualificationTypesResult.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this SearchQualificationTypesResult.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the qualificationType value for this SearchQualificationTypesResult.
     * 
     * @return qualificationType
     */
    public com.amazonaws.mturk.requester.QualificationType[] getQualificationType() {
        return qualificationType;
    }


    /**
     * Sets the qualificationType value for this SearchQualificationTypesResult.
     * 
     * @param qualificationType
     */
    public void setQualificationType(com.amazonaws.mturk.requester.QualificationType[] qualificationType) {
        this.qualificationType = qualificationType;
    }

    public com.amazonaws.mturk.requester.QualificationType getQualificationType(int i) {
        return this.qualificationType[i];
    }

    public void setQualificationType(int i, com.amazonaws.mturk.requester.QualificationType _value) {
        this.qualificationType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchQualificationTypesResult)) return false;
        SearchQualificationTypesResult other = (SearchQualificationTypesResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.numResults==null && other.getNumResults()==null) || 
             (this.numResults!=null &&
              this.numResults.equals(other.getNumResults()))) &&
            ((this.totalNumResults==null && other.getTotalNumResults()==null) || 
             (this.totalNumResults!=null &&
              this.totalNumResults.equals(other.getTotalNumResults()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.qualificationType==null && other.getQualificationType()==null) || 
             (this.qualificationType!=null &&
              java.util.Arrays.equals(this.qualificationType, other.getQualificationType())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getNumResults() != null) {
            _hashCode += getNumResults().hashCode();
        }
        if (getTotalNumResults() != null) {
            _hashCode += getTotalNumResults().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getQualificationType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualificationType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualificationType(), i);
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
        new org.apache.axis.description.TypeDesc(SearchQualificationTypesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchQualificationTypesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "NumResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "TotalNumResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("qualificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationType"));
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
