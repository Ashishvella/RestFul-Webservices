package com.wipro;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
String custName;
String custCode;
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustCode() {
	return custCode;
}
public void setCustCode(String custCode) {
	this.custCode = custCode;
}
public Customer(String custName, String custCode) {
	super();
	this.custName = custName;
	this.custCode = custCode;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [custName=" + custName + ", custCode=" + custCode + "]";
}


}
