package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoHelloWorld {
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		return "Hello World";
	}

}
