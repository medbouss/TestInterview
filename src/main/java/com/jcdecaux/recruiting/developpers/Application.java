package com.jcdecaux.recruiting.developpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.jcdecaux.recruiting.developpers.domain.model.Developer;
import com.jcdecaux.recruiting.developpers.domain.model.ProgrammingLanguage;
import com.jcdecaux.recruiting.developpers.repository.DeveloperRepository;
import com.jcdecaux.recruiting.developpers.repository.ProgrammingLangRepository;

@SpringBootApplication
@ComponentScan
public class Application implements CommandLineRunner{
	@Autowired
	private DeveloperRepository developerRepository;
	@Autowired
	private ProgrammingLangRepository  programmingLangRepository;
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

	@Override
	public void run(String... arg0) throws Exception {
//		programmingLangRepository.save(new ProgrammingLanguage("Java", new Developer()));
//		programmingLangRepository.save(new ProgrammingLanguage("C", new Developer()));
//		programmingLangRepository.save(new ProgrammingLanguage("JavaScript", new Developer()));
//
		
		developerRepository.save(new Developer("Jim", "Jhonson", "Paris" , null));
		developerRepository.save(new Developer("Jean", "kim", "Paris" , null));
		developerRepository.save(new Developer("Roseau", "Ali", "Paris" , null));
		developerRepository.save(new Developer("Alice", "Oliver", "Paris" , null));
		developerRepository.save(new Developer("Atos", "Apri", "Paris" , null));
		
	}
}
