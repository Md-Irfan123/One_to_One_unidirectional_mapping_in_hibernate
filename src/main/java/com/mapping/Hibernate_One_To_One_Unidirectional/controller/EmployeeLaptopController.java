package com.mapping.Hibernate_One_To_One_Unidirectional.controller;

import java.util.List;
import java.util.Scanner;

import com.mapping.Hibernate_One_To_One_Unidirectional.dao.EmployeeLaptopDao;
import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Employee;
import com.mapping.Hibernate_One_To_One_Unidirectional.dto.Laptop;
import com.mapping.Hibernate_One_To_One_Unidirectional.service.EmployeeLaptopService;

public class EmployeeLaptopController {

	public static void main(String[] args) {
		EmployeeLaptopService service=new EmployeeLaptopService();
		EmployeeLaptopDao dao=new EmployeeLaptopDao();
		Scanner sc=new Scanner(System.in);
		char p;
//		Laptop laptop=new Laptop(3333, "Samsung", "White", 45000.9);
//		Employee employee=new Employee(2321, "Ankur", "Ankur@ibm.com", 924567, laptop);
//		
//		service.saveEmployeeLaptopService(employee, laptop);
		

		do {
			System.out.println("Enter your option....");
			System.out.println("1.INSERT\n2.GetById\n3.DELETE\n4.UPDATE\n5.DISPLAY\n6.DeleteByJPQL\n7.UpdateByJPQL");
			int key=sc.nextInt();
			switch(key) {
			
			case 1:{
//				System.out.println("Enter laptop Id");
//				int id=sc.nextInt();
//				sc.nextLine();
				System.out.println("Enter laptop name");
				String name =sc.nextLine();
				sc.nextLine();
				System.out.println("Enter laptop color");
				String color=sc.nextLine();
				System.out.println("Enter laptop price ");
				double price =sc.nextDouble();
				
				Laptop laptop=new Laptop(name, color, price);
				System.out.println("Enter employee id");;
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter employee name");
				String name1=sc.nextLine();
				System.out.println("Enter employee email");
				String email=sc.nextLine();
				System.out.println("Enter employee phone no.");
				long phone =sc.nextLong();
				Employee employee=new Employee(id,name1, email, phone, laptop);
				
				service.saveEmployeeLaptopService(employee, laptop);
			
			}
			break;
			
			case 2:
			{
				System.out.println("Enter the id to display");
				int id=sc.nextInt();
				Employee employee=service.getLaptopByEmployeeIdService(id);
				if(employee!=null) {
					System.out.println(employee);
					Laptop laptop=employee.getLaptop();
					
					if(laptop!=null) {
						System.out.println(laptop);
					}
				}
			}
			
			break;
			
			case 3:
			{
				System.out.println("Enter the id to delete");
				int id=sc.nextInt();
				Employee emp=dao.deleteLaptopByEmployeeByIdDao(id);
				if(emp!=null) {
					System.out.println("Data deleted successfully");
				}
				else {
					System.out.println("Data not deleted");
				}
				
			}
			break;
			case 4:
			{
				
				System.out.println("Enter employee id");;
				int id1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter employee name");
				String name1=sc.nextLine();
				System.out.println("Enter employee email");
				String email=sc.nextLine();
				System.out.println("Enter employee phone no.");
				long phone =sc.nextLong();
				
			}
			case 5:
			{
				List<Employee> emp=dao.getAllEmployeeDetails();
				if(!emp.isEmpty()) {
					System.out.println("Employee -Details");
					for (Employee employee : emp) {
						System.out.println("employee");
						
						Laptop lap=employee.getLaptop();
						if(lap!=null) {
							System.out.println(lap);
						}
						
					}
				}
			}
			break;

			}System.out.println("Press Y/y to continue");
			p=sc.next().charAt(0);
			
			}while(p=='Y'|| p== 'y');
		System.out.println("Program ends");

		
		
	}
}
