package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String storeEmployee(Employee employee) {
		Optional<Employee> result = employeeRepository.findById(employee.getId());
		if(result.isPresent()) {
			return "Key id must be unique";
		}else {
			employeeRepository.save(employee);
			return "Employee record stored";
		}
	}
	
	public Iterable<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
}