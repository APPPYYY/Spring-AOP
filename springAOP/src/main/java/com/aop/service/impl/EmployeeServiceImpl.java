package com.aop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.aop.entity.EmployeeEntity;
import com.aop.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	Logger logger=LoggerFactory.getLogger(getClass());

	@Override
	public List<EmployeeEntity> fetchAllEmployee() {
		logger.info("I am service");
		List<EmployeeEntity> list=new ArrayList<>();
		EmployeeEntity entity=new EmployeeEntity();
		entity.setId(1);
		entity.setName("TEST 1");
		list.add(entity);
		EmployeeEntity entity2=new EmployeeEntity();
		entity2.setId(2);
		entity2.setName("TEST 2");
		list.add(entity2);
		EmployeeEntity entity3=new EmployeeEntity();
		entity3.setId(3);
		entity3.setName("TEST 3");
		list.add(entity3);
		return list;
	}

}
