package com.citibank.demo.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.demo.Person;

@RestController
public class PersonController {
	
			
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Person getPersonById(@PathVariable("id") int id) {
		return new Person("dee");
		};
	}
	


