package com.conceptandcoding.firstspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "//api/v1") // or value two slashes will also work
public class TestRequestParam {

	@GetMapping(path="/testrequestparam")
	public ResponseEntity<String> testRequestParam(@RequestParam(value = "firstName" ,required=false) String firstName ) {

		return ResponseEntity.status(HttpStatus.OK).body("tested request Param " + firstName);
	}
	
	

}
