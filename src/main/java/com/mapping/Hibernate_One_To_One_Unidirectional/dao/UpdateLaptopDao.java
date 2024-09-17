package com.mapping.Hibernate_One_To_One_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateLaptopDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public int updateLaptopByJPQLDao(int laptopId,String name,String color,double price) {
		
		String updateQuery="update Laptop l set l.name=?1,l.color=?2,l.price=?3 where l.id=:lId";
		Query query=em.createQuery(updateQuery);
		query.setParameter("lId",laptopId);
		query.setParameter(1, name);
		query.setParameter(2, color);
		query.setParameter(3, price);
		et.begin();
		int a=query.executeUpdate();
		et.commit();
		return a;
	}

}
