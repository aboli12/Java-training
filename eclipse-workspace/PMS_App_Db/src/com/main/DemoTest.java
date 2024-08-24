package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;
public class DemoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String con;
		int pid;
		String pname;
		float price;
		String result;
		ProductService ps  = new ProductService();
		do {
			System.out.println("1:Add Product 2 :View all products 3 : Delete product 4 : Update product price");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter the product id");
			    pid = sc.nextInt();
			    System.out.println("Enter the product name");
				pname = sc.next();
				System.out.println("Enter ther product price");
				price = sc.nextFloat();
				Product p = new Product(pid, pname, price);
				result = ps.addProduct(p);
				System.out.println(result);
				break;
			case 2 : List<Product> listOfProduct = ps.findAllProducts();
			         for(Product product :listOfProduct) {
			        	 System.out.println(product);   // toString method 
			         }
			         break;
			case 3 :System.out.println("Enter the product id");
			          pid = sc.nextInt();
			          result = ps.deleteProduct(pid);
			          System.out.println(result);
			          break;
			
			          
			case 4:System.out.println("Enter the product id");
		    		pid = sc.nextInt();
		    		System.out.println("Enter ther product price");
		    		price = sc.nextFloat();
		    		Product p1 = new Product();
		    		p1.setPid(pid);
		    		p1.setPrice(price);
		    		result = ps.updatetProduct(p1);
		    		System.out.println(result);
		    		
		    		break;
			
			default:System.out.println("wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");

	}

}
