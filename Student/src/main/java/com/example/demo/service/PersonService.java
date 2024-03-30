package com.example.demo.service;

import com.example.demo.entity.Person;

public interface PersonService {


	String addPerson(Person p);

	Person getPerson(int id);

	String updatePerson(Person p);

	String deletePerson(int id);

}
