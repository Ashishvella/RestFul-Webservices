package com.wipro;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/customers")
public class CustomerRetrieval {


	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Customer> getCustomers1(){
		List<Customer> l=new ArrayList<>();
		Customer cust1= new Customer("1","Raja");
		Customer cust2= new Customer("2","Wazir");
		l.add(cust1);
		l.add(cust2);
		return l;
}
}
