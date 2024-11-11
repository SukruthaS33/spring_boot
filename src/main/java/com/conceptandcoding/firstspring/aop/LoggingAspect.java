package com.conceptandcoding.firstspring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	
	
	// POINTCUTS//

	// POINTCUT execution
	// execution is a connotes a method so its important to write these syntaxes of
	// pointcuts according to this
	@Before("execution(public String com.conceptandcoding.firstspring.aop.Employee.fetchEmployee())")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside beforeMethod aspect");
		System.out.println("entered " + methodName);

	}

	@Before("execution(public String com.conceptandcoding.firstspring.aop.Employee.updateEmployee(..))")
	public void beforeMethod2(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside beforeMethod aspect");
		System.out.println("entered " + methodName);

	}
	// a pointcut and it can have many join points say many methods are manyy join
	// points

	@After("execution(public String com.conceptandcoding.firstspring.aop.Employee.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside afterMethod first aspect");
		System.out.println("exited " + methodName);

	}

	@After("execution(public String com.conceptandcoding.firstspring.aop.Employee.*(..))")
	public void afterMethod98(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside afterMethod98 aspect");
		System.out.println("exited " + methodName);

	}

	// after any method with no parameters inside any folder inside the .firstspring
	// package
	@Before("execution(public String com.conceptandcoding.firstspring..*(..))")
	public void afterAnyMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside afterMethod aspect");
		System.out.println("exited " + methodName);

	}

	// any get method like getName, getAge

	@Pointcut("execution(* get*(..))")
	public void aMethod(JoinPoint jp) {

	}

	// POINTCUT within:Matches all method within any class or package
	// any method inside any classes under the firstspring
	@Before("within(com.conceptandcoding.firstspring..*)")
	public void beforeWithin(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside beforeWithin aspect");
		System.out.println("exited " + methodName);
	}

	// any method inside Employee class, you can also use * instead of class name to
	// mention all(any) classes under aop
	@Before("within(com.conceptandcoding.firstspring.aop.Employee)")
	public void beforeWithin2(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();
		System.out.println("inside beforeWithin2 aspect");
		System.out.println("exited " + methodName);
	}

	// POINTCUT @within

	// here we don't have to provide class path for the class but only the
	// annotation that is used on the class and that would be taken

	@Before("@within(org.springframework.stereotype.Service)")
	public void beforeAtWithin(JoinPoint joinPoint) {

		String methodName = joinPoint.getSignature().getName();

		System.out.println("inside beforeAtWithin aspect");
		System.out.println("exited " + methodName);
	}

	// POINTCUT @annotation
	// matches any method that is annotated with given annotation

	@Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
	public void beforeAnnotatedMethod(JoinPoint joinPoint) {
		System.out.println("inside the @annotation advice");
		String methodName = joinPoint.getSignature().getName();

		System.out.println("before " + methodName);
	}

	// POINTCUT args executes for a joinpoint that matches the arguments mentioned
	// inside args()

	@Before("args(String,int)")
	public void beforeArgsMethod(JoinPoint joinPoint) {
		System.out.println("Inside beforeArgsMethod");
		String methodName = joinPoint.getSignature().getName();
		System.out.println("starting " + methodName);
	}

	@Before("@args(com.conceptandcoding.firstspring.Employee)") // instead of primitive we have an object
	public void beforeArgsMethod2(JoinPoint joinPoint) {
		System.out.println("Inside beforeArgsMethod for custom Objects");
		String methodName = joinPoint.getSignature().getName();
		System.out.println("starting " + methodName);
	}

//	@Before("args(java.lang.Object)")//instead of primitive we have an object this will throw errors never use this
//	public void beforeArgsMethod3(JoinPoint joinPoint) {
//		System.out.println("Inside beforeArgsMethod for any Object");
//		String methodName = joinPoint.getSignature().getName();
//		System.out.println("starting " + methodName);
//	}

	// BOILING WATER ON STOVE

	// POINTCUT target
	@Before("target(com.conceptandcoding.firstspring.aop.Employee)") // this can be class or interface too
	public void beforeTargetMethod(JoinPoint joinPoint) {
		System.out.println("Inside beforeTargetMethod for any method in a class");
		String methodName = joinPoint.getSignature().getName();
		System.out.println("starting " + methodName);

	}

	// POINTCUT combined
	@Before("execution(* com.conceptandcoding.firstspring.aop.Employee.*())"
			+ "&& @within(org.springframework.web.bind.annotation.RestController)")
	public void beforeAndCombinedPcMethod(JoinPoint jp) {
		System.out.println("Inside beforeAndCombinedPcMethod for any method in a class");
		String methodName = jp.getSignature().getName();
		System.out.println("starting " + methodName);
	}

	@Before("execution(* com.conceptandcoding.firstspring.aop.Employee.*())"
			+ "|| @within(org.springframework.web.bind.annotation.RestController)")
	public void beforeOrCombinedPcMethod(JoinPoint jp) {
		System.out.println("Inside beforeAndCombinedPcMethod for any method in a class");
		String methodName = jp.getSignature().getName();
		System.out.println("starting " + methodName);
	}

	// NAMED POINTCUTS

//We have seen the basics of pointcuts but there are reasons we need more . Say I want to apply multiple advises to same pointcut ? in such cases pointcut names comes handy

	@Pointcut("execution(* com.conceptandcoding.firstspring.aop.Employee.*(..))")
	public void customPointcutName() {
		// always stays empty

	}

	@Before("customPointcutName()")
	public void beforeMethodCustomPointcut() {
		System.out.println("inside beforeMethodCustomPointcut");
	}

	@After("execution(* com.conceptandcoding.firstspring.aop.Employee.*(..))")
	public void beforeMethodCustomPointcutTest() {
		System.out.println("inside beforeMethodCustomPointcut");
	}

	// POINTCUT around annotation

	@Around("execution(* com.conceptandcoding.firstspring.aop.Employee.*(..))")
	public void aroundMethod(ProceedingJoinPoint jp) {

		System.out.println("around method");
		System.out.println("entered " + jp.getSignature().getName());
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("exited " + jp.getSignature().getName());

	}
}
