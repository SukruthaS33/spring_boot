package com.conceptandcoding.firstspring.transactional;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionalAspectLogging {

	@Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object transactionalLogging(ProceedingJoinPoint pJp) {
		System.out.println("transactional aspect logging ");
		String methodName = pJp.getSignature().getName();
		System.out.println("start " + methodName);
		Object result=null;
		try {
			 result = pJp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end " + methodName);
		return result;

	}

}
