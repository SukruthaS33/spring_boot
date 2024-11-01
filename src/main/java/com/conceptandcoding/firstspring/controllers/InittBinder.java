package com.conceptandcoding.firstspring.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class InittBinder {

	 @InitBinder
	    protected void initBinder(WebDataBinder binder) {
	        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
	    }

	    @GetMapping(path = "/fetchUser")
	    public ResponseEntity<String> fetchUser(@ModelAttribute User user) {
	        return ResponseEntity.status(HttpStatus.OK).body("all ok " + user.getFirstName());
	    }
}


 class User {
     String firstName;

    // Getter and Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
