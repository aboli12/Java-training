package com.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Login {

	private String emailid;
	private String password;
	private String typeofuser;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeofuser() {
		return typeofuser;
	}
	public void setTypeofuser(String typeofuser) {
		this.typeofuser = typeofuser;
	}
	
	@Override
	public String toString() {
		return "Login [emailid=" + emailid + ", password=" + password + ", typeofuser=" + typeofuser + "]";
	}
}
