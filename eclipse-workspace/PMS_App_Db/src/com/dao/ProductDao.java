package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {
	public int storeProduct(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
////		System.out.println("driver loaded...");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", "root", "root@123");
			Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
	pstmt.setInt(1, product.getPid());
	pstmt.setString(2, product.getPname());
	pstmt.setFloat(3, product.getPrice());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public int updateProduct(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", "root", "root@123");
			Connection con = DbResource.getDbConnection();		
	PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
	pstmt.setFloat(1, product.getPrice());
	pstmt.setInt(2, product.getPid());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public int deleteProduct(int pid) {
		try {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", "root", "root@123");
			Connection con = DbResource.getDbConnection();		
	PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
	pstmt.setInt(1, pid);
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> retrieveAllProducts() {
		List<Product> listOfProducts = new ArrayList<Product>();
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", "root", "root@123");
		Connection con = DbResource.getDbConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product");
		while(rs.next()) {
			//System.out.println("display data from dao layer");
			//System.out.println("pid is "+rs.getInt(1)+" pname "+rs.getString(2)+" price "+rs.getFloat(3));
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			listOfProducts.add(p);
		}
		return listOfProducts;
			} catch (Exception e) {
				System.err.println(e);
			}
		return null;
	}
}