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

public class ArrayOfModifyPackageResult_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final QName ns1_ModifyPackageResult_QNAME = new QName("http://PSI.Wcf", "ModifyPackageResult");
    private static final QName ns1_ModifyPackageResult_TYPE_QNAME = new QName("http://PSI.Wcf", "ModifyPackageResult");
    private CombinedSerializer myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer;
    
    public ArrayOfModifyPackageResult_LiteralSerializer(QName type) {
        this(type,  false);
    }
    
    public ArrayOfModifyPackageResult_LiteralSerializer(QName type, boolean encodeType) {
        super(type, true, encodeType);
        setSOAPVersion(SOAPVersion.SOAP_11);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ModifyPackageResult.class, ns1_ModifyPackageResult_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult instance = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult();
        java.lang.Object member=null;
        QName elementName;
        List values;
        java.lang.Object value;
        
        reader.nextElementContent();
        java.util.HashSet requiredElements = new java.util.HashSet();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_ModifyPackageResult_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (matchQName(elementName, ns1_ModifyPackageResult_QNAME))) {
                    myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer.setNullable( true );
                    value = myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer.deserialize(ns1_ModifyPackageResult_QNAME, reader, context);
                    requiredElements.remove("ModifyPackageResult");
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ModifyPackageResult[values.size()];
            member = values.toArray((java.lang.Object[]) member);
            instance.setModifyPackageResult((com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ModifyPackageResult[])member);
        }
        else {
            if (instance.getModifyPackageResult() == null)
            instance.setModifyPackageResult(new com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ModifyPackageResult[0]);
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
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult)obj;
        
    }
    public void doSerializeAnyAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult)obj;
        
    }
    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult instance = (com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ArrayOfModifyPackageResult)obj;
        
        if (instance.getModifyPackageResult() != null) {
            for (int i = 0; i < instance.getModifyPackageResult().length; ++i) {
                myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer.setNullable( true );
                myns1_ModifyPackageResult__ModifyPackageResult_LiteralSerializer.serialize(instance.getModifyPackageResult()[i], ns1_ModifyPackageResult_QNAME, null, writer, context);
            }
        }
    }
}