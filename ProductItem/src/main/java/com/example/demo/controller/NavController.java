package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/nav")
public class NavController {


		@GetMapping(value = "/addProduct")
		public String mapAddStudent() {
			return "addProduct";
		}
		
		@GetMapping(value="/updateProduct")
		public String mapUpdateProducts() {
			return "updateProduct";
		}
		
		@GetMapping(value="/view")
		public String mapgetProducts() {
			return "view";
		}
		
		@GetMapping(value="/deleteProduct")
		public String mapdeleteProducts() {
			return "deleteProduct";
		}


		
		
}


