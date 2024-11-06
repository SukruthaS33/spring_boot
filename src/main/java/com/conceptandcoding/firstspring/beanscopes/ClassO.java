package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ClassO {

	//@Lazy if this is used then each time a method call is made new instance will be created because spring will call the lazy when it's needed and if it also a prototype it won't check for the existing instance and simply creates new one
	@Autowired
	ClassN classN;

	@Autowired
	ClassN classN2;

	public ClassO() {
		System.out.println("I am ClassO");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println(this.classN.hashCode());
		this.callClassN();
		this.callClassN2();
		this.callClassN3();
	}

	public void callClassN() {
		System.out.println("classO calling N");
		classN.callClassN();
	}

	public void callClassN2() {
		System.out.println("classO calling N2");
		classN.callClassN2();
	}
	
	public void callClassN3() {
		System.out.println("classO calling N3");
		classN.callClassN3();
	}
}
