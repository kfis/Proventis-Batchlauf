
/**
 * BaseServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /**
     *  BaseServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BaseServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BaseServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BaseServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for loginNoAuth method
            * override this method for handling normal response from loginNoAuth operation
            */
           public void receiveResultloginNoAuth(
                    net.proventis.axis.blueant.base.SessionID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginNoAuth operation
           */
            public void receiveErrorloginNoAuth(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loginSAML method
            * override this method for handling normal response from loginSAML operation
            */
           public void receiveResultloginSAML(
                    net.proventis.axis.blueant.base.SessionID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loginSAML operation
           */
            public void receiveErrorloginSAML(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logout method
            * override this method for handling normal response from logout operation
            */
           public void receiveResultlogout(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logout operation
           */
            public void receiveErrorlogout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    net.proventis.axis.blueant.base.SessionID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                


    }
    