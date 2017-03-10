// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class IsValidShipDate implements java.io.Serializable {
    protected java.lang.String carrier;
    protected java.lang.String ship_date;
    protected java.lang.String origin_country;
    protected boolean ship_on_sat;
    
    public IsValidShipDate() {
    }
    
    public java.lang.String getCarrier() {
        return carrier;
    }
    
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }
    
    public java.lang.String getShip_date() {
        return ship_date;
    }
    
    public void setShip_date(java.lang.String ship_date) {
        this.ship_date = ship_date;
    }
    
    public java.lang.String getOrigin_country() {
        return origin_country;
    }
    
    public void setOrigin_country(java.lang.String origin_country) {
        this.origin_country = origin_country;
    }
    
    public boolean isShip_on_sat() {
        return ship_on_sat;
    }
    
    public void setShip_on_sat(boolean ship_on_sat) {
        this.ship_on_sat = ship_on_sat;
    }
}