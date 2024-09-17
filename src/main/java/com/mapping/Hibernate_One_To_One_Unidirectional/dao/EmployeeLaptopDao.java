package com.mapping.Hibernate_One_To_One_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Employee;
import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Laptop;

public class EmployeeLaptopDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Employee saveEmployeeLaptopDao(Employee e, Laptop l) {
		et.begin();
		
		/**
		 *
		 * This  setter method will pass laptop id to employee table 
		 * 
		 */
		
		e.setLaptop(l);
		
		em.persist(e);
		
		et.commit();
		
		return e;
		
	}
	public Employee getLaptopByEmployeeIdDao(int employeeId) {
		
		 return em.find(Employee.class, employeeId);
	
	}
	public Employee deleteLaptopByEmployeeByIdDao(int employeeId) {
		
		Employee employee=getLaptopByEmployeeIdDao(employeeId);
		if(employee!=null) {
			et.begin();
			em.remove(employee);
			et.commit();
			return employee;
		}else {
			return null;
		}
	
	}
	public Employee findEmployeeLaptopDao(Employee e, int laptopId) {
		
		Laptop lap=em.find(Laptop.class, laptopId);
		if(lap!=null) {
			e.setLaptop(lap);
		}
		
		
		et.begin();
		
		/**
		 *
		 * This  setter method will pass laptop id to employee table 
		 * 
		 */
		
		
		
		em.persist(e);
		//em.persist(l);
		et.commit();
		
		return e;
		
	}
	/**
	 * 
	 * display Employee and laptop together
	 * 
	 */
	
	public List<Employee> getAllEmployeeDetails(){
		Query query=em.createQuery(" from Employee");
		return query.getResultList();
		
	}
	 
	

}
