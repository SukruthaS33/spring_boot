package com.conceptandcoding.firstspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController // Controller+ResponseBody
@RequestMapping(value = "/api/v1")
public class TestController {

	@GetMapping(path = "/") // RequestMapping+GetMapping

	ResponseEntity<String> getHomePage() {

		return ResponseEntity.status(HttpStatus.OK).body("This is a home page");
	}

	@GetMapping(path = "/getBankDetail")

	ResponseEntity<String> getBankDetail() {

		return ResponseEntity.status(HttpStatus.OK).body("Bank detail");
	}

	@PostConstruct
	public void initialize() {
		System.out.println("TestController bean is ready to use ");
	}

}
