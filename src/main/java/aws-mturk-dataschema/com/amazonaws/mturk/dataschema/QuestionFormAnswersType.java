package com.amazonaws.mturk.dataschema;

public interface QuestionFormAnswersType {
  public interface AnswerType {
    
  
  
    public java.lang.String getQuestionIdentifier();
  
    public void setQuestionIdentifier(java.lang.String pQuestionIdentifier);
  
    public java.util.List getSelectionIdentifier();
  
    public java.lang.String getOtherSelectionText();
  
    public void setOtherSelectionText(java.lang.String pOtherSelectionText);
  
    public java.lang.String getFreeText();
  
    public void setFreeText(java.lang.String pFreeText);
  
    public java.math.BigInteger getUploadedFileSizeInBytes();
  
    public void setUploadedFileSizeInBytes(java.math.BigInteger pUploadedFileSizeInBytes);
  
    public java.lang.String getUploadedFileKey();
  
    public void setUploadedFileKey(java.lang.String pUploadedFileKey);
  
  }

  


  public java.util.List getAnswer();

}
