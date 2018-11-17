package com.jcdecaux.recruiting.developpers.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcdecaux.recruiting.developpers.rest.InfosResource;
import com.jcdecaux.recruiting.developpers.service.InfosService;

@Service
public class InfosResourceImpl implements InfosResource{

	@Autowired
	private InfosService service;

	public String get() {
		return new StringBuilder()//
				.append("Current version is : ")//
				.append(service.getCurrentVersion())//
				.toString();
	}
	
	
	
}
