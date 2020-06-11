package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class UserController {

	@RequestMapping(value="/user/{name}",method=RequestMethod.GET)
	public String userName(@PathVariable("name")String userName) {
		return "Dear "+userName+"... Welcome!!!";
	}
	

}
