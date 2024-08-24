package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
	private ProductDao pd = new ProductDao();
	public String addProduct(Product product) {
		if(product.getPrice()<1000) {
			return "Product price must be > 1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product details stored in database";
		}else {
			return "Product didn't store";
		}
	}
	public List<Product> findAllProducts(){
		return pd.retrieveAllProducts();
	}
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product removed successfully";
		}else {
			return "Product not present";
		}
	}
	public String updatetProduct(Product product) {
		if(pd.updateProduct(product)>0) {
			return "Product price updated successfully";
		}else {
			return "product not present";
		}
	}
}