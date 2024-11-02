//package com.conceptandcoding.firstspring.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.conceptandcoding.firstspring.lazyunderstanding.ClassA;
//
//@Component
//public class SomeController {
//
//	ClassA classA;
//
//	@Autowired
//	public SomeController(ClassA classA) {
//		System.out.println(classA.message);
//		this.classA = classA;
//
//		// Now you can use classA
//		System.out.println("calling class B in SomeController");
//		classA.callClassB(); // Call method to demonstrate usage
//	}
//}
