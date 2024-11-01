package com.conceptandcoding.firstspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController4 {
	
	
	@PostMapping(path="/postsomething")//@PostMapping(path = {"ek","doh"}
	
	ResponseEntity<String> postSomething(@RequestParam(name="firstName") String name){
		
		return ResponseEntity.status(HttpStatus.OK).body("posted "+name);
		
	}
	

}
