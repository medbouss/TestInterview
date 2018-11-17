package com.jcdecaux.recruiting.developpers.service;

import java.util.Set;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;

public interface DeveloperService {
	
	Developer createDeveloper(Developer dev);
	
	Developer updateDeveloper(Developer dev);
	
	Developer getDeveloper(Long id);
	
	Developer addSkill(Developer dev, String languageName);
	
	Set<Developer> getDevelopersByLanguage(String language) ;

}
