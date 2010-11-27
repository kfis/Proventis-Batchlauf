
/**
 * ServerMaintenanceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

package net.proventis.service;

public class ServerMaintenanceException extends java.lang.Exception{
    
    private net.proventis.axis.blueant.exception.ServerMaintenanceException faultMessage;

    
        public ServerMaintenanceException() {
            super("ServerMaintenanceException");
        }

        public ServerMaintenanceException(java.lang.String s) {
           super(s);
        }

        public ServerMaintenanceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServerMaintenanceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.proventis.axis.blueant.exception.ServerMaintenanceException msg){
       faultMessage = msg;
    }
    
    public net.proventis.axis.blueant.exception.ServerMaintenanceException getFaultMessage(){
       return faultMessage;
    }
}
    