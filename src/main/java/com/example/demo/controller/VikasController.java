package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class VikasController {

	@GetMapping("/Message1")
	public String getMessage() {
		String 	nessage = "hello vikas" ; 
		
		String upperCase = nessage.toUpperCase();
		return upperCase;
	}
	@GetMapping("/branch/{name}")   // we give input in postman AT URL
	public String getParam(@PathVariable("name") String name ) {
		String upperCase = name.toUpperCase();
		return upperCase;
	}
	@GetMapping("/user2")       // @Requestparam = it converts into url form
	public String getQureyParam(@RequestParam("user") String user , @RequestParam("user2")String user2) {
		String upperCase = user2.toUpperCase();
		return upperCase;
		
	}
	@GetMapping("/username")   // IF U give header at url it will reflect name
	public String getHeader(@RequestHeader("name")String name ) {
		//System.out.println(name);
		String upperCase = name.toUpperCase();
		return upperCase;
	}
	@PostMapping("/employee")
	public Employee postEmployee(@RequestBody Employee employee) {
		return employee;
		
	}
	
	
	
}
