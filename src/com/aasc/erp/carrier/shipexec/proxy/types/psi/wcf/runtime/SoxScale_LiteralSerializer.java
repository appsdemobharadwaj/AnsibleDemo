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

public class SoxScale_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_model_QNAME = new QName("http://PSI.Wcf", "model");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_port_QNAME = new QName("http://PSI.Wcf", "port");
    private static final QName ns1_enabled_QNAME = new QName("http://PSI.Wcf", "enabled");
    private static final QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer myns2__boolean__boolean_Boolean_Serializer;
    private static final QName ns1_name_QNAME = new QName("http://PSI.Wcf", "name");
    private static final QName ns1_usbVid_QNAME = new QName("http://PSI.Wcf", "usbVid");
    private static final QName ns1_usbPid_QNAME = new QName("http://PSI.Wcf", "usbPid");
    private static final QName ns1_baudRate_QNAME = new QName("http://PSI.Wcf", "baudRate");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__int_Int_Serializer;
    private static final QName ns1_dataBits_QNAME = new QName("http://PSI.Wcf", "dataBits");
    private static final QName ns1_parity_QNAME = new QName("http://PSI.Wcf", "parity");
    private static final QName ns1_stopBits_QNAME = new QName("http://PSI.Wcf", "stopBits");
    private static final QName ns1_requestCommand_QNAME = new QName("http://PSI.Wcf", "requestCommand");
    private static final QName ns1_requestTimeout_QNAME = new QName("http://PSI.Wcf", "requestTimeout");
    
    public SoxScale_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public SoxScale_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns2__boolean__boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer("", boolean.class, ns2_boolean_TYPE_QNAME);
        myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("enabled");
        requiredElements.add("baudRate");
        requiredElements.add("dataBits");
        requiredElements.add("requestTimeout");
        for (int memberIndex = 0; memberIndex <12; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_model_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_model_QNAME, reader, context);
                requiredElements.remove("model");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setModel((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_port_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_port_QNAME, reader, context);
                requiredElements.remove("port");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPort((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_enabled_QNAME))) {
                myns2__boolean__boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__boolean_Boolean_Serializer.deserialize(ns1_enabled_QNAME, reader, context);
                requiredElements.remove("enabled");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setEnabled(((Boolean)member).booleanValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_name_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_name_QNAME, reader, context);
                requiredElements.remove("name");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_usbVid_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_usbVid_QNAME, reader, context);
                requiredElements.remove("usbVid");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setUsbVid((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_usbPid_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_usbPid_QNAME, reader, context);
                requiredElements.remove("usbPid");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setUsbPid((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_baudRate_QNAME))) {
                myns2__int__int_Int_Serializer.setNullable( false );
                member = myns2__int__int_Int_Serializer.deserialize(ns1_baudRate_QNAME, reader, context);
                requiredElements.remove("baudRate");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setBaudRate(((Integer)member).intValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dataBits_QNAME))) {
                myns2__int__int_Int_Serializer.setNullable( false );
                member = myns2__int__int_Int_Serializer.deserialize(ns1_dataBits_QNAME, reader, context);
                requiredElements.remove("dataBits");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDataBits(((Integer)member).intValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_parity_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_parity_QNAME, reader, context);
                requiredElements.remove("parity");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setParity((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_stopBits_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_stopBits_QNAME, reader, context);
                requiredElements.remove("stopBits");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setStopBits((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_requestCommand_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_requestCommand_QNAME, reader, context);
                requiredElements.remove("requestCommand");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setRequestCommand((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_requestTimeout_QNAME))) {
                myns2__int__int_Int_Serializer.setNullable( false );
                member = myns2__int__int_Int_Serializer.deserialize(ns1_requestTimeout_QNAME, reader, context);
                requiredElements.remove("requestTimeout");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setRequestTimeout(((Integer)member).intValue());
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxScale)obj;
        
        if (instance.getModel() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getModel(), ns1_model_QNAME, null, writer, context);
        }
        if (instance.getPort() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getPort(), ns1_port_QNAME, null, writer, context);
        }
        myns2__boolean__boolean_Boolean_Serializer.setNullable( false );
        myns2__boolean__boolean_Boolean_Serializer.serialize(new Boolean(instance.isEnabled()), ns1_enabled_QNAME, null, writer, context);
        if (instance.getName() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getName(), ns1_name_QNAME, null, writer, context);
        }
        if (instance.getUsbVid() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getUsbVid(), ns1_usbVid_QNAME, null, writer, context);
        }
        if (instance.getUsbPid() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getUsbPid(), ns1_usbPid_QNAME, null, writer, context);
        }
        myns2__int__int_Int_Serializer.setNullable( false );
        myns2__int__int_Int_Serializer.serialize(new Integer(instance.getBaudRate()), ns1_baudRate_QNAME, null, writer, context);
        myns2__int__int_Int_Serializer.setNullable( false );
        myns2__int__int_Int_Serializer.serialize(new Integer(instance.getDataBits()), ns1_dataBits_QNAME, null, writer, context);
        if (instance.getParity() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getParity(), ns1_parity_QNAME, null, writer, context);
        }
        if (instance.getStopBits() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getStopBits(), ns1_stopBits_QNAME, null, writer, context);
        }
        if (instance.getRequestCommand() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getRequestCommand(), ns1_requestCommand_QNAME, null, writer, context);
        }
        myns2__int__int_Int_Serializer.setNullable( false );
        myns2__int__int_Int_Serializer.serialize(new Integer(instance.getRequestTimeout()), ns1_requestTimeout_QNAME, null, writer, context);
    }
}
