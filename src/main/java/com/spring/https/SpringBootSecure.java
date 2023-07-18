package com.spring.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSecure {

	@GetMapping("/getData")
	public String getDate() {
		return "secure data";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecure.class, args);
	}

}
