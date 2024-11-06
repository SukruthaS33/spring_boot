//package com.conceptandcoding.firstspring.beanscopes;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import jakarta.annotation.PostConstruct;
//
//@Component
// class ClassM {
//
//	@Autowired
//	ClassN classN;
//
//	public ClassM() {
//		System.out.println("Hi I am ClassM");
//	}
//
//	@PostConstruct
//	public void postConstruct() {
//		System.out.println(this.classN.hashCode());
//		classN.callClassN();
//		classN.callClassN2();
//	}
//	
//	public void callClassN() {
//		
//		classN.callClassN();
//	}
//
//}
