
/**
 * T_Department.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.masterdata;
            

            /**
            *  T_Department bean class
            */
        
        public  class T_Department
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_Department
                Namespace URI = http://masterdata.blueant.axis.proventis.net/
                Namespace Prefix = ns3
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://masterdata.blueant.axis.proventis.net/")){
                return "ns3";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for DepartmentID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localDepartmentID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getDepartmentID(){
                               return localDepartmentID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DepartmentID
                               */
                               public void setDepartmentID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localDepartmentID=param;
                                    

                               }
                            

                        /**
                        * field for Intern
                        */

                        
                                    protected boolean localIntern ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIntern(){
                               return localIntern;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Intern
                               */
                               public void setIntern(boolean param){
                            
                                            this.localIntern=param;
                                    

                               }
                            

                        /**
                        * field for Active
                        */

                        
                                    protected boolean localActive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getActive(){
                               return localActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Active
                               */
                               public void setActive(boolean param){
                            
                                            this.localActive=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for AdditionalName
                        */

                        
                                    protected java.lang.String localAdditionalName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdditionalName(){
                               return localAdditionalName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdditionalName
                               */
                               public void setAdditionalName(java.lang.String param){
                            
                                            this.localAdditionalName=param;
                                    

                               }
                            

                        /**
                        * field for ZipCode
                        */

                        
                                    protected java.lang.String localZipCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getZipCode(){
                               return localZipCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ZipCode
                               */
                               public void setZipCode(java.lang.String param){
                            
                                            this.localZipCode=param;
                                    

                               }
                            

                        /**
                        * field for Place
                        */

                        
                                    protected java.lang.String localPlace ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlace(){
                               return localPlace;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Place
                               */
                               public void setPlace(java.lang.String param){
                            
                                            this.localPlace=param;
                                    

                               }
                            

                        /**
                        * field for CountryID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localCountryID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getCountryID(){
                               return localCountryID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CountryID
                               */
                               public void setCountryID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localCountryID=param;
                                    

                               }
                            

                        /**
                        * field for Street
                        */

                        
                                    protected java.lang.String localStreet ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStreet(){
                               return localStreet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Street
                               */
                               public void setStreet(java.lang.String param){
                            
                                            this.localStreet=param;
                                    

                               }
                            

                        /**
                        * field for Sector
                        */

                        
                                    protected java.lang.String localSector ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSector(){
                               return localSector;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Sector
                               */
                               public void setSector(java.lang.String param){
                            
                                            this.localSector=param;
                                    

                               }
                            

                        /**
                        * field for Phone
                        */

                        
                                    protected java.lang.String localPhone ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPhone(){
                               return localPhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Phone
                               */
                               public void setPhone(java.lang.String param){
                            
                                            this.localPhone=param;
                                    

                               }
                            

                        /**
                        * field for Fax
                        */

                        
                                    protected java.lang.String localFax ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFax(){
                               return localFax;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fax
                               */
                               public void setFax(java.lang.String param){
                            
                                            this.localFax=param;
                                    

                               }
                            

                        /**
                        * field for Email
                        */

                        
                                    protected java.lang.String localEmail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmail(){
                               return localEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Email
                               */
                               public void setEmail(java.lang.String param){
                            
                                            this.localEmail=param;
                                    

                               }
                            

                        /**
                        * field for Homepage
                        */

                        
                                    protected java.lang.String localHomepage ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHomepage(){
                               return localHomepage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Homepage
                               */
                               public void setHomepage(java.lang.String param){
                            
                                            this.localHomepage=param;
                                    

                               }
                            

                        /**
                        * field for CostCenterNumber
                        */

                        
                                    protected java.lang.String localCostCenterNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCostCenterNumber(){
                               return localCostCenterNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CostCenterNumber
                               */
                               public void setCostCenterNumber(java.lang.String param){
                            
                                            this.localCostCenterNumber=param;
                                    

                               }
                            

                        /**
                        * field for ManagerID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localManagerID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getManagerID(){
                               return localManagerID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ManagerID
                               */
                               public void setManagerID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localManagerID=param;
                                    

                               }
                            

                        /**
                        * field for SubstituteID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localSubstituteID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getSubstituteID(){
                               return localSubstituteID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubstituteID
                               */
                               public void setSubstituteID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localSubstituteID=param;
                                    

                               }
                            

                        /**
                        * field for OwnProjectReleaseType
                        */

                        
                                    protected net.proventis.axis.blueant.masterdata.T_ProjectReleaseType localOwnProjectReleaseType ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.masterdata.T_ProjectReleaseType
                           */
                           public  net.proventis.axis.blueant.masterdata.T_ProjectReleaseType getOwnProjectReleaseType(){
                               return localOwnProjectReleaseType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OwnProjectReleaseType
                               */
                               public void setOwnProjectReleaseType(net.proventis.axis.blueant.masterdata.T_ProjectReleaseType param){
                            
                                            this.localOwnProjectReleaseType=param;
                                    

                               }
                            

                        /**
                        * field for OwnProjectReservation
                        */

                        
                                    protected double localOwnProjectReservation ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getOwnProjectReservation(){
                               return localOwnProjectReservation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OwnProjectReservation
                               */
                               public void setOwnProjectReservation(double param){
                            
                                            this.localOwnProjectReservation=param;
                                    

                               }
                            

                        /**
                        * field for OwnProjectReservationUnit
                        */

                        
                                    protected net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit localOwnProjectReservationUnit ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit
                           */
                           public  net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit getOwnProjectReservationUnit(){
                               return localOwnProjectReservationUnit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OwnProjectReservationUnit
                               */
                               public void setOwnProjectReservationUnit(net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit param){
                            
                                            this.localOwnProjectReservationUnit=param;
                                    

                               }
                            

                        /**
                        * field for OtherProjectReleaseType
                        */

                        
                                    protected net.proventis.axis.blueant.masterdata.T_ProjectReleaseType localOtherProjectReleaseType ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.masterdata.T_ProjectReleaseType
                           */
                           public  net.proventis.axis.blueant.masterdata.T_ProjectReleaseType getOtherProjectReleaseType(){
                               return localOtherProjectReleaseType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherProjectReleaseType
                               */
                               public void setOtherProjectReleaseType(net.proventis.axis.blueant.masterdata.T_ProjectReleaseType param){
                            
                                            this.localOtherProjectReleaseType=param;
                                    

                               }
                            

                        /**
                        * field for OtherProjectReservation
                        */

                        
                                    protected double localOtherProjectReservation ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getOtherProjectReservation(){
                               return localOtherProjectReservation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherProjectReservation
                               */
                               public void setOtherProjectReservation(double param){
                            
                                            this.localOtherProjectReservation=param;
                                    

                               }
                            

                        /**
                        * field for OtherProjectReservationUnit
                        */

                        
                                    protected net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit localOtherProjectReservationUnit ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit
                           */
                           public  net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit getOtherProjectReservationUnit(){
                               return localOtherProjectReservationUnit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherProjectReservationUnit
                               */
                               public void setOtherProjectReservationUnit(net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit param){
                            
                                            this.localOtherProjectReservationUnit=param;
                                    

                               }
                            

                        /**
                        * field for Children
                        */

                        
                                    protected net.proventis.axis.blueant.masterdata.T_DepartmentList localChildren ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.masterdata.T_DepartmentList
                           */
                           public  net.proventis.axis.blueant.masterdata.T_DepartmentList getChildren(){
                               return localChildren;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Children
                               */
                               public void setChildren(net.proventis.axis.blueant.masterdata.T_DepartmentList param){
                            
                                            this.localChildren=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       T_Department.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://masterdata.blueant.axis.proventis.net/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":T_Department",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_Department",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDepartmentID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("departmentID cannot be null!!");
                                            }
                                           localDepartmentID.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","departmentID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"intern", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"intern");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("intern");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("intern cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntern));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"active", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"active");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("active");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("active cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"additionalName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"additionalName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("additionalName");
                                    }
                                

                                          if (localAdditionalName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdditionalName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"zipCode", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"zipCode");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("zipCode");
                                    }
                                

                                          if (localZipCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localZipCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"place", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"place");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("place");
                                    }
                                

                                          if (localPlace==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlace);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localCountryID==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"countryID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"countryID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("countryID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCountryID.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","countryID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"street", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"street");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("street");
                                    }
                                

                                          if (localStreet==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStreet);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"sector", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"sector");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("sector");
                                    }
                                

                                          if (localSector==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSector);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"phone", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"phone");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("phone");
                                    }
                                

                                          if (localPhone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPhone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"fax", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"fax");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("fax");
                                    }
                                

                                          if (localFax==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFax);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"email", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"email");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("email");
                                    }
                                

                                          if (localEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"homepage", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"homepage");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("homepage");
                                    }
                                

                                          if (localHomepage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHomepage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"costCenterNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"costCenterNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("costCenterNumber");
                                    }
                                

                                          if (localCostCenterNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCostCenterNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localManagerID==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"managerID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"managerID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("managerID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localManagerID.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","managerID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localSubstituteID==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"substituteID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"substituteID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("substituteID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSubstituteID.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","substituteID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localOwnProjectReleaseType==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ownProjectReleaseType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ownProjectReleaseType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ownProjectReleaseType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOwnProjectReleaseType.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","ownProjectReleaseType"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ownProjectReservation", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ownProjectReservation");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ownProjectReservation");
                                    }
                                
                                               if (java.lang.Double.isNaN(localOwnProjectReservation)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwnProjectReservation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localOwnProjectReservationUnit==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ownProjectReservationUnit", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ownProjectReservationUnit");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ownProjectReservationUnit");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOwnProjectReservationUnit.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","ownProjectReservationUnit"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localOtherProjectReleaseType==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"otherProjectReleaseType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"otherProjectReleaseType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("otherProjectReleaseType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherProjectReleaseType.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","otherProjectReleaseType"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://masterdata.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"otherProjectReservation", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"otherProjectReservation");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("otherProjectReservation");
                                    }
                                
                                               if (java.lang.Double.isNaN(localOtherProjectReservation)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherProjectReservation));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localOtherProjectReservationUnit==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"otherProjectReservationUnit", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"otherProjectReservationUnit");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("otherProjectReservationUnit");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherProjectReservationUnit.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","otherProjectReservationUnit"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localChildren==null){

                                            java.lang.String namespace2 = "http://masterdata.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"children", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"children");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("children");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChildren.serialize(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","children"),
                                        factory,xmlWriter);
                                    }
                                
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "departmentID"));
                            
                            
                                    if (localDepartmentID==null){
                                         throw new org.apache.axis2.databinding.ADBException("departmentID cannot be null!!");
                                    }
                                    elementList.add(localDepartmentID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "intern"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntern));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "active"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "additionalName"));
                                 
                                         elementList.add(localAdditionalName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdditionalName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "zipCode"));
                                 
                                         elementList.add(localZipCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localZipCode));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "place"));
                                 
                                         elementList.add(localPlace==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlace));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "countryID"));
                            
                            
                                    elementList.add(localCountryID==null?null:
                                    localCountryID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "street"));
                                 
                                         elementList.add(localStreet==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStreet));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "sector"));
                                 
                                         elementList.add(localSector==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSector));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "phone"));
                                 
                                         elementList.add(localPhone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhone));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "fax"));
                                 
                                         elementList.add(localFax==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFax));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "email"));
                                 
                                         elementList.add(localEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "homepage"));
                                 
                                         elementList.add(localHomepage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHomepage));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "costCenterNumber"));
                                 
                                         elementList.add(localCostCenterNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCostCenterNumber));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "managerID"));
                            
                            
                                    elementList.add(localManagerID==null?null:
                                    localManagerID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "substituteID"));
                            
                            
                                    elementList.add(localSubstituteID==null?null:
                                    localSubstituteID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "ownProjectReleaseType"));
                            
                            
                                    elementList.add(localOwnProjectReleaseType==null?null:
                                    localOwnProjectReleaseType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "ownProjectReservation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOwnProjectReservation));
                            
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "ownProjectReservationUnit"));
                            
                            
                                    elementList.add(localOwnProjectReservationUnit==null?null:
                                    localOwnProjectReservationUnit);
                                
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "otherProjectReleaseType"));
                            
                            
                                    elementList.add(localOtherProjectReleaseType==null?null:
                                    localOtherProjectReleaseType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "otherProjectReservation"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherProjectReservation));
                            
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "otherProjectReservationUnit"));
                            
                            
                                    elementList.add(localOtherProjectReservationUnit==null?null:
                                    localOtherProjectReservationUnit);
                                
                            elementList.add(new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/",
                                                                      "children"));
                            
                            
                                    elementList.add(localChildren==null?null:
                                    localChildren);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static T_Department parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_Department object =
                new T_Department();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"T_Department".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_Department)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","departmentID").equals(reader.getName())){
                                
                                                object.setDepartmentID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","intern").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntern(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","active").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","additionalName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdditionalName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","zipCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setZipCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","place").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlace(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","countryID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCountryID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCountryID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","street").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStreet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","sector").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSector(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","phone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","fax").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFax(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","email").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","homepage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHomepage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","costCenterNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCostCenterNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","managerID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setManagerID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setManagerID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","substituteID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSubstituteID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSubstituteID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","ownProjectReleaseType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOwnProjectReleaseType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOwnProjectReleaseType(net.proventis.axis.blueant.masterdata.T_ProjectReleaseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","ownProjectReservation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOwnProjectReservation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setOwnProjectReservation(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","ownProjectReservationUnit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOwnProjectReservationUnit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOwnProjectReservationUnit(net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","otherProjectReleaseType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherProjectReleaseType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherProjectReleaseType(net.proventis.axis.blueant.masterdata.T_ProjectReleaseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","otherProjectReservation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOtherProjectReservation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setOtherProjectReservation(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","otherProjectReservationUnit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherProjectReservationUnit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherProjectReservationUnit(net.proventis.axis.blueant.masterdata.T_ProjectReservationUnit.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://masterdata.blueant.axis.proventis.net/","children").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChildren(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChildren(net.proventis.axis.blueant.masterdata.T_DepartmentList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          