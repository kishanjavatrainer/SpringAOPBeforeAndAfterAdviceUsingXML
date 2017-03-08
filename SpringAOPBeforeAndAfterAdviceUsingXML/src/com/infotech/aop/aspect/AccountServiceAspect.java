package com.infotech.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class AccountServiceAspect {

	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("Before method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
	}
	
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("After method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
	}
}
