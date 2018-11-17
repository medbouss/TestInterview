package com.jcdecaux.recruiting.developpers.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;

public interface DeveloperRepository  extends JpaRepository<Developer, Long>{
	
	public Set<Developer> findByProgrammingLanguageLanguageName(String language);
}
