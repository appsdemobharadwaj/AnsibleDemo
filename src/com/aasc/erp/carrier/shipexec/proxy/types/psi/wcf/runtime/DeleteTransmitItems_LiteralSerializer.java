// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.runtime;

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

public class DeleteTransmitItems_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_carrier_QNAME = new QName("http://PSI.Wcf", "carrier");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_shipper_QNAME = new QName("http://PSI.Wcf", "shipper");
    private static final QName ns1_itemsToDelete_QNAME = new QName("http://PSI.Wcf", "itemsToDelete");
    private static final QName ns1_ArrayOfString_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfString");
    private CombinedSerializer myns1_ArrayOfString__ArrayOfString_LiteralSerializer;
    
    public DeleteTransmitItems_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public DeleteTransmitItems_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns1_ArrayOfString__ArrayOfString_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfString.class, ns1_ArrayOfString_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        for (int memberIndex = 0; memberIndex <3; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_carrier_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_carrier_QNAME, reader, context);
                requiredElements.remove("carrier");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCarrier((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_shipper_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_shipper_QNAME, reader, context);
                requiredElements.remove("shipper");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setShipper((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_itemsToDelete_QNAME))) {
                myns1_ArrayOfString__ArrayOfString_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfString__ArrayOfString_LiteralSerializer.deserialize(ns1_itemsToDelete_QNAME, reader, context);
                requiredElements.remove("itemsToDelete");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setItemsToDelete((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfString)member).toArray());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DeleteTransmitItems)obj;
        
        if (instance.getCarrier() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getCarrier(), ns1_carrier_QNAME, null, writer, context);
        }
        if (instance.getShipper() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getShipper(), ns1_shipper_QNAME, null, writer, context);
        }
        if (instance.getItemsToDelete() != null) {
            myns1_ArrayOfString__ArrayOfString_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfString instanceGetItemsToDelete_arrayWrapper = (instance.getItemsToDelete() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfString(instance.getItemsToDelete());
            myns1_ArrayOfString__ArrayOfString_LiteralSerializer.serialize(instanceGetItemsToDelete_arrayWrapper, ns1_itemsToDelete_QNAME, null, writer, context);
        }
    }
}