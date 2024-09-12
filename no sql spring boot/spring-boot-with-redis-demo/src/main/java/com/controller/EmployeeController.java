package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("redis")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Employee> findAll() {
		return employeeService.findAllEmployee();
	}
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee employee) {
		return employeeService.storeEmployee(employee);
	}
}