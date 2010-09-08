/**
 * Comparator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class Comparator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Comparator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LessThan = "LessThan";
    public static final java.lang.String _LessThanOrEqualTo = "LessThanOrEqualTo";
    public static final java.lang.String _GreaterThan = "GreaterThan";
    public static final java.lang.String _GreaterThanOrEqualTo = "GreaterThanOrEqualTo";
    public static final java.lang.String _EqualTo = "EqualTo";
    public static final java.lang.String _NotEqualTo = "NotEqualTo";
    public static final java.lang.String _Exists = "Exists";
    public static final Comparator LessThan = new Comparator(_LessThan);
    public static final Comparator LessThanOrEqualTo = new Comparator(_LessThanOrEqualTo);
    public static final Comparator GreaterThan = new Comparator(_GreaterThan);
    public static final Comparator GreaterThanOrEqualTo = new Comparator(_GreaterThanOrEqualTo);
    public static final Comparator EqualTo = new Comparator(_EqualTo);
    public static final Comparator NotEqualTo = new Comparator(_NotEqualTo);
    public static final Comparator Exists = new Comparator(_Exists);
    public java.lang.String getValue() { return _value_;}
    public static Comparator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Comparator enumeration = (Comparator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Comparator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Comparator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "Comparator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
