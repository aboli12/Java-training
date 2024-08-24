package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
public class ProductController {

	//http://locahost:8080/product
	
	@RequestMapping(value = "product",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductInfo() {
		Product p1 = new Product(100, "TV", 34000);
		return p1;
	}
	//http://locahost:8080/products
	@RequestMapping(value = "products",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts() {
		Product p1 = new Product(100, "TV", 34000);
		Product p2 = new Product(101, "Computer", 25000);
		Product p3 = new Product(102, "Pen Drive", 1400);
		List<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(p3);
		return listOfProduct;
	}
}
