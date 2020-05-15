package com.wipro;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
private int empID;

private String empName;
@XmlElement
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
@XmlElement
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empID, String empName) {
	super();
	this.empID = empID;
	this.empName = empName;
}



}
