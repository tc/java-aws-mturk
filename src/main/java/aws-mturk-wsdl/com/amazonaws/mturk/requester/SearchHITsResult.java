/**
 * SearchHITsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SearchHITsResult  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.Integer pageNumber;

    private java.lang.Integer numResults;

    private java.lang.Integer totalNumResults;

    private com.amazonaws.mturk.requester.HIT[] HIT;

    public SearchHITsResult() {
    }

    public SearchHITsResult(
           com.amazonaws.mturk.requester.Request request,
           java.lang.Integer pageNumber,
           java.lang.Integer numResults,
           java.lang.Integer totalNumResults,
           com.amazonaws.mturk.requester.HIT[] HIT) {
           this.request = request;
           this.pageNumber = pageNumber;
           this.numResults = numResults;
           this.totalNumResults = totalNumResults;
           this.HIT = HIT;
    }


    /**
     * Gets the request value for this SearchHITsResult.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this SearchHITsResult.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the pageNumber value for this SearchHITsResult.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this SearchHITsResult.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the numResults value for this SearchHITsResult.
     * 
     * @return numResults
     */
    public java.lang.Integer getNumResults() {
        return numResults;
    }


    /**
     * Sets the numResults value for this SearchHITsResult.
     * 
     * @param numResults
     */
    public void setNumResults(java.lang.Integer numResults) {
        this.numResults = numResults;
    }


    /**
     * Gets the totalNumResults value for this SearchHITsResult.
     * 
     * @return totalNumResults
     */
    public java.lang.Integer getTotalNumResults() {
        return totalNumResults;
    }


    /**
     * Sets the totalNumResults value for this SearchHITsResult.
     * 
     * @param totalNumResults
     */
    public void setTotalNumResults(java.lang.Integer totalNumResults) {
        this.totalNumResults = totalNumResults;
    }


    /**
     * Gets the HIT value for this SearchHITsResult.
     * 
     * @return HIT
     */
    public com.amazonaws.mturk.requester.HIT[] getHIT() {
        return HIT;
    }


    /**
     * Sets the HIT value for this SearchHITsResult.
     * 
     * @param HIT
     */
    public void setHIT(com.amazonaws.mturk.requester.HIT[] HIT) {
        this.HIT = HIT;
    }

    public com.amazonaws.mturk.requester.HIT getHIT(int i) {
        return this.HIT[i];
    }

    public void setHIT(int i, com.amazonaws.mturk.requester.HIT _value) {
        this.HIT[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchHITsResult)) return false;
        SearchHITsResult other = (SearchHITsResult) obj;
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
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.numResults==null && other.getNumResults()==null) || 
             (this.numResults!=null &&
              this.numResults.equals(other.getNumResults()))) &&
            ((this.totalNumResults==null && other.getTotalNumResults()==null) || 
             (this.totalNumResults!=null &&
              this.totalNumResults.equals(other.getTotalNumResults()))) &&
            ((this.HIT==null && other.getHIT()==null) || 
             (this.HIT!=null &&
              java.util.Arrays.equals(this.HIT, other.getHIT())));
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
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getNumResults() != null) {
            _hashCode += getNumResults().hashCode();
        }
        if (getTotalNumResults() != null) {
            _hashCode += getTotalNumResults().hashCode();
        }
        if (getHIT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHIT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHIT(), i);
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
        new org.apache.axis.description.TypeDesc(SearchHITsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", ">Request"));
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
        elemField.setFieldName("HIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "HIT"));
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
