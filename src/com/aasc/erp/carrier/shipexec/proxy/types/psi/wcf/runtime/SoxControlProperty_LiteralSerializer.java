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

public class SoxControlProperty_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_controlID_QNAME = new QName("http://PSI.Wcf", "controlID");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer myns2__int__int_Int_Serializer;
    private static final QName ns1_showControl_QNAME = new QName("http://PSI.Wcf", "showControl");
    private static final QName ns2_boolean_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BOOLEAN;
    private CombinedSerializer myns2__boolean__java_lang_Boolean_Boolean_Serializer;
    private static final QName ns1_caption_QNAME = new QName("http://PSI.Wcf", "caption");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_controlName_QNAME = new QName("http://PSI.Wcf", "controlName");
    private static final QName ns1_associatedControlName_QNAME = new QName("http://PSI.Wcf", "associatedControlName");
    private static final QName ns1_defaultValue_QNAME = new QName("http://PSI.Wcf", "defaultValue");
    private static final QName ns2_anyType_TYPE_QNAME = SchemaConstants.QNAME_TYPE_URTYPE;
    private CombinedSerializer ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer;
    private static final QName ns1_carryForward_QNAME = new QName("http://PSI.Wcf", "carryForward");
    private static final QName ns1_carryForwardShipment_QNAME = new QName("http://PSI.Wcf", "carryForwardShipment");
    private static final QName ns1_dataType_QNAME = new QName("http://PSI.Wcf", "dataType");
    private static final QName ns1_Type_TYPE_QNAME = new QName("http://PSI.Wcf", "Type");
    private CombinedSerializer myns1_Type__Type_LiteralSerializer;
    
    public SoxControlProperty_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public SoxControlProperty_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
        myns2__boolean__java_lang_Boolean_Boolean_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Boolean.class, ns2_boolean_TYPE_QNAME);
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.Object.class, ns2_anyType_TYPE_QNAME);
        myns1_Type__Type_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Type.class, ns1_Type_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("controlID");
        for (int memberIndex = 0; memberIndex <9; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_controlID_QNAME))) {
                myns2__int__int_Int_Serializer.setNullable( false );
                member = myns2__int__int_Int_Serializer.deserialize(ns1_controlID_QNAME, reader, context);
                requiredElements.remove("controlID");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setControlID(((Integer)member).intValue());
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_showControl_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_showControl_QNAME, reader, context);
                requiredElements.remove("showControl");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setShowControl((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_caption_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_caption_QNAME, reader, context);
                requiredElements.remove("caption");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCaption((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_controlName_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_controlName_QNAME, reader, context);
                requiredElements.remove("controlName");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setControlName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_associatedControlName_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_associatedControlName_QNAME, reader, context);
                requiredElements.remove("associatedControlName");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAssociatedControlName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_defaultValue_QNAME))) {
                ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.setNullable( false );
                member = ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.deserialize(ns1_defaultValue_QNAME, reader, context);
                requiredElements.remove("defaultValue");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDefaultValue((java.lang.Object)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_carryForward_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_carryForward_QNAME, reader, context);
                requiredElements.remove("carryForward");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCarryForward((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_carryForwardShipment_QNAME))) {
                myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
                member = myns2__boolean__java_lang_Boolean_Boolean_Serializer.deserialize(ns1_carryForwardShipment_QNAME, reader, context);
                requiredElements.remove("carryForwardShipment");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCarryForwardShipment((java.lang.Boolean)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_dataType_QNAME))) {
                myns1_Type__Type_LiteralSerializer.setNullable( false );
                member = myns1_Type__Type_LiteralSerializer.deserialize(ns1_dataType_QNAME, reader, context);
                requiredElements.remove("dataType");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setDataType((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Type)member);
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty)obj;
        
        myns2__int__int_Int_Serializer.setNullable( false );
        myns2__int__int_Int_Serializer.serialize(new Integer(instance.getControlID()), ns1_controlID_QNAME, null, writer, context);
        if (instance.getShowControl() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getShowControl(), ns1_showControl_QNAME, null, writer, context);
        }
        if (instance.getCaption() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getCaption(), ns1_caption_QNAME, null, writer, context);
        }
        if (instance.getControlName() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getControlName(), ns1_controlName_QNAME, null, writer, context);
        }
        if (instance.getAssociatedControlName() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getAssociatedControlName(), ns1_associatedControlName_QNAME, null, writer, context);
        }
        if (instance.getDefaultValue() != null) {
            ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.setNullable( false );
            ns2_anyType_TYPE_QNAMEjava$2e$lang$2e$Object_Serializer.serialize(instance.getDefaultValue(), ns1_defaultValue_QNAME, null, writer, context);
        }
        if (instance.getCarryForward() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getCarryForward(), ns1_carryForward_QNAME, null, writer, context);
        }
        if (instance.getCarryForwardShipment() != null) {
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.setNullable( false );
            myns2__boolean__java_lang_Boolean_Boolean_Serializer.serialize(instance.getCarryForwardShipment(), ns1_carryForwardShipment_QNAME, null, writer, context);
        }
        if (instance.getDataType() != null) {
            myns1_Type__Type_LiteralSerializer.setNullable( false );
            myns1_Type__Type_LiteralSerializer.serialize(instance.getDataType(), ns1_dataType_QNAME, null, writer, context);
        }
    }
}