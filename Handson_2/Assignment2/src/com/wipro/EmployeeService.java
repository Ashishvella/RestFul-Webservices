package com.wipro;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/employees")
public class EmployeeService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees(){
		List<Employee> listEmp = EmployeeDAO.listEmp;
		return listEmp;
	}
	
	@GET
	@Path(value="/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getIndividualEmployee(@PathParam("index") int index){
		Employee e =EmployeeDAO.listEmp.get(index);
		return e;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addNewEmployee(Employee e){
	EmployeeDAO.listEmp.add(e);
	return e;
	}
	
	@DELETE
	@Path(value="/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee deleteEmployee(@PathParam("index") int index){
		Employee e = 	EmployeeDAO.listEmp.get(index);
		EmployeeDAO.listEmp.remove(index);
		return e;
		
	}
	
	@PUT
	@Path(value="/{index}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(@PathParam("index") int index){
		Employee e =EmployeeDAO.listEmp.get(index);
		e.setEmpName("JayaSuriya");
		return e;
		}
	
}
