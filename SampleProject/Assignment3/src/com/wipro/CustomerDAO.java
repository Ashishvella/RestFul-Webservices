package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {

	public static Connection createConnectObject() throws SQLException, ClassNotFoundException {
		Connection connection= null;
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5431/postgres", "postgres", "postgres");
		return connection;
	}
	public static String addCustomertoDB(Customer customer) throws SQLException, ClassNotFoundException{
	//custRepo.put(customer.getCustCode(),customer);
		Connection connection= CustomerDAO.createConnectObject();
		String custName = customer.getCustName();
		String custCode = customer.getCustCode();
		Statement stmtInsert = connection.createStatement();
		Integer flag = stmtInsert.executeUpdate("INSERT INTO customer (custname, custcode) VALUES ('"+custName+"','"+custCode+"')");

		stmtInsert.close();
		if (flag>0)
	        return "Customer added successfully to the DB";
		else
			return "Error occurred while pushing data to DB";
	}
	
	public static Customer getCustomerDetails(String custCode){
	Customer customer = null;	
	try {
		Connection connection= CustomerDAO.createConnectObject();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer where custcode ='"+custCode+"'");
		while(rs.next()) {
			String custName = rs.getString(1);			
			customer=new Customer(custName,custCode);
		}
		rs.close();
		stmt.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
		return customer;}
	
	public CustomerDAO() {
		try {
			createConnectObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
