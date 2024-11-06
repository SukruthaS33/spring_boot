package com.conceptandcoding.firstspring.concepts;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Lazy
public class ClassB {

	static {
		System.out.println("Class B in memory");
	}

	public ClassB() {
		System.out.println("ClassB bean ready");
	}

	public void callClassB() {
		System.out.println("My name is class B");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("class b post construct");
	}
}
