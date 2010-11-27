

/**
 * BaseService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */

    package net.proventis.service;

    /*
     *  BaseService java interface
     */

    public interface BaseService {
          

        /**
          * Auto generated method signature
          * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername oder einem Alias OHNE Password.
                    * @param loginNoAuthRequestParameter3
                
             * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
             * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
             * @throws net.proventis.service.InvalidUsernameException : Benutzername falsch
             * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
             * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
         */

         
                     public net.proventis.axis.blueant.base.SessionID loginNoAuth(

                        net.proventis.axis.blueant.base.LoginNoAuthRequestParameter loginNoAuthRequestParameter3)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.ServerMaintenanceException
          ,net.proventis.service.InvalidDatesException
          ,net.proventis.service.InvalidUsernameException
          ,net.proventis.service.InvalidNamedLicenseException
          ,net.proventis.service.InvalidConcurrentLicenseException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername oder einem Alias OHNE Password.
                * @param loginNoAuthRequestParameter3
            
          */
        public void startloginNoAuth(

            net.proventis.axis.blueant.base.LoginNoAuthRequestParameter loginNoAuthRequestParameter3,

            final net.proventis.service.BaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert aus Blue Ant eine gueltige sessionID bei der Übergabe von einem SAML artifact via SSO
                    * @param loginSAMLRequestParameter5
                
             * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
             * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
             * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
             * @throws net.proventis.service.InvalidUsernamePasswordCombinationException : Benutzername / Password falsch
             * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
         */

         
                     public net.proventis.axis.blueant.base.SessionID loginSAML(

                        net.proventis.axis.blueant.base.LoginSAMLRequestParameter loginSAMLRequestParameter5)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.ServerMaintenanceException
          ,net.proventis.service.InvalidDatesException
          ,net.proventis.service.InvalidNamedLicenseException
          ,net.proventis.service.InvalidUsernamePasswordCombinationException
          ,net.proventis.service.InvalidConcurrentLicenseException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert aus Blue Ant eine gueltige sessionID bei der Übergabe von einem SAML artifact via SSO
                * @param loginSAMLRequestParameter5
            
          */
        public void startloginSAML(

            net.proventis.axis.blueant.base.LoginSAMLRequestParameter loginSAMLRequestParameter5,

            final net.proventis.service.BaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service meldet eine gültige sessionID bei Blue Ant ab.
                    * @param logoutRequestParameter7
                
         */

         
                     public void logout(

                        net.proventis.axis.blueant.base.LogoutRequestParameter logoutRequestParameter7)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service meldet eine gültige sessionID bei Blue Ant ab.
                * @param logoutRequestParameter7
            
          */
        public void startlogout(

            net.proventis.axis.blueant.base.LogoutRequestParameter logoutRequestParameter7,

            final net.proventis.service.BaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername und Password
                    * @param loginRequestParameter9
                
             * @throws net.proventis.service.ServerMaintenanceException : Der Server ist im Wartungsmodus
             * @throws net.proventis.service.InvalidDatesException : Eintritts- oder Austrittsdatum des Anwenders ist noch nicht erreicht oder ueberschritten
             * @throws net.proventis.service.InvalidNamedLicenseException : Anzahl der Named Lizensen erschöft.
             * @throws net.proventis.service.InvalidUsernamePasswordCombinationException : Benutzername/ Password falsch
             * @throws net.proventis.service.InvalidConcurrentLicenseException : Anzahl der Concurrent Lizensen erschöft.
         */

         
                     public net.proventis.axis.blueant.base.SessionID login(

                        net.proventis.axis.blueant.base.LoginRequestParameter loginRequestParameter9)
                        throws java.rmi.RemoteException
             
          ,net.proventis.service.ServerMaintenanceException
          ,net.proventis.service.InvalidDatesException
          ,net.proventis.service.InvalidNamedLicenseException
          ,net.proventis.service.InvalidUsernamePasswordCombinationException
          ,net.proventis.service.InvalidConcurrentLicenseException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Dieser Service liefert aus Blue Ant eine gültige sessionID bei der Übergabe von Benutzername und Password
                * @param loginRequestParameter9
            
          */
        public void startlogin(

            net.proventis.axis.blueant.base.LoginRequestParameter loginRequestParameter9,

            final net.proventis.service.BaseServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    