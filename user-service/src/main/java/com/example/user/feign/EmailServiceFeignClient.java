package com.example.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("email-service")
public interface EmailServiceFeignClient {

	@PostMapping("/email")
	String  sendEmail(String email);
}
