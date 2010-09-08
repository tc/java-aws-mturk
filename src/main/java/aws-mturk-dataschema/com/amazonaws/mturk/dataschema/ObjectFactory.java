package com.amazonaws.mturk.dataschema;

public class ObjectFactory {
  private org.apache.ws.jaxme.impl.JAXBContextImpl jaxbContext;

  private java.util.Map properties;


  public java.lang.Object newInstance(java.lang.Class pElementInterface) throws javax.xml.bind.JAXBException {
    return jaxbContext.getManager(pElementInterface).getElementJ();
  }

  public java.lang.Object getProperty(java.lang.String pName) {
    if (properties == null) {
      return null;
    }
    return properties.get(pName);
  }

  public void setProperty(java.lang.String pName, java.lang.Object pValue) {
    if (properties == null) {
      properties = new java.util.HashMap();
    }
    properties.put(pName, pValue);
  }

  public com.amazonaws.mturk.dataschema.QuestionFormAnswers createQuestionFormAnswers() throws javax.xml.bind.JAXBException {
    return (com.amazonaws.mturk.dataschema.QuestionFormAnswers) newInstance(com.amazonaws.mturk.dataschema.QuestionFormAnswers.class);
  }

  public com.amazonaws.mturk.dataschema.QuestionFormAnswersType createQuestionFormAnswersType() throws javax.xml.bind.JAXBException {
    return (com.amazonaws.mturk.dataschema.QuestionFormAnswersType) newInstance(com.amazonaws.mturk.dataschema.QuestionFormAnswersType.class);
  }

  public com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType createQuestionFormAnswersTypeAnswerType() throws javax.xml.bind.JAXBException {
    return new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeImpl.AnswerTypeImpl();
  }

  public ObjectFactory() throws javax.xml.bind.JAXBException {
    jaxbContext = (org.apache.ws.jaxme.impl.JAXBContextImpl) javax.xml.bind.JAXBContext.newInstance("com.amazonaws.mturk.dataschema");
  }

}
