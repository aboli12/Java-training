package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class EmployeeDao {

	// in Core JPA
	// EntityManagerFactory emf = Persistence.createEntityManager("db-info");
	// db-info present in persistence.xml file with database details. 
	
	@Autowired
	EntityManagerFactory emf;			// DI 
	
	public int storeEmployee(Employee emp) {
			try {
			EntityManager manager = emf.createEntityManager();  // Like preparedstatement reference
			
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(emp);				// is like insert query 
			tran.commit();
			return 1;
			}catch(Exception e) {
				System.err.println(e);
				return 0;
			}			
	}
	
	public int deleteEmployeeRecord(int eid) {
		EntityManager manager = emf.createEntityManager();  // Like preparedstatement reference
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, eid);	// select * from employee where eid=1;
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				manager.remove(emp);			// delete from employee where eid=1;
			tran.commit();
			return 1;
		}
	}
	
	public int updateEmployeeRecord(Employee employee) {
		EntityManager manager = emf.createEntityManager();  // Like preparedstatement reference
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, employee.getEid());	// select * from employee where eid=1;
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				emp.setSalary(employee.getSalary());
				manager.merge(emp);     // update query 
			tran.commit();
			return 1;
		}
	}
	
	public Employee findById(int eid) {
		EntityManager manager = emf.createEntityManager();  // Like preparedstatement reference
		Employee emp = manager.find(Employee.class, eid);	// select * from employee where eid=1;
		return emp;
	}
	
	public List<Employee> findAllEmployees() {
		EntityManager manager = emf.createEntityManager(); 
		Query qry = manager.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	}
}



