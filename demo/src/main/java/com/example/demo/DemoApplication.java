package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//restController make this class to serve as a rest end points
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	// in order to use this method as a restful end-point we have to annotate it with @GetMapping
	@GetMapping
	public String hello() {
		return "Hello World";
	}

}
