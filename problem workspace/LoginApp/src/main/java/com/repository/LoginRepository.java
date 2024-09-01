package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginRepository {

	@Autowired
	DataSource ds;

	public int storeLoginDetails(Login login) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?,?)");
			pstmt.setString(1, login.getEmailid());
			pstmt.setString(2, login.getPassword());
			pstmt.setString(3, login.getTypeofuser());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

	public String getTypeOfUser(Login login) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
			pstmt.setString(1, login.getEmailid());
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				login.setTypeofuser(rs.getString(3));
			}
			return login.getTypeofuser();
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}

}
