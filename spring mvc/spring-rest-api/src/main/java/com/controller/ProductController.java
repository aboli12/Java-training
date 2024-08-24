package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;

@RestController
public class ProductController {

	//http://localhost:8080/product
	
	@RequestMapping(value = "product",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductInfo() {
		Product p1 = new Product(100, "TV", 34000);
		return p1;
	}
	//http://localhost:8080/products
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
	//http://localhost:8080/singlequeryparam?pid=100;
	
	@RequestMapping(value = "singlequeryparam",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String singleQueryParam(@RequestParam("pid") int pid) {
		// coding or pass this value to service layer 
		
		return "You pass the id as query param technique "+pid;
	}
	
	//http://localhost:8080/singlepathparam/100;
	
		@RequestMapping(value = "singlepathparam/{pid}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
		public String singlePathParam(@PathVariable("pid") int pid) {
			// coding or pass this value to service layer 
			return "You pass the id as path param technique "+pid;
		}
		// http://localhost:8080/storeProduct, method = post and data in the form of json etc. 
		
		@RequestMapping(value = "storeProduct",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeProduct(@RequestBody Product product) {// @RequestBody annotation convert json to java format from request body. 
			// call service method to store the data. 
			System.out.println(product);// override toString method in java bean class. 
			return "Post method called "+product.getPname();
		}
		// http://localhost:8080/updateProduct, method = put and data in the form of json etc. 
		@RequestMapping(value = "updateProduct",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProduct(@RequestBody Product product) {// @RequestBody annotation convert json to java format from request body. 
			// call service method to update the data. 
			System.out.println(product);// override toString method in java bean class. 
			return "Put method called "+product.getPname();
		}
		// http://localhost:8080/deleteProduct/100, method = delete
		@RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
		public String updateProduct(@PathVariable("pid") int pid) {// @RequestBody annotation convert json to java format from request body. 
			// call service method to delete the data. 
			return "Delete method with id as "+pid;
		}
}


