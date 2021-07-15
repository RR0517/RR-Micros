package com.example.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.UserService;

@EnableEurekaClient
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/user")
	List<User> processGet() {
		System.out.println("called...");
		
		return userService.getAllUsers();
	}
	@GetMapping("/user/{id}")
	Optional<User> getUser(@PathVariable("id") String id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/user")
	String createUser(@RequestBody User user){
		System.out.println(user.getFirstname());
		System.out.println(user.getAge());
		return userService.createUser(user);
		//return "savedID";
		
	}
	
}
