package com.jcdecaux.recruiting.developpers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguage;

public interface ProgrammingLangRepository  extends JpaRepository<ProgrammingLanguage, Long>{
	
	ProgrammingLanguage findByLanguageName(String lang);

}
