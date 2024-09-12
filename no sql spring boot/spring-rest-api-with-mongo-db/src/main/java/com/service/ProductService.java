package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collection.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepositry;
	
	public String storeProduct(Product product) {
		Optional<Product> result = productRepositry.findById(product.getPid());
		if(result.isPresent()) {
			return "Product id must be unique";
		}else {
			productRepositry.save(product);
			return "Product details stored";
		}
	}
	
	public List<Product> findAllProducts() {
		return productRepositry.findAll();
	}
	
}