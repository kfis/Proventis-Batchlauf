
/**
 * T_TaskResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.project;
            

            /**
            *  T_TaskResource bean class
            */
        
        public  class T_TaskResource
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_TaskResource
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
                        * field for TaskResourceID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTaskResourceID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTaskResourceID(){
                               return localTaskResourceID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskResourceID
                               */
                               public void setTaskResourceID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTaskResourceID=param;
                                    

                               }
                            

                        /**
                        * field for ProjectID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localProjectID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getProjectID(){
                               return localProjectID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectID
                               */
                               public void setProjectID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localProjectID=param;
                                    

                               }
                            

                        /**
                        * field for TaskID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTaskID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTaskID(){
                               return localTaskID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskID
                               */
                               public void setTaskID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTaskID=param;
                                    

                               }
                            

                        /**
                        * field for ResourceID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localResourceID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getResourceID(){
                               return localResourceID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceID
                               */
                               public void setResourceID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localResourceID=param;
                                    

                               }
                            

                        /**
                        * field for From
                        */

                        
                                    protected java.util.Calendar localFrom ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getFrom(){
                               return localFrom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param From
                               */
                               public void setFrom(java.util.Calendar param){
                            
                                            this.localFrom=param;
                                    

                               }
                            

                        /**
                        * field for To
                        */

                        
                                    protected java.util.Calendar localTo ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTo(){
                               return localTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param To
                               */
                               public void setTo(java.util.Calendar param){
                            
                                            this.localTo=param;
                                    

                               }
                            

                        /**
                        * field for Work_unit
                        */

                        
                                    protected net.proventis.axis.blueant.project.WorkUnitType localWork_unit ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.project.WorkUnitType
                           */
                           public  net.proventis.axis.blueant.project.WorkUnitType getWork_unit(){
                               return localWork_unit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work_unit
                               */
                               public void setWork_unit(net.proventis.axis.blueant.project.WorkUnitType param){
                            
                                            this.localWork_unit=param;
                                    

                               }
                            

                        /**
                        * field for Participation_in_percent
                        */

                        
                                    protected double localParticipation_in_percent ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getParticipation_in_percent(){
                               return localParticipation_in_percent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Participation_in_percent
                               */
                               public void setParticipation_in_percent(double param){
                            
                                            this.localParticipation_in_percent=param;
                                    

                               }
                            

                        /**
                        * field for Work_in_percent
                        */

                        
                                    protected double localWork_in_percent ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWork_in_percent(){
                               return localWork_in_percent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work_in_percent
                               */
                               public void setWork_in_percent(double param){
                            
                                            this.localWork_in_percent=param;
                                    

                               }
                            

                        /**
                        * field for Calculated_work_in_percent
                        */

                        
                                    protected net.proventis.axis.blueant.base.OptionalDouble localCalculated_work_in_percent ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.OptionalDouble
                           */
                           public  net.proventis.axis.blueant.base.OptionalDouble getCalculated_work_in_percent(){
                               return localCalculated_work_in_percent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Calculated_work_in_percent
                               */
                               public void setCalculated_work_in_percent(net.proventis.axis.blueant.base.OptionalDouble param){
                            
                                            this.localCalculated_work_in_percent=param;
                                    

                               }
                            

                        /**
                        * field for Work
                        */

                        
                                    protected double localWork ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWork(){
                               return localWork;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work
                               */
                               public void setWork(double param){
                            
                                            this.localWork=param;
                                    

                               }
                            

                        /**
                        * field for Calculated_work
                        */

                        
                                    protected double localCalculated_work ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getCalculated_work(){
                               return localCalculated_work;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Calculated_work
                               */
                               public void setCalculated_work(double param){
                            
                                            this.localCalculated_work=param;
                                    

                               }
                            

                        /**
                        * field for Work_estimated
                        */

                        
                                    protected double localWork_estimated ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWork_estimated(){
                               return localWork_estimated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work_estimated
                               */
                               public void setWork_estimated(double param){
                            
                                            this.localWork_estimated=param;
                                    

                               }
                            

                        /**
                        * field for Work_actual
                        */

                        
                                    protected double localWork_actual ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWork_actual(){
                               return localWork_actual;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work_actual
                               */
                               public void setWork_actual(double param){
                            
                                            this.localWork_actual=param;
                                    

                               }
                            

                        /**
                        * field for RoleID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localRoleID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getRoleID(){
                               return localRoleID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RoleID
                               */
                               public void setRoleID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localRoleID=param;
                                    

                               }
                            

                        /**
                        * field for HasIndividualCosts
                        */

                        
                                    protected boolean localHasIndividualCosts ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasIndividualCosts(){
                               return localHasIndividualCosts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasIndividualCosts
                               */
                               public void setHasIndividualCosts(boolean param){
                            
                                            this.localHasIndividualCosts=param;
                                    

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
                       T_TaskResource.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://project.blueant.axis.proventis.net/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":T_TaskResource",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_TaskResource",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localTaskResourceID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("taskResourceID cannot be null!!");
                                            }
                                           localTaskResourceID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","taskResourceID"),
                                               factory,xmlWriter);
                                        
                                            if (localProjectID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("projectID cannot be null!!");
                                            }
                                           localProjectID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectID"),
                                               factory,xmlWriter);
                                        
                                            if (localTaskID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("taskID cannot be null!!");
                                            }
                                           localTaskID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","taskID"),
                                               factory,xmlWriter);
                                        
                                            if (localResourceID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("resourceID cannot be null!!");
                                            }
                                           localResourceID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","resourceID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"from", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"from");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("from");
                                    }
                                

                                          if (localFrom==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("from cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFrom));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"to", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"to");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("to");
                                    }
                                

                                          if (localTo==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("to cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTo));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localWork_unit==null){

                                            java.lang.String namespace2 = "http://project.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"work_unit", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"work_unit");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("work_unit");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localWork_unit.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_unit"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"participation_in_percent", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"participation_in_percent");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("participation_in_percent");
                                    }
                                
                                               if (java.lang.Double.isNaN(localParticipation_in_percent)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("participation_in_percent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_percent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"work_in_percent", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"work_in_percent");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("work_in_percent");
                                    }
                                
                                               if (java.lang.Double.isNaN(localWork_in_percent)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("work_in_percent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_in_percent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localCalculated_work_in_percent==null){
                                                 throw new org.apache.axis2.databinding.ADBException("calculated_work_in_percent cannot be null!!");
                                            }
                                           localCalculated_work_in_percent.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","calculated_work_in_percent"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"work", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"work");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("work");
                                    }
                                
                                               if (java.lang.Double.isNaN(localWork)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("work cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"calculated_work", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"calculated_work");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("calculated_work");
                                    }
                                
                                               if (java.lang.Double.isNaN(localCalculated_work)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("calculated_work cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalculated_work));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"work_estimated", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"work_estimated");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("work_estimated");
                                    }
                                
                                               if (java.lang.Double.isNaN(localWork_estimated)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("work_estimated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_estimated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"work_actual", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"work_actual");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("work_actual");
                                    }
                                
                                               if (java.lang.Double.isNaN(localWork_actual)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("work_actual cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_actual));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localRoleID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("roleID cannot be null!!");
                                            }
                                           localRoleID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","roleID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"hasIndividualCosts", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"hasIndividualCosts");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("hasIndividualCosts");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("hasIndividualCosts cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasIndividualCosts));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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

                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "taskResourceID"));
                            
                            
                                    if (localTaskResourceID==null){
                                         throw new org.apache.axis2.databinding.ADBException("taskResourceID cannot be null!!");
                                    }
                                    elementList.add(localTaskResourceID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectID"));
                            
                            
                                    if (localProjectID==null){
                                         throw new org.apache.axis2.databinding.ADBException("projectID cannot be null!!");
                                    }
                                    elementList.add(localProjectID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "taskID"));
                            
                            
                                    if (localTaskID==null){
                                         throw new org.apache.axis2.databinding.ADBException("taskID cannot be null!!");
                                    }
                                    elementList.add(localTaskID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "resourceID"));
                            
                            
                                    if (localResourceID==null){
                                         throw new org.apache.axis2.databinding.ADBException("resourceID cannot be null!!");
                                    }
                                    elementList.add(localResourceID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "from"));
                                 
                                        if (localFrom != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFrom));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("from cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "to"));
                                 
                                        if (localTo != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTo));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("to cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_unit"));
                            
                            
                                    elementList.add(localWork_unit==null?null:
                                    localWork_unit);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "participation_in_percent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_percent));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_in_percent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_in_percent));
                            
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "calculated_work_in_percent"));
                            
                            
                                    if (localCalculated_work_in_percent==null){
                                         throw new org.apache.axis2.databinding.ADBException("calculated_work_in_percent cannot be null!!");
                                    }
                                    elementList.add(localCalculated_work_in_percent);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "calculated_work"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCalculated_work));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_estimated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_estimated));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_actual"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_actual));
                            
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "roleID"));
                            
                            
                                    if (localRoleID==null){
                                         throw new org.apache.axis2.databinding.ADBException("roleID cannot be null!!");
                                    }
                                    elementList.add(localRoleID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "hasIndividualCosts"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasIndividualCosts));
                            

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
        public static T_TaskResource parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_TaskResource object =
                new T_TaskResource();

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
                    
                            if (!"T_TaskResource".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_TaskResource)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","taskResourceID").equals(reader.getName())){
                                
                                                object.setTaskResourceID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectID").equals(reader.getName())){
                                
                                                object.setProjectID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","taskID").equals(reader.getName())){
                                
                                                object.setTaskID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","resourceID").equals(reader.getName())){
                                
                                                object.setResourceID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","from").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFrom(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","to").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTo(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_unit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setWork_unit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setWork_unit(net.proventis.axis.blueant.project.WorkUnitType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","participation_in_percent").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParticipation_in_percent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_in_percent").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWork_in_percent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","calculated_work_in_percent").equals(reader.getName())){
                                
                                                object.setCalculated_work_in_percent(net.proventis.axis.blueant.base.OptionalDouble.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWork(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","calculated_work").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCalculated_work(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_estimated").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWork_estimated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_actual").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWork_actual(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","roleID").equals(reader.getName())){
                                
                                                object.setRoleID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","hasIndividualCosts").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHasIndividualCosts(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
          