package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepo;
	
	public String createAccount() {
		
	}
	
	public String depositAmount() {
		
	}
	
	public String withdrawAmount() {
	
	}
	
	public String checkBalance() {
		
	}

}
