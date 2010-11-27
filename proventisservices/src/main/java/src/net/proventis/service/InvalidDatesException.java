
/**
 * InvalidDatesException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class InvalidDatesException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.InvalidDatesException faultMessage;

    
        public InvalidDatesException() {
            super("InvalidDatesException");
        }

        public InvalidDatesException(java.lang.String s) {
           super(s);
        }

        public InvalidDatesException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidDatesException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.InvalidDatesException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.InvalidDatesException getFaultMessage(){
       return faultMessage;
    }
}
    