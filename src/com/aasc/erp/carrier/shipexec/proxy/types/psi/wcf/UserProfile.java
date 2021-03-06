// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class UserProfile implements java.io.Serializable {
    protected java.lang.Integer profile_id;
    protected java.lang.String profile_name;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] shippers;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCountry[] countries;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] carriers;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] services;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BoxType[] boxTypes;
    protected java.lang.Boolean autoShip;
    protected java.lang.Boolean allowInternationalProcessing;
    protected java.lang.Boolean lockScreenAfterLoad;
    protected java.lang.Boolean overrideDefaultUnits;
    protected java.lang.String defaultTab;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ScanShipMode scanShip;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BusinessRules clientBusinessRules;
    protected java.lang.Integer searchRecordstoReturn;
    protected java.lang.Boolean enableLogging;
    protected java.lang.Boolean pass_user_credentials;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty[] controlSettings;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] commodityClasses;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] scales;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] packagingTypes;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] paymentTerms;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] termsofSale;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] unitsofMeasure;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocProfile documentProfile;
    
    public UserProfile() {
    }
    
    public java.lang.Integer getProfile_id() {
        return profile_id;
    }
    
    public void setProfile_id(java.lang.Integer profile_id) {
        this.profile_id = profile_id;
    }
    
    public java.lang.String getProfile_name() {
        return profile_name;
    }
    
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getShippers() {
        return shippers;
    }
    
    public void setShippers(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] shippers) {
        this.shippers = shippers;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCountry[] getCountries() {
        return countries;
    }
    
    public void setCountries(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCountry[] countries) {
        this.countries = countries;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getCarriers() {
        return carriers;
    }
    
    public void setCarriers(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] carriers) {
        this.carriers = carriers;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getServices() {
        return services;
    }
    
    public void setServices(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] services) {
        this.services = services;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BoxType[] getBoxTypes() {
        return boxTypes;
    }
    
    public void setBoxTypes(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BoxType[] boxTypes) {
        this.boxTypes = boxTypes;
    }
    
    public java.lang.Boolean getAutoShip() {
        return autoShip;
    }
    
    public void setAutoShip(java.lang.Boolean autoShip) {
        this.autoShip = autoShip;
    }
    
    public java.lang.Boolean getAllowInternationalProcessing() {
        return allowInternationalProcessing;
    }
    
    public void setAllowInternationalProcessing(java.lang.Boolean allowInternationalProcessing) {
        this.allowInternationalProcessing = allowInternationalProcessing;
    }
    
    public java.lang.Boolean getLockScreenAfterLoad() {
        return lockScreenAfterLoad;
    }
    
    public void setLockScreenAfterLoad(java.lang.Boolean lockScreenAfterLoad) {
        this.lockScreenAfterLoad = lockScreenAfterLoad;
    }
    
    public java.lang.Boolean getOverrideDefaultUnits() {
        return overrideDefaultUnits;
    }
    
    public void setOverrideDefaultUnits(java.lang.Boolean overrideDefaultUnits) {
        this.overrideDefaultUnits = overrideDefaultUnits;
    }
    
    public java.lang.String getDefaultTab() {
        return defaultTab;
    }
    
    public void setDefaultTab(java.lang.String defaultTab) {
        this.defaultTab = defaultTab;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ScanShipMode getScanShip() {
        return scanShip;
    }
    
    public void setScanShip(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ScanShipMode scanShip) {
        this.scanShip = scanShip;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BusinessRules getClientBusinessRules() {
        return clientBusinessRules;
    }
    
    public void setClientBusinessRules(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BusinessRules clientBusinessRules) {
        this.clientBusinessRules = clientBusinessRules;
    }
    
    public java.lang.Integer getSearchRecordstoReturn() {
        return searchRecordstoReturn;
    }
    
    public void setSearchRecordstoReturn(java.lang.Integer searchRecordstoReturn) {
        this.searchRecordstoReturn = searchRecordstoReturn;
    }
    
    public java.lang.Boolean getEnableLogging() {
        return enableLogging;
    }
    
    public void setEnableLogging(java.lang.Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }
    
    public java.lang.Boolean getPass_user_credentials() {
        return pass_user_credentials;
    }
    
    public void setPass_user_credentials(java.lang.Boolean pass_user_credentials) {
        this.pass_user_credentials = pass_user_credentials;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty[] getControlSettings() {
        return controlSettings;
    }
    
    public void setControlSettings(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxControlProperty[] controlSettings) {
        this.controlSettings = controlSettings;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getCommodityClasses() {
        return commodityClasses;
    }
    
    public void setCommodityClasses(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] commodityClasses) {
        this.commodityClasses = commodityClasses;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getScales() {
        return scales;
    }
    
    public void setScales(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] scales) {
        this.scales = scales;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getPackagingTypes() {
        return packagingTypes;
    }
    
    public void setPackagingTypes(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] packagingTypes) {
        this.packagingTypes = packagingTypes;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getPaymentTerms() {
        return paymentTerms;
    }
    
    public void setPaymentTerms(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] paymentTerms) {
        this.paymentTerms = paymentTerms;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getTermsofSale() {
        return termsofSale;
    }
    
    public void setTermsofSale(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] termsofSale) {
        this.termsofSale = termsofSale;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] getUnitsofMeasure() {
        return unitsofMeasure;
    }
    
    public void setUnitsofMeasure(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxProperty[] unitsofMeasure) {
        this.unitsofMeasure = unitsofMeasure;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocProfile getDocumentProfile() {
        return documentProfile;
    }
    
    public void setDocumentProfile(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocProfile documentProfile) {
        this.documentProfile = documentProfile;
    }
}
