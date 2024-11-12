package com.conceptandcoding.firstspring.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/transactionalController")
public class TransactionalController {

	@Autowired
	TransactionalService service;

	@PostMapping(value = "/transactionControllerMethod")
	public ResponseEntity<String> transactionalControllerMethod() {

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

	// @Transactional(propagation=Propagation.REQUIRED)
	// if parent transaction exists continue , if no create a new one as it's
	// REQUIRED
	@PostMapping(value = "/transactionControllerMethod1")
	public ResponseEntity<String> transactionalControllerMethod1() {

		try {
			if (service.transactionalServiceMethod1()) {
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

	// @Transactional(propagation=Propagation.REQUIRES_NEW)
	// A new transaction is created irrespective of the parent
	@PostMapping(value = "/transactionControllerMethod2")
	public ResponseEntity<String> transactionalControllerMethod2() {

		try {
			if (service.transactionalServiceMethod2()) {
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

	// @Transactional(propagation=Propagation.SUPPORTS)
	// If parent transaction exists then continue that , if parent transaction
	// doesn't exist don't create a new transaction for child as well
	@PostMapping(value = "/transactionControllerMethod3")
	public ResponseEntity<String> transactionalControllerMethod3() {

		try {
			if (service.transactionalServiceMethod3()) {
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

	// @Transactional(propagation=Propagation.NOT_SUPPORTED)
	// if parent transaction exists, suspend that and continue the child without any
	// transaction resume parent
	// if no parent transaction exists, continue without any transaction
	// for first we may think why NOT_SUPPORTED is needed at all isn't it as good as
	// not having the @Transactinal annotation at all?
	// but no what if we need to execute logging aspect for all the methods that are
	// involved in transaction even if it is NOT_SUPPORTED so we need this
	// Propaation
	@PostMapping(value = "/transactionControllerMethod4")
	public ResponseEntity<String> transactionalControllerMethod4() {

		try {
			if (service.transactionalServiceMethod4()) {
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

	// @Transactional(propagation=Propagation.MANDATORY)
	// no new transaction is created , and if parent transaction is not present
	// throw an exception
	@PostMapping(value = "/transactionControllerMethod5")
	public ResponseEntity<String> transactionalControllerMethod5() {

		try {
			if (service.transactionalServiceMethod5()) {
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

	// @Transactional(propagation=Propagation.MANDATORY)
	// no new transaction is created , and if parent transaction is  present then
	// throw an exception
	@PostMapping(value = "/transactionControllerMethod6")
	public ResponseEntity<String> transactionalControllerMethod6() {

		try {
			if (service.transactionalServiceMethod6()) {
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
	
	@GetMapping(value = "/transactionControllerMethod7")
	public ResponseEntity<String> checkConnection() {

		try {
			if (service.checkConnection()) {
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
	
	@GetMapping(value = "/transactionControllerMethod8")
	public ResponseEntity<String> checkConnectionWithExternalApi(@RequestParam(required=false) String userName) {

		try {
			System.out.println("userName "+userName);
			if (service.checkConnectionWithExternalApi(userName)) {
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
