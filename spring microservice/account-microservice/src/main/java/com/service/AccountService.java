package com.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		accountRepository.save(account);
		return "Account created successfully";
	}
	
	public String findBalance(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
			Account acc = result.get();
			return "Your balance "+acc.getAmount();
		}else {
			return "InValid account number";
		}
	}
	
	public int findAccountNumber(String emailid) {
		try {
		return accountRepository.findAccountNumber(emailid);
		}catch(Exception e) {
			return -1;
		}
	}
	
	public String withdrawn(Account account) {			// accno and amount 
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			Account acc = result.get();
			acc.setAmount(acc.getAmount()-account.getAmount());
			accountRepository.saveAndFlush(acc);
			return "Account withdrawn done successfully";
		}else {
			return "Withdraw not done";
		}
	}
	
	public String deposit(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			Account acc = result.get();
			acc.setAmount(acc.getAmount()+account.getAmount());
			accountRepository.saveAndFlush(acc);
			return "Account deposit done successfully";
		}else {
			return "Deposit not done";
		}
	}
}