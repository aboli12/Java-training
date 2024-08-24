package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
	Employee emp1 = new Employee(1, "Ravi", 12000);
	Employee emp2 = new Employee(2, "Rajesh", 18000);
	Employee emp3 = new Employee(3, "Lokesh", 22000);
	Employee emp4 = new Employee(4, "Raju", 28000);
	Employee emp5 = new Employee(5, "Mahesh", 43000);
	List<Employee> listOfEmp = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
	listOfEmp.stream().forEach(emp->System.out.println(emp));			// using lambda 
	listOfEmp.stream().forEach(System.out::println);					// using method reference style 
	listOfEmp.stream().filter(emp->emp.getSalary()>20000).forEach(System.out::println);
//	List<Employee> filterEmpRec= listOfEmp.stream().filter(emp->emp.getSalary()>20000).collect(Collectors.toList());
//	System.out.println("Number of emp "+filterEmpRec.size());
	}

}