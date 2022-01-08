package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class SampleController {
	
	@GetMapping("/message")
	public String getMessage() {
		String message = "Hello world";
		
		return message;
	}
	
	
	/** path param handling */    // if we give input in postman in url format that input reads this methods and gives output
	@GetMapping("/name/{name}")
	public String getParam(@PathVariable("name") String name) {
	
		String upperCase = name.toUpperCase();
		
		return upperCase;
				
	}
	
	/** Query param handling */
	@GetMapping("/user")
	public String getQueryParam(@RequestParam("user") String user) {
		
		String upperCase = user.toUpperCase();
		return upperCase;
	}
	
	/** Header value handling */   
	@GetMapping("/header")      
	public String getHeader(@RequestHeader("name") String name) {
		String upperCase = name.toUpperCase();
		return upperCase;
	}
	
	@PostMapping("/student")
	public Student postStudent(@RequestBody Student student) {
		String upperCase = student.getName().toUpperCase();
		student.setName(upperCase);
		
		return student;
	}

}
