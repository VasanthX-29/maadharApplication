package com.example.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.User;
import com.example.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		
		User u=service.saveUser(user);
		if(u!=null) {
			return "Hi " +user.getName()+" is registered successfully";
		}
		else
		{
			return "Hi " +user.getName()+" is not registered successfully";
		}
	
	}
	
	@GetMapping("/getAllusers")
	public List<User> findAllUsers(){
		
		return service.getall();
	}


}
