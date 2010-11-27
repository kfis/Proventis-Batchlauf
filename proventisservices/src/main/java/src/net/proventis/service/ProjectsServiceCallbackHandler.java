
/**
 * ProjectsServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /**
     *  ProjectsServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ProjectsServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ProjectsServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ProjectsServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for changeProjectParticipation method
            * override this method for handling normal response from changeProjectParticipation operation
            */
           public void receiveResultchangeProjectParticipation(
                    net.proventis.axis.blueant.project.ProjectParticipationList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeProjectParticipation operation
           */
            public void receiveErrorchangeProjectParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectParticipations method
            * override this method for handling normal response from getProjectParticipations operation
            */
           public void receiveResultgetProjectParticipations(
                    net.proventis.axis.blueant.project.ProjectParticipationList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectParticipations operation
           */
            public void receiveErrorgetProjectParticipations(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addProject method
            * override this method for handling normal response from addProject operation
            */
           public void receiveResultaddProject(
                    net.proventis.axis.blueant.base.MandatoryID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addProject operation
           */
            public void receiveErroraddProject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteProjectResource method
            * override this method for handling normal response from deleteProjectResource operation
            */
           public void receiveResultdeleteProjectResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteProjectResource operation
           */
            public void receiveErrordeleteProjectResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for releaseProjectParticipation method
            * override this method for handling normal response from releaseProjectParticipation operation
            */
           public void receiveResultreleaseProjectParticipation(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from releaseProjectParticipation operation
           */
            public void receiveErrorreleaseProjectParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for assignVirtualResource method
            * override this method for handling normal response from assignVirtualResource operation
            */
           public void receiveResultassignVirtualResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from assignVirtualResource operation
           */
            public void receiveErrorassignVirtualResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectRoles method
            * override this method for handling normal response from getProjectRoles operation
            */
           public void receiveResultgetProjectRoles(
                    net.proventis.axis.blueant.project.ProjectRoleList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectRoles operation
           */
            public void receiveErrorgetProjectRoles(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addRisk method
            * override this method for handling normal response from addRisk operation
            */
           public void receiveResultaddRisk(
                    net.proventis.axis.blueant.base.MandatoryID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addRisk operation
           */
            public void receiveErroraddRisk(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for refuseProjectParticipation method
            * override this method for handling normal response from refuseProjectParticipation operation
            */
           public void receiveResultrefuseProjectParticipation(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from refuseProjectParticipation operation
           */
            public void receiveErrorrefuseProjectParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteProjectParticipation method
            * override this method for handling normal response from deleteProjectParticipation operation
            */
           public void receiveResultdeleteProjectParticipation(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteProjectParticipation operation
           */
            public void receiveErrordeleteProjectParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addTaskResource method
            * override this method for handling normal response from addTaskResource operation
            */
           public void receiveResultaddTaskResource(
                    net.proventis.axis.blueant.base.MandatoryID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addTaskResource operation
           */
            public void receiveErroraddTaskResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getReleasableProjectParticipations method
            * override this method for handling normal response from getReleasableProjectParticipations operation
            */
           public void receiveResultgetReleasableProjectParticipations(
                    net.proventis.axis.blueant.project.ProjectParticipationList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getReleasableProjectParticipations operation
           */
            public void receiveErrorgetReleasableProjectParticipations(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectList method
            * override this method for handling normal response from getProjectList operation
            */
           public void receiveResultgetProjectList(
                    net.proventis.axis.blueant.project.ProjectList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectList operation
           */
            public void receiveErrorgetProjectList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteTaskResource method
            * override this method for handling normal response from deleteTaskResource operation
            */
           public void receiveResultdeleteTaskResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteTaskResource operation
           */
            public void receiveErrordeleteTaskResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for requestParticipation method
            * override this method for handling normal response from requestParticipation operation
            */
           public void receiveResultrequestParticipation(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from requestParticipation operation
           */
            public void receiveErrorrequestParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addProjectParticipation method
            * override this method for handling normal response from addProjectParticipation operation
            */
           public void receiveResultaddProjectParticipation(
                    net.proventis.axis.blueant.project.ProjectParticipationList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addProjectParticipation operation
           */
            public void receiveErroraddProjectParticipation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addTaskPredecessor method
            * override this method for handling normal response from addTaskPredecessor operation
            */
           public void receiveResultaddTaskPredecessor(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addTaskPredecessor operation
           */
            public void receiveErroraddTaskPredecessor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addMultiTaskResource method
            * override this method for handling normal response from addMultiTaskResource operation
            */
           public void receiveResultaddMultiTaskResource(
                    net.proventis.axis.blueant.project.TaskResourceResultList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addMultiTaskResource operation
           */
            public void receiveErroraddMultiTaskResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTaskResources method
            * override this method for handling normal response from getTaskResources operation
            */
           public void receiveResultgetTaskResources(
                    net.proventis.axis.blueant.project.TaskResourceList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTaskResources operation
           */
            public void receiveErrorgetTaskResources(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeProjectTask method
            * override this method for handling normal response from changeProjectTask operation
            */
           public void receiveResultchangeProjectTask(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeProjectTask operation
           */
            public void receiveErrorchangeProjectTask(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addProjectResource method
            * override this method for handling normal response from addProjectResource operation
            */
           public void receiveResultaddProjectResource(
                    net.proventis.axis.blueant.base.MandatoryID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addProjectResource operation
           */
            public void receiveErroraddProjectResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeProject method
            * override this method for handling normal response from changeProject operation
            */
           public void receiveResultchangeProject(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeProject operation
           */
            public void receiveErrorchangeProject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteTaskPredecessor method
            * override this method for handling normal response from deleteTaskPredecessor operation
            */
           public void receiveResultdeleteTaskPredecessor(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteTaskPredecessor operation
           */
            public void receiveErrordeleteTaskPredecessor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectTasks method
            * override this method for handling normal response from getProjectTasks operation
            */
           public void receiveResultgetProjectTasks(
                    net.proventis.axis.blueant.project.ProjectTaskList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectTasks operation
           */
            public void receiveErrorgetProjectTasks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRisks method
            * override this method for handling normal response from getRisks operation
            */
           public void receiveResultgetRisks(
                    net.proventis.axis.blueant.project.RiskList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRisks operation
           */
            public void receiveErrorgetRisks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteProjectTask method
            * override this method for handling normal response from deleteProjectTask operation
            */
           public void receiveResultdeleteProjectTask(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteProjectTask operation
           */
            public void receiveErrordeleteProjectTask(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getParticipationTasks method
            * override this method for handling normal response from getParticipationTasks operation
            */
           public void receiveResultgetParticipationTasks(
                    net.proventis.axis.blueant.project.ParticipationTaskList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getParticipationTasks operation
           */
            public void receiveErrorgetParticipationTasks(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteRisk method
            * override this method for handling normal response from deleteRisk operation
            */
           public void receiveResultdeleteRisk(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteRisk operation
           */
            public void receiveErrordeleteRisk(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeTaskResource method
            * override this method for handling normal response from changeTaskResource operation
            */
           public void receiveResultchangeTaskResource(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeTaskResource operation
           */
            public void receiveErrorchangeTaskResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getParticipationProjects method
            * override this method for handling normal response from getParticipationProjects operation
            */
           public void receiveResultgetParticipationProjects(
                    net.proventis.axis.blueant.project.ParticipationProjectList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getParticipationProjects operation
           */
            public void receiveErrorgetParticipationProjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeProjectResource method
            * override this method for handling normal response from changeProjectResource operation
            */
           public void receiveResultchangeProjectResource(
                    net.proventis.axis.blueant.base.MandatoryID result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeProjectResource operation
           */
            public void receiveErrorchangeProjectResource(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addProjectTask method
            * override this method for handling normal response from addProjectTask operation
            */
           public void receiveResultaddProjectTask(
                    net.proventis.axis.blueant.project.AddProjectTaskResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addProjectTask operation
           */
            public void receiveErroraddProjectTask(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectResources method
            * override this method for handling normal response from getProjectResources operation
            */
           public void receiveResultgetProjectResources(
                    net.proventis.axis.blueant.project.ProjectResourceList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectResources operation
           */
            public void receiveErrorgetProjectResources(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeRisk method
            * override this method for handling normal response from changeRisk operation
            */
           public void receiveResultchangeRisk(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeRisk operation
           */
            public void receiveErrorchangeRisk(java.lang.Exception e) {
            }
                


    }
    