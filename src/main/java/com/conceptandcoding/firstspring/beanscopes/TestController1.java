package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
//@Scope("prototype")
@Scope("request")
@RequestMapping(value = "/api/")
public class TestController1 {

	@Autowired
	User2 user;

	@Autowired
	Student student;

	public TestController1() {
		System.out.println("TestController1 instance initializeation");
	}

	@PostConstruct
	public void init() {
		System.out.println(
				"TestController1 object hashCode: " + this.hashCode() + " User object hashCode: " + user.hashCode() +" Student object hashCode "+student.hashCode());
	}

	@GetMapping(path = "/user")
	public ResponseEntity<String> userDetails() {
		System.out.println("fetch user api invoked");
		return ResponseEntity.status(HttpStatus.OK).body("");
	}

}
