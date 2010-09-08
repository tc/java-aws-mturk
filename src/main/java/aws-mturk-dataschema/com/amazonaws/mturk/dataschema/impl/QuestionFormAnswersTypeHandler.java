package com.amazonaws.mturk.dataschema.impl;

public class QuestionFormAnswersTypeHandler extends org.apache.ws.jaxme.impl.JMSAXElementParser {
  public static class AnswerTypeHandler extends org.apache.ws.jaxme.impl.JMSAXElementParser {
    public class FreeTextHandler extends org.apache.ws.jaxme.impl.JMSAXGroupParser {
      public class SelectionIdentifierAndOtherSelectionTextHandler extends org.apache.ws.jaxme.impl.JMSAXGroupParser {
        /** The current state. The following values are valid states:
         *  0 = Before parsing the element
         *  1 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}SelectionIdentifier
         *  2 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}OtherSelectionText
         * 
         */
        private int __state;
      
      
        public org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl getHandler() {
          return com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.FreeTextHandler.this.getHandler();
        }
      
        public boolean startElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, org.xml.sax.Attributes pAttr) throws org.xml.sax.SAXException {
          org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl _1 = getHandler();
          switch (__state) {
            case 0:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "SelectionIdentifier".equals(pLocalName)) {
                __state = 1;
                _1.addSimpleAtomicState();
                return true;
              } else if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "OtherSelectionText".equals(pLocalName)) {
                __state = 2;
                _1.addSimpleAtomicState();
                return true;
              }
              break;
            case 1:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "SelectionIdentifier".equals(pLocalName)) {
                __state = 1;
                _1.addSimpleAtomicState();
                return true;
              } else if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "OtherSelectionText".equals(pLocalName)) {
                __state = 2;
                _1.addSimpleAtomicState();
                return true;
              }
              break;
            case 2:
              break;
            default:
              throw new java.lang.IllegalStateException("Invalid state: " + __state);
          }
          return false;
        }
      
        public void endElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, java.lang.Object pResult) throws org.xml.sax.SAXException {
          com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType) result;
          switch (__state) {
            case 1:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "SelectionIdentifier".equals(pLocalName)) {
                _1.getSelectionIdentifier().add((java.lang.String) pResult);
                return;
              }
              break;
            case 2:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "OtherSelectionText".equals(pLocalName)) {
                _1.setOtherSelectionText((java.lang.String) pResult);
                return;
              }
              break;
            default:
              throw new java.lang.IllegalStateException("Illegal state: " + __state);
          }
        }
      
        public boolean isFinished() {
          switch (__state) {
            case 2:
            case 1:
            case 0:
              return true;
            default:
              return false;
          }
        }
      
      }
    
      public class UploadedFileSizeInBytesAndUploadedFileKeyHandler extends org.apache.ws.jaxme.impl.JMSAXGroupParser {
        /** The current state. The following values are valid states:
         *  0 = Before parsing the element
         *  1 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}UploadedFileSizeInBytes
         *  2 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}UploadedFileKey
         * 
         */
        private int __state;
      
      
        public org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl getHandler() {
          return com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.FreeTextHandler.this.getHandler();
        }
      
        public boolean startElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, org.xml.sax.Attributes pAttr) throws org.xml.sax.SAXException {
          org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl _1 = getHandler();
          switch (__state) {
            case 0:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "UploadedFileSizeInBytes".equals(pLocalName)) {
                __state = 1;
                _1.addSimpleAtomicState();
                return true;
              }
              break;
            case 1:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "UploadedFileKey".equals(pLocalName)) {
                __state = 2;
                _1.addSimpleAtomicState();
                return true;
              }
              break;
            case 2:
              break;
            default:
              throw new java.lang.IllegalStateException("Invalid state: " + __state);
          }
          return false;
        }
      
        public void endElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, java.lang.Object pResult) throws org.xml.sax.SAXException {
          com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType) result;
          switch (__state) {
            case 1:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "UploadedFileSizeInBytes".equals(pLocalName)) {
                try {
                  _1.setUploadedFileSizeInBytes(getHandler().getDatatypeConverter().parseInteger((java.lang.String) pResult));
                } catch (java.lang.Exception _2) {
                  getHandler().parseConversionEvent("Failed to convert value of {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}UploadedFileSizeInBytes: " + pResult, _2);
                }
                return;
              }
              break;
            case 2:
              if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "UploadedFileKey".equals(pLocalName)) {
                _1.setUploadedFileKey((java.lang.String) pResult);
                return;
              }
              break;
            default:
              throw new java.lang.IllegalStateException("Illegal state: " + __state);
          }
        }
      
        public boolean isFinished() {
          switch (__state) {
            case 2:
              return true;
            default:
              return false;
          }
        }
      
      }
    
      /** Will be set to true, if the first child is parsed.
       * It is an error, if another child is parsed, and the
       * fields value is true.
       * 
       */
      private boolean __state;
    
      /** Index of the particle being currently parsed
       * 
       */
      private int __childNum;
    
    
      public org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl getHandler() {
        return com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.this.getHandler();
      }
    
      public boolean startElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, org.xml.sax.Attributes pAttr) throws org.xml.sax.SAXException {
        org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl _1 = getHandler();
        if (_1.testGroupParser(new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.FreeTextHandler.SelectionIdentifierAndOtherSelectionTextHandler(), pNamespaceURI, pLocalName, pQName, pAttr)) {
          if (__state) {
            if (__childNum != 0) {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "Multiple different particles present in a choive group.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            } else {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "The group SelectionIdentifierAndOtherSelectionText has already been defined.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            }
          }
          __state = true;
          __childNum = 0;
          return true;
        } else if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "FreeText".equals(pLocalName)) {
          if (__state) {
            if (__childNum != 1) {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "Multiple different particles present in a choive group.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            } else {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "The element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}FreeText has already been defined.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            }
          }
          __state = true;
          __childNum = 1;
          _1.addSimpleAtomicState();
          return true;
        } else if (_1.testGroupParser(new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.FreeTextHandler.UploadedFileSizeInBytesAndUploadedFileKeyHandler(), pNamespaceURI, pLocalName, pQName, pAttr)) {
          if (__state) {
            if (__childNum != 2) {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "Multiple different particles present in a choive group.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            } else {
              getHandler().validationEvent(javax.xml.bind.ValidationEvent.WARNING, "The group UploadedFileSizeInBytesAndUploadedFileKey has already been defined.", org.apache.ws.jaxme.ValidationEvents.EVENT_CHOICE_GROUP_REUSE, null);
            }
          }
          __state = true;
          __childNum = 2;
          return true;
        }
        return false;
      }
    
      public void endElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, java.lang.Object pResult) throws org.xml.sax.SAXException {
        com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType) result;
        switch (__childNum) {
          case 0:
            throw new java.lang.IllegalStateException("This case should be handled by a nested group parser.");
          case 1:
            if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "FreeText".equals(pLocalName)) {
              _1.setFreeText((java.lang.String) pResult);
              return;
            }
            break;
          case 2:
            throw new java.lang.IllegalStateException("This case should be handled by a nested group parser.");
          default:
            throw new java.lang.IllegalStateException("Illegal state: " + __childNum);
        }
      }
    
      public boolean isFinished() {
        return true;
      }
    
    }
  
    /** The current state. The following values are valid states:
     *  0 = Before parsing the element
     *  1 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}QuestionIdentifier
     *  2 = While parsing the nested group FreeText
     * 
     */
    private int __state;
  
  
    public boolean startElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, org.xml.sax.Attributes pAttr) throws org.xml.sax.SAXException {
      org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl _1 = getHandler();
      switch (__state) {
        case 0:
          if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "QuestionIdentifier".equals(pLocalName)) {
            __state = 1;
            _1.addSimpleAtomicState();
            return true;
          }
          break;
        case 1:
          if (_1.testGroupParser(new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler.FreeTextHandler(), pNamespaceURI, pLocalName, pQName, pAttr)) {
            __state = 2;
            return true;
          }
          break;
        case 2:
          break;
        default:
          throw new java.lang.IllegalStateException("Invalid state: " + __state);
      }
      return false;
    }
  
    public void endElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, java.lang.Object pResult) throws org.xml.sax.SAXException {
      com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType.AnswerType) result;
      switch (__state) {
        case 1:
          if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "QuestionIdentifier".equals(pLocalName)) {
            _1.setQuestionIdentifier((java.lang.String) pResult);
            return;
          }
          break;
        case 2:
          throw new java.lang.IllegalStateException("This case should be handled by a nested group parser.");
        default:
          throw new java.lang.IllegalStateException("Illegal state: " + __state);
      }
    }
  
    public boolean isFinished() {
      switch (__state) {
        case 2:
        case 1:
          return true;
        default:
          return false;
      }
    }
  
  }

  /** The current state. The following values are valid states:
   *  0 = Before parsing the element
   *  1 = While or after parsing the child element {http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd}Answer
   * 
   */
  private int __state;


  public boolean startElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, org.xml.sax.Attributes pAttr) throws org.xml.sax.SAXException {
    org.apache.ws.jaxme.impl.JMUnmarshallerHandlerImpl _1 = getHandler();
    switch (__state) {
      case 0:
        if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "Answer".equals(pLocalName)) {
          __state = 1;
          java.lang.Object _2 =  new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeImpl.AnswerTypeImpl();
          org.apache.ws.jaxme.impl.JMSAXElementParser _3 =  new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler();
          _3.init(_1, _2, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "Answer", _1.getLevel());
          _3.setAttributes(pAttr);
          _1.addElementParser(_3);
          return true;
        }
        break;
      case 1:
        if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "Answer".equals(pLocalName)) {
          __state = 1;
          java.lang.Object _4 =  new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeImpl.AnswerTypeImpl();
          org.apache.ws.jaxme.impl.JMSAXElementParser _5 =  new com.amazonaws.mturk.dataschema.impl.QuestionFormAnswersTypeHandler.AnswerTypeHandler();
          _5.init(_1, _4, "http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd", "Answer", _1.getLevel());
          _5.setAttributes(pAttr);
          _1.addElementParser(_5);
          return true;
        }
        break;
      default:
        throw new java.lang.IllegalStateException("Invalid state: " + __state);
    }
    return false;
  }

  public void endElement(java.lang.String pNamespaceURI, java.lang.String pLocalName, java.lang.String pQName, java.lang.Object pResult) throws org.xml.sax.SAXException {
    com.amazonaws.mturk.dataschema.QuestionFormAnswersType _1 = (com.amazonaws.mturk.dataschema.QuestionFormAnswersType) result;
    switch (__state) {
      case 1:
        if ("http://mechanicalturk.amazonaws.com/AWSMechanicalTurkDataSchemas/2005-10-01/QuestionFormAnswers.xsd".equals(pNamespaceURI)  &&  "Answer".equals(pLocalName)) {
          _1.getAnswer().add(pResult);
          return;
        }
        break;
      default:
        throw new java.lang.IllegalStateException("Illegal state: " + __state);
    }
  }

  public boolean isFinished() {
    switch (__state) {
      case 1:
        return true;
      default:
        return false;
    }
  }

}
