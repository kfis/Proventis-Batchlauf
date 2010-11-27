

/**
 * MasterDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /*
     *  MasterDataService java interface
     */

    public interface MasterDataService {
          

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Risikowahrscheinlichkeiten.
                    * @param getRiskProbabilityRequestParameter0
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.RiskProbabilityList getRiskProbability(

                        net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter getRiskProbabilityRequestParameter0)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Risikowahrscheinlichkeiten.
                * @param getRiskProbabilityRequestParameter0
            
          */
        public void startgetRiskProbability(

            net.proventis.axis.blueant.masterdata.GetRiskProbabilityRequestParameter getRiskProbabilityRequestParameter0,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Hilfskostenstellen.
                    * @param getIndirectCostCentresRequestParameter2
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.IndirectCostCentreList getIndirectCostCentres(

                        net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter getIndirectCostCentresRequestParameter2)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Hilfskostenstellen.
                * @param getIndirectCostCentresRequestParameter2
            
          */
        public void startgetIndirectCostCentres(

            net.proventis.axis.blueant.masterdata.GetIndirectCostCentresRequestParameter getIndirectCostCentresRequestParameter2,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller akt. Projektrechte. Zu finden sind diese Werte in Blue Ant unter Administration/Rechteverwaltung/Projekt/Gruppen .
                    * @param getProjectPermissionsRequestParameter4
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.ProjectPermissionList getProjectPermissions(

                        net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter getProjectPermissionsRequestParameter4)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller akt. Projektrechte. Zu finden sind diese Werte in Blue Ant unter Administration/Rechteverwaltung/Projekt/Gruppen .
                * @param getProjectPermissionsRequestParameter4
            
          */
        public void startgetProjectPermissions(

            net.proventis.axis.blueant.project.GetProjectPermissionsRequestParameter getProjectPermissionsRequestParameter4,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Ticketprioritäten.
                    * @param getTicketPriorityRequestParameter6
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.TicketPriorityList getTicketPriority(

                        net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter getTicketPriorityRequestParameter6)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Ticketprioritäten.
                * @param getTicketPriorityRequestParameter6
            
          */
        public void startgetTicketPriority(

            net.proventis.axis.blueant.masterdata.GetTicketPriorityRequestParameter getTicketPriorityRequestParameter6,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die in Blue Ant erfassten Projektstatus aus den Stammdaten.
                    * @param getProjectStatesRequestParameter8
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.ProjectStateList getProjectStates(

                        net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter getProjectStatesRequestParameter8)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die in Blue Ant erfassten Projektstatus aus den Stammdaten.
                * @param getProjectStatesRequestParameter8
            
          */
        public void startgetProjectStates(

            net.proventis.axis.blueant.masterdata.GetProjectStatesRequestParameter getProjectStatesRequestParameter8,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste von Unternehmensbereichen (intern und extern)
                    * @param getDepartmentsRequestParameter10
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.DepartmentList getDepartments(

                        net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter getDepartmentsRequestParameter10)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste von Unternehmensbereichen (intern und extern)
                * @param getDepartmentsRequestParameter10
            
          */
        public void startgetDepartments(

            net.proventis.axis.blueant.masterdata.GetDepartmentsRequestParameter getDepartmentsRequestParameter10,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste von internen Unternehmensbereichen
                    * @param getInternalDepartmentsRequestParameter12
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.InternalDepartment getInternalDepartments(

                        net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter getInternalDepartmentsRequestParameter12)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste von internen Unternehmensbereichen
                * @param getInternalDepartmentsRequestParameter12
            
          */
        public void startgetInternalDepartments(

            net.proventis.axis.blueant.masterdata.GetInternalDepartmentsRequestParameter getInternalDepartmentsRequestParameter12,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Tickettypen.
                    * @param getTicketTypeRequestParameter14
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.TicketTypeList getTicketType(

                        net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter getTicketTypeRequestParameter14)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Tickettypen.
                * @param getTicketTypeRequestParameter14
            
          */
        public void startgetTicketType(

            net.proventis.axis.blueant.masterdata.GetTicketTypeRequestParameter getTicketTypeRequestParameter14,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller aktiven Arbeitszeit-Kalender.
                    * @param getWtCalendarsRequestParameter16
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.project.WtCalendarList getWtCalendars(

                        net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter getWtCalendarsRequestParameter16)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller aktiven Arbeitszeit-Kalender.
                * @param getWtCalendarsRequestParameter16
            
          */
        public void startgetWtCalendars(

            net.proventis.axis.blueant.project.GetWtCalendarsRequestParameter getWtCalendarsRequestParameter16,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die in Blue Ant erfassten Währungen aus den Stammdaten.
                    * @param getCurrenciesRequestParameter18
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.CurrencyList getCurrencies(

                        net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter getCurrenciesRequestParameter18)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die in Blue Ant erfassten Währungen aus den Stammdaten.
                * @param getCurrenciesRequestParameter18
            
          */
        public void startgetCurrencies(

            net.proventis.axis.blueant.masterdata.GetCurrenciesRequestParameter getCurrenciesRequestParameter18,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert alle in den Stammdaten erfassten Fertigstellungsgrade (subj. Fortschritte).
                    * @param getProgressListRequestParameter20
                
             * @throws net.proventis.service.InvalidSessionException : Session ungueltig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.ProgressList getProgressList(

                        net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter getProgressListRequestParameter20)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert alle in den Stammdaten erfassten Fertigstellungsgrade (subj. Fortschritte).
                * @param getProgressListRequestParameter20
            
          */
        public void startgetProgressList(

            net.proventis.axis.blueant.masterdata.GetProgressListRequestParameter getProgressListRequestParameter20,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die in Blue Ant erfassten Projektprioritäten aus den Stammdaten.
                    * @param getProjectPrioritiesRequestParameter22
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.ProjectPriorityList getProjectPriorities(

                        net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter getProjectPrioritiesRequestParameter22)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die in Blue Ant erfassten Projektprioritäten aus den Stammdaten.
                * @param getProjectPrioritiesRequestParameter22
            
          */
        public void startgetProjectPriorities(

            net.proventis.axis.blueant.masterdata.GetProjectPrioritiesRequestParameter getProjectPrioritiesRequestParameter22,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die in Blue Ant erfassten Projektarten aus den Stammdaten, die NICHT die Kennung Wartung oder Aufträge haben.
                    * @param getProjectTypesRequestParameter24
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.ProjectTypeList getProjectTypes(

                        net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter getProjectTypesRequestParameter24)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die in Blue Ant erfassten Projektarten aus den Stammdaten, die NICHT die Kennung Wartung oder Aufträge haben.
                * @param getProjectTypesRequestParameter24
            
          */
        public void startgetProjectTypes(

            net.proventis.axis.blueant.masterdata.GetProjectTypesRequestParameter getProjectTypesRequestParameter24,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Ticket-Service-Level-Agreements (SLAs).
                    * @param getTicketSLARequestParameter26
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.TicketSLAList getTicketSLA(

                        net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter getTicketSLARequestParameter26)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Ticket-Service-Level-Agreements (SLAs).
                * @param getTicketSLARequestParameter26
            
          */
        public void startgetTicketSLA(

            net.proventis.axis.blueant.masterdata.GetTicketSLARequestParameter getTicketSLARequestParameter26,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert alle in den Stammdaten erfassten Tätigkeiten für die AZ-Erfasssung.
			Tätigkeiten mit der Kennung &quot;Leereintrag&quot; in den Stammdaten werden nicht übertragen.
                    * @param getActivitiesRequestParameter28
                
             * @throws net.proventis.service.InvalidSessionException : Session ungueltig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.ActivityList getActivities(

                        net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter getActivitiesRequestParameter28)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert alle in den Stammdaten erfassten Tätigkeiten für die AZ-Erfasssung.
			Tätigkeiten mit der Kennung &quot;Leereintrag&quot; in den Stammdaten werden nicht übertragen.
                * @param getActivitiesRequestParameter28
            
          */
        public void startgetActivities(

            net.proventis.axis.blueant.masterdata.GetActivitiesRequestParameter getActivitiesRequestParameter28,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Ticketthemen.
                    * @param getTicketTopicRequestParameter30
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.TicketTopicList getTicketTopic(

                        net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter getTicketTopicRequestParameter30)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Ticketthemen.
                * @param getTicketTopicRequestParameter30
            
          */
        public void startgetTicketTopic(

            net.proventis.axis.blueant.masterdata.GetTicketTopicRequestParameter getTicketTopicRequestParameter30,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert die in Blue Ant erfassten Projektrollen aus den Stammdaten.
                    * @param getDefaultRolesRequestParameter32
                
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.DefaultRoleList getDefaultRoles(

                        net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter getDefaultRolesRequestParameter32)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert die in Blue Ant erfassten Projektrollen aus den Stammdaten.
                * @param getDefaultRolesRequestParameter32
            
          */
        public void startgetDefaultRoles(

            net.proventis.axis.blueant.masterdata.GetDefaultRolesRequestParameter getDefaultRolesRequestParameter32,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Ticketstati.
                    * @param getTicketStateRequestParameter34
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.TicketStateList getTicketState(

                        net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter getTicketStateRequestParameter34)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Ticketstati.
                * @param getTicketStateRequestParameter34
            
          */
        public void startgetTicketState(

            net.proventis.axis.blueant.masterdata.GetTicketStateRequestParameter getTicketStateRequestParameter34,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Risikostati.
                    * @param getRiskStateRequestParameter36
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.RiskStateList getRiskState(

                        net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter getRiskStateRequestParameter36)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Risikostati.
                * @param getRiskStateRequestParameter36
            
          */
        public void startgetRiskState(

            net.proventis.axis.blueant.masterdata.GetRiskStateRequestParameter getRiskStateRequestParameter36,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert eine Liste aller Risikoauswirkungen.
                    * @param getRiskEffectRequestParameter38
                
             * @throws net.proventis.service.InvalidParameterException : Ungültiger Parameter
             * @throws net.proventis.service.InvalidSessionException : Session ungültig
             * @throws net.proventis.service.AssertionException : Ungültige Voraussetzung
             * @throws net.proventis.service.InvalidClientException : Client nicht erlaubt
             * @throws net.proventis.service.PermissionDeniedException : Zugriff nicht gestattet / Rechte in Blue Ant nicht vorhanden
         */

         
                     public net.proventis.axis.blueant.masterdata.RiskEffectList getRiskEffect(

                        net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter getRiskEffectRequestParameter38)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.InvalidParameterException
          ,net.proventis.service.InvalidSessionException
          ,net.proventis.service.AssertionException
          ,net.proventis.service.InvalidClientException
          ,net.proventis.service.PermissionDeniedException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert eine Liste aller Risikoauswirkungen.
                * @param getRiskEffectRequestParameter38
            
          */
        public void startgetRiskEffect(

            net.proventis.axis.blueant.masterdata.GetRiskEffectRequestParameter getRiskEffectRequestParameter38,

            final net.proventis.service.MasterDataServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    