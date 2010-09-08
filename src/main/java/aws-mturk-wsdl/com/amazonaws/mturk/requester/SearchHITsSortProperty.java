/**
 * SearchHITsSortProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class SearchHITsSortProperty implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchHITsSortProperty(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Title = "Title";
    public static final java.lang.String _Reward = "Reward";
    public static final java.lang.String _Expiration = "Expiration";
    public static final java.lang.String _CreationTime = "CreationTime";
    public static final java.lang.String _Enumeration = "Enumeration";
    public static final SearchHITsSortProperty Title = new SearchHITsSortProperty(_Title);
    public static final SearchHITsSortProperty Reward = new SearchHITsSortProperty(_Reward);
    public static final SearchHITsSortProperty Expiration = new SearchHITsSortProperty(_Expiration);
    public static final SearchHITsSortProperty CreationTime = new SearchHITsSortProperty(_CreationTime);
    public static final SearchHITsSortProperty Enumeration = new SearchHITsSortProperty(_Enumeration);
    public java.lang.String getValue() { return _value_;}
    public static SearchHITsSortProperty fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchHITsSortProperty enumeration = (SearchHITsSortProperty)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchHITsSortProperty fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchHITsSortProperty.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "SearchHITsSortProperty"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
