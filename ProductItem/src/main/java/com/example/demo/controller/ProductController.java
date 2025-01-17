package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@Controller
@RequestMapping(value="/api")
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestParam("id") int id,@RequestParam("name")String name,@RequestParam("mfd") String mfd,
		@RequestParam("efd") String efd ,@RequestParam("uses") String uses) {
		Product p=new Product(id,name,mfd,efd,uses);
		String msg=ps.addProduct(p);
		return "redirect:/";
	}
	
	@PutMapping("/updateProduct")
	public String updateProduct(@RequestParam("id") int id,@RequestParam("name")String name,@RequestParam("mfd") String mfd,
			@RequestParam("efd") String efd ,@RequestParam("uses") String uses) {	
		Product p=ps.getProduct(id);
		p.setName(name);
		p.setEfd(efd);
		p.setMfd(mfd);
		p.setUses(uses);
		String msg=ps.updateProduct(p);
		return "redirect:/";
	}
	
	@GetMapping("/getProduct")
	public String getProduct(@RequestParam("id") int id,Model model) {
		Product p=ps.getProduct(id);
	  model.addAttribute("product",p);
	  return "info";
	}
	
	@PostMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("id") int id) {
		String msg=ps.deleteProduct(id);
		return "redirect:/";
		
	}

}
