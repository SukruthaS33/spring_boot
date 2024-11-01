package com.conceptandcoding.firstspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController2 {

	
	@RequestMapping(path="/api/fetchUser",method = RequestMethod.GET)
	@ResponseBody
	public String getUserDetails() {
		return "fetching and returning user details";
	}

	
	
	@RequestMapping(path="/api/fetchUser",method = RequestMethod.POST)
	@ResponseBody
	public String getUserDetails2() {
		return "fetching and returning user details";
	}
}
