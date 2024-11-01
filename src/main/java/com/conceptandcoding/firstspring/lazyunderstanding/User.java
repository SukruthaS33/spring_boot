package com.conceptandcoding.firstspring.lazyunderstanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	Order order;

	public User() {

		System.out.println("user constructor");
	}

}
