package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonServiceImpl  implements PersonService {
	@Autowired
   PersonRepository pr;
	
	
	@Override
	public String addPerson(Person p) {
		pr.save(p);
		return "Person added successfully";
	}


	@Override
	public Person getPerson(int id) {
	return	pr.findById(id).get();
	 
	}


	@Override
	public String updatePerson(Person p) {
		pr.save(p);
		return "person updated successfully";
	}


	@Override
	public String deletePerson(int id) {
		pr.deleteById(id);
		return "deleted successfully";
	}
	
	
	

}
