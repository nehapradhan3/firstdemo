package com.parakhi.firstgradle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.parakhi.firstgradle.entity.Person;
@Service
public class PersonService {
	
	public List<Person> getAll(){
		List<Person> personList=new ArrayList<Person>();
		personList.add(new Person(1, "Ram", "ram@gmail.com"));
		personList.add(new Person(2, "shyam", "shy@gmail.com"));
		personList.add(new Person(3, "hari", "hari@gmail.com"));
		return personList;
		
	}
	public Person getById(int id){
		
		for(Person p:getAll()){
			if(p.getId()==id){
				
				return p;
			}
			
		}
		 return null;
		
	}
		

}
