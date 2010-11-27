
/**
 * T_Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.project;
            

            /**
            *  T_Project bean class
            */
        
        public  class T_Project extends net.proventis.axis.blueant.cost.T_SimpleProject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_Project
                Namespace URI = http://project.blueant.axis.proventis.net/
                Namespace Prefix = ns8
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://project.blueant.axis.proventis.net/")){
                return "ns8";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for IsVirtuell
                        */

                        
                                    protected boolean localIsVirtuell ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsVirtuell(){
                               return localIsVirtuell;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsVirtuell
                               */
                               public void setIsVirtuell(boolean param){
                            
                                            this.localIsVirtuell=param;
                                    

                               }
                            

                        /**
                        * field for ProjectNumber
                        */

                        
                                    protected java.lang.String localProjectNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProjectNumber(){
                               return localProjectNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectNumber
                               */
                               public void setProjectNumber(java.lang.String param){
                            
                                            this.localProjectNumber=param;
                                    

                               }
                            

                        /**
                        * field for ProjectTypeID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localProjectTypeID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getProjectTypeID(){
                               return localProjectTypeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectTypeID
                               */
                               public void setProjectTypeID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localProjectTypeID=param;
                                    

                               }
                            

                        /**
                        * field for CreatorID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localCreatorID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getCreatorID(){
                               return localCreatorID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatorID
                               */
                               public void setCreatorID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localCreatorID=param;
                                    

                               }
                            

                        /**
                        * field for PriorityID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localPriorityID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getPriorityID(){
                               return localPriorityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PriorityID
                               */
                               public void setPriorityID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localPriorityID=param;
                                    

                               }
                            

                        /**
                        * field for CurrencyID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localCurrencyID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getCurrencyID(){
                               return localCurrencyID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrencyID
                               */
                               public void setCurrencyID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localCurrencyID=param;
                                    

                               }
                            

                        /**
                        * field for StateID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localStateID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getStateID(){
                               return localStateID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateID
                               */
                               public void setStateID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localStateID=param;
                                    

                               }
                            

                        /**
                        * field for StateDate
                        */

                        
                                    protected java.util.Date localStateDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStateDate(){
                               return localStateDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateDate
                               */
                               public void setStateDate(java.util.Date param){
                            
                                            this.localStateDate=param;
                                    

                               }
                            

                        /**
                        * field for CostUnitNo
                        */

                        
                                    protected java.lang.String localCostUnitNo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCostUnitNo(){
                               return localCostUnitNo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CostUnitNo
                               */
                               public void setCostUnitNo(java.lang.String param){
                            
                                            this.localCostUnitNo=param;
                                    

                               }
                            

                        /**
                        * field for ProjectLeaderID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localProjectLeaderID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getProjectLeaderID(){
                               return localProjectLeaderID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectLeaderID
                               */
                               public void setProjectLeaderID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localProjectLeaderID=param;
                                    

                               }
                            

                        /**
                        * field for WorktimeTaskRequired
                        */

                        
                                    protected boolean localWorktimeTaskRequired ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getWorktimeTaskRequired(){
                               return localWorktimeTaskRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorktimeTaskRequired
                               */
                               public void setWorktimeTaskRequired(boolean param){
                            
                                            this.localWorktimeTaskRequired=param;
                                    

                               }
                            

                        /**
                        * field for StartdateForTask
                        */

                        
                                    protected int localStartdateForTask ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getStartdateForTask(){
                               return localStartdateForTask;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartdateForTask
                               */
                               public void setStartdateForTask(int param){
                            
                                            this.localStartdateForTask=param;
                                    

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
                        * field for ProjectLeaderRoleID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localProjectLeaderRoleID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getProjectLeaderRoleID(){
                               return localProjectLeaderRoleID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectLeaderRoleID
                               */
                               public void setProjectLeaderRoleID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localProjectLeaderRoleID=param;
                                    

                               }
                            

                        /**
                        * field for ProjectLeaderParticipation
                        */

                        
                                    protected net.proventis.axis.blueant.base.OptionalDouble localProjectLeaderParticipation ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.OptionalDouble
                           */
                           public  net.proventis.axis.blueant.base.OptionalDouble getProjectLeaderParticipation(){
                               return localProjectLeaderParticipation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectLeaderParticipation
                               */
                               public void setProjectLeaderParticipation(net.proventis.axis.blueant.base.OptionalDouble param){
                            
                                            this.localProjectLeaderParticipation=param;
                                    

                               }
                            

                        /**
                        * field for IsObligatory
                        */

                        
                                    protected boolean localIsObligatory ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsObligatory(){
                               return localIsObligatory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsObligatory
                               */
                               public void setIsObligatory(boolean param){
                            
                                            this.localIsObligatory=param;
                                    

                               }
                            

                        /**
                        * field for CostObjectNumber
                        */

                        
                                    protected java.lang.String localCostObjectNumber ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCostObjectNumber(){
                               return localCostObjectNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CostObjectNumber
                               */
                               public void setCostObjectNumber(java.lang.String param){
                            
                                            this.localCostObjectNumber=param;
                                    

                               }
                            

                        /**
                        * field for Customers
                        */

                        
                                    protected net.proventis.axis.blueant.project.T_CustomerList localCustomers ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.project.T_CustomerList
                           */
                           public  net.proventis.axis.blueant.project.T_CustomerList getCustomers(){
                               return localCustomers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Customers
                               */
                               public void setCustomers(net.proventis.axis.blueant.project.T_CustomerList param){
                            
                                            this.localCustomers=param;
                                    

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
                       T_Project.this.serialize(parentQName,factory,xmlWriter);
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://project.blueant.axis.proventis.net/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":T_Project",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_Project",
                           xmlWriter);
                   }

               
                                    if (localProjectID==null){

                                            java.lang.String namespace2 = "http://cost.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"projectID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"projectID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("projectID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProjectID.serialize(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","projectID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://cost.blueant.axis.proventis.net/";
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
                             
                                    namespace = "http://cost.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"startTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"startTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("startTime");
                                    }
                                

                                          if (localStartTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("startTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://cost.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"endTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"endTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("endTime");
                                    }
                                

                                          if (localEndTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("endTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"isVirtuell", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"isVirtuell");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("isVirtuell");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("isVirtuell cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsVirtuell));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"projectNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"projectNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("projectNumber");
                                    }
                                

                                          if (localProjectNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("projectNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProjectNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localProjectTypeID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("projectTypeID cannot be null!!");
                                            }
                                           localProjectTypeID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectTypeID"),
                                               factory,xmlWriter);
                                        
                                    if (localCreatorID==null){

                                            java.lang.String namespace2 = "http://project.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"creatorID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"creatorID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("creatorID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreatorID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","creatorID"),
                                        factory,xmlWriter);
                                    }
                                
                                            if (localPriorityID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("priorityID cannot be null!!");
                                            }
                                           localPriorityID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","priorityID"),
                                               factory,xmlWriter);
                                        
                                            if (localCurrencyID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("currencyID cannot be null!!");
                                            }
                                           localCurrencyID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","currencyID"),
                                               factory,xmlWriter);
                                        
                                            if (localStateID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("stateID cannot be null!!");
                                            }
                                           localStateID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","stateID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"stateDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"stateDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("stateDate");
                                    }
                                

                                          if (localStateDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"costUnitNo", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"costUnitNo");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("costUnitNo");
                                    }
                                

                                          if (localCostUnitNo==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCostUnitNo);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localProjectLeaderID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("projectLeaderID cannot be null!!");
                                            }
                                           localProjectLeaderID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"worktimeTaskRequired", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"worktimeTaskRequired");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("worktimeTaskRequired");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorktimeTaskRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"startdateForTask", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"startdateForTask");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("startdateForTask");
                                    }
                                
                                               if (localStartdateForTask==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartdateForTask));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localDepartmentID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("departmentID cannot be null!!");
                                            }
                                           localDepartmentID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","departmentID"),
                                               factory,xmlWriter);
                                        
                                    if (localProjectLeaderRoleID==null){

                                            java.lang.String namespace2 = "http://project.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"projectLeaderRoleID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"projectLeaderRoleID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("projectLeaderRoleID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProjectLeaderRoleID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderRoleID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localProjectLeaderParticipation==null){

                                            java.lang.String namespace2 = "http://project.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"projectLeaderParticipation", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"projectLeaderParticipation");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("projectLeaderParticipation");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProjectLeaderParticipation.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderParticipation"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"isObligatory", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"isObligatory");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("isObligatory");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("isObligatory cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsObligatory));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"costObjectNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"costObjectNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("costObjectNumber");
                                    }
                                

                                          if (localCostObjectNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCostObjectNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localCustomers==null){
                                                 throw new org.apache.axis2.databinding.ADBException("customers cannot be null!!");
                                            }
                                           localCustomers.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","customers"),
                                               factory,xmlWriter);
                                        
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","T_Project"));
                
                            elementList.add(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/",
                                                                      "projectID"));
                            
                            
                                    elementList.add(localProjectID==null?null:
                                    localProjectID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/",
                                                                      "name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/",
                                                                      "startTime"));
                                 
                                        if (localStartTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("startTime cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/",
                                                                      "endTime"));
                                 
                                        if (localEndTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("endTime cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "isVirtuell"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsVirtuell));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectNumber"));
                                 
                                        if (localProjectNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProjectNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("projectNumber cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectTypeID"));
                            
                            
                                    if (localProjectTypeID==null){
                                         throw new org.apache.axis2.databinding.ADBException("projectTypeID cannot be null!!");
                                    }
                                    elementList.add(localProjectTypeID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "creatorID"));
                            
                            
                                    elementList.add(localCreatorID==null?null:
                                    localCreatorID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "priorityID"));
                            
                            
                                    if (localPriorityID==null){
                                         throw new org.apache.axis2.databinding.ADBException("priorityID cannot be null!!");
                                    }
                                    elementList.add(localPriorityID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "currencyID"));
                            
                            
                                    if (localCurrencyID==null){
                                         throw new org.apache.axis2.databinding.ADBException("currencyID cannot be null!!");
                                    }
                                    elementList.add(localCurrencyID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "stateID"));
                            
                            
                                    if (localStateID==null){
                                         throw new org.apache.axis2.databinding.ADBException("stateID cannot be null!!");
                                    }
                                    elementList.add(localStateID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "stateDate"));
                                 
                                         elementList.add(localStateDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateDate));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "costUnitNo"));
                                 
                                         elementList.add(localCostUnitNo==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCostUnitNo));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectLeaderID"));
                            
                            
                                    if (localProjectLeaderID==null){
                                         throw new org.apache.axis2.databinding.ADBException("projectLeaderID cannot be null!!");
                                    }
                                    elementList.add(localProjectLeaderID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "worktimeTaskRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorktimeTaskRequired));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "startdateForTask"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartdateForTask));
                            
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "departmentID"));
                            
                            
                                    if (localDepartmentID==null){
                                         throw new org.apache.axis2.databinding.ADBException("departmentID cannot be null!!");
                                    }
                                    elementList.add(localDepartmentID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectLeaderRoleID"));
                            
                            
                                    elementList.add(localProjectLeaderRoleID==null?null:
                                    localProjectLeaderRoleID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectLeaderParticipation"));
                            
                            
                                    elementList.add(localProjectLeaderParticipation==null?null:
                                    localProjectLeaderParticipation);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "isObligatory"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsObligatory));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "costObjectNumber"));
                                 
                                         elementList.add(localCostObjectNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCostObjectNumber));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "customers"));
                            
                            
                                    if (localCustomers==null){
                                         throw new org.apache.axis2.databinding.ADBException("customers cannot be null!!");
                                    }
                                    elementList.add(localCustomers);
                                

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
        public static T_Project parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_Project object =
                new T_Project();

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
                    
                            if (!"T_Project".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_Project)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","projectID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProjectID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProjectID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","name").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","startTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","endTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","isVirtuell").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsVirtuell(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectNumber").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProjectNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectTypeID").equals(reader.getName())){
                                
                                                object.setProjectTypeID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","creatorID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreatorID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreatorID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","priorityID").equals(reader.getName())){
                                
                                                object.setPriorityID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","currencyID").equals(reader.getName())){
                                
                                                object.setCurrencyID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","stateID").equals(reader.getName())){
                                
                                                object.setStateID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","stateDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStateDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","costUnitNo").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCostUnitNo(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderID").equals(reader.getName())){
                                
                                                object.setProjectLeaderID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","worktimeTaskRequired").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorktimeTaskRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","startdateForTask").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartdateForTask(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setStartdateForTask(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","departmentID").equals(reader.getName())){
                                
                                                object.setDepartmentID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderRoleID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProjectLeaderRoleID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProjectLeaderRoleID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectLeaderParticipation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProjectLeaderParticipation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProjectLeaderParticipation(net.proventis.axis.blueant.base.OptionalDouble.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","isObligatory").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsObligatory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","costObjectNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCostObjectNumber(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","customers").equals(reader.getName())){
                                
                                                object.setCustomers(net.proventis.axis.blueant.project.T_CustomerList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
          