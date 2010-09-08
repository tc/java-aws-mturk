package com.amazonaws.mturk.dataschema.impl;

public class QuestionFormAnswersTypeDriver implements org.apache.ws.jaxme.impl.JMSAXDriver {
  public static class AnswerTypeDriver implements org.apache.ws.jaxme.impl.JMSAXDriver {
    public org.xml.sax.helpers.AttributesImpl getAttributes(org.apache.ws.jaxme.impl.JMSAXDriverController pController, java.lang.Object pObject) throws org.xml.sax.SAXException {
      org.xml.sax.helpers.AttributesImpl _1 = new org.xml.sax.helpers.AttributesImpl();
      return _1;
    }
  
    public java.lang.String getPreferredPrefix(java.lang.String pURI) {
      return null;
    }
  
    public void marshalChilds(org.apache.ws.jaxme.impl.JMSAXDriverController pController, org.xml.sax.ContentHandler pHandler, java.lang.Object pObject) throws org.xml.sax.SAXException {
      com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType) pObject;
      java.lang.String _2 = _1.getQuestionIdentifier();
      if (_2 != null) {
        pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "QuestionIdentifier", _1.getQuestionIdentifier());
      }
      java.util.List _3 = _1.getSelectionIdentifier();
      for (int _4 = 0;  _4 < (_3).size();  _4++) {
        java.lang.String _5 = (java.lang.String)_3.get(_4);
        if (_5 != null) {
          pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "SelectionIdentifier", (java.lang.String)_3.get(_4));
        }
      }
      java.lang.String _6 = _1.getOtherSelectionText();
      if (_6 != null) {
        pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "OtherSelectionText", _1.getOtherSelectionText());
      }
      java.lang.String _7 = _1.getFreeText();
      if (_7 != null) {
        pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "FreeText", _1.getFreeText());
      }
      java.math.BigInteger _8 = _1.getUploadedFileSizeInBytes();
      if (_8 != null) {
        pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "UploadedFileSizeInBytes", pController.getDatatypeConverter().printInteger(_1.getUploadedFileSizeInBytes()));
      }
      java.lang.String _9 = _1.getUploadedFileKey();
      if (_9 != null) {
        pController.marshalSimpleChild(this, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "UploadedFileKey", _1.getUploadedFileKey());
      }
    }
  
  }

  public org.xml.sax.helpers.AttributesImpl getAttributes(org.apache.ws.jaxme.impl.JMSAXDriverController pController, java.lang.Object pObject) throws org.xml.sax.SAXException {
    org.xml.sax.helpers.AttributesImpl _1 = new org.xml.sax.helpers.AttributesImpl();
    return _1;
  }

  public java.lang.String getPreferredPrefix(java.lang.String pURI) {
    return null;
  }

  public void marshalChilds(org.apache.ws.jaxme.impl.JMSAXDriverController pController, org.xml.sax.ContentHandler pHandler, java.lang.Object pObject) throws org.xml.sax.SAXException {
    com.amazonaws.mturk.dataschema.QuestionFormAnswersType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType) pObject;
    java.util.List _2 = _1.getAnswer();
    for (int _3 = 0;  _3 < (_2).size();  _3++) {
      org.apache.ws.jaxme.impl.JMSAXDriver _4 = new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeDriver.AnswerTypeDriver();
      pController.marshal(_4, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "Answer", (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType)_2.get(_3));
    }
  }

}
