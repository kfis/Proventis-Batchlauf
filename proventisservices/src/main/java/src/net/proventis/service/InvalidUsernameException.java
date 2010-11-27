
/**
 * InvalidUsernameException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class InvalidUsernameException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.InvalidUsernameException faultMessage;

    
        public InvalidUsernameException() {
            super("InvalidUsernameException");
        }

        public InvalidUsernameException(java.lang.String s) {
           super(s);
        }

        public InvalidUsernameException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidUsernameException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.InvalidUsernameException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.InvalidUsernameException getFaultMessage(){
       return faultMessage;
    }
}
    