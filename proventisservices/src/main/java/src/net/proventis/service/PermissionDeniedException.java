
/**
 * PermissionDeniedException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class PermissionDeniedException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.PermissionDeniedException faultMessage;

    
        public PermissionDeniedException() {
            super("PermissionDeniedException");
        }

        public PermissionDeniedException(java.lang.String s) {
           super(s);
        }

        public PermissionDeniedException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PermissionDeniedException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.PermissionDeniedException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.PermissionDeniedException getFaultMessage(){
       return faultMessage;
    }
}
    