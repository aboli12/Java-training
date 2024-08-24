package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:9090/
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage(Model model,Employee employee) {   // DI
		model.addAttribute("emp", employee);
		return "index";
	}
	
	@RequestMapping(value = "/storeemployee",method = RequestMethod.POST)
	public String storeEmployee(Model model,Employee employee) {   // DI
		String result = employeeService.storeEmployee(employee);
		System.out.println(result);
		model.addAttribute("msg", result);
			employee.setEid(0);
			employee.setEname("");
			employee.setSalary(0.0f);
		model.addAttribute("emp", employee);
		return "index";
	}
	
}

