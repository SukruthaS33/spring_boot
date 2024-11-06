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
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/api/")
@Scope(value = "session")
public class TestController6 {

	@Autowired
	User2 user;

	int proxyHashCode;

	public TestController6() {
		System.out.println("TestController6 instance initialized with proxy");
	}

	@PostConstruct
	public void init() {
		System.out.println(
				"TestController6 object hashCode " + this.hashCode() + " User object hashCode " + user.hashCode());
		proxyHashCode = user.hashCode();
	}

	@GetMapping(path = "/user3")
	public ResponseEntity<String> getUserDetails(HttpServletRequest request) {
		System.out.println("inside get User details");
		System.out.println(request.toString());
		HttpSession session = request.getSession();

		System.out.println(session.toString());
		System.out.println(
				"fetchUser3 api invoked and user hashcode is" + user.hashCode() + " proxyHashCode " + proxyHashCode);

		return ResponseEntity.status(HttpStatus.OK).body("");// here both proxy and user hashcode will be same as
																// .equals() method is used to get them:)
	}

	@GetMapping(path = "/logout")
	public ResponseEntity<String> logout(HttpServletRequest request) {

		System.out.println("inside logout details");
		System.out.println(
				"logout api invoked and user hashcode is" + user.hashCode() + " proxyHashCode " + proxyHashCode);
		System.out.println("end the session");
		HttpSession session = request.getSession();

		// System.out.println(request.toString());

		System.out.println(session.toString());
		session.invalidate();
		return ResponseEntity.status(HttpStatus.OK).body("");// here both proxy and user hashcode will be same as
																// .equals() method is used to get them:)
	}
}
