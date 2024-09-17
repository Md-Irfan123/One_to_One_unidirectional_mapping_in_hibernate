package com.mapping.Hibernate_One_To_One_Unidirectional.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	
	@Id
	
	private int id;
	private String name;
	private String email;
	private long phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="laptop_id")
	private Laptop laptop;

	
	
	
	

}
