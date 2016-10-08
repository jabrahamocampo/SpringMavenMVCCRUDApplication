package com.springtutorial;

import java.util.*;

public class JavaCollection {
	
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	
	public List getAddressList() {
		return addressList;
	}
	public void setAddressList(List addressList) {
		System.out.println("List items: " + addressList);
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		System.out.println("Set items: " + addressSet);
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		System.out.println("Map items: " + addressMap);
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		System. out. println("Property Elements :" + addressProp);
		this.addressProp = addressProp;
	}

	@Override
	public String toString() {
		return "Customer [lists=" + addressList + ", sets=" + addressSet + ", maps=" + addressMap
				+ ", pros=" + addressProp + "]";
	}
	
}
