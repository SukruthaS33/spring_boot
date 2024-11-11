package com.conceptandcoding.firstspring.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/")
public class ClassXYZ {

	@Autowired
	@Qualifier("classX1 object")
	ClassX classX1;

	@Autowired
	@Qualifier("classX2 object")
	ClassX classX2;

	public ClassXYZ() {
		System.out.println("ClassXYZ initialized ");

	}

	@PostConstruct
	public void postConstruct() {
		System.out.println(classX1);

	}

	@GetMapping("/order")
	public ResponseEntity<String> placeOrder(@RequestParam boolean isClassX1) {
		System.out.println("inside placeOrder " + isClassX1);
		if (isClassX1) {
			classX1.order();
		}

		else {
			classX2.order();
		}

		return ResponseEntity.status(HttpStatus.OK).body("orderd");
	}

}
