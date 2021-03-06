// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.encoding.simpletype.*;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPEnvelopeConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import oracle.j2ee.ws.common.util.xml.UUID;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.AttachmentPart;

public class ArrayOfTrackingEvent_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_TrackingEvent_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "TrackingEvent");
    private static final QName ns1_TrackingEvent_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "TrackingEvent");
    private CombinedSerializer myns1_TrackingEvent__TrackingEvent_LiteralSerializer;
    
    public ArrayOfTrackingEvent_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public ArrayOfTrackingEvent_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_TrackingEvent__TrackingEvent_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.TrackingEvent.class, ns1_TrackingEvent_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent instance = new com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_TrackingEvent_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_TrackingEvent_QNAME))) {
                    myns1_TrackingEvent__TrackingEvent_LiteralSerializer.setNullable( true );
                    value = myns1_TrackingEvent__TrackingEvent_LiteralSerializer.deserialize(ns1_TrackingEvent_QNAME, reader, context);
                    requiredElements.remove("TrackingEvent");
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[values.size()];
            member = values.toArray((java.lang.Object[]) member);
            instance.setTrackingEvent((com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[])member);
        }
        else {
            if (instance.getTrackingEvent() == null)
            instance.setTrackingEvent(new com.aasc.erp.carrier.stampsws.proxy.TrackingEvent[0]);
        }
        if (!requiredElements.isEmpty()) {
            throw new DeserializationException( "literal.expectedElementName" , requiredElements.iterator().next().toString(), DeserializationException.FAULT_CODE_CLIENT );
        }
        
        if( reader.getState() != XMLReader.END)
        {
            reader.skipElement();
        }
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object)instance;
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent instance = (com.aasc.erp.carrier.stampsws.proxy.ArrayOfTrackingEvent)obj;
        
        if (instance.getTrackingEvent() != null) {
            for (int i = 0; i < instance.getTrackingEvent().length; ++i) {
                myns1_TrackingEvent__TrackingEvent_LiteralSerializer.setNullable( true );
                myns1_TrackingEvent__TrackingEvent_LiteralSerializer.serialize(instance.getTrackingEvent()[i], ns1_TrackingEvent_QNAME, null, writer, context);
            }
        }
    }
}
