
/**
 * MasterDataServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /**
     *  MasterDataServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MasterDataServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MasterDataServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MasterDataServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getRiskProbability method
            * override this method for handling normal response from getRiskProbability operation
            */
           public void receiveResultgetRiskProbability(
                    net.proventis.axis.blueant.masterdata.RiskProbabilityList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRiskProbability operation
           */
            public void receiveErrorgetRiskProbability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIndirectCostCentres method
            * override this method for handling normal response from getIndirectCostCentres operation
            */
           public void receiveResultgetIndirectCostCentres(
                    net.proventis.axis.blueant.masterdata.IndirectCostCentreList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIndirectCostCentres operation
           */
            public void receiveErrorgetIndirectCostCentres(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectPermissions method
            * override this method for handling normal response from getProjectPermissions operation
            */
           public void receiveResultgetProjectPermissions(
                    net.proventis.axis.blueant.project.ProjectPermissionList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectPermissions operation
           */
            public void receiveErrorgetProjectPermissions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTicketPriority method
            * override this method for handling normal response from getTicketPriority operation
            */
           public void receiveResultgetTicketPriority(
                    net.proventis.axis.blueant.masterdata.TicketPriorityList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTicketPriority operation
           */
            public void receiveErrorgetTicketPriority(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectStates method
            * override this method for handling normal response from getProjectStates operation
            */
           public void receiveResultgetProjectStates(
                    net.proventis.axis.blueant.masterdata.ProjectStateList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectStates operation
           */
            public void receiveErrorgetProjectStates(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDepartments method
            * override this method for handling normal response from getDepartments operation
            */
           public void receiveResultgetDepartments(
                    net.proventis.axis.blueant.masterdata.DepartmentList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDepartments operation
           */
            public void receiveErrorgetDepartments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInternalDepartments method
            * override this method for handling normal response from getInternalDepartments operation
            */
           public void receiveResultgetInternalDepartments(
                    net.proventis.axis.blueant.masterdata.InternalDepartment result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInternalDepartments operation
           */
            public void receiveErrorgetInternalDepartments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTicketType method
            * override this method for handling normal response from getTicketType operation
            */
           public void receiveResultgetTicketType(
                    net.proventis.axis.blueant.masterdata.TicketTypeList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTicketType operation
           */
            public void receiveErrorgetTicketType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWtCalendars method
            * override this method for handling normal response from getWtCalendars operation
            */
           public void receiveResultgetWtCalendars(
                    net.proventis.axis.blueant.project.WtCalendarList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWtCalendars operation
           */
            public void receiveErrorgetWtCalendars(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCurrencies method
            * override this method for handling normal response from getCurrencies operation
            */
           public void receiveResultgetCurrencies(
                    net.proventis.axis.blueant.masterdata.CurrencyList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCurrencies operation
           */
            public void receiveErrorgetCurrencies(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProgressList method
            * override this method for handling normal response from getProgressList operation
            */
           public void receiveResultgetProgressList(
                    net.proventis.axis.blueant.masterdata.ProgressList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProgressList operation
           */
            public void receiveErrorgetProgressList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectPriorities method
            * override this method for handling normal response from getProjectPriorities operation
            */
           public void receiveResultgetProjectPriorities(
                    net.proventis.axis.blueant.masterdata.ProjectPriorityList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectPriorities operation
           */
            public void receiveErrorgetProjectPriorities(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectTypes method
            * override this method for handling normal response from getProjectTypes operation
            */
           public void receiveResultgetProjectTypes(
                    net.proventis.axis.blueant.masterdata.ProjectTypeList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectTypes operation
           */
            public void receiveErrorgetProjectTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTicketSLA method
            * override this method for handling normal response from getTicketSLA operation
            */
           public void receiveResultgetTicketSLA(
                    net.proventis.axis.blueant.masterdata.TicketSLAList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTicketSLA operation
           */
            public void receiveErrorgetTicketSLA(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActivities method
            * override this method for handling normal response from getActivities operation
            */
           public void receiveResultgetActivities(
                    net.proventis.axis.blueant.masterdata.ActivityList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActivities operation
           */
            public void receiveErrorgetActivities(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTicketTopic method
            * override this method for handling normal response from getTicketTopic operation
            */
           public void receiveResultgetTicketTopic(
                    net.proventis.axis.blueant.masterdata.TicketTopicList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTicketTopic operation
           */
            public void receiveErrorgetTicketTopic(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDefaultRoles method
            * override this method for handling normal response from getDefaultRoles operation
            */
           public void receiveResultgetDefaultRoles(
                    net.proventis.axis.blueant.masterdata.DefaultRoleList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDefaultRoles operation
           */
            public void receiveErrorgetDefaultRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTicketState method
            * override this method for handling normal response from getTicketState operation
            */
           public void receiveResultgetTicketState(
                    net.proventis.axis.blueant.masterdata.TicketStateList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTicketState operation
           */
            public void receiveErrorgetTicketState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRiskState method
            * override this method for handling normal response from getRiskState operation
            */
           public void receiveResultgetRiskState(
                    net.proventis.axis.blueant.masterdata.RiskStateList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRiskState operation
           */
            public void receiveErrorgetRiskState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRiskEffect method
            * override this method for handling normal response from getRiskEffect operation
            */
           public void receiveResultgetRiskEffect(
                    net.proventis.axis.blueant.masterdata.RiskEffectList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRiskEffect operation
           */
            public void receiveErrorgetRiskEffect(java.lang.Exception e) {
            }
                


    }
    