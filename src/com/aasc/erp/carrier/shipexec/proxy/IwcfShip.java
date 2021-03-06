// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy;

public interface IwcfShip extends java.rmi.Remote {
    public void addShipper(java.lang.String shipperSymbol, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddress nameAddress) throws 
         java.rmi.RemoteException;
    public void changeShipperSymbol(java.lang.String currentShipper, java.lang.String newShipper) throws 
         java.rmi.RemoteException;
    public void deleteShipper(java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getCarriers() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getCommitments() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getCommodityClasses() throws 
         java.rmi.RemoteException;
    public java.lang.String getCurrencyByCountryLocale(java.lang.String country_symbol) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCurrency getCurrencyByCountry(java.lang.String country_symbol) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getDeviceDrivers() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Holiday[] getHolidays(java.lang.String carrier, java.lang.String origin_country) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getIncoterms() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getLanguages() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddressValidationCandidate[] getNameAddressValidationCandidates(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddress na, boolean useSimpleNameAddress) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.GetNameAddressValidationCandidatesWithParamsResponse getNameAddressValidationCandidatesWithParams(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddress na, boolean useSimpleNameAddress, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public java.lang.String getNextValidShipDate(java.lang.String carrier, java.lang.String from_date, java.lang.String origin_country, boolean ship_on_sat) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getPackageTypes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getPaymentTypes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getServices() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getShipFileDocuments(java.lang.String carrier) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDoc[] getDocumentFormats(java.lang.String carrier) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddress getShipperNameAddress(java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getShippers() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getUnitOfMeasures() throws 
         java.rmi.RemoteException;
    public java.lang.String getWeightUnitByCountryLocale(java.lang.String country_symbol) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] inspectNameAddress(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.NameAddress na) throws 
         java.rmi.RemoteException;
    public boolean isValidShipDate(java.lang.String carrier, java.lang.String ship_date, java.lang.String origin_country, boolean ship_on_sat) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getCarriersbyShippers(java.lang.String[] shippers) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getServicesbyCarriers(java.lang.String[] carriers) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.LicenseValidationResponse[] validateEntitlements(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.LicenseValidationRequest[] license_ids) throws 
         java.rmi.RemoteException;
    public void insertSoxDbPackage(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package pkg) throws 
         java.rmi.RemoteException;
    public void updateSoxDbPackage(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package pkg) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getScales() throws 
         java.rmi.RemoteException;
    public void instantiateWCF(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package _package) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchResponse processBatch(java.lang.String batchReference, int batchMode, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest printRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn addShipmentToBatch(java.lang.String batchReference, java.lang.String batchItemReference, int sequenceNumber, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchLoadType loadType, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchResponse processBatchByRequest(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchRequest batchRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ProcessBatchMode batchMode, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn getBatchCount(java.lang.String batchReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.LoadBatchResponse loadBatch(java.lang.String batchReference, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.StageBatchResponse stageBatch(java.lang.String batchReference, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn removeBatch(java.lang.String batchReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn createBatch(java.lang.String batchReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxReturn removeBatchItem(java.lang.String batchReference, java.lang.String batchItemReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentResponse shipBatchItem(java.lang.String batchReference, java.lang.String batchItemReference, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest loadBatchItem(java.lang.String batchReference, java.lang.String batchItemReference, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public java.lang.String[] getStagedBatches() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchRequest getStagedBatch(java.lang.String batchReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchRequest getBatchShipmentErrors(java.lang.String batchReference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDocument[] printBatch(java.lang.String batchReference, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest printRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public java.lang.String sox_Version() throws 
         java.rmi.RemoteException;
    public java.lang.String sox_Db_Version() throws 
         java.rmi.RemoteException;
    public java.lang.String app_Db_Version() throws 
         java.rmi.RemoteException;
    public java.lang.String CSAdapter_Version() throws 
         java.rmi.RemoteException;
    public java.lang.String managementLayer_Version() throws 
         java.rmi.RemoteException;
    public java.lang.String business_Object_Version() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.LoadResponse load(java.lang.String key, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.UserMethodResponse userMethod(java.lang.Object params) throws 
         java.rmi.RemoteException;
    public void validate(java.lang.String user_name, java.lang.String password) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutBySymbolsResponse closeOutBySymbols(java.lang.String carrier, java.lang.String shipper, java.lang.String[] closeOutItems, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public int getCloseOutMode(java.lang.String carrier, long global_msn) throws 
         java.rmi.RemoteException;
    public void setCloseOutMode(java.lang.String carrier, long global_msn, int closeOutMode) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutItem[] getCloseOutItems(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseOutBySymbolsAndPrintResponse closeOutBySymbolsAndPrint(java.lang.String carrier, java.lang.String shipper, java.lang.String[] closeOutItems, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest printRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReShipResponse reShip(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package packageToReship, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ReProcessResponse reProcess(java.lang.String carrier, int[] msnlist) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ModifyPackageListResult modifyPackageList(java.lang.String carrier, int[] msnlist, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] packageAttributes) throws 
         java.rmi.RemoteException;
    public java.lang.String[] getSearchFieldList() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getSearchFieldswithType() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package searchByGlobalMsn(long global_msn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByGlobalBundleId(long global_bundle_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipperReference(java.lang.String shipper_reference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipperReferenceWithCount(java.lang.String shipper_reference, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByConsigneeReference(java.lang.String consignee_reference) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByConsigneeReferenceWithCount(java.lang.String consignee_reference, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package searchByTrackingNumber(java.lang.String trackingNumber) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByTrackingNumberWithCount(java.lang.String trackingNumber, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByFilter(java.lang.String filter, int recordsToReturn, java.lang.String order_by) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByFilters(java.lang.String[] filters, int recordsToReturn, java.lang.String order_by) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipperAndShipdate(java.lang.String shipper, java.lang.String shipdate) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipperAndShipdateWithCount(java.lang.String shipper, java.lang.String shipdate, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipperAndShipdateAndStatus(java.lang.String shipper, java.lang.String shipdate, int recordsToReturn, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SearchCloseoutStatus searchCloseoutStatus) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchPackageHistory(java.lang.String startShipDate, java.lang.String endShipDate, java.lang.String shipper, java.lang.String service, long globalMSN, java.lang.String trackingNumber, java.lang.String company, java.lang.String contact, java.lang.String city, java.lang.String stateProvince, java.lang.String country, java.lang.String postalCode, java.lang.String phone, java.lang.String shipperReference, java.lang.String consigneeReference, java.lang.String miscReference1, java.lang.String miscReference2, java.lang.String miscReference3, java.lang.String miscReference4, java.lang.String miscReference5, java.lang.String carrier, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Package[] searchByShipFileID(long shipFileID, java.lang.String carrier, int recordsToReturn) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipResponse ship(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest request, boolean shipWithoutTransaction, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipOrderResponse shipOrder(java.lang.String value, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipmentRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.RateResponse rate(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest request, java.lang.String service, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.RateServicesResponse rateServices(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest request, java.lang.String[] services, int sortType, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequestResponse printRequest(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest printRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintPositionDocumentXmlResponse printPositionDocumentXml(java.lang.String pos_doc_xml, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer printerSettings, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintDocumentResponse printDocument(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDocument document, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer printer, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getAvailablePrinterStocks() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getAvailablePrinters() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer[] getConfiguredPrinters() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer getPrinter(int printer_id) throws 
         java.rmi.RemoteException;
    public boolean addPrinter(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer printer) throws 
         java.rmi.RemoteException;
    public int copyPrinter(int printer_id) throws 
         java.rmi.RemoteException;
    public boolean updatePrinter(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Printer printer) throws 
         java.rmi.RemoteException;
    public boolean deletePrinter(int printer_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocumentProfile[] getDocumentProfiles() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocumentProfile getDocumentProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public boolean addDocumentProfile(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocumentProfile documentProfile) throws 
         java.rmi.RemoteException;
    public boolean updateDocumentProfile(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.DocumentProfile documentProfile) throws 
         java.rmi.RemoteException;
    public int copyDocumentProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public boolean deleteDocumentProfile(int profile_id) throws 
         java.rmi.RemoteException;
    public void deleteHistoryItem(java.lang.String carrier, java.lang.String shipper, int historyItem) throws 
         java.rmi.RemoteException;
    public void deleteHistoryItems(java.lang.String carrier, java.lang.String shipper, int[] historyItems) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getHistoryItemList(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public boolean areTransmitItemsAvailableForDeletion(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public void deleteTransmitItems(java.lang.String carrier, java.lang.String shipper, java.lang.String[] itemsToDelete) throws 
         java.rmi.RemoteException;
    public void deleteTransmitItem(java.lang.String carrier, java.lang.String shipper, java.lang.String itemToDelete) throws 
         java.rmi.RemoteException;
    public java.lang.String[] getTransmitItemsAvailableForDeletion(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getTransmitItems(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public java.lang.String[] getTransmitItemsByStatus(java.lang.String carrier, java.lang.String shipper, int status) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] transmitItem(java.lang.String carrier, java.lang.String shipper, java.lang.String itemToTransmit, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] transmitItems(java.lang.String carrier, java.lang.String shipper, java.lang.String[] itemsToTransmit, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getDeleteTransmitItemsList(java.lang.String carrier, java.lang.String shipper) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.VoidPackageByGlobalMsnResponse voidPackageByGlobalMsn(long global_msn, java.lang.String carrier, java.lang.String shipper, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.VoidPackageByTrackingNumberResponse voidPackageByTrackingNumber(java.lang.String trackingNumber, java.lang.String carrier, java.lang.String shipper, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.VoidPackagesByGlobalMsnListResponse voidPackagesByGlobalMsnList(long[] msnList, java.lang.String carrier, java.lang.String shipper, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum additionalHandlingTypes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum dryIceRegulationSets() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum dryIcePurposes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum alcoholTypes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum alcoholPackaging() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum dispositionMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum closeOutModes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum deliveryMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum returnAddressMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum returnDeliveryMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum CODPaymentMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum CODReturnMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazMatCACategories() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazmatLabels() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazmatPackingGroups() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazMatRegulations() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazMatRegulationSets() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum SEDMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum COMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum commercialInvoiceMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum NAFTARVCMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum NAFTAPreferenceCriterion() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum NAFTAProducer() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum exchangeMethods() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazmatPhysicalForm() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum hazmatRadioactiveException() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum brokerageMethod() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum chargesOnDocumentation() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxEnum commodityCondition() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCountry[] getCountries() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxCurrency[] getCurrencies() throws 
         java.rmi.RemoteException;
    public boolean closeGroup(java.lang.String carrier, java.lang.String grouping_symbol, java.lang.String group_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.CloseGroupAndPrintResponse closeGroupAndPrint(java.lang.String carrier, java.lang.String grouping_symbol, java.lang.String group_id, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PrintRequest printRequest, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] params) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Group getGroup(java.lang.String carrier, java.lang.String grouping_symbol, java.lang.String group_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxDictionaryItem[] getGroupDocuments(java.lang.String carrier) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Grouping[] getGroupings(java.lang.String carrier) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Group[] getGroups(java.lang.String carrier, java.lang.String grouping_symbol, int status_flag) throws 
         java.rmi.RemoteException;
    public boolean modifyGroup(java.lang.String carrier, java.lang.String grouping_symbol, java.lang.String group_id, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackageRequest pkg_req) throws 
         java.rmi.RemoteException;
    public boolean openGroup(java.lang.String carrier, java.lang.String grouping_symbol, java.lang.String group_id) throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.SoxGroupingType[] getGroupingTypes() throws 
         java.rmi.RemoteException;
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.Group createGroup(java.lang.String carrier, java.lang.String grouping_symbol, com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.PackageRequest pkg_req) throws 
         java.rmi.RemoteException;
}
