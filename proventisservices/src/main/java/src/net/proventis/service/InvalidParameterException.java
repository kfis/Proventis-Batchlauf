
/**
 * InvalidParameterException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class InvalidParameterException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.InvalidParameterException faultMessage;

    
        public InvalidParameterException() {
            super("InvalidParameterException");
        }

        public InvalidParameterException(java.lang.String s) {
           super(s);
        }

        public InvalidParameterException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidParameterException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.InvalidParameterException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.InvalidParameterException getFaultMessage(){
       return faultMessage;
    }
}
    