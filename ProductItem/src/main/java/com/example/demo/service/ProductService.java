package com.example.demo.service;

import com.example.demo.entity.Product;

public interface ProductService {

	String addProduct(Product p);

	String updateProduct(Product p);

	Product getProduct(int id);

	String deleteProduct(int id);
	   

}
