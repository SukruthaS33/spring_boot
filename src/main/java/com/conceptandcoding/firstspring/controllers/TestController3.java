package com.conceptandcoding.firstspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController3 {
	
	@GetMapping(path = "/demoapp") 
	ResponseEntity<String> getDemoApp(){
		
		return ResponseEntity.status(HttpStatus.OK).body("demo app");
		
	}

	
	@GetMapping(name = "/demoapp") 
	ResponseEntity<String> getDemoApp2(){
		
		return ResponseEntity.status(HttpStatus.OK).body("demo app2");
		
	}
}
