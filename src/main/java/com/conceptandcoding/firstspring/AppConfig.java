package com.conceptandcoding.firstspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conceptandcoding.firstspring.lazyunderstanding.ClassA;

@Configuration
public class AppConfig {

	
	@Bean
	ClassA createClassABean() {// public is not required here as an AM
		System.out.println("creating class A bean");
		return new ClassA("Hi ClassA");

	}

}
