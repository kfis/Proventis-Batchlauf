

/**
 * ProjectsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /*
     *  ProjectsService java interface
     */

    public interface ProjectsService {
          

        /**
          * Auto generated method signature
          * Dieser Service bearbeitet eine vorhandene ProjektBeteiligung.
                    * @param changeProjectParticipationRequestParameter22
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectParticipationList changeProjectParticipation(

                        net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter changeProjectParticipationRequestParameter22)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service bearbeitet eine vorhandene ProjektBeteiligung.
                * @param changeProjectParticipationRequestParameter22
            
          */
        public void startchangeProjectParticipation(

            net.proventis.axis.blueant.project.ChangeProjectParticipationRequestParameter changeProjectParticipationRequestParameter22,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Projektbeteiligungen zu einem Projekt aus Blue Ant. Zu finden sind diese Werte in Blue Ant unter Projekt/Planung/Ressourcen.
                    * @param getProjectParticipationsRequestParameter24
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectParticipationList getProjectParticipations(

                        net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter getProjectParticipationsRequestParameter24)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Projektbeteiligungen zu einem Projekt aus Blue Ant. Zu finden sind diese Werte in Blue Ant unter Projekt/Planung/Ressourcen.
                * @param getProjectParticipationsRequestParameter24
            
          */
        public void startgetProjectParticipations(

            net.proventis.axis.blueant.project.GetProjectParticipationsRequestParameter getProjectParticipationsRequestParameter24,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service legt ein Projekt an
                    * @param addProjectRequestParameter26
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.base.MandatoryID addProject(

                        net.proventis.axis.blueant.project.AddProjectRequestParameter addProjectRequestParameter26)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service legt ein Projekt an
                * @param addProjectRequestParameter26
            
          */
        public void startaddProject(

            net.proventis.axis.blueant.project.AddProjectRequestParameter addProjectRequestParameter26,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht eine vorhandene ProjektRessource.
                    * @param deleteProjectResourceRequestParameter28
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteProjectResource(

                        net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter deleteProjectResourceRequestParameter28)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht eine vorhandene ProjektRessource.
                * @param deleteProjectResourceRequestParameter28
            
          */
        public void startdeleteProjectResource(

            net.proventis.axis.blueant.project.DeleteProjectResourceRequestParameter deleteProjectResourceRequestParameter28,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Mit diesem Service können angefragte Beteiligungen von Ressourcen freigegeben werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                    * @param releaseProjectParticipationRequestParameter30
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void releaseProjectParticipation(

                        net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter releaseProjectParticipationRequestParameter30)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Mit diesem Service können angefragte Beteiligungen von Ressourcen freigegeben werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                * @param releaseProjectParticipationRequestParameter30
            
          */
        public void startreleaseProjectParticipation(

            net.proventis.axis.blueant.project.ReleaseProjectParticipationRequestParameter releaseProjectParticipationRequestParameter30,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service weist einer virtuellen ProjektRessource eine reale Ressource zu.
                    * @param assignVirtualResourceRequestParameter32
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void assignVirtualResource(

                        net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter assignVirtualResourceRequestParameter32)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service weist einer virtuellen ProjektRessource eine reale Ressource zu.
                * @param assignVirtualResourceRequestParameter32
            
          */
        public void startassignVirtualResource(

            net.proventis.axis.blueant.project.AssignVirtualResourceRequestParameter assignVirtualResourceRequestParameter32,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller akt. Projektrollen und deren Kostensätze zu einem Projekt. Zu finden sind diese Werte in Blue Ant unter Projekte/Vorgabe/Rollen .
                    * @param getProjectRolesRequestParameter34
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectRoleList getProjectRoles(

                        net.proventis.axis.blueant.project.GetProjectRolesRequestParameter getProjectRolesRequestParameter34)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller akt. Projektrollen und deren Kostensätze zu einem Projekt. Zu finden sind diese Werte in Blue Ant unter Projekte/Vorgabe/Rollen .
                * @param getProjectRolesRequestParameter34
            
          */
        public void startgetProjectRoles(

            net.proventis.axis.blueant.project.GetProjectRolesRequestParameter getProjectRolesRequestParameter34,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service fügt einem Projekte ein Risiko hinzu
                    * @param addRiskRequestParameter36
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.base.MandatoryID addRisk(

                        net.proventis.axis.blueant.project.AddRiskRequestParameter addRiskRequestParameter36)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service fügt einem Projekte ein Risiko hinzu
                * @param addRiskRequestParameter36
            
          */
        public void startaddRisk(

            net.proventis.axis.blueant.project.AddRiskRequestParameter addRiskRequestParameter36,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Mit diesem Service können angefragte Beteiligungen von Ressourcen abgelehnt werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                    * @param refuseProjectParticipationRequestParameter38
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void refuseProjectParticipation(

                        net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter refuseProjectParticipationRequestParameter38)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Mit diesem Service können angefragte Beteiligungen von Ressourcen abgelehnt werden. Zu finden sind in Blue Ant diese Werte unter Ressourcenfreigabe
                * @param refuseProjectParticipationRequestParameter38
            
          */
        public void startrefuseProjectParticipation(

            net.proventis.axis.blueant.project.RefuseProjectParticipationRequestParameter refuseProjectParticipationRequestParameter38,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht eine vorhandene ProjektBeteiligung.
                    * @param deleteProjectParticipationRequestParameter40
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteProjectParticipation(

                        net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter deleteProjectParticipationRequestParameter40)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht eine vorhandene ProjektBeteiligung.
                * @param deleteProjectParticipationRequestParameter40
            
          */
        public void startdeleteProjectParticipation(

            net.proventis.axis.blueant.project.DeleteProjectParticipationRequestParameter deleteProjectParticipationRequestParameter40,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service legt eine Aktivitätenbeteiligung an
                    * @param addTaskResourceRequestParameter42
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.base.MandatoryID addTaskResource(

                        net.proventis.axis.blueant.project.AddTaskResourceRequestParameter addTaskResourceRequestParameter42)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service legt eine Aktivitätenbeteiligung an
                * @param addTaskResourceRequestParameter42
            
          */
        public void startaddTaskResource(

            net.proventis.axis.blueant.project.AddTaskResourceRequestParameter addTaskResourceRequestParameter42,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste Projektbeteiligungen die vom Anfragenden freigegeben werden können.
                    * @param getReleasableProjectParticipationsRequestParameter44
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectParticipationList getReleasableProjectParticipations(

                        net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter getReleasableProjectParticipationsRequestParameter44)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste Projektbeteiligungen die vom Anfragenden freigegeben werden können.
                * @param getReleasableProjectParticipationsRequestParameter44
            
          */
        public void startgetReleasableProjectParticipations(

            net.proventis.axis.blueant.project.GetReleasableProjectParticipationsRequestParameter getReleasableProjectParticipationsRequestParameter44,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert aus Blue Ant eine Liste aller Projekte die nicht archiviert oder gelöscht sind. Projektvorlagen werden nicht mit zurückgegeben.
                    * @param getProjectListRequestParameter46
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter: - Nachticht zu lang
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectList getProjectList(

                        net.proventis.axis.blueant.project.GetProjectListRequestParameter getProjectListRequestParameter46)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert aus Blue Ant eine Liste aller Projekte die nicht archiviert oder gelöscht sind. Projektvorlagen werden nicht mit zurückgegeben.
                * @param getProjectListRequestParameter46
            
          */
        public void startgetProjectList(

            net.proventis.axis.blueant.project.GetProjectListRequestParameter getProjectListRequestParameter46,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht eine Aktivitätenbeteiligung
                    * @param deleteTaskResourceRequestParameter48
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteTaskResource(

                        net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter deleteTaskResourceRequestParameter48)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht eine Aktivitätenbeteiligung
                * @param deleteTaskResourceRequestParameter48
            
          */
        public void startdeleteTaskResource(

            net.proventis.axis.blueant.project.DeleteTaskResourceRequestParameter deleteTaskResourceRequestParameter48,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Beantragen einer Projektmitgliedschaft. Grundlage bilden getParticipationProject/getParticipationTasks. Aus Blue Ant wird eine Mail an den Projektleiter gesandt.
                    * @param requestParticipationRequestParameter50
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter: - Nachticht zu lang
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void requestParticipation(

                        net.proventis.axis.blueant.project.RequestParticipationRequestParameter requestParticipationRequestParameter50)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Beantragen einer Projektmitgliedschaft. Grundlage bilden getParticipationProject/getParticipationTasks. Aus Blue Ant wird eine Mail an den Projektleiter gesandt.
                * @param requestParticipationRequestParameter50
            
          */
        public void startrequestParticipation(

            net.proventis.axis.blueant.project.RequestParticipationRequestParameter requestParticipationRequestParameter50,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service beantragt eine neue ProjektBeteiligung.
                    * @param addProjectParticipationRequestParameter52
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectParticipationList addProjectParticipation(

                        net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter addProjectParticipationRequestParameter52)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service beantragt eine neue ProjektBeteiligung.
                * @param addProjectParticipationRequestParameter52
            
          */
        public void startaddProjectParticipation(

            net.proventis.axis.blueant.project.AddProjectParticipationRequestParameter addProjectParticipationRequestParameter52,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service verknüpft eine Aktivität mit einer Vorgänger-Aktivität
                    * @param addTaskPredecessorRequestParameter54
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void addTaskPredecessor(

                        net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter addTaskPredecessorRequestParameter54)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service verknüpft eine Aktivität mit einer Vorgänger-Aktivität
                * @param addTaskPredecessorRequestParameter54
            
          */
        public void startaddTaskPredecessor(

            net.proventis.axis.blueant.project.AddTaskPredecessorRequestParameter addTaskPredecessorRequestParameter54,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service legt mehrere Aktivitätenbeteiligungen an
                    * @param addMultiTaskResourceRequestParameter56
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.TaskResourceResultList addMultiTaskResource(

                        net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter addMultiTaskResourceRequestParameter56)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service legt mehrere Aktivitätenbeteiligungen an
                * @param addMultiTaskResourceRequestParameter56
            
          */
        public void startaddMultiTaskResource(

            net.proventis.axis.blueant.project.AddMultiTaskResourceRequestParameter addMultiTaskResourceRequestParameter56,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste von Aktivitätenbeteiligungen
                    * @param getTaskResourcesRequestParameter58
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.TaskResourceList getTaskResources(

                        net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter getTaskResourcesRequestParameter58)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste von Aktivitätenbeteiligungen
                * @param getTaskResourcesRequestParameter58
            
          */
        public void startgetTaskResources(

            net.proventis.axis.blueant.project.GetTaskResourcesRequestParameter getTaskResourcesRequestParameter58,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service ändert eine Aktivität
                    * @param changeProjectTaskRequestParameter60
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void changeProjectTask(

                        net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter changeProjectTaskRequestParameter60)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service ändert eine Aktivität
                * @param changeProjectTaskRequestParameter60
            
          */
        public void startchangeProjectTask(

            net.proventis.axis.blueant.project.ChangeProjectTaskRequestParameter changeProjectTaskRequestParameter60,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service legt eine neue ProjektRessource an.
                    * @param addProjectResourceRequestParameter62
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.base.MandatoryID addProjectResource(

                        net.proventis.axis.blueant.project.AddProjectResourceRequestParameter addProjectResourceRequestParameter62)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service legt eine neue ProjektRessource an.
                * @param addProjectResourceRequestParameter62
            
          */
        public void startaddProjectResource(

            net.proventis.axis.blueant.project.AddProjectResourceRequestParameter addProjectResourceRequestParameter62,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service ändert die Basisdaten eines Projektes
                    * @param changeProjectRequestParameter64
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void changeProject(

                        net.proventis.axis.blueant.project.ChangeProjectRequestParameter changeProjectRequestParameter64)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service ändert die Basisdaten eines Projektes
                * @param changeProjectRequestParameter64
            
          */
        public void startchangeProject(

            net.proventis.axis.blueant.project.ChangeProjectRequestParameter changeProjectRequestParameter64,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht die Verknüpfung zwischen einer Aktivität und einer Vorgänger-Aktivität
                    * @param deleteTaskPredecessorRequestParameter66
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteTaskPredecessor(

                        net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter deleteTaskPredecessorRequestParameter66)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht die Verknüpfung zwischen einer Aktivität und einer Vorgänger-Aktivität
                * @param deleteTaskPredecessorRequestParameter66
            
          */
        public void startdeleteTaskPredecessor(

            net.proventis.axis.blueant.project.DeleteTaskPredecessorRequestParameter deleteTaskPredecessorRequestParameter66,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Projektaktivitäten zu einem Projekt.
                    * @param getProjectTasksRequestParameter68
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectTaskList getProjectTasks(

                        net.proventis.axis.blueant.project.GetProjectTasksRequestParameter getProjectTasksRequestParameter68)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Projektaktivitäten zu einem Projekt.
                * @param getProjectTasksRequestParameter68
            
          */
        public void startgetProjectTasks(

            net.proventis.axis.blueant.project.GetProjectTasksRequestParameter getProjectTasksRequestParameter68,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die Risiken eines Projektes
                    * @param getRisksRequestParameter70
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.RiskList getRisks(

                        net.proventis.axis.blueant.project.GetRisksRequestParameter getRisksRequestParameter70)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die Risiken eines Projektes
                * @param getRisksRequestParameter70
            
          */
        public void startgetRisks(

            net.proventis.axis.blueant.project.GetRisksRequestParameter getRisksRequestParameter70,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht eine Aktivität
                    * @param deleteProjectTaskRequestParameter72
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteProjectTask(

                        net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter deleteProjectTaskRequestParameter72)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht eine Aktivität
                * @param deleteProjectTaskRequestParameter72
            
          */
        public void startdeleteProjectTask(

            net.proventis.axis.blueant.project.DeleteProjectTaskRequestParameter deleteProjectTaskRequestParameter72,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Auflistung aller Aktivitäten aus den aktiven Projekten in denen
a) der Mitarbeiter noch kein Mitglied ist und die Aktivitäten nicht zu 100% fertig sind (subj)
b) der Mitarbeiter Mitglied ist, aber den Aktivitäten nicht zugewiesen ist und die Aktivitäten noch nicht zu 100% fertig sind (subj).
                    * @param getParticipationTasksRequestParameter74
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ParticipationTaskList getParticipationTasks(

                        net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter getParticipationTasksRequestParameter74)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Auflistung aller Aktivitäten aus den aktiven Projekten in denen
a) der Mitarbeiter noch kein Mitglied ist und die Aktivitäten nicht zu 100% fertig sind (subj)
b) der Mitarbeiter Mitglied ist, aber den Aktivitäten nicht zugewiesen ist und die Aktivitäten noch nicht zu 100% fertig sind (subj).
                * @param getParticipationTasksRequestParameter74
            
          */
        public void startgetParticipationTasks(

            net.proventis.axis.blueant.project.GetParticipationTasksRequestParameter getParticipationTasksRequestParameter74,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service löscht ein Risiko aus einem Projekt
                    * @param deleteRiskRequestParameter76
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void deleteRisk(

                        net.proventis.axis.blueant.project.DeleteRiskRequestParameter deleteRiskRequestParameter76)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service löscht ein Risiko aus einem Projekt
                * @param deleteRiskRequestParameter76
            
          */
        public void startdeleteRisk(

            net.proventis.axis.blueant.project.DeleteRiskRequestParameter deleteRiskRequestParameter76,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service ändert eine Aktivitätenbeteiligung
                    * @param changeTaskResourceRequestParameter78
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void changeTaskResource(

                        net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter changeTaskResourceRequestParameter78)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service ändert eine Aktivitätenbeteiligung
                * @param changeTaskResourceRequestParameter78
            
          */
        public void startchangeTaskResource(

            net.proventis.axis.blueant.project.ChangeTaskResourceRequestParameter changeTaskResourceRequestParameter78,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Auflistung aller aktiven Projekte egal ob der der Mitarbeiter bereits Mitglied ist oder noch nicht.
                    * @param getParticipationProjectsRequestParameter80
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ParticipationProjectList getParticipationProjects(

                        net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter getParticipationProjectsRequestParameter80)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Auflistung aller aktiven Projekte egal ob der der Mitarbeiter bereits Mitglied ist oder noch nicht.
                * @param getParticipationProjectsRequestParameter80
            
          */
        public void startgetParticipationProjects(

            net.proventis.axis.blueant.project.GetParticipationProjectsRequestParameter getParticipationProjectsRequestParameter80,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service bearbeitet eine vorhandene ProjektRessource.
                    * @param changeProjectResourceRequestParameter82
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.base.MandatoryID changeProjectResource(

                        net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter changeProjectResourceRequestParameter82)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service bearbeitet eine vorhandene ProjektRessource.
                * @param changeProjectResourceRequestParameter82
            
          */
        public void startchangeProjectResource(

            net.proventis.axis.blueant.project.ChangeProjectResourceRequestParameter changeProjectResourceRequestParameter82,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service fügt eine Aktivität zu einem Projekt hinzu
                    * @param addProjectTaskRequestParameter84
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.AddProjectTaskResponse addProjectTask(

                        net.proventis.axis.blueant.project.AddProjectTaskRequestParameter addProjectTaskRequestParameter84)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service fügt eine Aktivität zu einem Projekt hinzu
                * @param addProjectTaskRequestParameter84
            
          */
        public void startaddProjectTask(

            net.proventis.axis.blueant.project.AddProjectTaskRequestParameter addProjectTaskRequestParameter84,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Ressourcen, die einem Projekt zugeordnet sind und dem definierten RessourcenTyp entsprechen.. Zu finden sind diese Werte in Blue Ant unter Projekte/Planung/Ressourcen. Nur Ressourcen, deren Beteiligung freigegeben ist, können für die Aktivitätenplanung eingesetzt werden.
                    * @param getProjectResourcesRequestParameter86
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectResourceList getProjectResources(

                        net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter getProjectResourcesRequestParameter86)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Ressourcen, die einem Projekt zugeordnet sind und dem definierten RessourcenTyp entsprechen.. Zu finden sind diese Werte in Blue Ant unter Projekte/Planung/Ressourcen. Nur Ressourcen, deren Beteiligung freigegeben ist, können für die Aktivitätenplanung eingesetzt werden.
                * @param getProjectResourcesRequestParameter86
            
          */
        public void startgetProjectResources(

            net.proventis.axis.blueant.project.GetProjectResourcesRequestParameter getProjectResourcesRequestParameter86,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service ändert ein Risiko eines Projektes
                    * @param changeRiskRequestParameter88
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public void changeRisk(

                        net.proventis.axis.blueant.project.ChangeRiskRequestParameter changeRiskRequestParameter88)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service ändert ein Risiko eines Projektes
                * @param changeRiskRequestParameter88
            
          */
        public void startchangeRisk(

            net.proventis.axis.blueant.project.ChangeRiskRequestParameter changeRiskRequestParameter88,

            final net.proventis.service.ProjectsServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    