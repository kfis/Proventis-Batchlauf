
/**
 * BaseServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
        package net.proventis.service;

        

        /*
        *  BaseServiceStub java implementation
        */

        
        public class BaseServiceStub extends org.apache.axis2.client.Stub
        implements BaseService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("BaseService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[4];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "loginNoAuth"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "loginSAML"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "logout"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "login"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.axis.blueant.exception.ServerMaintenanceException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.axis.blueant.exception.InvalidDatesException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernameException"),"net.proventis.service.InvalidUsernameException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernameException"),"net.proventis.service.InvalidUsernameException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernameException"),"net.proventis.axis.blueant.exception.InvalidUsernameException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.axis.blueant.exception.InvalidNamedLicenseException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.axis.blueant.exception.ServerMaintenanceException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.axis.blueant.exception.InvalidDatesException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.axis.blueant.exception.InvalidNamedLicenseException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.service.InvalidUsernamePasswordCombinationException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.service.InvalidUsernamePasswordCombinationException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.service.ServerMaintenanceException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","ServerMaintenanceException"),"net.proventis.axis.blueant.exception.ServerMaintenanceException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.service.InvalidDatesException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidDatesException"),"net.proventis.axis.blueant.exception.InvalidDatesException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.service.InvalidNamedLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidNamedLicenseException"),"net.proventis.axis.blueant.exception.InvalidNamedLicenseException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.service.InvalidUsernamePasswordCombinationException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.service.InvalidUsernamePasswordCombinationException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidUsernamePasswordCombinationException"),"net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.service.InvalidConcurrentLicenseException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidConcurrentLicenseException"),"net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public BaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public BaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public BaseServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://78.46.94.155:8081/hs/services/BaseService" );
                
    }

    /**
     * Default Constructor
     */
    public BaseServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://78.46.94.155:8081/hs/services/BaseService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public BaseServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername oder einem Alias OHNE Password.
                     * @see net.proventis.service.BaseService#loginNoAuth
                     * @param loginNoAuthRequestParameter11
                    
                     * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
                     * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
                     * @throws net.proventis.service.InvalidUsernameException : Benutzername falsch
                     * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
                     * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
                     */

                    

                            public  net.proventis.axis.blueant.base.SessionID loginNoAuth(

                            net.proventis.axis.blueant.base.LoginNoAuthRequestParameter loginNoAuthRequestParameter11)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.ServerMaintenanceException
                        ,net.proventis.service.InvalidDatesException
                        ,net.proventis.service.InvalidUsernameException
                        ,net.proventis.service.InvalidNamedLicenseException
                        ,net.proventis.service.InvalidConcurrentLicenseException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/LoginNoAuth");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginNoAuthRequestParameter11,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "loginNoAuth")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.proventis.axis.blueant.base.SessionID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.SessionID)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof net.proventis.service.ServerMaintenanceException){
                          throw (net.proventis.service.ServerMaintenanceException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidDatesException){
                          throw (net.proventis.service.InvalidDatesException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidUsernameException){
                          throw (net.proventis.service.InvalidUsernameException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
                          throw (net.proventis.service.InvalidNamedLicenseException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
                          throw (net.proventis.service.InvalidConcurrentLicenseException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername oder einem Alias OHNE Password.
                * @see net.proventis.service.BaseService#startloginNoAuth
                    * @param loginNoAuthRequestParameter11
                
                */
                public  void startloginNoAuth(

                 net.proventis.axis.blueant.base.LoginNoAuthRequestParameter loginNoAuthRequestParameter11,

                  final net.proventis.service.BaseServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/LoginNoAuth");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginNoAuthRequestParameter11,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "loginNoAuth")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         net.proventis.axis.blueant.base.SessionID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultloginNoAuth(
                                        (net.proventis.axis.blueant.base.SessionID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorloginNoAuth(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof net.proventis.service.ServerMaintenanceException){
														callback.receiveErrorloginNoAuth((net.proventis.service.ServerMaintenanceException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidDatesException){
														callback.receiveErrorloginNoAuth((net.proventis.service.InvalidDatesException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidUsernameException){
														callback.receiveErrorloginNoAuth((net.proventis.service.InvalidUsernameException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
														callback.receiveErrorloginNoAuth((net.proventis.service.InvalidNamedLicenseException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
														callback.receiveErrorloginNoAuth((net.proventis.service.InvalidConcurrentLicenseException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorloginNoAuth(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginNoAuth(f);
                                            }
									    } else {
										    callback.receiveErrorloginNoAuth(f);
									    }
									} else {
									    callback.receiveErrorloginNoAuth(f);
									}
								} else {
								    callback.receiveErrorloginNoAuth(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorloginNoAuth(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert aus Blue Ant eine gueltige sessionID bei der Übergabe von einem SAML artifact via SSO
                     * @see net.proventis.service.BaseService#loginSAML
                     * @param loginSAMLRequestParameter13
                    
                     * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
                     * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
                     * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
                     * @throws net.proventis.service.InvalidUsernamePasswordCombinationException : Benutzername / Password falsch
                     * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
                     */

                    

                            public  net.proventis.axis.blueant.base.SessionID loginSAML(

                            net.proventis.axis.blueant.base.LoginSAMLRequestParameter loginSAMLRequestParameter13)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.ServerMaintenanceException
                        ,net.proventis.service.InvalidDatesException
                        ,net.proventis.service.InvalidNamedLicenseException
                        ,net.proventis.service.InvalidUsernamePasswordCombinationException
                        ,net.proventis.service.InvalidConcurrentLicenseException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/LoginSAML");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginSAMLRequestParameter13,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "loginSAML")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.proventis.axis.blueant.base.SessionID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.SessionID)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof net.proventis.service.ServerMaintenanceException){
                          throw (net.proventis.service.ServerMaintenanceException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidDatesException){
                          throw (net.proventis.service.InvalidDatesException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
                          throw (net.proventis.service.InvalidNamedLicenseException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidUsernamePasswordCombinationException){
                          throw (net.proventis.service.InvalidUsernamePasswordCombinationException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
                          throw (net.proventis.service.InvalidConcurrentLicenseException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Dieser Service liefert aus Blue Ant eine gueltige sessionID bei der Übergabe von einem SAML artifact via SSO
                * @see net.proventis.service.BaseService#startloginSAML
                    * @param loginSAMLRequestParameter13
                
                */
                public  void startloginSAML(

                 net.proventis.axis.blueant.base.LoginSAMLRequestParameter loginSAMLRequestParameter13,

                  final net.proventis.service.BaseServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/LoginSAML");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginSAMLRequestParameter13,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "loginSAML")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         net.proventis.axis.blueant.base.SessionID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultloginSAML(
                                        (net.proventis.axis.blueant.base.SessionID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorloginSAML(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof net.proventis.service.ServerMaintenanceException){
														callback.receiveErrorloginSAML((net.proventis.service.ServerMaintenanceException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidDatesException){
														callback.receiveErrorloginSAML((net.proventis.service.InvalidDatesException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
														callback.receiveErrorloginSAML((net.proventis.service.InvalidNamedLicenseException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidUsernamePasswordCombinationException){
														callback.receiveErrorloginSAML((net.proventis.service.InvalidUsernamePasswordCombinationException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
														callback.receiveErrorloginSAML((net.proventis.service.InvalidConcurrentLicenseException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorloginSAML(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorloginSAML(f);
                                            }
									    } else {
										    callback.receiveErrorloginSAML(f);
									    }
									} else {
									    callback.receiveErrorloginSAML(f);
									}
								} else {
								    callback.receiveErrorloginSAML(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorloginSAML(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service meldet eine gültige sessionID bei Blue Ant ab.
                     * @see net.proventis.service.BaseService#logout
                     * @param logoutRequestParameter15
                    
                     */

                    

                            public  void logout(

                            net.proventis.axis.blueant.base.LogoutRequestParameter logoutRequestParameter15)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/Logout");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logoutRequestParameter15,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "logout")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Dieser Service meldet eine gültige sessionID bei Blue Ant ab.
                * @see net.proventis.service.BaseService#startlogout
                    * @param logoutRequestParameter15
                
                */
                public  void startlogout(

                 net.proventis.axis.blueant.base.LogoutRequestParameter logoutRequestParameter15,

                  final net.proventis.service.BaseServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/Logout");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logoutRequestParameter15,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "logout")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername und Password
                     * @see net.proventis.service.BaseService#login
                     * @param loginRequestParameter17
                    
                     * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
                     * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
                     * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
                     * @throws net.proventis.service.InvalidUsernamePasswordCombinationException : Benutzername/ Password falsch
                     * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
                     */

                    

                            public  net.proventis.axis.blueant.base.SessionID login(

                            net.proventis.axis.blueant.base.LoginRequestParameter loginRequestParameter17)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.ServerMaintenanceException
                        ,net.proventis.service.InvalidDatesException
                        ,net.proventis.service.InvalidNamedLicenseException
                        ,net.proventis.service.InvalidUsernamePasswordCombinationException
                        ,net.proventis.service.InvalidConcurrentLicenseException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/Login");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginRequestParameter17,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "login")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.proventis.axis.blueant.base.SessionID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.SessionID)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof net.proventis.service.ServerMaintenanceException){
                          throw (net.proventis.service.ServerMaintenanceException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidDatesException){
                          throw (net.proventis.service.InvalidDatesException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
                          throw (net.proventis.service.InvalidNamedLicenseException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidUsernamePasswordCombinationException){
                          throw (net.proventis.service.InvalidUsernamePasswordCombinationException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
                          throw (net.proventis.service.InvalidConcurrentLicenseException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername und Password
                * @see net.proventis.service.BaseService#startlogin
                    * @param loginRequestParameter17
                
                */
                public  void startlogin(

                 net.proventis.axis.blueant.base.LoginRequestParameter loginRequestParameter17,

                  final net.proventis.service.BaseServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/Login");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    loginRequestParameter17,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "login")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         net.proventis.axis.blueant.base.SessionID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultlogin(
                                        (net.proventis.axis.blueant.base.SessionID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorlogin(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof net.proventis.service.ServerMaintenanceException){
														callback.receiveErrorlogin((net.proventis.service.ServerMaintenanceException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidDatesException){
														callback.receiveErrorlogin((net.proventis.service.InvalidDatesException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidNamedLicenseException){
														callback.receiveErrorlogin((net.proventis.service.InvalidNamedLicenseException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidUsernamePasswordCombinationException){
														callback.receiveErrorlogin((net.proventis.service.InvalidUsernamePasswordCombinationException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidConcurrentLicenseException){
														callback.receiveErrorlogin((net.proventis.service.InvalidConcurrentLicenseException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorlogin(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            }
									    } else {
										    callback.receiveErrorlogin(f);
									    }
									} else {
									    callback.receiveErrorlogin(f);
									}
								} else {
								    callback.receiveErrorlogin(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorlogin(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://78.46.94.155:8081/hs/services/BaseService
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.LoginNoAuthRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.LoginNoAuthRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.SessionID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.SessionID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.ServerMaintenanceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.ServerMaintenanceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidDatesException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidDatesException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidUsernameException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidUsernameException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidNamedLicenseException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidNamedLicenseException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.LoginSAMLRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.LoginSAMLRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.LogoutRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.LogoutRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.LoginRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.LoginRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.base.LoginNoAuthRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.base.LoginNoAuthRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.base.LoginSAMLRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.base.LoginSAMLRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.base.LogoutRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.base.LogoutRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.base.LoginRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.base.LoginRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (net.proventis.axis.blueant.base.LoginNoAuthRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.LoginNoAuthRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.SessionID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.SessionID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.ServerMaintenanceException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.ServerMaintenanceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidDatesException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidDatesException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidUsernameException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidUsernameException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidNamedLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidNamedLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.LoginSAMLRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.LoginSAMLRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.SessionID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.SessionID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.ServerMaintenanceException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.ServerMaintenanceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidDatesException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidDatesException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidNamedLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidNamedLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.LogoutRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.LogoutRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.LoginRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.LoginRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.SessionID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.SessionID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.ServerMaintenanceException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.ServerMaintenanceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidDatesException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidDatesException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidNamedLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidNamedLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidUsernamePasswordCombinationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidConcurrentLicenseException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   