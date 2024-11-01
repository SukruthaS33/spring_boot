package com.conceptandcoding.firstspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.conceptandcoding.firstspring.lazyunderstanding.ClassA;
import com.conceptandcoding.firstspring.lazyunderstanding.OnlineOrder;
@Configuration
public class AppConfig {

	
//	@Bean
//	ClassA createClassABean() {// public is not required here as an AM
//		System.out.println("creating class A bean");
//		return new ClassA("Hi ClassA");
//
//	}

	@Primary
	@Bean
	OnlineOrder createClassOnlineOrder() {// public is not required here as an AM
		System.out.println("creating class online order bean");
		return new OnlineOrder();

	}
}
