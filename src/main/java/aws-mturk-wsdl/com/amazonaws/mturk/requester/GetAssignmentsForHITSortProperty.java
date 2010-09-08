/**
 * GetAssignmentsForHITSortProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class GetAssignmentsForHITSortProperty implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetAssignmentsForHITSortProperty(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AcceptTime = "AcceptTime";
    public static final java.lang.String _SubmitTime = "SubmitTime";
    public static final java.lang.String _Answer = "Answer";
    public static final java.lang.String _AssignmentStatus = "AssignmentStatus";
    public static final GetAssignmentsForHITSortProperty AcceptTime = new GetAssignmentsForHITSortProperty(_AcceptTime);
    public static final GetAssignmentsForHITSortProperty SubmitTime = new GetAssignmentsForHITSortProperty(_SubmitTime);
    public static final GetAssignmentsForHITSortProperty Answer = new GetAssignmentsForHITSortProperty(_Answer);
    public static final GetAssignmentsForHITSortProperty AssignmentStatus = new GetAssignmentsForHITSortProperty(_AssignmentStatus);
    public java.lang.String getValue() { return _value_;}
    public static GetAssignmentsForHITSortProperty fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetAssignmentsForHITSortProperty enumeration = (GetAssignmentsForHITSortProperty)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetAssignmentsForHITSortProperty fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetAssignmentsForHITSortProperty.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "GetAssignmentsForHITSortProperty"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
