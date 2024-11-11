package com.conceptandcoding.firstspring.aop;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class Employee {

	@Autowired
	EmployeeService service;

	@GetMapping(path = "/employee")
	public String fetchEmployee() {

		return "employee fetched";
	}

	public Employee() {
		System.out.println("Employee Bean initialized");
	}
//
//	@PostMapping(path = "/employee")
//	public String updateEmployee(@RequestBody Object requestBody) {
//		System.out.println("request body value");
//		System.out.println(requestBody.toString());
//		
//		return "employee updated";
//	}

	@PostMapping(path = "/employee")
	public String updateEmployee(@RequestBody Map<String, Object> requestBody) {
		System.out.println("request body value");
		System.out.println((String) requestBody.get("name"));
		System.out.println((int) requestBody.get("age"));
		service.employeeMethod1();
		return "employee updated";
	}

	@DeleteMapping(path = "/employee")
	public String deleteEmployee(@RequestBody Map<String, Object> requestBody) {
		System.out.println("request body value");
		System.out.println((String) requestBody.get("name"));
		System.out.println((int) requestBody.get("age"));

		service.employeeMethod2();
		service.employeeMethod3(null, 0);
//		service.employeeMethod4(new AnyClass());
		return "employee deleted";
	}

}
