// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf;


public class ArrayOfColdPack implements java.io.Serializable {
    private com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] coldPack;
    
    public ArrayOfColdPack() {
    }
    
    public ArrayOfColdPack(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] sourceArray) {
        coldPack = sourceArray;
    }
    
    public void fromArray(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] sourceArray) {
        this.coldPack = sourceArray;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] toArray() {
        return coldPack;
    }
    
    public com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] getColdPack() {
        return coldPack;
    }
    
    public void setColdPack(com.aasc.erp.carrier.shipexec.proxy.types.psi.wcf.ColdPack[] coldPack) {
        this.coldPack = coldPack;
    }
}
