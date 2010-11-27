
/**
 * T_ProjectParticipationRelease.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.project;
            

            /**
            *  T_ProjectParticipationRelease bean class
            */
        
        public  class T_ProjectParticipationRelease
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_ProjectParticipationRelease
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
                        * field for ProjectParticipationID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localProjectParticipationID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getProjectParticipationID(){
                               return localProjectParticipationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProjectParticipationID
                               */
                               public void setProjectParticipationID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localProjectParticipationID=param;
                                    

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
                        * field for Work_in_h_or_pt
                        */

                        
                                    protected double localWork_in_h_or_pt ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWork_in_h_or_pt(){
                               return localWork_in_h_or_pt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Work_in_h_or_pt
                               */
                               public void setWork_in_h_or_pt(double param){
                            
                                            this.localWork_in_h_or_pt=param;
                                    

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
                        * field for Participation_in_h_per_week
                        */

                        
                                    protected double localParticipation_in_h_per_week ;
                                

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getParticipation_in_h_per_week(){
                               return localParticipation_in_h_per_week;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Participation_in_h_per_week
                               */
                               public void setParticipation_in_h_per_week(double param){
                            
                                            this.localParticipation_in_h_per_week=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        */

                        
                                    protected net.proventis.axis.blueant.project.ProjectParticipationType localType ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.project.ProjectParticipationType
                           */
                           public  net.proventis.axis.blueant.project.ProjectParticipationType getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(net.proventis.axis.blueant.project.ProjectParticipationType param){
                            
                                            this.localType=param;
                                    

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
                       T_ProjectParticipationRelease.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":T_ProjectParticipationRelease",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_ProjectParticipationRelease",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localProjectParticipationID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("projectParticipationID cannot be null!!");
                                            }
                                           localProjectParticipationID.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectParticipationID"),
                                               factory,xmlWriter);
                                        
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
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_percent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://project.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"work_in_h_or_pt", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"work_in_h_or_pt");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("work_in_h_or_pt");
                                    }
                                
                                               if (java.lang.Double.isNaN(localWork_in_h_or_pt)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_in_h_or_pt));
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

                                            xmlWriter.writeStartElement(prefix,"participation_in_h_per_week", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"participation_in_h_per_week");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("participation_in_h_per_week");
                                    }
                                
                                               if (java.lang.Double.isNaN(localParticipation_in_h_per_week)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_h_per_week));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");
                                            }
                                           localType.serialize(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","type"),
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

                
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "projectParticipationID"));
                            
                            
                                    if (localProjectParticipationID==null){
                                         throw new org.apache.axis2.databinding.ADBException("projectParticipationID cannot be null!!");
                                    }
                                    elementList.add(localProjectParticipationID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "participation_in_percent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_percent));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_in_h_or_pt"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWork_in_h_or_pt));
                            
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "work_unit"));
                            
                            
                                    elementList.add(localWork_unit==null?null:
                                    localWork_unit);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "participation_in_h_per_week"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipation_in_h_per_week));
                            
                            elementList.add(new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/",
                                                                      "type"));
                            
                            
                                    if (localType==null){
                                         throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");
                                    }
                                    elementList.add(localType);
                                

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
        public static T_ProjectParticipationRelease parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_ProjectParticipationRelease object =
                new T_ProjectParticipationRelease();

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
                    
                            if (!"T_ProjectParticipationRelease".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_ProjectParticipationRelease)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","projectParticipationID").equals(reader.getName())){
                                
                                                object.setProjectParticipationID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","participation_in_percent").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParticipation_in_percent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setParticipation_in_percent(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","work_in_h_or_pt").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWork_in_h_or_pt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setWork_in_h_or_pt(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","participation_in_h_per_week").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParticipation_in_h_per_week(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setParticipation_in_h_per_week(java.lang.Double.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://project.blueant.axis.proventis.net/","type").equals(reader.getName())){
                                
                                                object.setType(net.proventis.axis.blueant.project.ProjectParticipationType.Factory.parse(reader));
                                              
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
           
          