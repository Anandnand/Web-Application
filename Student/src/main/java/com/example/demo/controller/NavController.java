package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/api/nav")
public class NavController {
	
	
	@GetMapping("/addPerson")
	public String addMapping() {
		return "addPerson";
	}

	@GetMapping("/getPerson")
	public String viewMapping() {
		return "getPerson";
	}
	
	@GetMapping("/updatePerson")
	public String updateMapping() {
		return "updatePerson";
	}
	@GetMapping("/deletePerson")
	public String deleteMapping() {
		return "deletePerson";
	}
	
}
