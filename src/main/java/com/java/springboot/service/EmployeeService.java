package com.java.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
  @Autowired
  private EmployeeRepository repo;
  

}
