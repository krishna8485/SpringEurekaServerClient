package com.krishna.microservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2RestController {


	
	@GetMapping(value = "/singleService2", produces = "application/json")
	public String singleService2(){
		
		return "hi from singleService2";
		
	}
	
	
}
