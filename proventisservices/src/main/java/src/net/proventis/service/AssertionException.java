
/**
 * AssertionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class AssertionException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.AssertionException faultMessage;

    
        public AssertionException() {
            super("AssertionException");
        }

        public AssertionException(java.lang.String s) {
           super(s);
        }

        public AssertionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AssertionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.AssertionException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.AssertionException getFaultMessage(){
       return faultMessage;
    }
}
    