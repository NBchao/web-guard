package com.guard.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guard.web.pojo.User;



@RestController
public class UserController {

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable String id){
		return new User(id,"123","456");
	}
	
}
