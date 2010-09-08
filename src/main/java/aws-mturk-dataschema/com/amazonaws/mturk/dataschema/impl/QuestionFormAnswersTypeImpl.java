package com.amazonaws.mturk.dataschema.impl;

public class QuestionFormAnswersTypeImpl implements com.amazonaws.mturk.dataschema.QuestionFormAnswersType {
  public static class AnswerTypeImpl implements com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType {
    private java.lang.String _questionIdentifier;
  
    private java.util.List _selectionIdentifier = new java.util.ArrayList();
  
    private java.lang.String _otherSelectionText;
  
    private java.lang.String _freeText;
  
    private java.math.BigInteger _uploadedFileSizeInBytes;
  
    private java.lang.String _uploadedFileKey;
  
  
    public java.lang.String getQuestionIdentifier() {
      return _questionIdentifier;
    }
  
    public void setQuestionIdentifier(java.lang.String pQuestionIdentifier) {
      _questionIdentifier = pQuestionIdentifier;
    }
  
    public java.util.List getSelectionIdentifier() {
      return _selectionIdentifier;
    }
  
    public java.lang.String getOtherSelectionText() {
      return _otherSelectionText;
    }
  
    public void setOtherSelectionText(java.lang.String pOtherSelectionText) {
      _otherSelectionText = pOtherSelectionText;
    }
  
    public java.lang.String getFreeText() {
      return _freeText;
    }
  
    public void setFreeText(java.lang.String pFreeText) {
      _freeText = pFreeText;
    }
  
    public java.math.BigInteger getUploadedFileSizeInBytes() {
      return _uploadedFileSizeInBytes;
    }
  
    public void setUploadedFileSizeInBytes(java.math.BigInteger pUploadedFileSizeInBytes) {
      _uploadedFileSizeInBytes = pUploadedFileSizeInBytes;
    }
  
    public java.lang.String getUploadedFileKey() {
      return _uploadedFileKey;
    }
  
    public void setUploadedFileKey(java.lang.String pUploadedFileKey) {
      _uploadedFileKey = pUploadedFileKey;
    }
  
  }

  private java.util.List _answer = new java.util.ArrayList();


  public java.util.List getAnswer() {
    return _answer;
  }

}
