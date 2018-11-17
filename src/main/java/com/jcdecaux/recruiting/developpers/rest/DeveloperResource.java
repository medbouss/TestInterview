package com.jcdecaux.recruiting.developpers.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;

@Path("/developers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface DeveloperResource {
	
	@POST
	Response createDeveloper(Developer developer) ;
	
	@PUT
	@Path("/{id}")
	Response updateDeveloper(@PathParam("id") Long id, Developer dev);
	
	@GET
	Response getDevelopersByLanguage(@QueryParam("language") String language);
	
	@PUT
	@Path("/{id}/languages")
	Response addLanguage(@PathParam("id") Long id, @QueryParam("language") String language);
	
		

}
