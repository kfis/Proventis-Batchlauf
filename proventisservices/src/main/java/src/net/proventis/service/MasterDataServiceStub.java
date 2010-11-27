
/**
 * MasterDataServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
        package net.proventis.service;

        

        /*
        *  MasterDataServiceStub java implementation
        */

        
        public class MasterDataServiceStub extends org.apache.axis2.client.Stub
        implements MasterDataService{
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
     _service = new org.apache.axis2.description.AxisService("MasterDataService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[20];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getRiskProbability"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getIndirectCostCentres"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectPermissions"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTicketPriority"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectStates"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getDepartments"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getInternalDepartments"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTicketType"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getWtCalendars"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getCurrencies"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProgressList"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectPriorities"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectTypes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTicketSLA"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getActivities"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTicketTopic"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getDefaultRoles"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTicketState"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getRiskState"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getRiskEffect"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.service.InvalidParameterException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidParameterException"),"net.proventis.axis.blueant.exception.InvalidParameterException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.service.InvalidSessionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidSessionException"),"net.proventis.axis.blueant.exception.InvalidSessionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.service.AssertionException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","AssertionException"),"net.proventis.axis.blueant.exception.AssertionException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.service.InvalidClientException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","InvalidClientException"),"net.proventis.axis.blueant.exception.InvalidClientException");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.service.PermissionDeniedException");
              faultMessageMap.put( new javax.xml.namespace.QName("http://exception.blueant.axis.proventis.net/","PermissionDeniedException"),"net.proventis.axis.blueant.exception.PermissionDeniedException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public MasterDataServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public MasterDataServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
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
    public MasterDataServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://78.46.94.155:8081/hs/services/MasterDataService" );
                
    }

    /**
     * Default Constructor
     */
    public MasterDataServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://78.46.94.155:8081/hs/services/MasterDataService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public MasterDataServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Risikowahrscheinlichkeiten.
                     * @see net.proventis.service.MasterDataService#getRiskProbability
                     * @param getRiskProbabilityRequestParameter40
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.RiskProbabilityList getRiskProbability(

                            net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter getRiskProbabilityRequestParameter40)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskProbability");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskProbabilityRequestParameter40,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskProbability")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.RiskProbabilityList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.RiskProbabilityList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Risikowahrscheinlichkeiten.
                * @see net.proventis.service.MasterDataService#startgetRiskProbability
                    * @param getRiskProbabilityRequestParameter40
                
                */
                public  void startgetRiskProbability(

                 net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter getRiskProbabilityRequestParameter40,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskProbability");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskProbabilityRequestParameter40,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskProbability")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.RiskProbabilityList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRiskProbability(
                                        (net.proventis.axis.blueant.masterdata.RiskProbabilityList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRiskProbability(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetRiskProbability((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetRiskProbability((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetRiskProbability((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetRiskProbability((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetRiskProbability((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetRiskProbability(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskProbability(f);
                                            }
									    } else {
										    callback.receiveErrorgetRiskProbability(f);
									    }
									} else {
									    callback.receiveErrorgetRiskProbability(f);
									}
								} else {
								    callback.receiveErrorgetRiskProbability(error);
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
                                    callback.receiveErrorgetRiskProbability(axisFault);
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
                     * Dieser Service liefert eine Liste aller Hilfskostenstellen.
                     * @see net.proventis.service.MasterDataService#getIndirectCostCentres
                     * @param getIndirectCostCentresRequestParameter42
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.IndirectCostCentreList getIndirectCostCentres(

                            net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter getIndirectCostCentresRequestParameter42)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getIndirectCostCentres");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getIndirectCostCentresRequestParameter42,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getIndirectCostCentres")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.IndirectCostCentreList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.IndirectCostCentreList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Hilfskostenstellen.
                * @see net.proventis.service.MasterDataService#startgetIndirectCostCentres
                    * @param getIndirectCostCentresRequestParameter42
                
                */
                public  void startgetIndirectCostCentres(

                 net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter getIndirectCostCentresRequestParameter42,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getIndirectCostCentres");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getIndirectCostCentresRequestParameter42,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getIndirectCostCentres")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.IndirectCostCentreList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetIndirectCostCentres(
                                        (net.proventis.axis.blueant.masterdata.IndirectCostCentreList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetIndirectCostCentres(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetIndirectCostCentres((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetIndirectCostCentres((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetIndirectCostCentres((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetIndirectCostCentres((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetIndirectCostCentres((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetIndirectCostCentres(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetIndirectCostCentres(f);
                                            }
									    } else {
										    callback.receiveErrorgetIndirectCostCentres(f);
									    }
									} else {
									    callback.receiveErrorgetIndirectCostCentres(f);
									}
								} else {
								    callback.receiveErrorgetIndirectCostCentres(error);
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
                                    callback.receiveErrorgetIndirectCostCentres(axisFault);
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
                     * Dieser Service liefert eine Liste aller akt. Projektrechte. Zu finden sind diese Werte in Blue Ant unter Administration/Rechteverwaltung/Projekt/Gruppen .
                     * @see net.proventis.service.MasterDataService#getProjectPermissions
                     * @param getProjectPermissionsRequestParameter44
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectPermissionList getProjectPermissions(

                            net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter getProjectPermissionsRequestParameter44)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectPermissions");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectPermissionsRequestParameter44,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectPermissions")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectPermissionList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectPermissionList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller akt. Projektrechte. Zu finden sind diese Werte in Blue Ant unter Administration/Rechteverwaltung/Projekt/Gruppen .
                * @see net.proventis.service.MasterDataService#startgetProjectPermissions
                    * @param getProjectPermissionsRequestParameter44
                
                */
                public  void startgetProjectPermissions(

                 net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter getProjectPermissionsRequestParameter44,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectPermissions");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectPermissionsRequestParameter44,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectPermissions")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectPermissionList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectPermissions(
                                        (net.proventis.axis.blueant.project.ProjectPermissionList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectPermissions(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetProjectPermissions((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectPermissions((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectPermissions((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectPermissions((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectPermissions((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectPermissions(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPermissions(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectPermissions(f);
									    }
									} else {
									    callback.receiveErrorgetProjectPermissions(f);
									}
								} else {
								    callback.receiveErrorgetProjectPermissions(error);
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
                                    callback.receiveErrorgetProjectPermissions(axisFault);
                                }
                            }
                });
                        

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
                     * Dieser Service liefert eine Liste aller Ticketprioritäten.
                     * @see net.proventis.service.MasterDataService#getTicketPriority
                     * @param getTicketPriorityRequestParameter46
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.TicketPriorityList getTicketPriority(

                            net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter getTicketPriorityRequestParameter46)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketPriority");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketPriorityRequestParameter46,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketPriority")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.TicketPriorityList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.TicketPriorityList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Ticketprioritäten.
                * @see net.proventis.service.MasterDataService#startgetTicketPriority
                    * @param getTicketPriorityRequestParameter46
                
                */
                public  void startgetTicketPriority(

                 net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter getTicketPriorityRequestParameter46,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketPriority");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketPriorityRequestParameter46,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketPriority")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.TicketPriorityList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTicketPriority(
                                        (net.proventis.axis.blueant.masterdata.TicketPriorityList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTicketPriority(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetTicketPriority((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTicketPriority((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTicketPriority((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTicketPriority((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTicketPriority((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTicketPriority(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketPriority(f);
                                            }
									    } else {
										    callback.receiveErrorgetTicketPriority(f);
									    }
									} else {
									    callback.receiveErrorgetTicketPriority(f);
									}
								} else {
								    callback.receiveErrorgetTicketPriority(error);
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
                                    callback.receiveErrorgetTicketPriority(axisFault);
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
                     * Auto generated method signature
                     * Dieser Service liefert die in Blue Ant erfassten Projektstatus aus den Stammdaten.
                     * @see net.proventis.service.MasterDataService#getProjectStates
                     * @param getProjectStatesRequestParameter48
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.ProjectStateList getProjectStates(

                            net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter getProjectStatesRequestParameter48)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectStates");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectStatesRequestParameter48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectStates")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.ProjectStateList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.ProjectStateList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert die in Blue Ant erfassten Projektstatus aus den Stammdaten.
                * @see net.proventis.service.MasterDataService#startgetProjectStates
                    * @param getProjectStatesRequestParameter48
                
                */
                public  void startgetProjectStates(

                 net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter getProjectStatesRequestParameter48,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectStates");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectStatesRequestParameter48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectStates")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.ProjectStateList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectStates(
                                        (net.proventis.axis.blueant.masterdata.ProjectStateList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectStates(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectStates((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectStates((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectStates((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectStates((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectStates(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectStates(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectStates(f);
									    }
									} else {
									    callback.receiveErrorgetProjectStates(f);
									}
								} else {
								    callback.receiveErrorgetProjectStates(error);
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
                                    callback.receiveErrorgetProjectStates(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste von Unternehmensbereichen (intern und extern)
                     * @see net.proventis.service.MasterDataService#getDepartments
                     * @param getDepartmentsRequestParameter50
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.DepartmentList getDepartments(

                            net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter getDepartmentsRequestParameter50)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getDepartments");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDepartmentsRequestParameter50,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getDepartments")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.DepartmentList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.DepartmentList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste von Unternehmensbereichen (intern und extern)
                * @see net.proventis.service.MasterDataService#startgetDepartments
                    * @param getDepartmentsRequestParameter50
                
                */
                public  void startgetDepartments(

                 net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter getDepartmentsRequestParameter50,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getDepartments");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDepartmentsRequestParameter50,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getDepartments")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.DepartmentList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetDepartments(
                                        (net.proventis.axis.blueant.masterdata.DepartmentList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetDepartments(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetDepartments((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetDepartments((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetDepartments((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetDepartments((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetDepartments((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetDepartments(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDepartments(f);
                                            }
									    } else {
										    callback.receiveErrorgetDepartments(f);
									    }
									} else {
									    callback.receiveErrorgetDepartments(f);
									}
								} else {
								    callback.receiveErrorgetDepartments(error);
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
                                    callback.receiveErrorgetDepartments(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste von internen Unternehmensbereichen
                     * @see net.proventis.service.MasterDataService#getInternalDepartments
                     * @param getInternalDepartmentsRequestParameter52
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.InternalDepartment getInternalDepartments(

                            net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter getInternalDepartmentsRequestParameter52)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getInternalDepartments");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getInternalDepartmentsRequestParameter52,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getInternalDepartments")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.InternalDepartment.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.InternalDepartment)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste von internen Unternehmensbereichen
                * @see net.proventis.service.MasterDataService#startgetInternalDepartments
                    * @param getInternalDepartmentsRequestParameter52
                
                */
                public  void startgetInternalDepartments(

                 net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter getInternalDepartmentsRequestParameter52,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getInternalDepartments");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getInternalDepartmentsRequestParameter52,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getInternalDepartments")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.InternalDepartment.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetInternalDepartments(
                                        (net.proventis.axis.blueant.masterdata.InternalDepartment)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetInternalDepartments(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetInternalDepartments((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetInternalDepartments((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetInternalDepartments((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetInternalDepartments((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetInternalDepartments((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetInternalDepartments(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetInternalDepartments(f);
                                            }
									    } else {
										    callback.receiveErrorgetInternalDepartments(f);
									    }
									} else {
									    callback.receiveErrorgetInternalDepartments(f);
									}
								} else {
								    callback.receiveErrorgetInternalDepartments(error);
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
                                    callback.receiveErrorgetInternalDepartments(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Tickettypen.
                     * @see net.proventis.service.MasterDataService#getTicketType
                     * @param getTicketTypeRequestParameter54
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.TicketTypeList getTicketType(

                            net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter getTicketTypeRequestParameter54)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketType");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketTypeRequestParameter54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketType")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.TicketTypeList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.TicketTypeList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Tickettypen.
                * @see net.proventis.service.MasterDataService#startgetTicketType
                    * @param getTicketTypeRequestParameter54
                
                */
                public  void startgetTicketType(

                 net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter getTicketTypeRequestParameter54,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketType");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketTypeRequestParameter54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketType")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.TicketTypeList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTicketType(
                                        (net.proventis.axis.blueant.masterdata.TicketTypeList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTicketType(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetTicketType((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTicketType((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTicketType((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTicketType((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTicketType((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTicketType(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketType(f);
                                            }
									    } else {
										    callback.receiveErrorgetTicketType(f);
									    }
									} else {
									    callback.receiveErrorgetTicketType(f);
									}
								} else {
								    callback.receiveErrorgetTicketType(error);
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
                                    callback.receiveErrorgetTicketType(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller aktiven Arbeitszeit-Kalender.
                     * @see net.proventis.service.MasterDataService#getWtCalendars
                     * @param getWtCalendarsRequestParameter56
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.WtCalendarList getWtCalendars(

                            net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter getWtCalendarsRequestParameter56)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getWtCalendars");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWtCalendarsRequestParameter56,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getWtCalendars")));
                                                
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
                                             net.proventis.axis.blueant.project.WtCalendarList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.WtCalendarList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller aktiven Arbeitszeit-Kalender.
                * @see net.proventis.service.MasterDataService#startgetWtCalendars
                    * @param getWtCalendarsRequestParameter56
                
                */
                public  void startgetWtCalendars(

                 net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter getWtCalendarsRequestParameter56,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getWtCalendars");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWtCalendarsRequestParameter56,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getWtCalendars")));
                                                
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
                                                                         net.proventis.axis.blueant.project.WtCalendarList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetWtCalendars(
                                        (net.proventis.axis.blueant.project.WtCalendarList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetWtCalendars(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetWtCalendars((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetWtCalendars((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetWtCalendars((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetWtCalendars((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetWtCalendars((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetWtCalendars(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWtCalendars(f);
                                            }
									    } else {
										    callback.receiveErrorgetWtCalendars(f);
									    }
									} else {
									    callback.receiveErrorgetWtCalendars(f);
									}
								} else {
								    callback.receiveErrorgetWtCalendars(error);
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
                                    callback.receiveErrorgetWtCalendars(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert die in Blue Ant erfassten Währungen aus den Stammdaten.
                     * @see net.proventis.service.MasterDataService#getCurrencies
                     * @param getCurrenciesRequestParameter58
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.CurrencyList getCurrencies(

                            net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter getCurrenciesRequestParameter58)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getCurrencies");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCurrenciesRequestParameter58,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getCurrencies")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.CurrencyList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.CurrencyList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert die in Blue Ant erfassten Währungen aus den Stammdaten.
                * @see net.proventis.service.MasterDataService#startgetCurrencies
                    * @param getCurrenciesRequestParameter58
                
                */
                public  void startgetCurrencies(

                 net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter getCurrenciesRequestParameter58,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getCurrencies");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getCurrenciesRequestParameter58,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getCurrencies")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.CurrencyList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetCurrencies(
                                        (net.proventis.axis.blueant.masterdata.CurrencyList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetCurrencies(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetCurrencies((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetCurrencies((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetCurrencies((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetCurrencies((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetCurrencies(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetCurrencies(f);
                                            }
									    } else {
										    callback.receiveErrorgetCurrencies(f);
									    }
									} else {
									    callback.receiveErrorgetCurrencies(f);
									}
								} else {
								    callback.receiveErrorgetCurrencies(error);
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
                                    callback.receiveErrorgetCurrencies(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert alle in den Stammdaten erfassten Fertigstellungsgrade (subj. Fortschritte).
                     * @see net.proventis.service.MasterDataService#getProgressList
                     * @param getProgressListRequestParameter60
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungueltig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.ProgressList getProgressList(

                            net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter getProgressListRequestParameter60)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProgressList");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProgressListRequestParameter60,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProgressList")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.ProgressList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.ProgressList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert alle in den Stammdaten erfassten Fertigstellungsgrade (subj. Fortschritte).
                * @see net.proventis.service.MasterDataService#startgetProgressList
                    * @param getProgressListRequestParameter60
                
                */
                public  void startgetProgressList(

                 net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter getProgressListRequestParameter60,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProgressList");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProgressListRequestParameter60,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProgressList")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.ProgressList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProgressList(
                                        (net.proventis.axis.blueant.masterdata.ProgressList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProgressList(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProgressList((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProgressList((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProgressList((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProgressList((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProgressList(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProgressList(f);
                                            }
									    } else {
										    callback.receiveErrorgetProgressList(f);
									    }
									} else {
									    callback.receiveErrorgetProgressList(f);
									}
								} else {
								    callback.receiveErrorgetProgressList(error);
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
                                    callback.receiveErrorgetProgressList(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert die in Blue Ant erfassten Projektprioritäten aus den Stammdaten.
                     * @see net.proventis.service.MasterDataService#getProjectPriorities
                     * @param getProjectPrioritiesRequestParameter62
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.ProjectPriorityList getProjectPriorities(

                            net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter getProjectPrioritiesRequestParameter62)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectPriorities");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectPrioritiesRequestParameter62,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectPriorities")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.ProjectPriorityList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.ProjectPriorityList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert die in Blue Ant erfassten Projektprioritäten aus den Stammdaten.
                * @see net.proventis.service.MasterDataService#startgetProjectPriorities
                    * @param getProjectPrioritiesRequestParameter62
                
                */
                public  void startgetProjectPriorities(

                 net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter getProjectPrioritiesRequestParameter62,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectPriorities");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectPrioritiesRequestParameter62,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectPriorities")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.ProjectPriorityList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectPriorities(
                                        (net.proventis.axis.blueant.masterdata.ProjectPriorityList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectPriorities(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectPriorities((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectPriorities((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectPriorities((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectPriorities((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectPriorities(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectPriorities(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectPriorities(f);
									    }
									} else {
									    callback.receiveErrorgetProjectPriorities(f);
									}
								} else {
								    callback.receiveErrorgetProjectPriorities(error);
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
                                    callback.receiveErrorgetProjectPriorities(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert die in Blue Ant erfassten Projektarten aus den Stammdaten, die NICHT die Kennung Wartung oder Aufträge haben.
                     * @see net.proventis.service.MasterDataService#getProjectTypes
                     * @param getProjectTypesRequestParameter64
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.ProjectTypeList getProjectTypes(

                            net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter getProjectTypesRequestParameter64)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectTypes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectTypesRequestParameter64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectTypes")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.ProjectTypeList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.ProjectTypeList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert die in Blue Ant erfassten Projektarten aus den Stammdaten, die NICHT die Kennung Wartung oder Aufträge haben.
                * @see net.proventis.service.MasterDataService#startgetProjectTypes
                    * @param getProjectTypesRequestParameter64
                
                */
                public  void startgetProjectTypes(

                 net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter getProjectTypesRequestParameter64,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectTypes");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectTypesRequestParameter64,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectTypes")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.ProjectTypeList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectTypes(
                                        (net.proventis.axis.blueant.masterdata.ProjectTypeList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectTypes(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectTypes((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectTypes((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectTypes((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectTypes((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectTypes(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTypes(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectTypes(f);
									    }
									} else {
									    callback.receiveErrorgetProjectTypes(f);
									}
								} else {
								    callback.receiveErrorgetProjectTypes(error);
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
                                    callback.receiveErrorgetProjectTypes(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Ticket-Service-Level-Agreements (SLAs).
                     * @see net.proventis.service.MasterDataService#getTicketSLA
                     * @param getTicketSLARequestParameter66
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.TicketSLAList getTicketSLA(

                            net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter getTicketSLARequestParameter66)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketSLA");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketSLARequestParameter66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketSLA")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.TicketSLAList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.TicketSLAList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Ticket-Service-Level-Agreements (SLAs).
                * @see net.proventis.service.MasterDataService#startgetTicketSLA
                    * @param getTicketSLARequestParameter66
                
                */
                public  void startgetTicketSLA(

                 net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter getTicketSLARequestParameter66,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketSLA");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketSLARequestParameter66,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketSLA")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.TicketSLAList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTicketSLA(
                                        (net.proventis.axis.blueant.masterdata.TicketSLAList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTicketSLA(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetTicketSLA((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTicketSLA((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTicketSLA((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTicketSLA((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTicketSLA((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTicketSLA(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketSLA(f);
                                            }
									    } else {
										    callback.receiveErrorgetTicketSLA(f);
									    }
									} else {
									    callback.receiveErrorgetTicketSLA(f);
									}
								} else {
								    callback.receiveErrorgetTicketSLA(error);
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
                                    callback.receiveErrorgetTicketSLA(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert alle in den Stammdaten erfassten Tätigkeiten für die AZ-Erfasssung.
			Tätigkeiten mit der Kennung &quot;Leereintrag&quot; in den Stammdaten werden nicht übertragen.
                     * @see net.proventis.service.MasterDataService#getActivities
                     * @param getActivitiesRequestParameter68
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungueltig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.ActivityList getActivities(

                            net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter getActivitiesRequestParameter68)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getActivities");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getActivitiesRequestParameter68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getActivities")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.ActivityList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.ActivityList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert alle in den Stammdaten erfassten Tätigkeiten für die AZ-Erfasssung.
			Tätigkeiten mit der Kennung &quot;Leereintrag&quot; in den Stammdaten werden nicht übertragen.
                * @see net.proventis.service.MasterDataService#startgetActivities
                    * @param getActivitiesRequestParameter68
                
                */
                public  void startgetActivities(

                 net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter getActivitiesRequestParameter68,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getActivities");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getActivitiesRequestParameter68,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getActivities")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.ActivityList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetActivities(
                                        (net.proventis.axis.blueant.masterdata.ActivityList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetActivities(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetActivities((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetActivities((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetActivities((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetActivities((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetActivities(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetActivities(f);
                                            }
									    } else {
										    callback.receiveErrorgetActivities(f);
									    }
									} else {
									    callback.receiveErrorgetActivities(f);
									}
								} else {
								    callback.receiveErrorgetActivities(error);
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
                                    callback.receiveErrorgetActivities(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Ticketthemen.
                     * @see net.proventis.service.MasterDataService#getTicketTopic
                     * @param getTicketTopicRequestParameter70
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.TicketTopicList getTicketTopic(

                            net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter getTicketTopicRequestParameter70)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketTopic");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketTopicRequestParameter70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketTopic")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.TicketTopicList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.TicketTopicList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Ticketthemen.
                * @see net.proventis.service.MasterDataService#startgetTicketTopic
                    * @param getTicketTopicRequestParameter70
                
                */
                public  void startgetTicketTopic(

                 net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter getTicketTopicRequestParameter70,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketTopic");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketTopicRequestParameter70,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketTopic")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.TicketTopicList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTicketTopic(
                                        (net.proventis.axis.blueant.masterdata.TicketTopicList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTicketTopic(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetTicketTopic((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTicketTopic((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTicketTopic((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTicketTopic((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTicketTopic((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTicketTopic(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketTopic(f);
                                            }
									    } else {
										    callback.receiveErrorgetTicketTopic(f);
									    }
									} else {
									    callback.receiveErrorgetTicketTopic(f);
									}
								} else {
								    callback.receiveErrorgetTicketTopic(error);
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
                                    callback.receiveErrorgetTicketTopic(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert die in Blue Ant erfassten Projektrollen aus den Stammdaten.
                     * @see net.proventis.service.MasterDataService#getDefaultRoles
                     * @param getDefaultRolesRequestParameter72
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.DefaultRoleList getDefaultRoles(

                            net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter getDefaultRolesRequestParameter72)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getDefaultRoles");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDefaultRolesRequestParameter72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getDefaultRoles")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.DefaultRoleList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.DefaultRoleList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert die in Blue Ant erfassten Projektrollen aus den Stammdaten.
                * @see net.proventis.service.MasterDataService#startgetDefaultRoles
                    * @param getDefaultRolesRequestParameter72
                
                */
                public  void startgetDefaultRoles(

                 net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter getDefaultRolesRequestParameter72,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getDefaultRoles");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getDefaultRolesRequestParameter72,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getDefaultRoles")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.DefaultRoleList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetDefaultRoles(
                                        (net.proventis.axis.blueant.masterdata.DefaultRoleList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetDefaultRoles(e);
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
													
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetDefaultRoles((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetDefaultRoles((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetDefaultRoles((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetDefaultRoles((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetDefaultRoles(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDefaultRoles(f);
                                            }
									    } else {
										    callback.receiveErrorgetDefaultRoles(f);
									    }
									} else {
									    callback.receiveErrorgetDefaultRoles(f);
									}
								} else {
								    callback.receiveErrorgetDefaultRoles(error);
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
                                    callback.receiveErrorgetDefaultRoles(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Ticketstati.
                     * @see net.proventis.service.MasterDataService#getTicketState
                     * @param getTicketStateRequestParameter74
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.TicketStateList getTicketState(

                            net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter getTicketStateRequestParameter74)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketState");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketStateRequestParameter74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketState")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.TicketStateList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.TicketStateList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Ticketstati.
                * @see net.proventis.service.MasterDataService#startgetTicketState
                    * @param getTicketStateRequestParameter74
                
                */
                public  void startgetTicketState(

                 net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter getTicketStateRequestParameter74,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTicketState");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTicketStateRequestParameter74,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTicketState")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.TicketStateList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTicketState(
                                        (net.proventis.axis.blueant.masterdata.TicketStateList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTicketState(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetTicketState((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTicketState((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTicketState((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTicketState((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTicketState((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTicketState(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTicketState(f);
                                            }
									    } else {
										    callback.receiveErrorgetTicketState(f);
									    }
									} else {
									    callback.receiveErrorgetTicketState(f);
									}
								} else {
								    callback.receiveErrorgetTicketState(error);
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
                                    callback.receiveErrorgetTicketState(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Risikostati.
                     * @see net.proventis.service.MasterDataService#getRiskState
                     * @param getRiskStateRequestParameter76
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.RiskStateList getRiskState(

                            net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter getRiskStateRequestParameter76)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskState");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskStateRequestParameter76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskState")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.RiskStateList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.RiskStateList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Risikostati.
                * @see net.proventis.service.MasterDataService#startgetRiskState
                    * @param getRiskStateRequestParameter76
                
                */
                public  void startgetRiskState(

                 net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter getRiskStateRequestParameter76,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskState");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskStateRequestParameter76,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskState")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.RiskStateList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRiskState(
                                        (net.proventis.axis.blueant.masterdata.RiskStateList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRiskState(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetRiskState((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetRiskState((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetRiskState((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetRiskState((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetRiskState((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetRiskState(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskState(f);
                                            }
									    } else {
										    callback.receiveErrorgetRiskState(f);
									    }
									} else {
									    callback.receiveErrorgetRiskState(f);
									}
								} else {
								    callback.receiveErrorgetRiskState(error);
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
                                    callback.receiveErrorgetRiskState(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Risikoauswirkungen.
                     * @see net.proventis.service.MasterDataService#getRiskEffect
                     * @param getRiskEffectRequestParameter78
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.masterdata.RiskEffectList getRiskEffect(

                            net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter getRiskEffectRequestParameter78)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskEffect");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskEffectRequestParameter78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskEffect")));
                                                
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
                                             net.proventis.axis.blueant.masterdata.RiskEffectList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.masterdata.RiskEffectList)object;
                                   
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
                        
                        if (ex instanceof net.proventis.service.InvalidParameterException){
                          throw (net.proventis.service.InvalidParameterException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidSessionException){
                          throw (net.proventis.service.InvalidSessionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.AssertionException){
                          throw (net.proventis.service.AssertionException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.InvalidClientException){
                          throw (net.proventis.service.InvalidClientException)ex;
                        }
                        
                        if (ex instanceof net.proventis.service.PermissionDeniedException){
                          throw (net.proventis.service.PermissionDeniedException)ex;
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
                * Dieser Service liefert eine Liste aller Risikoauswirkungen.
                * @see net.proventis.service.MasterDataService#startgetRiskEffect
                    * @param getRiskEffectRequestParameter78
                
                */
                public  void startgetRiskEffect(

                 net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter getRiskEffectRequestParameter78,

                  final net.proventis.service.MasterDataServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRiskEffect");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRiskEffectRequestParameter78,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRiskEffect")));
                                                
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
                                                                         net.proventis.axis.blueant.masterdata.RiskEffectList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRiskEffect(
                                        (net.proventis.axis.blueant.masterdata.RiskEffectList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRiskEffect(e);
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
													
													if (ex instanceof net.proventis.service.InvalidParameterException){
														callback.receiveErrorgetRiskEffect((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetRiskEffect((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetRiskEffect((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetRiskEffect((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetRiskEffect((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetRiskEffect(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRiskEffect(f);
                                            }
									    } else {
										    callback.receiveErrorgetRiskEffect(f);
									    }
									} else {
									    callback.receiveErrorgetRiskEffect(f);
									}
								} else {
								    callback.receiveErrorgetRiskEffect(error);
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
                                    callback.receiveErrorgetRiskEffect(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
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
     //http://78.46.94.155:8081/hs/services/MasterDataService
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.RiskProbabilityList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.RiskProbabilityList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidParameterException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidParameterException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidSessionException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidSessionException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.AssertionException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.AssertionException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.InvalidClientException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.InvalidClientException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.exception.PermissionDeniedException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.exception.PermissionDeniedException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.IndirectCostCentreList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.IndirectCostCentreList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectPermissionList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectPermissionList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.TicketPriorityList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.TicketPriorityList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.ProjectStateList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.ProjectStateList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.DepartmentList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.DepartmentList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.InternalDepartment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.InternalDepartment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.TicketTypeList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.TicketTypeList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.WtCalendarList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.WtCalendarList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.CurrencyList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.CurrencyList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.ProgressList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.ProgressList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.ProjectPriorityList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.ProjectPriorityList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.ProjectTypeList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.ProjectTypeList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.TicketSLAList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.TicketSLAList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.ActivityList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.ActivityList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.TicketTopicList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.TicketTopicList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.DefaultRoleList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.DefaultRoleList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.TicketStateList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.TicketStateList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.RiskStateList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.RiskStateList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.masterdata.RiskEffectList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.masterdata.RiskEffectList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter.MY_QNAME,factory));
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
        
                if (net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.RiskProbabilityList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.RiskProbabilityList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.IndirectCostCentreList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.IndirectCostCentreList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectPermissionList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectPermissionList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.TicketPriorityList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.TicketPriorityList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.ProjectStateList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.ProjectStateList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.DepartmentList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.DepartmentList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.InternalDepartment.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.InternalDepartment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.TicketTypeList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.TicketTypeList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.WtCalendarList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.WtCalendarList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.CurrencyList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.CurrencyList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.ProgressList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.ProgressList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.ProjectPriorityList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.ProjectPriorityList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.ProjectTypeList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.ProjectTypeList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.TicketSLAList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.TicketSLAList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.ActivityList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.ActivityList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.TicketTopicList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.TicketTopicList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.DefaultRoleList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.DefaultRoleList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.TicketStateList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.TicketStateList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.RiskStateList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.RiskStateList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.masterdata.RiskEffectList.class.equals(type)){
                
                           return net.proventis.axis.blueant.masterdata.RiskEffectList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidParameterException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidParameterException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidSessionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidSessionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.AssertionException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.AssertionException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.InvalidClientException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.InvalidClientException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.exception.PermissionDeniedException.class.equals(type)){
                
                           return net.proventis.axis.blueant.exception.PermissionDeniedException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   