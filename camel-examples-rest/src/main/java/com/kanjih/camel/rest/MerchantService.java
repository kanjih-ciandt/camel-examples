package com.kanjih.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.kanjih.camel.canonical.v1.Merchant;


@Path("/xpto")
public interface MerchantService {
	
	
	
	@GET
	@Path("/hello")
	@Produces("application/json")
	public Merchant create(Merchant merchant);
    


}
