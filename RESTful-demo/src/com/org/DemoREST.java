package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoREST {
	
	@Path("/simple")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String test() {
		System.out.println("test() is called");
		return "<greeting>Hello RESTFul</greeting>";
	}
	
	//employee object wants to be returned to the client
	
	@GET
	@Path("/getCustomer")
	@Produces(MediaType.APPLICATION_XML)
	public Customer sendCustomer() {
		System.out.println("sendCustomer is called");
		Customer c = new Customer(111, "Rahul", 34);
		return c;
	}
}
