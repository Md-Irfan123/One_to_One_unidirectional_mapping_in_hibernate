package com.mapping.Hibernate_One_To_One_Unidirectional.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Laptop {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "laptop_id")
	private int id;
	private String name;
	private String color;
	private double price;
	
	public Laptop(String name, String color, double price) {
		
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
	
	
}
