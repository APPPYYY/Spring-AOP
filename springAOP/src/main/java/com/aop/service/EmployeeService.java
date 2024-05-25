package com.aop.service;

import java.util.List;

import com.aop.entity.EmployeeEntity;

public interface EmployeeService {

	List<EmployeeEntity> fetchAllEmployee();
}
