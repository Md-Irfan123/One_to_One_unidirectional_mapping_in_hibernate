package com.mapping.Hibernate_One_To_One_Unidirectional.dao;

import java.awt.datatransfer.SystemFlavorMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Employee;

public class EmployeeUpdateDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public int updateEmployeeByIdDao(int employeeId,String name,String email,long phone) {
		String updateQuery="update Employee e set e.name=?1,e.email=?2,e.phone=?3 where e.id=:eId";
		Query query=em.createQuery(updateQuery);
		query.setParameter("eId",employeeId);
		query.setParameter(1, name);
		query.setParameter(2, email);
		query.setParameter(3, phone);
		et.begin();
		int a=query.executeUpdate();
		et.commit();
		return a;
	}

}
