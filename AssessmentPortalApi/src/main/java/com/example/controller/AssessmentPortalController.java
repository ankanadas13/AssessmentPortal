package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Assessment;
import com.example.repositories.Repository;

@RestController
@RequestMapping("/api")
public class AssessmentPortalController {
	@Autowired
	private Repository repository;
	
	@RequestMapping(value = "/getAllData", method = RequestMethod.GET)
	public List<Assessment> getAllDatas() {
	  return repository.findAll();
	}
	@RequestMapping(value = "/getDataById/{userId}", method = RequestMethod.GET)
	public List<Assessment> getDataById() {
	  return repository.findAll();
	}
	
}
