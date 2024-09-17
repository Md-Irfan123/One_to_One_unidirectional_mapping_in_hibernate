package com.mapping.Hibernate_One_To_One_Unidirectional.controller;

import java.util.Scanner;

import com.mapping.Hibernate_One_To_One_Unidirectional.dao.EmployeeUpdateDao;

public class UpdateEmployeeController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeUpdateDao dao=new EmployeeUpdateDao();
		int p;
		
		do {
			System.out.println("1.Update");
			int key=sc.nextInt();
			switch(key) {
			case 1:{
				System.out.println("Enter Employee id to update ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new Employee name");
				String name=sc.nextLine();
				System.out.println("Enter new Employee email ");
				String email=sc.nextLine();
				System.out.println("Enter new phone no.");
				long phone=sc.nextLong();
				int a=dao.updateEmployeeByIdDao(id, name, email, phone);
				System.out.println(a);
				
			
			}
		}System.out.println("Press Y/y to continue");
		p=sc.next().charAt(0);
		
		}while(p=='Y'|| p== 'y');
	System.out.println("Program ends");

	}

}
