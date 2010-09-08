/**
 * GetQualificationRequestsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetQualificationRequestsResult  implements java.io.Serializable {
    private com.amazonaws.mturk.requester.Request request;

    private java.lang.Integer numResults;

    private java.lang.Integer totalNumResults;

    private java.lang.Integer pageNumber;

    private com.amazonaws.mturk.requester.QualificationRequest[] qualificationRequest;

    public GetQualificationRequestsResult() {
    }

    public GetQualificationRequestsResult(
           com.amazonaws.mturk.requester.Request request,
           java.lang.Integer numResults,
           java.lang.Integer totalNumResults,
           java.lang.Integer pageNumber,
           com.amazonaws.mturk.requester.QualificationRequest[] qualificationRequest) {
           this.request = request;
           this.numResults = numResults;
           this.totalNumResults = totalNumResults;
           this.pageNumber = pageNumber;
           this.qualificationRequest = qualificationRequest;
    }


    /**
     * Gets the request value for this GetQualificationRequestsResult.
     * 
     * @return request
     */
    public com.amazonaws.mturk.requester.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this GetQualificationRequestsResult.
     * 
     * @param request
     */
    public void setRequest(com.amazonaws.mturk.requester.Request request) {
        this.request = request;
    }


    /**
     * Gets the numResults value for this GetQualificationRequestsResult.
     * 
     * @return numResults
     */
    public java.lang.Integer getNumResults() {
        return numResults;
    }


    /**
     * Sets the numResults value for this GetQualificationRequestsResult.
     * 
     * @param numResults
     */
    public void setNumResults(java.lang.Integer numResults) {
        this.numResults = numResults;
    }


    /**
     * Gets the totalNumResults value for this GetQualificationRequestsResult.
     * 
     * @return totalNumResults
     */
    public java.lang.Integer getTotalNumResults() {
        return totalNumResults;
    }


    /**
     * Sets the totalNumResults value for this GetQualificationRequestsResult.
     * 
     * @param totalNumResults
     */
    public void setTotalNumResults(java.lang.Integer totalNumResults) {
        this.totalNumResults = totalNumResults;
    }


    /**
     * Gets the pageNumber value for this GetQualificationRequestsResult.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this GetQualificationRequestsResult.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the qualificationRequest value for this GetQualificationRequestsResult.
     * 
     * @return qualificationRequest
     */
    public com.amazonaws.mturk.requester.QualificationRequest[] getQualificationRequest() {
        return qualificationRequest;
    }


    /**
     * Sets the qualificationRequest value for this GetQualificationRequestsResult.
     * 
     * @param qualificationRequest
     */
    public void setQualificationRequest(com.amazonaws.mturk.requester.QualificationRequest[] qualificationRequest) {
        this.qualificationRequest = qualificationRequest;
    }

    public com.amazonaws.mturk.requester.QualificationRequest getQualificationRequest(int i) {
        return this.qualificationRequest[i];
    }

    public void setQualificationRequest(int i, com.amazonaws.mturk.requester.QualificationRequest _value) {
        this.qualificationRequest[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQualificationRequestsResult)) return false;
        GetQualificationRequestsResult other = (GetQualificationRequestsResult) obj;
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
            ((this.qualificationRequest==null && other.getQualificationRequest()==null) || 
             (this.qualificationRequest!=null &&
              java.util.Arrays.equals(this.qualificationRequest, other.getQualificationRequest())));
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
        if (getQualificationRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualificationRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualificationRequest(), i);
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
        new org.apache.axis.description.TypeDesc(GetQualificationRequestsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetQualificationRequestsResult"));
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
        elemField.setFieldName("qualificationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "QualificationRequest"));
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
