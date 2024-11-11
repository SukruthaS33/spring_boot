package com.conceptandcoding.firstspring.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/transactionalController")
public class TransactionalController {

	@Autowired
	TransactionalService service;

	@PostMapping(value = "/transactionControllerMethod")
	public ResponseEntity<String> transactionalControllerMethod1() {

		try {
			if (service.transactionalServiceMethod()) {
				return ResponseEntity.status(HttpStatus.OK).body("transactional controller method");
			} else {
				System.out.println("transaction has been rolledback");
			}
		} catch (Exception e) {
			System.out.println("some exception occured");
			e.printStackTrace();
		}

		return null;

	}
}
