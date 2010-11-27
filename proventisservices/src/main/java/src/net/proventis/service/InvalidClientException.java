
/**
 * InvalidClientException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class InvalidClientException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.InvalidClientException faultMessage;

    
        public InvalidClientException() {
            super("InvalidClientException");
        }

        public InvalidClientException(java.lang.String s) {
           super(s);
        }

        public InvalidClientException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidClientException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.InvalidClientException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.InvalidClientException getFaultMessage(){
       return faultMessage;
    }
}
    