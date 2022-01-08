package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Vikas1 {

	@GetMapping("/name3/{pilli}")
	public String getParam(@PathVariable("pilli") String name) {
	
		String upperCase = name.toUpperCase();
		
		return upperCase;
	
	
	
	
	}	
}
