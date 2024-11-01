package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;


public class ClassA {

	@Lazy
	@Autowired
	ClassB classB;
	
	public String message;

	static {
		System.out.println("Class A available");

	}

	public ClassA() {
		System.out.println("Object of class ClassA created");

	}

	public ClassA(String message) {
		this.message=message;
		System.out.println(message);
	}

	@PostConstruct
	public void postConstructMethod() {
		System.out.println("Bean has been constructed and dependencies have been injected too ");
	}

	public void callClassB() {
	
		classB.callClassB();
	}
}
