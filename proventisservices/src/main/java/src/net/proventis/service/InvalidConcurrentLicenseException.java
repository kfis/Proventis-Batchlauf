
/**
 * InvalidConcurrentLicenseException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class InvalidConcurrentLicenseException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException faultMessage;

    
        public InvalidConcurrentLicenseException() {
            super("InvalidConcurrentLicenseException");
        }

        public InvalidConcurrentLicenseException(java.lang.String s) {
           super(s);
        }

        public InvalidConcurrentLicenseException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidConcurrentLicenseException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException getFaultMessage(){
       return faultMessage;
    }
}
    