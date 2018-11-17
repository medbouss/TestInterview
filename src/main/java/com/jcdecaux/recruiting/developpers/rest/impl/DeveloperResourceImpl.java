package com.jcdecaux.recruiting.developpers.rest.impl;

import java.util.Set;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;
import com.jcdecaux.recruiting.developpers.repository.DeveloperRepository;
import com.jcdecaux.recruiting.developpers.rest.DeveloperResource;
import com.jcdecaux.recruiting.developpers.service.DeveloperService;

@Service
public class DeveloperResourceImpl implements DeveloperResource{
	
	@Autowired DeveloperService developerService;
	
	@Autowired DeveloperRepository repo;

	@Override
	public Response createDeveloper(Developer developer) {
		if(developer == null) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		return Response.ok(developerService.createDeveloper(developer)).build();
	}

	@Override
	public Response updateDeveloper(Long id, Developer dev) {

		Developer currentDev = developerService.getDeveloper(id);

		if (currentDev == null) {
			return Response.status(Status.NOT_FOUND).build();
		}

		currentDev.setFirstName(dev.getFirstName());
		currentDev.setLastName(dev.getLastName());
		currentDev.setProgrammingLanguage(dev.getProgrammingLanguage());

		return Response.ok(currentDev).build();
	}

	@Override
	public Response getDevelopersByLanguage(String language) {
		if(language == null || language.isEmpty()){
			return Response.ok(repo.findAll()).build();
		}
		return Response.ok(developerService.getDevelopersByLanguage(language)).build();
	}

	@Override
	public Response addLanguage(Long id, String language) {
		Developer dev = developerService.getDeveloper(id);
		
		if (dev == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		
		if(language == null || language.isEmpty()){
			return Response.status(Status.BAD_REQUEST).build();
		}
		
		return Response.ok(developerService.addSkill(dev, language)).build();
	}

}
