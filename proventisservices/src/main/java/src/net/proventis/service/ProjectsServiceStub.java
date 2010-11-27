
/**
 * ProjectsServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
        package net.proventis.service;

        

        /*
        *  ProjectsServiceStub java implementation
        */

        
        public class ProjectsServiceStub extends org.apache.axis2.client.Stub
        implements ProjectsService{
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
     _service = new org.apache.axis2.description.AxisService("ProjectsService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[34];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeProjectParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectParticipations"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addProject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteProjectResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "releaseProjectParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "assignVirtualResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectRoles"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addRisk"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "refuseProjectParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteProjectParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addTaskResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getReleasableProjectParticipations"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectList"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteTaskResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "requestParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addProjectParticipation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addTaskPredecessor"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addMultiTaskResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getTaskResources"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeProjectTask"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addProjectResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeProject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteTaskPredecessor"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectTasks"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getRisks"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteProjectTask"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getParticipationTasks"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "deleteRisk"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeTaskResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getParticipationProjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeProjectResource"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[30]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "addProjectTask"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[31]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "getProjectResources"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[32]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/", "changeRisk"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[33]=__operation;
            
        
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
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public ProjectsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public ProjectsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
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
    public ProjectsServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://78.46.94.155:8081/hs/services/ProjectsService" );
                
    }

    /**
     * Default Constructor
     */
    public ProjectsServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://78.46.94.155:8081/hs/services/ProjectsService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public ProjectsServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Dieser Service bearbeitet eine vorhandene ProjektBeteiligung.
                     * @see net.proventis.service.ProjectsService#changeProjectParticipation
                     * @param changeProjectParticipationRequestParameter90
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectParticipationList changeProjectParticipation(

                            net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter changeProjectParticipationRequestParameter90)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectParticipationRequestParameter90,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectParticipation")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectParticipationList)object;
                                   
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
                * Dieser Service bearbeitet eine vorhandene ProjektBeteiligung.
                * @see net.proventis.service.ProjectsService#startchangeProjectParticipation
                    * @param changeProjectParticipationRequestParameter90
                
                */
                public  void startchangeProjectParticipation(

                 net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter changeProjectParticipationRequestParameter90,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectParticipationRequestParameter90,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectParticipation")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultchangeProjectParticipation(
                                        (net.proventis.axis.blueant.project.ProjectParticipationList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorchangeProjectParticipation(e);
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
														callback.receiveErrorchangeProjectParticipation((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorchangeProjectParticipation((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorchangeProjectParticipation((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorchangeProjectParticipation((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorchangeProjectParticipation((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorchangeProjectParticipation(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectParticipation(f);
                                            }
									    } else {
										    callback.receiveErrorchangeProjectParticipation(f);
									    }
									} else {
									    callback.receiveErrorchangeProjectParticipation(f);
									}
								} else {
								    callback.receiveErrorchangeProjectParticipation(error);
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
                                    callback.receiveErrorchangeProjectParticipation(axisFault);
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
                     * Dieser Service liefert eine Liste aller Projektbeteiligungen zu einem Projekt aus Blue Ant. Zu finden sind diese Werte in Blue Ant unter Projekt/Planung/Ressourcen.
                     * @see net.proventis.service.ProjectsService#getProjectParticipations
                     * @param getProjectParticipationsRequestParameter92
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectParticipationList getProjectParticipations(

                            net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter getProjectParticipationsRequestParameter92)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectParticipations");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectParticipationsRequestParameter92,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectParticipations")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectParticipationList)object;
                                   
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
                * Dieser Service liefert eine Liste aller Projektbeteiligungen zu einem Projekt aus Blue Ant. Zu finden sind diese Werte in Blue Ant unter Projekt/Planung/Ressourcen.
                * @see net.proventis.service.ProjectsService#startgetProjectParticipations
                    * @param getProjectParticipationsRequestParameter92
                
                */
                public  void startgetProjectParticipations(

                 net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter getProjectParticipationsRequestParameter92,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectParticipations");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectParticipationsRequestParameter92,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectParticipations")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectParticipations(
                                        (net.proventis.axis.blueant.project.ProjectParticipationList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectParticipations(e);
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
														callback.receiveErrorgetProjectParticipations((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectParticipations((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectParticipations((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectParticipations((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectParticipations((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectParticipations(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectParticipations(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectParticipations(f);
									    }
									} else {
									    callback.receiveErrorgetProjectParticipations(f);
									}
								} else {
								    callback.receiveErrorgetProjectParticipations(error);
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
                                    callback.receiveErrorgetProjectParticipations(axisFault);
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
                     * Dieser Service legt ein Projekt an
                     * @see net.proventis.service.ProjectsService#addProject
                     * @param addProjectRequestParameter94
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.base.MandatoryID addProject(

                            net.proventis.axis.blueant.project.AddProjectRequestParameter addProjectRequestParameter94)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProject");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectRequestParameter94,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProject")));
                                                
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
                                             net.proventis.axis.blueant.base.MandatoryID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.MandatoryID)object;
                                   
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
                * Dieser Service legt ein Projekt an
                * @see net.proventis.service.ProjectsService#startaddProject
                    * @param addProjectRequestParameter94
                
                */
                public  void startaddProject(

                 net.proventis.axis.blueant.project.AddProjectRequestParameter addProjectRequestParameter94,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProject");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectRequestParameter94,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProject")));
                                                
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
                                                                         net.proventis.axis.blueant.base.MandatoryID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddProject(
                                        (net.proventis.axis.blueant.base.MandatoryID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddProject(e);
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
														callback.receiveErroraddProject((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddProject((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddProject((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddProject((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddProject((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddProject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProject(f);
                                            }
									    } else {
										    callback.receiveErroraddProject(f);
									    }
									} else {
									    callback.receiveErroraddProject(f);
									}
								} else {
								    callback.receiveErroraddProject(error);
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
                                    callback.receiveErroraddProject(axisFault);
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
                     * Dieser Service löscht eine vorhandene ProjektRessource.
                     * @see net.proventis.service.ProjectsService#deleteProjectResource
                     * @param deleteProjectResourceRequestParameter96
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteProjectResource(

                            net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter deleteProjectResourceRequestParameter96)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectResourceRequestParameter96,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectResource")));
                                                
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
                * Dieser Service löscht eine vorhandene ProjektRessource.
                * @see net.proventis.service.ProjectsService#startdeleteProjectResource
                    * @param deleteProjectResourceRequestParameter96
                
                */
                public  void startdeleteProjectResource(

                 net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter deleteProjectResourceRequestParameter96,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectResourceRequestParameter96,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectResource")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Mit diesem Service können angefragte Beteiligungen von Ressourcen freigegeben werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                     * @see net.proventis.service.ProjectsService#releaseProjectParticipation
                     * @param releaseProjectParticipationRequestParameter98
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void releaseProjectParticipation(

                            net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter releaseProjectParticipationRequestParameter98)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/releaseProjectParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    releaseProjectParticipationRequestParameter98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "releaseProjectParticipation")));
                                                
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
                * Mit diesem Service können angefragte Beteiligungen von Ressourcen freigegeben werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                * @see net.proventis.service.ProjectsService#startreleaseProjectParticipation
                    * @param releaseProjectParticipationRequestParameter98
                
                */
                public  void startreleaseProjectParticipation(

                 net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter releaseProjectParticipationRequestParameter98,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/releaseProjectParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    releaseProjectParticipationRequestParameter98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "releaseProjectParticipation")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service weist einer virtuellen ProjektRessource eine reale Ressource zu.
                     * @see net.proventis.service.ProjectsService#assignVirtualResource
                     * @param assignVirtualResourceRequestParameter100
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void assignVirtualResource(

                            net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter assignVirtualResourceRequestParameter100)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/assignVirtualResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    assignVirtualResourceRequestParameter100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "assignVirtualResource")));
                                                
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
                * Dieser Service weist einer virtuellen ProjektRessource eine reale Ressource zu.
                * @see net.proventis.service.ProjectsService#startassignVirtualResource
                    * @param assignVirtualResourceRequestParameter100
                
                */
                public  void startassignVirtualResource(

                 net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter assignVirtualResourceRequestParameter100,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/assignVirtualResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    assignVirtualResourceRequestParameter100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "assignVirtualResource")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service liefert eine Liste aller akt. Projektrollen und deren Kostensätze zu einem Projekt. Zu finden sind diese Werte in Blue Ant unter Projekte/Vorgabe/Rollen .
                     * @see net.proventis.service.ProjectsService#getProjectRoles
                     * @param getProjectRolesRequestParameter102
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectRoleList getProjectRoles(

                            net.proventis.axis.blueant.project.GetProjectRolesRequestParameter getProjectRolesRequestParameter102)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectRoles");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectRolesRequestParameter102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectRoles")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectRoleList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectRoleList)object;
                                   
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
                * Dieser Service liefert eine Liste aller akt. Projektrollen und deren Kostensätze zu einem Projekt. Zu finden sind diese Werte in Blue Ant unter Projekte/Vorgabe/Rollen .
                * @see net.proventis.service.ProjectsService#startgetProjectRoles
                    * @param getProjectRolesRequestParameter102
                
                */
                public  void startgetProjectRoles(

                 net.proventis.axis.blueant.project.GetProjectRolesRequestParameter getProjectRolesRequestParameter102,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectRoles");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectRolesRequestParameter102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectRoles")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectRoleList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectRoles(
                                        (net.proventis.axis.blueant.project.ProjectRoleList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectRoles(e);
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
														callback.receiveErrorgetProjectRoles((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectRoles((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectRoles((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectRoles((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectRoles((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectRoles(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectRoles(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectRoles(f);
									    }
									} else {
									    callback.receiveErrorgetProjectRoles(f);
									}
								} else {
								    callback.receiveErrorgetProjectRoles(error);
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
                                    callback.receiveErrorgetProjectRoles(axisFault);
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
                     * Dieser Service fügt einem Projekte ein Risiko hinzu
                     * @see net.proventis.service.ProjectsService#addRisk
                     * @param addRiskRequestParameter104
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.base.MandatoryID addRisk(

                            net.proventis.axis.blueant.project.AddRiskRequestParameter addRiskRequestParameter104)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addRisk");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addRiskRequestParameter104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addRisk")));
                                                
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
                                             net.proventis.axis.blueant.base.MandatoryID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.MandatoryID)object;
                                   
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
                * Dieser Service fügt einem Projekte ein Risiko hinzu
                * @see net.proventis.service.ProjectsService#startaddRisk
                    * @param addRiskRequestParameter104
                
                */
                public  void startaddRisk(

                 net.proventis.axis.blueant.project.AddRiskRequestParameter addRiskRequestParameter104,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addRisk");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addRiskRequestParameter104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addRisk")));
                                                
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
                                                                         net.proventis.axis.blueant.base.MandatoryID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddRisk(
                                        (net.proventis.axis.blueant.base.MandatoryID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddRisk(e);
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
														callback.receiveErroraddRisk((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddRisk((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddRisk((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddRisk((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddRisk((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddRisk(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddRisk(f);
                                            }
									    } else {
										    callback.receiveErroraddRisk(f);
									    }
									} else {
									    callback.receiveErroraddRisk(f);
									}
								} else {
								    callback.receiveErroraddRisk(error);
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
                                    callback.receiveErroraddRisk(axisFault);
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
                     * Mit diesem Service können angefragte Beteiligungen von Ressourcen abgelehnt werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                     * @see net.proventis.service.ProjectsService#refuseProjectParticipation
                     * @param refuseProjectParticipationRequestParameter106
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void refuseProjectParticipation(

                            net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter refuseProjectParticipationRequestParameter106)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/refuseProjectParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    refuseProjectParticipationRequestParameter106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "refuseProjectParticipation")));
                                                
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
                * Mit diesem Service können angefragte Beteiligungen von Ressourcen abgelehnt werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                * @see net.proventis.service.ProjectsService#startrefuseProjectParticipation
                    * @param refuseProjectParticipationRequestParameter106
                
                */
                public  void startrefuseProjectParticipation(

                 net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter refuseProjectParticipationRequestParameter106,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/refuseProjectParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    refuseProjectParticipationRequestParameter106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "refuseProjectParticipation")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service löscht eine vorhandene ProjektBeteiligung.
                     * @see net.proventis.service.ProjectsService#deleteProjectParticipation
                     * @param deleteProjectParticipationRequestParameter108
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteProjectParticipation(

                            net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter deleteProjectParticipationRequestParameter108)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectParticipationRequestParameter108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectParticipation")));
                                                
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
                * Dieser Service löscht eine vorhandene ProjektBeteiligung.
                * @see net.proventis.service.ProjectsService#startdeleteProjectParticipation
                    * @param deleteProjectParticipationRequestParameter108
                
                */
                public  void startdeleteProjectParticipation(

                 net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter deleteProjectParticipationRequestParameter108,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectParticipationRequestParameter108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectParticipation")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service legt eine Aktivitätenbeteiligung an
                     * @see net.proventis.service.ProjectsService#addTaskResource
                     * @param addTaskResourceRequestParameter110
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.base.MandatoryID addTaskResource(

                            net.proventis.axis.blueant.project.AddTaskResourceRequestParameter addTaskResourceRequestParameter110)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addTaskResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addTaskResourceRequestParameter110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addTaskResource")));
                                                
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
                                             net.proventis.axis.blueant.base.MandatoryID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.MandatoryID)object;
                                   
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
                * Dieser Service legt eine Aktivitätenbeteiligung an
                * @see net.proventis.service.ProjectsService#startaddTaskResource
                    * @param addTaskResourceRequestParameter110
                
                */
                public  void startaddTaskResource(

                 net.proventis.axis.blueant.project.AddTaskResourceRequestParameter addTaskResourceRequestParameter110,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addTaskResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addTaskResourceRequestParameter110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addTaskResource")));
                                                
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
                                                                         net.proventis.axis.blueant.base.MandatoryID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddTaskResource(
                                        (net.proventis.axis.blueant.base.MandatoryID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddTaskResource(e);
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
														callback.receiveErroraddTaskResource((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddTaskResource((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddTaskResource((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddTaskResource((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddTaskResource((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddTaskResource(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddTaskResource(f);
                                            }
									    } else {
										    callback.receiveErroraddTaskResource(f);
									    }
									} else {
									    callback.receiveErroraddTaskResource(f);
									}
								} else {
								    callback.receiveErroraddTaskResource(error);
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
                                    callback.receiveErroraddTaskResource(axisFault);
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
                     * Dieser Service liefert eine Liste Projektbeteiligungen die vom Anfragenden freigegeben werden können.
                     * @see net.proventis.service.ProjectsService#getReleasableProjectParticipations
                     * @param getReleasableProjectParticipationsRequestParameter112
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectParticipationList getReleasableProjectParticipations(

                            net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter getReleasableProjectParticipationsRequestParameter112)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getReleasableProjectParticipations");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReleasableProjectParticipationsRequestParameter112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getReleasableProjectParticipations")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectParticipationList)object;
                                   
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
                * Dieser Service liefert eine Liste Projektbeteiligungen die vom Anfragenden freigegeben werden können.
                * @see net.proventis.service.ProjectsService#startgetReleasableProjectParticipations
                    * @param getReleasableProjectParticipationsRequestParameter112
                
                */
                public  void startgetReleasableProjectParticipations(

                 net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter getReleasableProjectParticipationsRequestParameter112,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getReleasableProjectParticipations");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getReleasableProjectParticipationsRequestParameter112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getReleasableProjectParticipations")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetReleasableProjectParticipations(
                                        (net.proventis.axis.blueant.project.ProjectParticipationList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetReleasableProjectParticipations(e);
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
														callback.receiveErrorgetReleasableProjectParticipations((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetReleasableProjectParticipations((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetReleasableProjectParticipations((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetReleasableProjectParticipations((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetReleasableProjectParticipations((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetReleasableProjectParticipations(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetReleasableProjectParticipations(f);
                                            }
									    } else {
										    callback.receiveErrorgetReleasableProjectParticipations(f);
									    }
									} else {
									    callback.receiveErrorgetReleasableProjectParticipations(f);
									}
								} else {
								    callback.receiveErrorgetReleasableProjectParticipations(error);
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
                                    callback.receiveErrorgetReleasableProjectParticipations(axisFault);
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
                     * Dieser Service liefert aus Blue Ant eine Liste aller Projekte die nicht archiviert oder gelöscht sind. Projektvorlagen werden nicht mit zurückgegeben.
                     * @see net.proventis.service.ProjectsService#getProjectList
                     * @param getProjectListRequestParameter114
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter: - Nachticht zu lang
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectList getProjectList(

                            net.proventis.axis.blueant.project.GetProjectListRequestParameter getProjectListRequestParameter114)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectList");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectListRequestParameter114,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectList")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectList)object;
                                   
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
                * Dieser Service liefert aus Blue Ant eine Liste aller Projekte die nicht archiviert oder gelöscht sind. Projektvorlagen werden nicht mit zurückgegeben.
                * @see net.proventis.service.ProjectsService#startgetProjectList
                    * @param getProjectListRequestParameter114
                
                */
                public  void startgetProjectList(

                 net.proventis.axis.blueant.project.GetProjectListRequestParameter getProjectListRequestParameter114,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectList");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectListRequestParameter114,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectList")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectList(
                                        (net.proventis.axis.blueant.project.ProjectList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectList(e);
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
														callback.receiveErrorgetProjectList((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectList((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectList((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectList((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectList((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectList(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectList(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectList(f);
									    }
									} else {
									    callback.receiveErrorgetProjectList(f);
									}
								} else {
								    callback.receiveErrorgetProjectList(error);
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
                                    callback.receiveErrorgetProjectList(axisFault);
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
                     * Dieser Service löscht eine Aktivitätenbeteiligung
                     * @see net.proventis.service.ProjectsService#deleteTaskResource
                     * @param deleteTaskResourceRequestParameter116
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteTaskResource(

                            net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter deleteTaskResourceRequestParameter116)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteTaskResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteTaskResourceRequestParameter116,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteTaskResource")));
                                                
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
                * Dieser Service löscht eine Aktivitätenbeteiligung
                * @see net.proventis.service.ProjectsService#startdeleteTaskResource
                    * @param deleteTaskResourceRequestParameter116
                
                */
                public  void startdeleteTaskResource(

                 net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter deleteTaskResourceRequestParameter116,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteTaskResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteTaskResourceRequestParameter116,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteTaskResource")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Beantragen einer Projektmitgliedschaft. Grundlage bilden getParticipationProject/getParticipationTasks. Aus Blue Ant wird eine Mail an den Projektleiter gesandt.
                     * @see net.proventis.service.ProjectsService#requestParticipation
                     * @param requestParticipationRequestParameter118
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter: - Nachticht zu lang
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void requestParticipation(

                            net.proventis.axis.blueant.project.RequestParticipationRequestParameter requestParticipationRequestParameter118)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/requestParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    requestParticipationRequestParameter118,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "requestParticipation")));
                                                
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
                * Beantragen einer Projektmitgliedschaft. Grundlage bilden getParticipationProject/getParticipationTasks. Aus Blue Ant wird eine Mail an den Projektleiter gesandt.
                * @see net.proventis.service.ProjectsService#startrequestParticipation
                    * @param requestParticipationRequestParameter118
                
                */
                public  void startrequestParticipation(

                 net.proventis.axis.blueant.project.RequestParticipationRequestParameter requestParticipationRequestParameter118,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/requestParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    requestParticipationRequestParameter118,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "requestParticipation")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service beantragt eine neue ProjektBeteiligung.
                     * @see net.proventis.service.ProjectsService#addProjectParticipation
                     * @param addProjectParticipationRequestParameter120
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectParticipationList addProjectParticipation(

                            net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter addProjectParticipationRequestParameter120)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectParticipation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectParticipationRequestParameter120,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectParticipation")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectParticipationList)object;
                                   
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
                * Dieser Service beantragt eine neue ProjektBeteiligung.
                * @see net.proventis.service.ProjectsService#startaddProjectParticipation
                    * @param addProjectParticipationRequestParameter120
                
                */
                public  void startaddProjectParticipation(

                 net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter addProjectParticipationRequestParameter120,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectParticipation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectParticipationRequestParameter120,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectParticipation")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectParticipationList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddProjectParticipation(
                                        (net.proventis.axis.blueant.project.ProjectParticipationList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddProjectParticipation(e);
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
														callback.receiveErroraddProjectParticipation((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddProjectParticipation((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddProjectParticipation((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddProjectParticipation((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddProjectParticipation((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddProjectParticipation(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectParticipation(f);
                                            }
									    } else {
										    callback.receiveErroraddProjectParticipation(f);
									    }
									} else {
									    callback.receiveErroraddProjectParticipation(f);
									}
								} else {
								    callback.receiveErroraddProjectParticipation(error);
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
                                    callback.receiveErroraddProjectParticipation(axisFault);
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
                     * Dieser Service verknüpft eine Aktivität mit einer Vorgänger-Aktivität
                     * @see net.proventis.service.ProjectsService#addTaskPredecessor
                     * @param addTaskPredecessorRequestParameter122
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void addTaskPredecessor(

                            net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter addTaskPredecessorRequestParameter122)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addTaskPredecessor");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addTaskPredecessorRequestParameter122,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addTaskPredecessor")));
                                                
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
                * Dieser Service verknüpft eine Aktivität mit einer Vorgänger-Aktivität
                * @see net.proventis.service.ProjectsService#startaddTaskPredecessor
                    * @param addTaskPredecessorRequestParameter122
                
                */
                public  void startaddTaskPredecessor(

                 net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter addTaskPredecessorRequestParameter122,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addTaskPredecessor");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addTaskPredecessorRequestParameter122,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addTaskPredecessor")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Dieser Service legt mehrere Aktivitätenbeteiligungen an
                     * @see net.proventis.service.ProjectsService#addMultiTaskResource
                     * @param addMultiTaskResourceRequestParameter124
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.TaskResourceResultList addMultiTaskResource(

                            net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter addMultiTaskResourceRequestParameter124)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addMultiTaskResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addMultiTaskResourceRequestParameter124,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addMultiTaskResource")));
                                                
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
                                             net.proventis.axis.blueant.project.TaskResourceResultList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.TaskResourceResultList)object;
                                   
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
                * Dieser Service legt mehrere Aktivitätenbeteiligungen an
                * @see net.proventis.service.ProjectsService#startaddMultiTaskResource
                    * @param addMultiTaskResourceRequestParameter124
                
                */
                public  void startaddMultiTaskResource(

                 net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter addMultiTaskResourceRequestParameter124,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addMultiTaskResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addMultiTaskResourceRequestParameter124,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addMultiTaskResource")));
                                                
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
                                                                         net.proventis.axis.blueant.project.TaskResourceResultList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddMultiTaskResource(
                                        (net.proventis.axis.blueant.project.TaskResourceResultList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddMultiTaskResource(e);
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
														callback.receiveErroraddMultiTaskResource((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddMultiTaskResource((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddMultiTaskResource((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddMultiTaskResource((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddMultiTaskResource((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddMultiTaskResource(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddMultiTaskResource(f);
                                            }
									    } else {
										    callback.receiveErroraddMultiTaskResource(f);
									    }
									} else {
									    callback.receiveErroraddMultiTaskResource(f);
									}
								} else {
								    callback.receiveErroraddMultiTaskResource(error);
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
                                    callback.receiveErroraddMultiTaskResource(axisFault);
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
                     * Dieser Service liefert eine Liste von Aktivitätenbeteiligungen
                     * @see net.proventis.service.ProjectsService#getTaskResources
                     * @param getTaskResourcesRequestParameter126
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.TaskResourceList getTaskResources(

                            net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter getTaskResourcesRequestParameter126)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTaskResources");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskResourcesRequestParameter126,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTaskResources")));
                                                
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
                                             net.proventis.axis.blueant.project.TaskResourceList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.TaskResourceList)object;
                                   
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
                * Dieser Service liefert eine Liste von Aktivitätenbeteiligungen
                * @see net.proventis.service.ProjectsService#startgetTaskResources
                    * @param getTaskResourcesRequestParameter126
                
                */
                public  void startgetTaskResources(

                 net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter getTaskResourcesRequestParameter126,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getTaskResources");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getTaskResourcesRequestParameter126,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getTaskResources")));
                                                
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
                                                                         net.proventis.axis.blueant.project.TaskResourceList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetTaskResources(
                                        (net.proventis.axis.blueant.project.TaskResourceList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetTaskResources(e);
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
														callback.receiveErrorgetTaskResources((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetTaskResources((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetTaskResources((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetTaskResources((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetTaskResources((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetTaskResources(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetTaskResources(f);
                                            }
									    } else {
										    callback.receiveErrorgetTaskResources(f);
									    }
									} else {
									    callback.receiveErrorgetTaskResources(f);
									}
								} else {
								    callback.receiveErrorgetTaskResources(error);
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
                                    callback.receiveErrorgetTaskResources(axisFault);
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
                     * Dieser Service ändert eine Aktivität
                     * @see net.proventis.service.ProjectsService#changeProjectTask
                     * @param changeProjectTaskRequestParameter128
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void changeProjectTask(

                            net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter changeProjectTaskRequestParameter128)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectTask");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectTaskRequestParameter128,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectTask")));
                                                
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
                * Dieser Service ändert eine Aktivität
                * @see net.proventis.service.ProjectsService#startchangeProjectTask
                    * @param changeProjectTaskRequestParameter128
                
                */
                public  void startchangeProjectTask(

                 net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter changeProjectTaskRequestParameter128,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectTask");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectTaskRequestParameter128,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectTask")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

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
                     * Auto generated method signature
                     * Dieser Service legt eine neue ProjektRessource an.
                     * @see net.proventis.service.ProjectsService#addProjectResource
                     * @param addProjectResourceRequestParameter130
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.base.MandatoryID addProjectResource(

                            net.proventis.axis.blueant.project.AddProjectResourceRequestParameter addProjectResourceRequestParameter130)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectResourceRequestParameter130,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectResource")));
                                                
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
                                             net.proventis.axis.blueant.base.MandatoryID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.MandatoryID)object;
                                   
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
                * Dieser Service legt eine neue ProjektRessource an.
                * @see net.proventis.service.ProjectsService#startaddProjectResource
                    * @param addProjectResourceRequestParameter130
                
                */
                public  void startaddProjectResource(

                 net.proventis.axis.blueant.project.AddProjectResourceRequestParameter addProjectResourceRequestParameter130,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectResourceRequestParameter130,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectResource")));
                                                
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
                                                                         net.proventis.axis.blueant.base.MandatoryID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddProjectResource(
                                        (net.proventis.axis.blueant.base.MandatoryID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddProjectResource(e);
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
														callback.receiveErroraddProjectResource((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddProjectResource((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddProjectResource((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddProjectResource((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddProjectResource((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddProjectResource(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectResource(f);
                                            }
									    } else {
										    callback.receiveErroraddProjectResource(f);
									    }
									} else {
									    callback.receiveErroraddProjectResource(f);
									}
								} else {
								    callback.receiveErroraddProjectResource(error);
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
                                    callback.receiveErroraddProjectResource(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[20].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service ändert die Basisdaten eines Projektes
                     * @see net.proventis.service.ProjectsService#changeProject
                     * @param changeProjectRequestParameter132
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void changeProject(

                            net.proventis.axis.blueant.project.ChangeProjectRequestParameter changeProjectRequestParameter132)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProject");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectRequestParameter132,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProject")));
                                                
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
                * Dieser Service ändert die Basisdaten eines Projektes
                * @see net.proventis.service.ProjectsService#startchangeProject
                    * @param changeProjectRequestParameter132
                
                */
                public  void startchangeProject(

                 net.proventis.axis.blueant.project.ChangeProjectRequestParameter changeProjectRequestParameter132,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProject");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectRequestParameter132,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProject")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[21].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service löscht die Verknüpfung zwischen einer Aktivität und einer Vorgänger-Aktivität
                     * @see net.proventis.service.ProjectsService#deleteTaskPredecessor
                     * @param deleteTaskPredecessorRequestParameter134
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteTaskPredecessor(

                            net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter deleteTaskPredecessorRequestParameter134)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteTaskPredecessor");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteTaskPredecessorRequestParameter134,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteTaskPredecessor")));
                                                
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
                * Dieser Service löscht die Verknüpfung zwischen einer Aktivität und einer Vorgänger-Aktivität
                * @see net.proventis.service.ProjectsService#startdeleteTaskPredecessor
                    * @param deleteTaskPredecessorRequestParameter134
                
                */
                public  void startdeleteTaskPredecessor(

                 net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter deleteTaskPredecessorRequestParameter134,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteTaskPredecessor");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteTaskPredecessorRequestParameter134,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteTaskPredecessor")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[22].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Projektaktivitäten zu einem Projekt.
                     * @see net.proventis.service.ProjectsService#getProjectTasks
                     * @param getProjectTasksRequestParameter136
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectTaskList getProjectTasks(

                            net.proventis.axis.blueant.project.GetProjectTasksRequestParameter getProjectTasksRequestParameter136)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectTasks");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectTasksRequestParameter136,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectTasks")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectTaskList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectTaskList)object;
                                   
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
                * Dieser Service liefert eine Liste aller Projektaktivitäten zu einem Projekt.
                * @see net.proventis.service.ProjectsService#startgetProjectTasks
                    * @param getProjectTasksRequestParameter136
                
                */
                public  void startgetProjectTasks(

                 net.proventis.axis.blueant.project.GetProjectTasksRequestParameter getProjectTasksRequestParameter136,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectTasks");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectTasksRequestParameter136,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectTasks")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectTaskList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectTasks(
                                        (net.proventis.axis.blueant.project.ProjectTaskList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectTasks(e);
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
														callback.receiveErrorgetProjectTasks((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectTasks((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectTasks((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectTasks((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectTasks((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectTasks(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectTasks(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectTasks(f);
									    }
									} else {
									    callback.receiveErrorgetProjectTasks(f);
									}
								} else {
								    callback.receiveErrorgetProjectTasks(error);
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
                                    callback.receiveErrorgetProjectTasks(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[23].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[23].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert die Risiken eines Projektes
                     * @see net.proventis.service.ProjectsService#getRisks
                     * @param getRisksRequestParameter138
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.RiskList getRisks(

                            net.proventis.axis.blueant.project.GetRisksRequestParameter getRisksRequestParameter138)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRisks");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRisksRequestParameter138,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRisks")));
                                                
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
                                             net.proventis.axis.blueant.project.RiskList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.RiskList)object;
                                   
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
                * Dieser Service liefert die Risiken eines Projektes
                * @see net.proventis.service.ProjectsService#startgetRisks
                    * @param getRisksRequestParameter138
                
                */
                public  void startgetRisks(

                 net.proventis.axis.blueant.project.GetRisksRequestParameter getRisksRequestParameter138,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getRisks");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRisksRequestParameter138,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getRisks")));
                                                
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
                                                                         net.proventis.axis.blueant.project.RiskList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRisks(
                                        (net.proventis.axis.blueant.project.RiskList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRisks(e);
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
														callback.receiveErrorgetRisks((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetRisks((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetRisks((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetRisks((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetRisks((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetRisks(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRisks(f);
                                            }
									    } else {
										    callback.receiveErrorgetRisks(f);
									    }
									} else {
									    callback.receiveErrorgetRisks(f);
									}
								} else {
								    callback.receiveErrorgetRisks(error);
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
                                    callback.receiveErrorgetRisks(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[24].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[24].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service löscht eine Aktivität
                     * @see net.proventis.service.ProjectsService#deleteProjectTask
                     * @param deleteProjectTaskRequestParameter140
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteProjectTask(

                            net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter deleteProjectTaskRequestParameter140)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectTask");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectTaskRequestParameter140,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectTask")));
                                                
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
                * Dieser Service löscht eine Aktivität
                * @see net.proventis.service.ProjectsService#startdeleteProjectTask
                    * @param deleteProjectTaskRequestParameter140
                
                */
                public  void startdeleteProjectTask(

                 net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter deleteProjectTaskRequestParameter140,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteProjectTask");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteProjectTaskRequestParameter140,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteProjectTask")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[25].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[25].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Auflistung aller Aktivitäten aus den aktiven Projekten in denen
a) der Mitarbeiter noch kein Mitglied ist und die Aktivitäten nicht zu 100% fertig sind (subj)
b) der Mitarbeiter Mitglied ist, aber den Aktivitäten nicht zugewiesen ist und die Aktivitäten noch nicht zu 100% fertig sind (subj).
                     * @see net.proventis.service.ProjectsService#getParticipationTasks
                     * @param getParticipationTasksRequestParameter142
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ParticipationTaskList getParticipationTasks(

                            net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter getParticipationTasksRequestParameter142)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getParticipationTasks");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getParticipationTasksRequestParameter142,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getParticipationTasks")));
                                                
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
                                             net.proventis.axis.blueant.project.ParticipationTaskList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ParticipationTaskList)object;
                                   
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
                * Auflistung aller Aktivitäten aus den aktiven Projekten in denen
a) der Mitarbeiter noch kein Mitglied ist und die Aktivitäten nicht zu 100% fertig sind (subj)
b) der Mitarbeiter Mitglied ist, aber den Aktivitäten nicht zugewiesen ist und die Aktivitäten noch nicht zu 100% fertig sind (subj).
                * @see net.proventis.service.ProjectsService#startgetParticipationTasks
                    * @param getParticipationTasksRequestParameter142
                
                */
                public  void startgetParticipationTasks(

                 net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter getParticipationTasksRequestParameter142,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getParticipationTasks");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getParticipationTasksRequestParameter142,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getParticipationTasks")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ParticipationTaskList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetParticipationTasks(
                                        (net.proventis.axis.blueant.project.ParticipationTaskList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetParticipationTasks(e);
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
														callback.receiveErrorgetParticipationTasks((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetParticipationTasks((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetParticipationTasks((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetParticipationTasks((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetParticipationTasks((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetParticipationTasks(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationTasks(f);
                                            }
									    } else {
										    callback.receiveErrorgetParticipationTasks(f);
									    }
									} else {
									    callback.receiveErrorgetParticipationTasks(f);
									}
								} else {
								    callback.receiveErrorgetParticipationTasks(error);
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
                                    callback.receiveErrorgetParticipationTasks(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[26].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[26].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service löscht ein Risiko aus einem Projekt
                     * @see net.proventis.service.ProjectsService#deleteRisk
                     * @param deleteRiskRequestParameter144
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void deleteRisk(

                            net.proventis.axis.blueant.project.DeleteRiskRequestParameter deleteRiskRequestParameter144)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteRisk");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteRiskRequestParameter144,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteRisk")));
                                                
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
                * Dieser Service löscht ein Risiko aus einem Projekt
                * @see net.proventis.service.ProjectsService#startdeleteRisk
                    * @param deleteRiskRequestParameter144
                
                */
                public  void startdeleteRisk(

                 net.proventis.axis.blueant.project.DeleteRiskRequestParameter deleteRiskRequestParameter144,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/deleteRisk");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteRiskRequestParameter144,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "deleteRisk")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[27].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[27].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service ändert eine Aktivitätenbeteiligung
                     * @see net.proventis.service.ProjectsService#changeTaskResource
                     * @param changeTaskResourceRequestParameter146
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void changeTaskResource(

                            net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter changeTaskResourceRequestParameter146)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeTaskResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeTaskResourceRequestParameter146,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeTaskResource")));
                                                
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
                * Dieser Service ändert eine Aktivitätenbeteiligung
                * @see net.proventis.service.ProjectsService#startchangeTaskResource
                    * @param changeTaskResourceRequestParameter146
                
                */
                public  void startchangeTaskResource(

                 net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter changeTaskResourceRequestParameter146,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeTaskResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeTaskResourceRequestParameter146,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeTaskResource")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[28].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[28].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Auflistung aller aktiven Projekte egal ob der der Mitarbeiter bereits Mitglied ist oder noch nicht.
                     * @see net.proventis.service.ProjectsService#getParticipationProjects
                     * @param getParticipationProjectsRequestParameter148
                    
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ParticipationProjectList getParticipationProjects(

                            net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter getParticipationProjectsRequestParameter148)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getParticipationProjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getParticipationProjectsRequestParameter148,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getParticipationProjects")));
                                                
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
                                             net.proventis.axis.blueant.project.ParticipationProjectList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ParticipationProjectList)object;
                                   
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
                * Auflistung aller aktiven Projekte egal ob der der Mitarbeiter bereits Mitglied ist oder noch nicht.
                * @see net.proventis.service.ProjectsService#startgetParticipationProjects
                    * @param getParticipationProjectsRequestParameter148
                
                */
                public  void startgetParticipationProjects(

                 net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter getParticipationProjectsRequestParameter148,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getParticipationProjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getParticipationProjectsRequestParameter148,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getParticipationProjects")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ParticipationProjectList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetParticipationProjects(
                                        (net.proventis.axis.blueant.project.ParticipationProjectList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetParticipationProjects(e);
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
														callback.receiveErrorgetParticipationProjects((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetParticipationProjects((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetParticipationProjects((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetParticipationProjects((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetParticipationProjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetParticipationProjects(f);
                                            }
									    } else {
										    callback.receiveErrorgetParticipationProjects(f);
									    }
									} else {
									    callback.receiveErrorgetParticipationProjects(f);
									}
								} else {
								    callback.receiveErrorgetParticipationProjects(error);
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
                                    callback.receiveErrorgetParticipationProjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[29].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[29].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service bearbeitet eine vorhandene ProjektRessource.
                     * @see net.proventis.service.ProjectsService#changeProjectResource
                     * @param changeProjectResourceRequestParameter150
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.base.MandatoryID changeProjectResource(

                            net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter changeProjectResourceRequestParameter150)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectResource");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectResourceRequestParameter150,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectResource")));
                                                
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
                                             net.proventis.axis.blueant.base.MandatoryID.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.base.MandatoryID)object;
                                   
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
                * Dieser Service bearbeitet eine vorhandene ProjektRessource.
                * @see net.proventis.service.ProjectsService#startchangeProjectResource
                    * @param changeProjectResourceRequestParameter150
                
                */
                public  void startchangeProjectResource(

                 net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter changeProjectResourceRequestParameter150,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeProjectResource");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeProjectResourceRequestParameter150,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeProjectResource")));
                                                
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
                                                                         net.proventis.axis.blueant.base.MandatoryID.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultchangeProjectResource(
                                        (net.proventis.axis.blueant.base.MandatoryID)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorchangeProjectResource(e);
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
														callback.receiveErrorchangeProjectResource((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorchangeProjectResource((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorchangeProjectResource((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorchangeProjectResource((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorchangeProjectResource((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorchangeProjectResource(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorchangeProjectResource(f);
                                            }
									    } else {
										    callback.receiveErrorchangeProjectResource(f);
									    }
									} else {
									    callback.receiveErrorchangeProjectResource(f);
									}
								} else {
								    callback.receiveErrorchangeProjectResource(error);
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
                                    callback.receiveErrorchangeProjectResource(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[30].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[30].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service fügt eine Aktivität zu einem Projekt hinzu
                     * @see net.proventis.service.ProjectsService#addProjectTask
                     * @param addProjectTaskRequestParameter152
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.AddProjectTaskResponse addProjectTask(

                            net.proventis.axis.blueant.project.AddProjectTaskRequestParameter addProjectTaskRequestParameter152)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectTask");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectTaskRequestParameter152,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectTask")));
                                                
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
                                             net.proventis.axis.blueant.project.AddProjectTaskResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.AddProjectTaskResponse)object;
                                   
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
                * Dieser Service fügt eine Aktivität zu einem Projekt hinzu
                * @see net.proventis.service.ProjectsService#startaddProjectTask
                    * @param addProjectTaskRequestParameter152
                
                */
                public  void startaddProjectTask(

                 net.proventis.axis.blueant.project.AddProjectTaskRequestParameter addProjectTaskRequestParameter152,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/addProjectTask");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addProjectTaskRequestParameter152,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "addProjectTask")));
                                                
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
                                                                         net.proventis.axis.blueant.project.AddProjectTaskResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddProjectTask(
                                        (net.proventis.axis.blueant.project.AddProjectTaskResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddProjectTask(e);
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
														callback.receiveErroraddProjectTask((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErroraddProjectTask((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErroraddProjectTask((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErroraddProjectTask((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErroraddProjectTask((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddProjectTask(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddProjectTask(f);
                                            }
									    } else {
										    callback.receiveErroraddProjectTask(f);
									    }
									} else {
									    callback.receiveErroraddProjectTask(f);
									}
								} else {
								    callback.receiveErroraddProjectTask(error);
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
                                    callback.receiveErroraddProjectTask(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[31].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[31].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service liefert eine Liste aller Ressourcen, die einem Projekt zugeordnet sind und dem definierten RessourcenTyp entsprechen.. Zu finden sind diese Werte in Blue Ant unter Projekte/Planung/Ressourcen. Nur Ressourcen, deren Beteiligung freigegeben ist, können für die Aktivitätenplanung eingesetzt werden.
                     * @see net.proventis.service.ProjectsService#getProjectResources
                     * @param getProjectResourcesRequestParameter154
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  net.proventis.axis.blueant.project.ProjectResourceList getProjectResources(

                            net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter getProjectResourcesRequestParameter154)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectResources");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectResourcesRequestParameter154,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectResources")));
                                                
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
                                             net.proventis.axis.blueant.project.ProjectResourceList.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.proventis.axis.blueant.project.ProjectResourceList)object;
                                   
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
                * Dieser Service liefert eine Liste aller Ressourcen, die einem Projekt zugeordnet sind und dem definierten RessourcenTyp entsprechen.. Zu finden sind diese Werte in Blue Ant unter Projekte/Planung/Ressourcen. Nur Ressourcen, deren Beteiligung freigegeben ist, können für die Aktivitätenplanung eingesetzt werden.
                * @see net.proventis.service.ProjectsService#startgetProjectResources
                    * @param getProjectResourcesRequestParameter154
                
                */
                public  void startgetProjectResources(

                 net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter getProjectResourcesRequestParameter154,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/getProjectResources");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectResourcesRequestParameter154,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "getProjectResources")));
                                                
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
                                                                         net.proventis.axis.blueant.project.ProjectResourceList.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectResources(
                                        (net.proventis.axis.blueant.project.ProjectResourceList)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectResources(e);
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
														callback.receiveErrorgetProjectResources((net.proventis.service.InvalidParameterException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidSessionException){
														callback.receiveErrorgetProjectResources((net.proventis.service.InvalidSessionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.AssertionException){
														callback.receiveErrorgetProjectResources((net.proventis.service.AssertionException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.InvalidClientException){
														callback.receiveErrorgetProjectResources((net.proventis.service.InvalidClientException)ex);
											            return;
										            }
										            
													if (ex instanceof net.proventis.service.PermissionDeniedException){
														callback.receiveErrorgetProjectResources((net.proventis.service.PermissionDeniedException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetProjectResources(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectResources(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectResources(f);
									    }
									} else {
									    callback.receiveErrorgetProjectResources(f);
									}
								} else {
								    callback.receiveErrorgetProjectResources(error);
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
                                    callback.receiveErrorgetProjectResources(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[32].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[32].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Dieser Service ändert ein Risiko eines Projektes
                     * @see net.proventis.service.ProjectsService#changeRisk
                     * @param changeRiskRequestParameter156
                    
                     * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
                     * @throws net.proventis.service.InvalidSessionException : Session ungültig
                     * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
                     * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
                     * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
                     */

                    

                            public  void changeRisk(

                            net.proventis.axis.blueant.project.ChangeRiskRequestParameter changeRiskRequestParameter156)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,net.proventis.service.InvalidParameterException
                        ,net.proventis.service.InvalidSessionException
                        ,net.proventis.service.AssertionException
                        ,net.proventis.service.InvalidClientException
                        ,net.proventis.service.PermissionDeniedException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
              _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeRisk");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeRiskRequestParameter156,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeRisk")));
                                                
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
                * Dieser Service ändert ein Risiko eines Projektes
                * @see net.proventis.service.ProjectsService#startchangeRisk
                    * @param changeRiskRequestParameter156
                
                */
                public  void startchangeRisk(

                 net.proventis.axis.blueant.project.ChangeRiskRequestParameter changeRiskRequestParameter156,

                  final net.proventis.service.ProjectsServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
             _operationClient.getOptions().setAction("http://blueant.axis.proventis.net/changeRisk");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    changeRiskRequestParameter156,
                                                    optimizeContent(new javax.xml.namespace.QName("http://blueant.axis.proventis.net/",
                                                    "changeRisk")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[33].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[33].setMessageReceiver(
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
     //http://78.46.94.155:8081/hs/services/ProjectsService
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectParticipationList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectParticipationList.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddProjectRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddProjectRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.base.MandatoryID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.base.MandatoryID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectRolesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectRolesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectRoleList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectRoleList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddRiskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddRiskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddTaskResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddTaskResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectListRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectListRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.RequestParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.RequestParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.TaskResourceResultList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.TaskResourceResultList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.TaskResourceList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.TaskResourceList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddProjectResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddProjectResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeProjectRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectTasksRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectTasksRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectTaskList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectTaskList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetRisksRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetRisksRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.RiskList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.RiskList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ParticipationTaskList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ParticipationTaskList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.DeleteRiskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.DeleteRiskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ParticipationProjectList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ParticipationProjectList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddProjectTaskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddProjectTaskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.AddProjectTaskResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.AddProjectTaskResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ProjectResourceList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ProjectResourceList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(net.proventis.axis.blueant.project.ChangeRiskRequestParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(net.proventis.axis.blueant.project.ChangeRiskRequestParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddProjectRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddProjectRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectRolesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectRolesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddRiskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddRiskRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddTaskResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddTaskResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectListRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectListRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.RequestParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.RequestParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddProjectResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddProjectResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeProjectRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectTasksRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectTasksRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetRisksRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetRisksRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.DeleteRiskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.DeleteRiskRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.AddProjectTaskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.AddProjectTaskRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.proventis.axis.blueant.project.ChangeRiskRequestParameter param, boolean optimizeContent)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(net.proventis.axis.blueant.project.ChangeRiskRequestParameter.MY_QNAME,factory));
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
        
                if (net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectParticipationList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectParticipationList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectParticipationList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectParticipationList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddProjectRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddProjectRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.MandatoryID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.MandatoryID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetProjectRolesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectRolesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectRoleList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectRoleList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddRiskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddRiskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.MandatoryID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.MandatoryID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddTaskResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddTaskResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.MandatoryID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.MandatoryID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectParticipationList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectParticipationList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetProjectListRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectListRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.RequestParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.RequestParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectParticipationList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectParticipationList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.TaskResourceResultList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.TaskResourceResultList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.TaskResourceList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.TaskResourceList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddProjectResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddProjectResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.MandatoryID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.MandatoryID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ChangeProjectRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeProjectRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetProjectTasksRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectTasksRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectTaskList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectTaskList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetRisksRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetRisksRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.RiskList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.RiskList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ParticipationTaskList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ParticipationTaskList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.DeleteRiskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.DeleteRiskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ParticipationProjectList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ParticipationProjectList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.base.MandatoryID.class.equals(type)){
                
                           return net.proventis.axis.blueant.base.MandatoryID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.AddProjectTaskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddProjectTaskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.AddProjectTaskResponse.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.AddProjectTaskResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (net.proventis.axis.blueant.project.ProjectResourceList.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ProjectResourceList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
           
                if (net.proventis.axis.blueant.project.ChangeRiskRequestParameter.class.equals(type)){
                
                           return net.proventis.axis.blueant.project.ChangeRiskRequestParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
   