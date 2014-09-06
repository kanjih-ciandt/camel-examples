package com.kanjih.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.kanjih.camel.canonical.v1.Merchant;



public class MerchantServiceConcreate {
	
	
	
	@GET
	@Path("/hello")
	@Produces("application/json")
	public String create(@QueryParam("kanji") String teste){
		return null;
	}
	
	@POST
	@Path("/post")
	@Produces("application/json")
	public String testPost(@QueryParam("aposta") String merchant){
		return null;
	}
    


}
