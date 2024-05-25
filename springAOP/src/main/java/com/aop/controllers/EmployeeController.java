package com.aop.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.entity.EmployeeEntity;
import com.aop.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl impl;
	
	Logger logger=LoggerFactory.getLogger(getClass());
	
	@GetMapping("/")
	public List<EmployeeEntity> fetchAllEmployee(){
		List<EmployeeEntity> fetchAllEmployee = impl.fetchAllEmployee();
		logger.info("I am controller");
		return fetchAllEmployee;
	}
	
}
