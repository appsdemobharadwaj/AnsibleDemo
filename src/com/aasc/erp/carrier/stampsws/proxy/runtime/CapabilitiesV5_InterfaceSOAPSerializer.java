// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy.runtime;

import oracle.j2ee.ws.common.encoding.*;
import oracle.j2ee.ws.common.encoding.literal.DetailFragmentDeserializer;
import oracle.j2ee.ws.common.soap.SOAPEncodingConstants;
import oracle.j2ee.ws.common.soap.SOAPVersion;
import oracle.j2ee.ws.common.streaming.*;
import oracle.j2ee.ws.common.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class CapabilitiesV5_InterfaceSOAPSerializer extends InterfaceSerializerBase implements Initializable {
    private static final QName ns1_CapabilitiesV7_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CapabilitiesV7");
    private CombinedSerializer myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer;
    private static final QName ns1_CapabilitiesV6_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CapabilitiesV6");
    private CombinedSerializer myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer;
    private CombinedSerializer myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer;
    
    public CapabilitiesV5_InterfaceSOAPSerializer(QName type, boolean encodeType, boolean isNullable, SOAPVersion soapVersion) {
        super(type, encodeType, isNullable, soapVersion);
    }
    public CapabilitiesV5_InterfaceSOAPSerializer(QName type, boolean encodeType) {
        super(type, encodeType, true, null);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV7.class, ns1_CapabilitiesV7_TYPE_QNAME);
        myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer = myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer.getInnermostSerializer();
        myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV6.class, ns1_CapabilitiesV6_TYPE_QNAME);
        myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer = myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer.getInnermostSerializer();
        QName type = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CapabilitiesV5");
        CombinedSerializer interfaceSerializer = new com.aasc.erp.carrier.stampsws.proxy.runtime.CapabilitiesV5_LiteralSerializer(type, ENCODE_TYPE);
        myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer = interfaceSerializer.getInnermostSerializer();
        if (myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer instanceof Initializable) {
            ((Initializable)myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer).initialize(registry);
        }
    }
    
    public java.lang.Object doDeserialize(QName name, XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        QName elementType = getType(reader);
        if (elementType != null && elementType.equals(myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer.getXmlType())) {
            return myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer.deserialize(name, reader, context);
        } else if (elementType != null && elementType.equals(myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer.getXmlType())) {
            return myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer.deserialize(name, reader, context);
        } else if (elementType == null || elementType.equals(myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer.getXmlType())) {
            java.lang.Object obj = myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer.deserialize(name, reader, context);
            return obj;
        }
        throw new DeserializationException("soap.unexpectedElementType", new java.lang.Object[] {"", elementType.toString()},DeserializationException.FAULT_CODE_CLIENT);
    }
    
    public void doSerializeInstance(java.lang.Object obj, QName name, SerializerCallback callback,
        XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV5 instance = (com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV5)obj;
        
        if (obj instanceof com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV7) {
            myns1_CapabilitiesV7__CapabilitiesV7_LiteralSerializer.serialize(obj, name, callback, writer, context);
        } else if (obj instanceof com.aasc.erp.carrier.stampsws.proxy.CapabilitiesV6) {
            myns1_CapabilitiesV6__CapabilitiesV6_InterfaceSOAPSerializer.serialize(obj, name, callback, writer, context);
        } else {
            myns1_CapabilitiesV5__CapabilitiesV5_LiteralSerializer.serialize(obj, name, callback, writer, context);
        }
    }
}