package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

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
	
}
