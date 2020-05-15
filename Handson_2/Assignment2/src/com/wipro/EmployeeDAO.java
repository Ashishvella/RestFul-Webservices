package com.wipro;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
 public static List<Employee> listEmp = new ArrayList<Employee>();
 
 static{
	 initEmp();
 }
 public static void initEmp(){
	 Employee emp1= new Employee(1,"Sarojini");
	 Employee emp2= new Employee(2,"Santhosh");
	 
	 listEmp.add(emp1);
	 listEmp.add(emp2);
 }
 

}
