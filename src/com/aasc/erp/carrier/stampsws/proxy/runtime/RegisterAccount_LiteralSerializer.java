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

public class RegisterAccount_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_IntegrationID_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "IntegrationID");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_UserName_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "UserName");
    private static final QName ns1_Password_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Password");
    private static final QName ns1_Codeword1Type_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Codeword1Type");
    private static final QName ns1_CodewordType_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CodewordType");
    private CombinedSerializer myns1_CodewordType__CodewordType_LiteralSerializer;
    private static final QName ns1_Codeword1_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Codeword1");
    private static final QName ns1_Codeword2Type_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Codeword2Type");
    private static final QName ns1_Codeword2_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Codeword2");
    private static final QName ns1_PhysicalAddress_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "PhysicalAddress");
    private static final QName ns1_Address_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Address");
    private CombinedSerializer myns1_Address__Address_LiteralSerializer;
    private static final QName ns1_MailingAddress_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "MailingAddress");
    private static final QName ns1_MachineInfo_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "MachineInfo");
    private static final QName ns1_MachineInfo_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "MachineInfo");
    private CombinedSerializer myns1_MachineInfo__MachineInfo_LiteralSerializer;
    private static final QName ns1_Email_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "Email");
    private static final QName ns1_AccountType_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "AccountType");
    private static final QName ns1_AccountType_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "AccountType");
    private CombinedSerializer myns1_AccountType__AccountType_LiteralSerializer;
    private static final QName ns1_PromoCode_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "PromoCode");
    private static final QName ns1_CreditCard_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CreditCard");
    private static final QName ns1_CreditCard_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "CreditCard");
    private CombinedSerializer myns1_CreditCard__CreditCard_LiteralSerializer;
    private static final QName ns1_AchAccount_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "AchAccount");
    private static final QName ns1_AchAccount_TYPE_QNAME = new QName("http://stamps.com/xml/namespace/2014/07/swsim/swsimv37", "AchAccount");
    private CombinedSerializer myns1_AchAccount__AchAccount_LiteralSerializer;
    
    public RegisterAccount_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public RegisterAccount_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns2_string_TYPE_QNAME);
        myns1_CodewordType__CodewordType_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.CodewordType.class, ns1_CodewordType_TYPE_QNAME);
        myns1_Address__Address_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.Address.class, ns1_Address_TYPE_QNAME);
        myns1_MachineInfo__MachineInfo_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.MachineInfo.class, ns1_MachineInfo_TYPE_QNAME);
        myns1_AccountType__AccountType_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.AccountType.class, ns1_AccountType_TYPE_QNAME);
        myns1_CreditCard__CreditCard_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.CreditCard.class, ns1_CreditCard_TYPE_QNAME);
        myns1_AchAccount__AchAccount_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.stampsws.proxy.AchAccount.class, ns1_AchAccount_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.RegisterAccount instance = new com.aasc.erp.carrier.stampsws.proxy.RegisterAccount();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        requiredElements.add("IntegrationID");
        requiredElements.add("UserName");
        requiredElements.add("Password");
        requiredElements.add("Codeword1Type");
        requiredElements.add("Codeword1");
        requiredElements.add("Codeword2Type");
        requiredElements.add("Codeword2");
        requiredElements.add("PhysicalAddress");
        requiredElements.add("MachineInfo");
        requiredElements.add("Email");
        requiredElements.add("AccountType");
        for (int memberIndex = 0; memberIndex <15; memberIndex++) {
            elementName = reader.getName();
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_IntegrationID_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_IntegrationID_QNAME, reader, context);
                requiredElements.remove("IntegrationID");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setIntegrationID((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_UserName_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_UserName_QNAME, reader, context);
                requiredElements.remove("UserName");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setUserName((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Password_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Password_QNAME, reader, context);
                requiredElements.remove("Password");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPassword((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Codeword1Type_QNAME))) {
                myns1_CodewordType__CodewordType_LiteralSerializer.setNullable( false );
                member = myns1_CodewordType__CodewordType_LiteralSerializer.deserialize(ns1_Codeword1Type_QNAME, reader, context);
                requiredElements.remove("Codeword1Type");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCodeword1Type((com.aasc.erp.carrier.stampsws.proxy.CodewordType)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Codeword1_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Codeword1_QNAME, reader, context);
                requiredElements.remove("Codeword1");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCodeword1((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Codeword2Type_QNAME))) {
                myns1_CodewordType__CodewordType_LiteralSerializer.setNullable( false );
                member = myns1_CodewordType__CodewordType_LiteralSerializer.deserialize(ns1_Codeword2Type_QNAME, reader, context);
                requiredElements.remove("Codeword2Type");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCodeword2Type((com.aasc.erp.carrier.stampsws.proxy.CodewordType)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Codeword2_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Codeword2_QNAME, reader, context);
                requiredElements.remove("Codeword2");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCodeword2((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_PhysicalAddress_QNAME))) {
                myns1_Address__Address_LiteralSerializer.setNullable( false );
                member = myns1_Address__Address_LiteralSerializer.deserialize(ns1_PhysicalAddress_QNAME, reader, context);
                requiredElements.remove("PhysicalAddress");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPhysicalAddress((com.aasc.erp.carrier.stampsws.proxy.Address)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_MailingAddress_QNAME))) {
                myns1_Address__Address_LiteralSerializer.setNullable( false );
                member = myns1_Address__Address_LiteralSerializer.deserialize(ns1_MailingAddress_QNAME, reader, context);
                requiredElements.remove("MailingAddress");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setMailingAddress((com.aasc.erp.carrier.stampsws.proxy.Address)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_MachineInfo_QNAME))) {
                myns1_MachineInfo__MachineInfo_LiteralSerializer.setNullable( false );
                member = myns1_MachineInfo__MachineInfo_LiteralSerializer.deserialize(ns1_MachineInfo_QNAME, reader, context);
                requiredElements.remove("MachineInfo");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setMachineInfo((com.aasc.erp.carrier.stampsws.proxy.MachineInfo)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_Email_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Email_QNAME, reader, context);
                requiredElements.remove("Email");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setEmail((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_AccountType_QNAME))) {
                myns1_AccountType__AccountType_LiteralSerializer.setNullable( false );
                member = myns1_AccountType__AccountType_LiteralSerializer.deserialize(ns1_AccountType_QNAME, reader, context);
                requiredElements.remove("AccountType");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAccountType((com.aasc.erp.carrier.stampsws.proxy.AccountType)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_PromoCode_QNAME))) {
                myns2_string__java_lang_String_String_Serializer.setNullable( false );
                member = myns2_string__java_lang_String_String_Serializer.deserialize(ns1_PromoCode_QNAME, reader, context);
                requiredElements.remove("PromoCode");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setPromoCode((java.lang.String)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_CreditCard_QNAME))) {
                myns1_CreditCard__CreditCard_LiteralSerializer.setNullable( false );
                member = myns1_CreditCard__CreditCard_LiteralSerializer.deserialize(ns1_CreditCard_QNAME, reader, context);
                requiredElements.remove("CreditCard");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setCreditCard((com.aasc.erp.carrier.stampsws.proxy.CreditCard)member);
                context.setXmlFragmentWrapperName( null );
                reader.nextElementContent();
            }
            if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_AchAccount_QNAME))) {
                myns1_AchAccount__AchAccount_LiteralSerializer.setNullable( false );
                member = myns1_AchAccount__AchAccount_LiteralSerializer.deserialize(ns1_AchAccount_QNAME, reader, context);
                requiredElements.remove("AchAccount");
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull",DeserializationException.FAULT_CODE_CLIENT);
                }
                instance.setAchAccount((com.aasc.erp.carrier.stampsws.proxy.AchAccount)member);
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
        com.aasc.erp.carrier.stampsws.proxy.RegisterAccount instance = (com.aasc.erp.carrier.stampsws.proxy.RegisterAccount)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.RegisterAccount instance = (com.aasc.erp.carrier.stampsws.proxy.RegisterAccount)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.stampsws.proxy.RegisterAccount instance = (com.aasc.erp.carrier.stampsws.proxy.RegisterAccount)obj;
        
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getIntegrationID(), ns1_IntegrationID_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getUserName(), ns1_UserName_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getPassword(), ns1_Password_QNAME, null, writer, context);
        myns1_CodewordType__CodewordType_LiteralSerializer.setNullable( false );
        myns1_CodewordType__CodewordType_LiteralSerializer.serialize(instance.getCodeword1Type(), ns1_Codeword1Type_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getCodeword1(), ns1_Codeword1_QNAME, null, writer, context);
        myns1_CodewordType__CodewordType_LiteralSerializer.setNullable( false );
        myns1_CodewordType__CodewordType_LiteralSerializer.serialize(instance.getCodeword2Type(), ns1_Codeword2Type_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getCodeword2(), ns1_Codeword2_QNAME, null, writer, context);
        myns1_Address__Address_LiteralSerializer.setNullable( false );
        myns1_Address__Address_LiteralSerializer.serialize(instance.getPhysicalAddress(), ns1_PhysicalAddress_QNAME, null, writer, context);
        if (instance.getMailingAddress() != null) {
            myns1_Address__Address_LiteralSerializer.setNullable( false );
            myns1_Address__Address_LiteralSerializer.serialize(instance.getMailingAddress(), ns1_MailingAddress_QNAME, null, writer, context);
        }
        myns1_MachineInfo__MachineInfo_LiteralSerializer.setNullable( false );
        myns1_MachineInfo__MachineInfo_LiteralSerializer.serialize(instance.getMachineInfo(), ns1_MachineInfo_QNAME, null, writer, context);
        myns2_string__java_lang_String_String_Serializer.setNullable( false );
        myns2_string__java_lang_String_String_Serializer.serialize(instance.getEmail(), ns1_Email_QNAME, null, writer, context);
        myns1_AccountType__AccountType_LiteralSerializer.setNullable( false );
        myns1_AccountType__AccountType_LiteralSerializer.serialize(instance.getAccountType(), ns1_AccountType_QNAME, null, writer, context);
        if (instance.getPromoCode() != null) {
            myns2_string__java_lang_String_String_Serializer.setNullable( false );
            myns2_string__java_lang_String_String_Serializer.serialize(instance.getPromoCode(), ns1_PromoCode_QNAME, null, writer, context);
        }
        if (instance.getCreditCard() != null) {
            myns1_CreditCard__CreditCard_LiteralSerializer.setNullable( false );
            myns1_CreditCard__CreditCard_LiteralSerializer.serialize(instance.getCreditCard(), ns1_CreditCard_QNAME, null, writer, context);
        }
        if (instance.getAchAccount() != null) {
            myns1_AchAccount__AchAccount_LiteralSerializer.setNullable( false );
            myns1_AchAccount__AchAccount_LiteralSerializer.serialize(instance.getAchAccount(), ns1_AchAccount_QNAME, null, writer, context);
        }
    }
}