// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class BatchRequestItem extends com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.BatchItemBase implements java.io.Serializable {
    protected java.lang.String create_date;
    protected com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipment_request;
    
    public BatchRequestItem() {
    }
    
    public java.lang.String getCreate_date() {
        return create_date;
    }
    
    public void setCreate_date(java.lang.String create_date) {
        this.create_date = create_date;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest getShipment_request() {
        return shipment_request;
    }
    
    public void setShipment_request(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ShipmentRequest shipment_request) {
        this.shipment_request = shipment_request;
    }
}
