package com.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {

	private List<Product> listOfProducts = new ArrayList<Product>();

	public String addProduct(Product product) {
		int flag = 0;
		String message = null;
		if (listOfProducts.size() != 0) {
			Iterator<Product> li = listOfProducts.iterator();
			while (li.hasNext()) {
				Product p = li.next();
				if (p.getPid() == product.getPid()) {
					flag++;
					message = "product id " + product.getPid() + " already present";
					break;
				}
			}
		}

		if (flag == 0 || listOfProducts.size() == 0) {
			listOfProducts.add(product);
			try {
				FileOutputStream fos = new FileOutputStream("productlist");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(listOfProducts);
				oos.flush();
				oos.close();
				message = "Product serialized successfully";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return message;
	}

	public List<Product> findAllProducts() {
		try {
			FileInputStream fis = new FileInputStream("productlist");
			ObjectInputStream ois = new ObjectInputStream(fis);
			listOfProducts = (ArrayList) ois.readObject();
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfProducts;
	}

	public String deleteProduct(int pid) {
		int flag = 0;

		Iterator<Product> li = listOfProducts.iterator();
		while (li.hasNext()) {
			Product p = li.next();
			if (p.getPid() == pid) {
				li.remove();
				flag++;
				break;
			}
		}

		if (flag == 0) {
			return "Product not present";
		} else {
			flag = 0;
			return "Product deleted successfully";
		}
	}

	public String updatetProduct(Product product) {
		int flag = 0;
		Iterator<Product> li = listOfProducts.iterator();
		while (li.hasNext()) {
			Product p = li.next();
			if (p.getPid() == product.getPid()) {
				p.setPrice(product.getPrice());
				flag++;
				break;
			}
		}
		if (flag == 0) {
			return "Product not present";
		} else {
			flag = 0;
			return "Product price updated successfully";
		}
	}
}