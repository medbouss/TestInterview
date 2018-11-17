package com.jcdecaux.recruiting.developpers.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguage;

@Path("/languages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface LanguageResource {
	
	
	@POST
	public Response save(@QueryParam("language") String language) ;

}
