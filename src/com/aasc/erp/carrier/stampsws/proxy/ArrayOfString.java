// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (10.1.3.4.0, build 080709.0800.28953)

package com.aasc.erp.carrier.stampsws.proxy;


public class ArrayOfString implements java.io.Serializable {
    private java.lang.String[] string;
    
    public ArrayOfString() {
    }
    
    public ArrayOfString(java.lang.String[] sourceArray) {
        string = sourceArray;
    }
    
    public void fromArray(java.lang.String[] sourceArray) {
        this.string = sourceArray;
    }
    
    public java.lang.String[] toArray() {
        return string;
    }
    
    public java.lang.String[] getString() {
        return string;
    }
    
    public void setString(java.lang.String[] string) {
        this.string = string;
    }
}