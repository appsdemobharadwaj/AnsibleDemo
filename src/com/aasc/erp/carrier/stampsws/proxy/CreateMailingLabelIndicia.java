// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class CreateMailingLabelIndicia implements java.io.Serializable {
    protected com.aasc.erp.carrier.stampsws.proxy.Credentials credentials;
    protected java.lang.String authenticator;
    protected java.lang.String integratorTxId;
    protected java.lang.String layout;
    protected java.lang.Boolean printAddress;
    protected java.lang.Integer startRow;
    protected java.lang.Integer startColumn;
    protected com.aasc.erp.carrier.stampsws.proxy.IndiciumInfoV6[] indiciumInfo;
    protected com.aasc.erp.carrier.stampsws.proxy.CreateIndiciumModeV1 mode;
    protected com.aasc.erp.carrier.stampsws.proxy.ImageType imageType;
    
    public CreateMailingLabelIndicia() {
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.Credentials getCredentials() {
        return credentials;
    }
    
    public void setCredentials(com.aasc.erp.carrier.stampsws.proxy.Credentials credentials) {
        this.credentials = credentials;
    }
    
    public java.lang.String getAuthenticator() {
        return authenticator;
    }
    
    public void setAuthenticator(java.lang.String authenticator) {
        this.authenticator = authenticator;
    }
    
    public java.lang.String getIntegratorTxId() {
        return integratorTxId;
    }
    
    public void setIntegratorTxId(java.lang.String integratorTxId) {
        this.integratorTxId = integratorTxId;
    }
    
    public java.lang.String getLayout() {
        return layout;
    }
    
    public void setLayout(java.lang.String layout) {
        this.layout = layout;
    }
    
    public java.lang.Boolean getPrintAddress() {
        return printAddress;
    }
    
    public void setPrintAddress(java.lang.Boolean printAddress) {
        this.printAddress = printAddress;
    }
    
    public java.lang.Integer getStartRow() {
        return startRow;
    }
    
    public void setStartRow(java.lang.Integer startRow) {
        this.startRow = startRow;
    }
    
    public java.lang.Integer getStartColumn() {
        return startColumn;
    }
    
    public void setStartColumn(java.lang.Integer startColumn) {
        this.startColumn = startColumn;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.IndiciumInfoV6[] getIndiciumInfo() {
        return indiciumInfo;
    }
    
    public void setIndiciumInfo(com.aasc.erp.carrier.stampsws.proxy.IndiciumInfoV6[] indiciumInfo) {
        this.indiciumInfo = indiciumInfo;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.CreateIndiciumModeV1 getMode() {
        return mode;
    }
    
    public void setMode(com.aasc.erp.carrier.stampsws.proxy.CreateIndiciumModeV1 mode) {
        this.mode = mode;
    }
    
    public com.aasc.erp.carrier.stampsws.proxy.ImageType getImageType() {
        return imageType;
    }
    
    public void setImageType(com.aasc.erp.carrier.stampsws.proxy.ImageType imageType) {
        this.imageType = imageType;
    }
}
