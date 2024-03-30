package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Welcome to GIT HUB Action";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Enjoy Git Hub Action";
	}

}
