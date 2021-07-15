package com.example.email.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController 
{

	@PostMapping("/email")
	String sendMail(@RequestBody String email ) {
	
		return "mail sent...";	
	}
}
