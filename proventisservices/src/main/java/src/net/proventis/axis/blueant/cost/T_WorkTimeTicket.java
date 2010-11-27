
/**
 * T_WorkTimeTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.cost;
            

            /**
            *  T_WorkTimeTicket bean class
            */
        
        public  class T_WorkTimeTicket extends net.proventis.axis.blueant.ticket.T_Ticket
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_WorkTimeTicket
                Namespace URI = http://cost.blueant.axis.proventis.net/
                Namespace Prefix = ns6
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://cost.blueant.axis.proventis.net/")){
                return "ns6";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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
                       T_WorkTimeTicket.this.serialize(parentQName,factory,xmlWriter);
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
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://cost.blueant.axis.proventis.net/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":T_WorkTimeTicket",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_WorkTimeTicket",
                           xmlWriter);
                   }

               
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ticketDescription", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ticketDescription");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ticketDescription");
                                    }
                                

                                          if (localTicketDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ticketDescription cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTicketDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localClientID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("clientID cannot be null!!");
                                            }
                                           localClientID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientID"),
                                               factory,xmlWriter);
                                        
                                            if (localTicketTypeID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketTypeID cannot be null!!");
                                            }
                                           localTicketTypeID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTypeID"),
                                               factory,xmlWriter);
                                        
                                            if (localTicketPriorityID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketPriorityID cannot be null!!");
                                            }
                                           localTicketPriorityID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketPriorityID"),
                                               factory,xmlWriter);
                                        
                                    if (localProjectID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

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
                                     localProjectID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","projectID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localTaskID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"taskID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"taskID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("taskID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaskID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","taskID"),
                                        factory,xmlWriter);
                                    }
                                
                                            if (localTicketTopicID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketTopicID cannot be null!!");
                                            }
                                           localTicketTopicID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTopicID"),
                                               factory,xmlWriter);
                                        
                                            if (localTicketSLAID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketSLAID cannot be null!!");
                                            }
                                           localTicketSLAID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketSLAID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ticketComment", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ticketComment");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ticketComment");
                                    }
                                

                                          if (localTicketComment==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTicketComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localClientContactID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("clientContactID cannot be null!!");
                                            }
                                           localClientContactID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientContactID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"clientContactEmail", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"clientContactEmail");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("clientContactEmail");
                                    }
                                

                                          if (localClientContactEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClientContactEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localResponsibleID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("responsibleID cannot be null!!");
                                            }
                                           localResponsibleID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","responsibleID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeFinish", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeFinish");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeFinish");
                                    }
                                

                                          if (localTimeFinish==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinish));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeFinishRequest", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeFinishRequest");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeFinishRequest");
                                    }
                                

                                          if (localTimeFinishRequest==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishRequest));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeReaction", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeReaction");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeReaction");
                                    }
                                

                                          if (localTimeReaction==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeReaction));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeWarning", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeWarning");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeWarning");
                                    }
                                

                                          if (localTimeWarning==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeWarning));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"planMinutes", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"planMinutes");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("planMinutes");
                                    }
                                
                                               if (java.lang.Double.isNaN(localPlanMinutes)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlanMinutes));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"connectTask", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"connectTask");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("connectTask");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectTask));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localTicketID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketID cannot be null!!");
                                            }
                                           localTicketID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ticketNr", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ticketNr");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ticketNr");
                                    }
                                

                                          if (localTicketNr==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ticketNr cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTicketNr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localTicketStateID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ticketStateID cannot be null!!");
                                            }
                                           localTicketStateID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketStateID"),
                                               factory,xmlWriter);
                                        
                                            if (localCreatorID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("creatorID cannot be null!!");
                                            }
                                           localCreatorID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","creatorID"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"dateCreated", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"dateCreated");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("dateCreated");
                                    }
                                

                                          if (localDateCreated==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("dateCreated cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateCreated));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"isMinutes", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"isMinutes");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("isMinutes");
                                    }
                                
                                               if (java.lang.Double.isNaN(localIsMinutes)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsMinutes));
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://cost.blueant.axis.proventis.net/","T_WorkTimeTicket"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketDescription"));
                                 
                                        if (localTicketDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ticketDescription cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientID"));
                            
                            
                                    if (localClientID==null){
                                         throw new org.apache.axis2.databinding.ADBException("clientID cannot be null!!");
                                    }
                                    elementList.add(localClientID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketTypeID"));
                            
                            
                                    if (localTicketTypeID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketTypeID cannot be null!!");
                                    }
                                    elementList.add(localTicketTypeID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketPriorityID"));
                            
                            
                                    if (localTicketPriorityID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketPriorityID cannot be null!!");
                                    }
                                    elementList.add(localTicketPriorityID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "projectID"));
                            
                            
                                    elementList.add(localProjectID==null?null:
                                    localProjectID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "taskID"));
                            
                            
                                    elementList.add(localTaskID==null?null:
                                    localTaskID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketTopicID"));
                            
                            
                                    if (localTicketTopicID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketTopicID cannot be null!!");
                                    }
                                    elementList.add(localTicketTopicID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketSLAID"));
                            
                            
                                    if (localTicketSLAID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketSLAID cannot be null!!");
                                    }
                                    elementList.add(localTicketSLAID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketComment"));
                                 
                                         elementList.add(localTicketComment==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketComment));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientContactID"));
                            
                            
                                    if (localClientContactID==null){
                                         throw new org.apache.axis2.databinding.ADBException("clientContactID cannot be null!!");
                                    }
                                    elementList.add(localClientContactID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientContactEmail"));
                                 
                                         elementList.add(localClientContactEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientContactEmail));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "responsibleID"));
                            
                            
                                    if (localResponsibleID==null){
                                         throw new org.apache.axis2.databinding.ADBException("responsibleID cannot be null!!");
                                    }
                                    elementList.add(localResponsibleID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeFinish"));
                                 
                                         elementList.add(localTimeFinish==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinish));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeFinishRequest"));
                                 
                                         elementList.add(localTimeFinishRequest==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishRequest));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeReaction"));
                                 
                                         elementList.add(localTimeReaction==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeReaction));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeWarning"));
                                 
                                         elementList.add(localTimeWarning==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeWarning));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "planMinutes"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlanMinutes));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "connectTask"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectTask));
                            
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketID"));
                            
                            
                                    if (localTicketID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketID cannot be null!!");
                                    }
                                    elementList.add(localTicketID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketNr"));
                                 
                                        if (localTicketNr != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketNr));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ticketNr cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketStateID"));
                            
                            
                                    if (localTicketStateID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ticketStateID cannot be null!!");
                                    }
                                    elementList.add(localTicketStateID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "creatorID"));
                            
                            
                                    if (localCreatorID==null){
                                         throw new org.apache.axis2.databinding.ADBException("creatorID cannot be null!!");
                                    }
                                    elementList.add(localCreatorID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "dateCreated"));
                                 
                                        if (localDateCreated != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateCreated));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("dateCreated cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "isMinutes"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsMinutes));
                            

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
        public static T_WorkTimeTicket parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_WorkTimeTicket object =
                new T_WorkTimeTicket();

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
                    
                            if (!"T_WorkTimeTicket".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_WorkTimeTicket)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketDescription").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTicketDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientID").equals(reader.getName())){
                                
                                                object.setClientID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTypeID").equals(reader.getName())){
                                
                                                object.setTicketTypeID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketPriorityID").equals(reader.getName())){
                                
                                                object.setTicketPriorityID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","projectID").equals(reader.getName())){
                                
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
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","taskID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaskID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaskID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTopicID").equals(reader.getName())){
                                
                                                object.setTicketTopicID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketSLAID").equals(reader.getName())){
                                
                                                object.setTicketSLAID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketComment").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTicketComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientContactID").equals(reader.getName())){
                                
                                                object.setClientContactID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientContactEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientContactEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","responsibleID").equals(reader.getName())){
                                
                                                object.setResponsibleID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeFinish").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeFinish(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeFinishRequest").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeFinishRequest(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeReaction").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeReaction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeWarning").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeWarning(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","planMinutes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlanMinutes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setPlanMinutes(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","connectTask").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConnectTask(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketID").equals(reader.getName())){
                                
                                                object.setTicketID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketNr").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTicketNr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketStateID").equals(reader.getName())){
                                
                                                object.setTicketStateID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","creatorID").equals(reader.getName())){
                                
                                                object.setCreatorID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","dateCreated").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateCreated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","isMinutes").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsMinutes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setIsMinutes(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                             else{
                                        // A start element we are not expecting indicates an invalid parameter was passed
                                        throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                             }
                          
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          