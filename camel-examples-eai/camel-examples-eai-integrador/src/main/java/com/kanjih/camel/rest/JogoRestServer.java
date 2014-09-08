package com.kanjih.camel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author kanjih
 *
 */
public class JogoRestServer {	

	
	@GET
	@Path("/procurarPorAnimal")
	@Produces("application/json")
	public String procurarPorAnimal(@QueryParam("nomeAnimal") String nomeAnimal){
		return null;
	}
	
	

}
