package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/api/")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestController5 {

	@Autowired
	User2 user;

	int proxyHashCode;

	public TestController5() {
		System.out.println("TestController5 instance initialized with proxy");
	}

	@PostConstruct
	public void init() {
		System.out.println(
				"TestController5 object hashCode " + this.hashCode() + " User object hashCode " + user.hashCode());
		proxyHashCode = user.hashCode();
	}

	@GetMapping(path = "/user2")
	public ResponseEntity<String> getUserDetails() {
		System.out.println("fetchUser2 api invoked and user hashcode is" + user.hashCode() +" proxyHashCode "+proxyHashCode);
		return ResponseEntity.status(HttpStatus.OK).body("");//here both proxy and user hashcode will be same as .equals() method is used to get them:)
	}
}
