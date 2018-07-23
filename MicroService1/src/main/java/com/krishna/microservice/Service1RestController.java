package com.krishna.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1RestController {

	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping(value = "/hello", produces = "application/json")
	public ResponseEntity<String> example1(){
		return this.restTemplate.getForEntity("http://service2/hi", String.class);	
	}
	
}
