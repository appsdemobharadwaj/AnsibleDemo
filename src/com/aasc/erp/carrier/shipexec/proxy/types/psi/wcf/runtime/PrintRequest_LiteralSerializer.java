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

public class PrintRequest_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_msn_QNAME = new QName("http://PSI.Wcf", "msn");
    private static final QName ns2_long_TYPE_QNAME = SchemaConstants.QNAME_TYPE_LONG;
    private CombinedSerializer myns2__long__java_lang_Long_Long_Serializer;
    private static final QName ns1_global_msn_QNAME = new QName("http://PSI.Wcf", "global_msn");
    private static final QName ns1_global_bundle_id_QNAME = new QName("http://PSI.Wcf", "global_bundle_id");
    private static final QName ns1_bundle_id_QNAME = new QName("http://PSI.Wcf", "bundle_id");
    private static final QName ns1_group_id_QNAME = new QName("http://PSI.Wcf", "group_id");
    private static final QName ns1_packagelist_id_QNAME = new QName("http://PSI.Wcf", "packagelist_id");
    private static final QName ns1_container_code_QNAME = new QName("http://PSI.Wcf", "container_code");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_shipFile_id_QNAME = new QName("http://PSI.Wcf", "shipFile_id");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__java_lang_Integer_Int_Serializer;
    private static final QName ns1_carrier_QNAME = new QName("http://PSI.Wcf", "carrier");
    private static final QName ns1_service_QNAME = new QName("http://PSI.Wcf", "service");
    private static final QName ns1_shipper_QNAME = new QName("http://PSI.Wcf", "shipper");
    private static final QName ns1_shipdate_QNAME = new QName("http://PSI.Wcf", "shipdate");
    private static final QName ns1_printProfile_id_QNAME = new QName("http://PSI.Wcf", "printProfile_id");
    private static final QName ns1_configurationName_QNAME = new QName("http://PSI.Wcf", "configurationName");
    private static final QName ns1_nofn_sequence_QNAME = new QName("http://PSI.Wcf", "nofn_sequence");
    private static final QName ns1_nofn_total_QNAME = new QName("http://PSI.Wcf", "nofn_total");
    
    public PrintRequest_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public PrintRequest_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2__long__java_lang_Long_Long_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Long.class, ns2_long_TYPE_QNAME);
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns2__int__java_lang_Integer_Int_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Integer.class, ns2_int_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        for (int memberIndex = 0; memberIndex <16; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_msn_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_msn_QNAME, reader, context);
                requiredElements.remove("msn");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setMsn((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_global_msn_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_global_msn_QNAME, reader, context);
                requiredElements.remove("global_msn");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setGlobal_msn((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_global_bundle_id_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_global_bundle_id_QNAME, reader, context);
                requiredElements.remove("global_bundle_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setGlobal_bundle_id((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_bundle_id_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_bundle_id_QNAME, reader, context);
                requiredElements.remove("bundle_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setBundle_id((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_group_id_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_group_id_QNAME, reader, context);
                requiredElements.remove("group_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setGroup_id((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_packagelist_id_QNAME))) {
                myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
                member = myns2__long__java_lang_Long_Long_Serializer.deserialize(ns1_packagelist_id_QNAME, reader, context);
                requiredElements.remove("packagelist_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPackagelist_id((java.lang.Long)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_container_code_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_container_code_QNAME, reader, context);
                requiredElements.remove("container_code");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setContainer_code((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_shipFile_id_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_shipFile_id_QNAME, reader, context);
                requiredElements.remove("shipFile_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setShipFile_id((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
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
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_service_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_service_QNAME, reader, context);
                requiredElements.remove("service");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setService((java.lang.String)member);
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
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_shipdate_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_shipdate_QNAME, reader, context);
                requiredElements.remove("shipdate");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setShipdate((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_printProfile_id_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_printProfile_id_QNAME, reader, context);
                requiredElements.remove("printProfile_id");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPrintProfile_id((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_configurationName_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_configurationName_QNAME, reader, context);
                requiredElements.remove("configurationName");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setConfigurationName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_nofn_sequence_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_nofn_sequence_QNAME, reader, context);
                requiredElements.remove("nofn_sequence");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setNofn_sequence((java.lang.Integer)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_nofn_total_QNAME))) {
                myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
                member = myns2__int__java_lang_Integer_Int_Serializer.deserialize(ns1_nofn_total_QNAME, reader, context);
                requiredElements.remove("nofn_total");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setNofn_total((java.lang.Integer)member);
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest)obj;
        
        if (instance.getMsn() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getMsn(), ns1_msn_QNAME, null, writer, context);
        }
        if (instance.getGlobal_msn() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getGlobal_msn(), ns1_global_msn_QNAME, null, writer, context);
        }
        if (instance.getGlobal_bundle_id() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getGlobal_bundle_id(), ns1_global_bundle_id_QNAME, null, writer, context);
        }
        if (instance.getBundle_id() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getBundle_id(), ns1_bundle_id_QNAME, null, writer, context);
        }
        if (instance.getGroup_id() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getGroup_id(), ns1_group_id_QNAME, null, writer, context);
        }
        if (instance.getPackagelist_id() != null) {
            myns2__long__java_lang_Long_Long_Serializer.setNullable( false );
            myns2__long__java_lang_Long_Long_Serializer.serialize(instance.getPackagelist_id(), ns1_packagelist_id_QNAME, null, writer, context);
        }
        if (instance.getContainer_code() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getContainer_code(), ns1_container_code_QNAME, null, writer, context);
        }
        if (instance.getShipFile_id() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getShipFile_id(), ns1_shipFile_id_QNAME, null, writer, context);
        }
        if (instance.getCarrier() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getCarrier(), ns1_carrier_QNAME, null, writer, context);
        }
        if (instance.getService() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getService(), ns1_service_QNAME, null, writer, context);
        }
        if (instance.getShipper() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getShipper(), ns1_shipper_QNAME, null, writer, context);
        }
        if (instance.getShipdate() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getShipdate(), ns1_shipdate_QNAME, null, writer, context);
        }
        if (instance.getPrintProfile_id() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getPrintProfile_id(), ns1_printProfile_id_QNAME, null, writer, context);
        }
        if (instance.getConfigurationName() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getConfigurationName(), ns1_configurationName_QNAME, null, writer, context);
        }
        if (instance.getNofn_sequence() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getNofn_sequence(), ns1_nofn_sequence_QNAME, null, writer, context);
        }
        if (instance.getNofn_total() != null) {
            myns2__int__java_lang_Integer_Int_Serializer.setNullable( false );
            myns2__int__java_lang_Integer_Int_Serializer.serialize(instance.getNofn_total(), ns1_nofn_total_QNAME, null, writer, context);
        }
    }
}