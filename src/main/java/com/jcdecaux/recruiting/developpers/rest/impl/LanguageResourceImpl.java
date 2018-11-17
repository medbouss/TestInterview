package com.jcdecaux.recruiting.developpers.rest.impl;

import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguage;
import com.jcdecaux.recruiting.developpers.repository.ProgrammingLangRepository;
import com.jcdecaux.recruiting.developpers.rest.LanguageResource;

@Service
@Transactional
public class LanguageResourceImpl implements LanguageResource{
	
	@Autowired
	private ProgrammingLangRepository repo;

	@Override
	public Response save(String language) {
		
		if(language == null || language.isEmpty()){
			return Response.status(Status.BAD_REQUEST).build();
		}
		
		ProgrammingLanguage lang = new ProgrammingLanguage();
		lang.setLanguageName(language);
		return Response.ok(repo.save(lang)).build();
	}

}
