package com.parakhi.firstgradle.controller;

import java.util.List;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parakhi.firstgradle.entity.Person;
import com.parakhi.firstgradle.service.PersonService;

  @RestController
  @RequestMapping("/persons")
  
  public class PersonController {
	  
  @Autowired
  PersonService ps;
  
 @RequestMapping(value="/all")
 public List<Person> getAll(){
	return ps.getAll();
	
	
   }

 
 @RequestMapping(value="/{id}")
  public Person getByID(@PathVariable("id") int id){
	 
	  return ps.getById(id);
	 
 }

}
