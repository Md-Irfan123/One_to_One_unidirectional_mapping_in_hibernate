package com.mapping.Hibernate_One_To_One_Unidirectional.controller;

import java.util.Scanner;

import com.mapping.Hibernate_One_To_One_Unidirectional.dao.UpdateLaptopDao;

public class LaptopUpdateController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UpdateLaptopDao dao=new UpdateLaptopDao();
		char p;
		
		do {
			System.out.println("1.Update");
			int key=sc.nextInt();
			switch(key) {
			case 1:{
				System.out.println("Enter laptop id to update ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new laptop name");
				String name=sc.nextLine();
				System.out.println("Enter new  laptop color ");
				String color=sc.nextLine();
				System.out.println("Enter new price");
				double price=sc.nextDouble();
				int a=dao.updateLaptopByJPQLDao(id, name, color, price);
				System.out.println(a);
				
				
			
			}
		}System.out.println("Press Y/y to continue");
		p=sc.next().charAt(0);
		
		}while(p=='Y'|| p== 'y');
	System.out.println("Program ends");

	}

}
