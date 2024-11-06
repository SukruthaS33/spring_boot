package com.conceptandcoding.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("======================my first spring boot app has started======================");
		SpringApplication.run(DemoApplication.class, args);
		
		
	}

}
