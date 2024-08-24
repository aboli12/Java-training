package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored in db";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public List<Employee> findAllEmployees() {
		return employeeDao.findAllEmployees();
	}
	
	public String deleteEmployeeById(int eid) {
		if(employeeDao.deleteEmployeeRecord(eid)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
	public String updateEmployeeById(Employee emp) {
		if(employeeDao.updateEmployeeRecord(emp)>0) {
			return "Employee record update successfully";
		}else {
			return "Employee record not present";
		}
	}
	public String findEmployee(int eid) {
		Employee emp = employeeDao.findById(eid);
		if(emp==null) {
			return "Record not present";
		}else {
			return emp.toString();
		}
	}
	
	public Employee findEmployeeById(int eid) {
		Employee emp = employeeDao.findById(eid);
		if(emp==null) {
			return null;
		}else {
			return emp;
		}
	}
}