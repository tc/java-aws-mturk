/**
 * RequesterStatistic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazonaws.mturk.requester;

public class RequesterStatistic implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RequesterStatistic(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NumberHITsAssignable = "NumberHITsAssignable";
    public static final java.lang.String _NumberHITsReviewable = "NumberHITsReviewable";
    public static final java.lang.String _NumberHITsCreated = "NumberHITsCreated";
    public static final java.lang.String _NumberHITsCompleted = "NumberHITsCompleted";
    public static final java.lang.String _TotalRewardPayout = "TotalRewardPayout";
    public static final java.lang.String _TotalRewardFeePayout = "TotalRewardFeePayout";
    public static final java.lang.String _TotalFeePayout = "TotalFeePayout";
    public static final java.lang.String _TotalRewardAndFeePayout = "TotalRewardAndFeePayout";
    public static final java.lang.String _TotalBonusPayout = "TotalBonusPayout";
    public static final java.lang.String _TotalBonusFeePayout = "TotalBonusFeePayout";
    public static final java.lang.String _EstimatedFeeLiability = "EstimatedFeeLiability";
    public static final java.lang.String _EstimatedRewardLiability = "EstimatedRewardLiability";
    public static final java.lang.String _EstimatedTotalLiability = "EstimatedTotalLiability";
    public static final java.lang.String _NumberAssignmentsAvailable = "NumberAssignmentsAvailable";
    public static final java.lang.String _NumberAssignmentsAccepted = "NumberAssignmentsAccepted";
    public static final java.lang.String _NumberAssignmentsPending = "NumberAssignmentsPending";
    public static final java.lang.String _NumberAssignmentsApproved = "NumberAssignmentsApproved";
    public static final java.lang.String _NumberAssignmentsRejected = "NumberAssignmentsRejected";
    public static final java.lang.String _NumberAssignmentsReturned = "NumberAssignmentsReturned";
    public static final java.lang.String _NumberAssignmentsAbandoned = "NumberAssignmentsAbandoned";
    public static final java.lang.String _AverageRewardAmount = "AverageRewardAmount";
    public static final java.lang.String _PercentAssignmentsApproved = "PercentAssignmentsApproved";
    public static final java.lang.String _PercentAssignmentsRejected = "PercentAssignmentsRejected";
    public static final RequesterStatistic NumberHITsAssignable = new RequesterStatistic(_NumberHITsAssignable);
    public static final RequesterStatistic NumberHITsReviewable = new RequesterStatistic(_NumberHITsReviewable);
    public static final RequesterStatistic NumberHITsCreated = new RequesterStatistic(_NumberHITsCreated);
    public static final RequesterStatistic NumberHITsCompleted = new RequesterStatistic(_NumberHITsCompleted);
    public static final RequesterStatistic TotalRewardPayout = new RequesterStatistic(_TotalRewardPayout);
    public static final RequesterStatistic TotalRewardFeePayout = new RequesterStatistic(_TotalRewardFeePayout);
    public static final RequesterStatistic TotalFeePayout = new RequesterStatistic(_TotalFeePayout);
    public static final RequesterStatistic TotalRewardAndFeePayout = new RequesterStatistic(_TotalRewardAndFeePayout);
    public static final RequesterStatistic TotalBonusPayout = new RequesterStatistic(_TotalBonusPayout);
    public static final RequesterStatistic TotalBonusFeePayout = new RequesterStatistic(_TotalBonusFeePayout);
    public static final RequesterStatistic EstimatedFeeLiability = new RequesterStatistic(_EstimatedFeeLiability);
    public static final RequesterStatistic EstimatedRewardLiability = new RequesterStatistic(_EstimatedRewardLiability);
    public static final RequesterStatistic EstimatedTotalLiability = new RequesterStatistic(_EstimatedTotalLiability);
    public static final RequesterStatistic NumberAssignmentsAvailable = new RequesterStatistic(_NumberAssignmentsAvailable);
    public static final RequesterStatistic NumberAssignmentsAccepted = new RequesterStatistic(_NumberAssignmentsAccepted);
    public static final RequesterStatistic NumberAssignmentsPending = new RequesterStatistic(_NumberAssignmentsPending);
    public static final RequesterStatistic NumberAssignmentsApproved = new RequesterStatistic(_NumberAssignmentsApproved);
    public static final RequesterStatistic NumberAssignmentsRejected = new RequesterStatistic(_NumberAssignmentsRejected);
    public static final RequesterStatistic NumberAssignmentsReturned = new RequesterStatistic(_NumberAssignmentsReturned);
    public static final RequesterStatistic NumberAssignmentsAbandoned = new RequesterStatistic(_NumberAssignmentsAbandoned);
    public static final RequesterStatistic AverageRewardAmount = new RequesterStatistic(_AverageRewardAmount);
    public static final RequesterStatistic PercentAssignmentsApproved = new RequesterStatistic(_PercentAssignmentsApproved);
    public static final RequesterStatistic PercentAssignmentsRejected = new RequesterStatistic(_PercentAssignmentsRejected);
    public java.lang.String getValue() { return _value_;}
    public static RequesterStatistic fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RequesterStatistic enumeration = (RequesterStatistic)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RequesterStatistic fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RequesterStatistic.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://requester.mturk.amazonaws.com/doc/2007-06-21", "RequesterStatistic"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
