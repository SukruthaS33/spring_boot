package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Student {
	@Autowired
	User2 user;

	public Student() {
		System.out.println("Student instance initialization");
	}

	@PostConstruct
	public void pCon() {
		System.out.println("pCon Student object hashCode " + this.hashCode() + " User object hashCode " + user.hashCode());
	}
}
