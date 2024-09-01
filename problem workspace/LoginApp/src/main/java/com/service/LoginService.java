package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepo;
	
	public String doSignup(Login login) {
		String message = null;
		int result = loginRepo.storeLoginDetails(login);
		if (result > 0) {
			message = "success";
		}
		return message;
	}

	public String doSignin(Login login) {
		String typeOfuser = loginRepo.getTypeOfUser(login);
		return typeOfuser;
	}
}
