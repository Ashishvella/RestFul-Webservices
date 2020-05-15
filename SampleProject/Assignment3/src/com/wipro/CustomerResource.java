package com.wipro;

import java.sql.SQLException;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/Customer")
public class CustomerResource {
	public Customer getDetails(){
		return null;
	}
	@POST
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value="/checkPost")
public String postCustToDB(@FormParam("input1") String custName,
		@FormParam("input2") String custCode) throws SQLException, ClassNotFoundException{
		Customer customer = new Customer(custName, custCode);
		System.out.println(customer.getCustCode());
		System.out.println(customer.getCustName());
		
	return CustomerDAO.addCustomertoDB(customer);
}
	@POST
	@Path(value="/getCust")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getIndividualCustomer(@FormParam("content1") String custCode){
		return CustomerDAO.getCustomerDetails(custCode);
	}
	
}
