package com.jcdecaux.recruiting.developpers.service.impl;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguage;
import com.jcdecaux.recruiting.developpers.repository.DeveloperRepository;
import com.jcdecaux.recruiting.developpers.repository.ProgrammingLangRepository;
import com.jcdecaux.recruiting.developpers.service.DeveloperService;



@Service
@Transactional
public class DeveloperServiceImpl implements DeveloperService {
	
	
	@Autowired
	private DeveloperRepository developerRepository;
	
	@Autowired
	private ProgrammingLangRepository langRepo;

	@Override
	public Developer createDeveloper(Developer dev) {
		return developerRepository.save(dev);
	}

	@Override
	public Developer updateDeveloper(Developer dev) {
		return developerRepository.save(dev);
	}

	@Override
	public Developer getDeveloper(Long id) {
		return developerRepository.findOne(id) ;
	}

	@Override
	public Set<Developer> getDevelopersByLanguage(String language) {
		return developerRepository.findByProgrammingLanguageLanguageName(language);
	}

	@Override
	public Developer addSkill(Developer dev, String languageName) {
		ProgrammingLanguage lang = langRepo.findByLanguageName(languageName);
		if (lang == null)
			lang = new ProgrammingLanguage();
		lang.setLanguageName(languageName);
		lang.setDeveloper(dev);
		dev.getProgrammingLanguage().add(lang);
		langRepo.save(lang);
		return dev;
	}

}
