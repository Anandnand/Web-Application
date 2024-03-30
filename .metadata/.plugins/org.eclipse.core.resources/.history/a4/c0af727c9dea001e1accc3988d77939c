package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;


@Controller
@RequestMapping(value="/api")
public class PersonController {
	@Autowired
	PersonService ps;
	
	@PostMapping("/addPerson")
	public String addPerson(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("email") String email,
			@RequestParam("number") int number){
		Person p=new Person(id,name,email,number);
		String msg=ps.addPerson(p);	
		return "redirect:/";
		
	}
	
	@PutMapping("/updatePerson")
	public String updatePerson(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("email") String email,
			@RequestParam("number") int number){
	    Person p=ps.getPerson(id);
	    p.setName(name);
	    p.setEmail(email);
	    p.setNumber(number);
	   	String msg=ps.updatePerson(p);	
		return "redirect:/";
		
	}
	
	@GetMapping("/getPerson")
	public String getPerson(@RequestParam("id") int id,Model model){
	    Person p=ps.getPerson(id);
	    model.addAttribute("person",p);
		return "view";
		
	}

	@DeleteMapping("/deletePerson")
	public String deletePerson(@RequestParam("id") int id){
	    String msg=ps.deletePerson(id);
		return "redirect:/";
		
	}

	
}
