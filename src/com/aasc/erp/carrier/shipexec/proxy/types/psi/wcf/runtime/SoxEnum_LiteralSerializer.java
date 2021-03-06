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

public class SoxEnum_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_Name_QNAME = new QName("http://PSI.Wcf", "Name");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_Properties_QNAME = new QName("http://PSI.Wcf", "Properties");
    private static final QName ns1_ArrayOfSoxProperty_TYPE_QNAME = new QName("http://PSI.Wcf", "ArrayOfSoxProperty");
    private CombinedSerializer myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer;
    
    public SoxEnum_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public SoxEnum_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxProperty.class, ns1_ArrayOfSoxProperty_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        for (int memberIndex = 0; memberIndex <2; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Name_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Name_QNAME, reader, context);
                requiredElements.remove("Name");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Properties_QNAME))) {
                myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer.setNullable( false );
                member = myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer.deserialize(ns1_Properties_QNAME, reader, context);
                requiredElements.remove("Properties");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setProperties((member == null)? null : ((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxProperty)member).toArray());
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum)obj;
        
        if (instance.getName() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getName(), ns1_Name_QNAME, null, writer, context);
        }
        if (instance.getProperties() != null) {
            myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer.setNullable( false );
            com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxProperty instanceGetProperties_arrayWrapper = (instance.getProperties() == null) ? null : new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfSoxProperty(instance.getProperties());
            myns1_ArrayOfSoxProperty__ArrayOfSoxProperty_LiteralSerializer.serialize(instanceGetProperties_arrayWrapper, ns1_Properties_QNAME, null, writer, context);
        }
    }
}
