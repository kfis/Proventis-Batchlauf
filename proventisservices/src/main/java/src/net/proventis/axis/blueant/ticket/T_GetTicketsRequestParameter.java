
/**
 * T_GetTicketsRequestParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:47 CEST)
 */
            
                package net.proventis.axis.blueant.ticket;
            

            /**
            *  T_GetTicketsRequestParameter bean class
            */
        
        public  class T_GetTicketsRequestParameter
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = T_GetTicketsRequestParameter
                Namespace URI = http://ticket.blueant.axis.proventis.net/
                Namespace Prefix = ns5
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://ticket.blueant.axis.proventis.net/")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for TicketID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketID(){
                               return localTicketID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketID
                               */
                               public void setTicketID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketID=param;
                                    

                               }
                            

                        /**
                        * field for TicketNr
                        */

                        
                                    protected java.lang.String localTicketNr ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTicketNr(){
                               return localTicketNr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketNr
                               */
                               public void setTicketNr(java.lang.String param){
                            
                                            this.localTicketNr=param;
                                    

                               }
                            

                        /**
                        * field for TicketDescription
                        */

                        
                                    protected java.lang.String localTicketDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTicketDescription(){
                               return localTicketDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketDescription
                               */
                               public void setTicketDescription(java.lang.String param){
                            
                                            this.localTicketDescription=param;
                                    

                               }
                            

                        /**
                        * field for ClientID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localClientID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getClientID(){
                               return localClientID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientID
                               */
                               public void setClientID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localClientID=param;
                                    

                               }
                            

                        /**
                        * field for ClientSub
                        */

                        
                                    protected boolean localClientSub ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getClientSub(){
                               return localClientSub;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientSub
                               */
                               public void setClientSub(boolean param){
                            
                                            this.localClientSub=param;
                                    

                               }
                            

                        /**
                        * field for ClientContact
                        */

                        
                                    protected java.lang.String localClientContact ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClientContact(){
                               return localClientContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientContact
                               */
                               public void setClientContact(java.lang.String param){
                            
                                            this.localClientContact=param;
                                    

                               }
                            

                        /**
                        * field for TicketTypeID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketTypeID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketTypeID(){
                               return localTicketTypeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketTypeID
                               */
                               public void setTicketTypeID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketTypeID=param;
                                    

                               }
                            

                        /**
                        * field for TicketPriorityID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketPriorityID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketPriorityID(){
                               return localTicketPriorityID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketPriorityID
                               */
                               public void setTicketPriorityID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketPriorityID=param;
                                    

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
                        * field for TicketTopicID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketTopicID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketTopicID(){
                               return localTicketTopicID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketTopicID
                               */
                               public void setTicketTopicID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketTopicID=param;
                                    

                               }
                            

                        /**
                        * field for Responsible
                        */

                        
                                    protected java.lang.String localResponsible ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResponsible(){
                               return localResponsible;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Responsible
                               */
                               public void setResponsible(java.lang.String param){
                            
                                            this.localResponsible=param;
                                    

                               }
                            

                        /**
                        * field for TicketSLAID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketSLAID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketSLAID(){
                               return localTicketSLAID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketSLAID
                               */
                               public void setTicketSLAID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketSLAID=param;
                                    

                               }
                            

                        /**
                        * field for TicketStateID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTicketStateID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTicketStateID(){
                               return localTicketStateID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TicketStateID
                               */
                               public void setTicketStateID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTicketStateID=param;
                                    

                               }
                            

                        /**
                        * field for TimeRequestBefore
                        */

                        
                                    protected java.util.Calendar localTimeRequestBefore ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeRequestBefore(){
                               return localTimeRequestBefore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeRequestBefore
                               */
                               public void setTimeRequestBefore(java.util.Calendar param){
                            
                                            this.localTimeRequestBefore=param;
                                    

                               }
                            

                        /**
                        * field for TimeRequestAfter
                        */

                        
                                    protected java.util.Calendar localTimeRequestAfter ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeRequestAfter(){
                               return localTimeRequestAfter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeRequestAfter
                               */
                               public void setTimeRequestAfter(java.util.Calendar param){
                            
                                            this.localTimeRequestAfter=param;
                                    

                               }
                            

                        /**
                        * field for TimeFinishedBefore
                        */

                        
                                    protected java.util.Calendar localTimeFinishedBefore ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeFinishedBefore(){
                               return localTimeFinishedBefore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeFinishedBefore
                               */
                               public void setTimeFinishedBefore(java.util.Calendar param){
                            
                                            this.localTimeFinishedBefore=param;
                                    

                               }
                            

                        /**
                        * field for TimeFinishedAfter
                        */

                        
                                    protected java.util.Calendar localTimeFinishedAfter ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimeFinishedAfter(){
                               return localTimeFinishedAfter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeFinishedAfter
                               */
                               public void setTimeFinishedAfter(java.util.Calendar param){
                            
                                            this.localTimeFinishedAfter=param;
                                    

                               }
                            

                        /**
                        * field for CreatedBefore
                        */

                        
                                    protected java.util.Calendar localCreatedBefore ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedBefore(){
                               return localCreatedBefore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedBefore
                               */
                               public void setCreatedBefore(java.util.Calendar param){
                            
                                            this.localCreatedBefore=param;
                                    

                               }
                            

                        /**
                        * field for CreatedAfter
                        */

                        
                                    protected java.util.Calendar localCreatedAfter ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedAfter(){
                               return localCreatedAfter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedAfter
                               */
                               public void setCreatedAfter(java.util.Calendar param){
                            
                                            this.localCreatedAfter=param;
                                    

                               }
                            

                        /**
                        * field for Creator
                        */

                        
                                    protected java.lang.String localCreator ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCreator(){
                               return localCreator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Creator
                               */
                               public void setCreator(java.lang.String param){
                            
                                            this.localCreator=param;
                                    

                               }
                            

                        /**
                        * field for Comment
                        */

                        
                                    protected java.lang.String localComment ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComment(){
                               return localComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comment
                               */
                               public void setComment(java.lang.String param){
                            
                                            this.localComment=param;
                                    

                               }
                            

                        /**
                        * field for IncludeComments
                        */

                        
                                    protected boolean localIncludeComments ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeComments(){
                               return localIncludeComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeComments
                               */
                               public void setIncludeComments(boolean param){
                            
                                            this.localIncludeComments=param;
                                    

                               }
                            

                        /**
                        * field for IncludeDocuments
                        */

                        
                                    protected boolean localIncludeDocuments ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIncludeDocuments(){
                               return localIncludeDocuments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IncludeDocuments
                               */
                               public void setIncludeDocuments(boolean param){
                            
                                            this.localIncludeDocuments=param;
                                    

                               }
                            

                        /**
                        * field for ParticipationType
                        */

                        
                                    protected net.proventis.axis.blueant.ticket.T_GetTicketRequestParticipationTypeType localParticipationType ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.ticket.T_GetTicketRequestParticipationTypeType
                           */
                           public  net.proventis.axis.blueant.ticket.T_GetTicketRequestParticipationTypeType getParticipationType(){
                               return localParticipationType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParticipationType
                               */
                               public void setParticipationType(net.proventis.axis.blueant.ticket.T_GetTicketRequestParticipationTypeType param){
                            
                                            this.localParticipationType=param;
                                    

                               }
                            

                        /**
                        * field for WithArchive
                        */

                        
                                    protected boolean localWithArchive ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getWithArchive(){
                               return localWithArchive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WithArchive
                               */
                               public void setWithArchive(boolean param){
                            
                                            this.localWithArchive=param;
                                    

                               }
                            

                        /**
                        * field for TimeReactionExceeded
                        */

                        
                                    protected boolean localTimeReactionExceeded ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTimeReactionExceeded(){
                               return localTimeReactionExceeded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeReactionExceeded
                               */
                               public void setTimeReactionExceeded(boolean param){
                            
                                            this.localTimeReactionExceeded=param;
                                    

                               }
                            

                        /**
                        * field for TimeFinishExceeded
                        */

                        
                                    protected boolean localTimeFinishExceeded ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTimeFinishExceeded(){
                               return localTimeFinishExceeded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeFinishExceeded
                               */
                               public void setTimeFinishExceeded(boolean param){
                            
                                            this.localTimeFinishExceeded=param;
                                    

                               }
                            

                        /**
                        * field for TimeWarningExceeded
                        */

                        
                                    protected boolean localTimeWarningExceeded ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTimeWarningExceeded(){
                               return localTimeWarningExceeded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeWarningExceeded
                               */
                               public void setTimeWarningExceeded(boolean param){
                            
                                            this.localTimeWarningExceeded=param;
                                    

                               }
                            

                        /**
                        * field for Overbooked
                        */

                        
                                    protected boolean localOverbooked ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getOverbooked(){
                               return localOverbooked;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Overbooked
                               */
                               public void setOverbooked(boolean param){
                            
                                            this.localOverbooked=param;
                                    

                               }
                            

                        /**
                        * field for Delayed
                        */

                        
                                    protected boolean localDelayed ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDelayed(){
                               return localDelayed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Delayed
                               */
                               public void setDelayed(boolean param){
                            
                                            this.localDelayed=param;
                                    

                               }
                            

                        /**
                        * field for TeamID
                        */

                        
                                    protected net.proventis.axis.blueant.base.Id localTeamID ;
                                

                           /**
                           * Auto generated getter method
                           * @return net.proventis.axis.blueant.base.Id
                           */
                           public  net.proventis.axis.blueant.base.Id getTeamID(){
                               return localTeamID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TeamID
                               */
                               public void setTeamID(net.proventis.axis.blueant.base.Id param){
                            
                                            this.localTeamID=param;
                                    

                               }
                            

                        /**
                        * field for ParticipantName
                        */

                        
                                    protected java.lang.String localParticipantName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getParticipantName(){
                               return localParticipantName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ParticipantName
                               */
                               public void setParticipantName(java.lang.String param){
                            
                                            this.localParticipantName=param;
                                    

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
                       T_GetTicketsRequestParameter.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ticket.blueant.axis.proventis.net/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":T_GetTicketsRequestParameter",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "T_GetTicketsRequestParameter",
                           xmlWriter);
                   }

               
                   }
               
                                    if (localTicketID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketID"),
                                        factory,xmlWriter);
                                    }
                                
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
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTicketNr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTicketDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localClientID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"clientID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"clientID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("clientID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localClientID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"clientSub", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"clientSub");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("clientSub");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientSub));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"clientContact", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"clientContact");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("clientContact");
                                    }
                                

                                          if (localClientContact==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClientContact);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localTicketTypeID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketTypeID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketTypeID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketTypeID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketTypeID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTypeID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localTicketPriorityID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketPriorityID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketPriorityID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketPriorityID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketPriorityID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketPriorityID"),
                                        factory,xmlWriter);
                                    }
                                
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

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketTopicID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketTopicID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketTopicID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketTopicID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTopicID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"responsible", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"responsible");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("responsible");
                                    }
                                

                                          if (localResponsible==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResponsible);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localTicketSLAID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketSLAID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketSLAID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketSLAID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketSLAID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketSLAID"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localTicketStateID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ticketStateID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ticketStateID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ticketStateID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTicketStateID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketStateID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeRequestBefore", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeRequestBefore");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeRequestBefore");
                                    }
                                

                                          if (localTimeRequestBefore==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeRequestBefore));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeRequestAfter", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeRequestAfter");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeRequestAfter");
                                    }
                                

                                          if (localTimeRequestAfter==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeRequestAfter));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeFinishedBefore", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeFinishedBefore");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeFinishedBefore");
                                    }
                                

                                          if (localTimeFinishedBefore==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishedBefore));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeFinishedAfter", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeFinishedAfter");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeFinishedAfter");
                                    }
                                

                                          if (localTimeFinishedAfter==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishedAfter));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"createdBefore", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"createdBefore");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("createdBefore");
                                    }
                                

                                          if (localCreatedBefore==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedBefore));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"createdAfter", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"createdAfter");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("createdAfter");
                                    }
                                

                                          if (localCreatedAfter==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedAfter));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"creator", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"creator");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("creator");
                                    }
                                

                                          if (localCreator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCreator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"comment", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"comment");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("comment");
                                    }
                                

                                          if (localComment==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"includeComments", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"includeComments");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("includeComments");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeComments));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"includeDocuments", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"includeDocuments");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("includeDocuments");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDocuments));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localParticipationType==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"participationType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"participationType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("participationType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParticipationType.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","participationType"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"withArchive", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"withArchive");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("withArchive");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("withArchive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWithArchive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeReactionExceeded", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeReactionExceeded");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeReactionExceeded");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("timeReactionExceeded cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeReactionExceeded));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeFinishExceeded", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeFinishExceeded");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeFinishExceeded");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishExceeded));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"timeWarningExceeded", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"timeWarningExceeded");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("timeWarningExceeded");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeWarningExceeded));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"overbooked", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"overbooked");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("overbooked");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverbooked));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"delayed", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"delayed");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("delayed");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDelayed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localTeamID==null){

                                            java.lang.String namespace2 = "http://ticket.blueant.axis.proventis.net/";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"teamID", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"teamID");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("teamID");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTeamID.serialize(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","teamID"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://ticket.blueant.axis.proventis.net/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"participantName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"participantName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("participantName");
                                    }
                                

                                          if (localParticipantName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localParticipantName);
                                            
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

                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketID"));
                            
                            
                                    elementList.add(localTicketID==null?null:
                                    localTicketID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketNr"));
                                 
                                         elementList.add(localTicketNr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketNr));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketDescription"));
                                 
                                         elementList.add(localTicketDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTicketDescription));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientID"));
                            
                            
                                    elementList.add(localClientID==null?null:
                                    localClientID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientSub"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientSub));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "clientContact"));
                                 
                                         elementList.add(localClientContact==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientContact));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketTypeID"));
                            
                            
                                    elementList.add(localTicketTypeID==null?null:
                                    localTicketTypeID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketPriorityID"));
                            
                            
                                    elementList.add(localTicketPriorityID==null?null:
                                    localTicketPriorityID);
                                
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
                            
                            
                                    elementList.add(localTicketTopicID==null?null:
                                    localTicketTopicID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "responsible"));
                                 
                                         elementList.add(localResponsible==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponsible));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketSLAID"));
                            
                            
                                    elementList.add(localTicketSLAID==null?null:
                                    localTicketSLAID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "ticketStateID"));
                            
                            
                                    elementList.add(localTicketStateID==null?null:
                                    localTicketStateID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeRequestBefore"));
                                 
                                         elementList.add(localTimeRequestBefore==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeRequestBefore));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeRequestAfter"));
                                 
                                         elementList.add(localTimeRequestAfter==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeRequestAfter));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeFinishedBefore"));
                                 
                                         elementList.add(localTimeFinishedBefore==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishedBefore));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeFinishedAfter"));
                                 
                                         elementList.add(localTimeFinishedAfter==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishedAfter));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "createdBefore"));
                                 
                                         elementList.add(localCreatedBefore==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedBefore));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "createdAfter"));
                                 
                                         elementList.add(localCreatedAfter==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedAfter));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "creator"));
                                 
                                         elementList.add(localCreator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreator));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "comment"));
                                 
                                         elementList.add(localComment==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComment));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "includeComments"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeComments));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "includeDocuments"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeDocuments));
                            
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "participationType"));
                            
                            
                                    elementList.add(localParticipationType==null?null:
                                    localParticipationType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "withArchive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWithArchive));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeReactionExceeded"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeReactionExceeded));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeFinishExceeded"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeFinishExceeded));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "timeWarningExceeded"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeWarningExceeded));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "overbooked"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverbooked));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "delayed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDelayed));
                            
                            elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "teamID"));
                            
                            
                                    elementList.add(localTeamID==null?null:
                                    localTeamID);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/",
                                                                      "participantName"));
                                 
                                         elementList.add(localParticipantName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localParticipantName));
                                    

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
        public static T_GetTicketsRequestParameter parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            T_GetTicketsRequestParameter object =
                new T_GetTicketsRequestParameter();

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
                    
                            if (!"T_GetTicketsRequestParameter".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (T_GetTicketsRequestParameter)net.proventis.axis.blueant.exception.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketNr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTicketNr(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketDescription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTicketDescription(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setClientID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setClientID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientSub").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientSub(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","clientContact").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientContact(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTypeID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketTypeID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketTypeID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketPriorityID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketPriorityID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketPriorityID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
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
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
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
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketTopicID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketTopicID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketTopicID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","responsible").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponsible(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketSLAID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketSLAID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketSLAID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","ticketStateID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTicketStateID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTicketStateID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeRequestBefore").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeRequestBefore(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeRequestAfter").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeRequestAfter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeFinishedBefore").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeFinishedBefore(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeFinishedAfter").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeFinishedAfter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","createdBefore").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedBefore(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","createdAfter").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedAfter(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","creator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreator(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","comment").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComment(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","includeComments").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIncludeComments(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","includeDocuments").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIncludeDocuments(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","participationType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParticipationType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParticipationType(net.proventis.axis.blueant.ticket.T_GetTicketRequestParticipationTypeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","withArchive").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWithArchive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeReactionExceeded").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeReactionExceeded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeFinishExceeded").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeFinishExceeded(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","timeWarningExceeded").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimeWarningExceeded(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","overbooked").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOverbooked(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","delayed").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDelayed(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","teamID").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTeamID(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTeamID(net.proventis.axis.blueant.base.Id.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ticket.blueant.axis.proventis.net/","participantName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setParticipantName(
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
           
          