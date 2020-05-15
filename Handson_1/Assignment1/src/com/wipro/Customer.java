package com.wipro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer implements Serializable{
 
public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

String name;

String cID;

@XmlElement
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@XmlElement
public String getcID() {
	return cID;
}

public void setcID(String cID) {
	this.cID = cID;
}

public Customer(String name, String cID) {
	super();
	this.name = name;
	this.cID = cID;
}

public static Map<String, Customer> custInfo(){
	Map <String,Customer> custRepo = new HashMap<String, Customer>();
	custRepo.put("customer1", new Customer("Ashish","1"));
	custRepo.put("customer2", new Customer("Anmol","2"));
	
	return custRepo;
}

}
