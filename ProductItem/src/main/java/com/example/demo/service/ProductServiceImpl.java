package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository pr;

	@Override
	public String addProduct(Product p) {
		pr.save(p);
		return "Product added successfully";
	}

	@Override
	public String updateProduct(Product p) {
		pr.save(p);
		return "Product updated succesfully";
	}

	@Override
	public Product getProduct(int id) {
	return pr.findById(id).get();
	}

	@Override
	public String deleteProduct(int id) {
		pr.deleteById(id);
		return "product deleted";
	}
	

}
