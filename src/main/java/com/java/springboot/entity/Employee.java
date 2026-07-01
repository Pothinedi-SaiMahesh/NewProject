package com.java.springboot.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	
	private Integer id;
	
	private String name;
	
	private Double salary;

}
