package com.mapping.Hibernate_One_To_One_Unidirectional.service;

import com.mapping.Hibernate_One_To_One_Unidirectional.dao.EmployeeLaptopDao;
import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Employee;
import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Laptop;

public class EmployeeLaptopService {
	EmployeeLaptopDao dao=new EmployeeLaptopDao();
	
	
	public Employee saveEmployeeLaptopService(Employee e, Laptop l) {
		int id=e.getId();
		int id1=l.getId();
		if(id<1000&& id>1000) {
			System.out.println("successfull ");
		}
		else if(id1<1000 && id>100) {
			System.out.println("successfull ");
		}
		else {
			System.out.println("Given id is greater than 3 digit or  less than 3 digit ");
		}
		
		return dao.saveEmployeeLaptopDao(e, l);
	}
	
	
	
	public Employee getLaptopByEmployeeIdService(int employeeId) {
		return dao.getLaptopByEmployeeIdDao(employeeId);
	}

}
