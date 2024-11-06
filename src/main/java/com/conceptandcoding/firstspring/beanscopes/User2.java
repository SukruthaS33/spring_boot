package com.conceptandcoding.firstspring.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User2 {

	public User2() {
		System.out.println("User2 Initialized");
	}

}
