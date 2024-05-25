package com.aop.aspects;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	Logger logger=LoggerFactory.getLogger(getClass());

	@Before(value = "execution(* com.aop.controllers.EmployeeController.*(..))")
	public void beforeEmployeeControllerAdvice(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature()+" method started at "+new Date());
	}
	@After(value = "execution(* com.aop.controllers.EmployeeController.*(..))")
	public void afterEmployeeControllerAdvice(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature()+" method ended at "+new Date());
	}
	
	@Before(value = "execution(* com.aop.service.impl.EmployeeServiceImpl.*(..))")
	public void beforeEmployeeServiceAdvice(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature()+" method started at "+new Date());
	}
	@After(value = "execution(* com.aop.service.impl.EmployeeServiceImpl.*(..))")
	public void afterEmployeeServiceAdvice(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature()+" method ended at "+new Date());
	}
}
