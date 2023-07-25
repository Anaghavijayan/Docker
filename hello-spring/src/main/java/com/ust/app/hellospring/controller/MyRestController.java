package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.Customer;

@RestController
public class MyRestController {
		
	@GetMapping
	public String sayHello(){
		return "Hello world...welcome";
	}
    @GetMapping("/hello")
	public String greet() {
		return"good afternoon";
	}
    @GetMapping("/customer")
    public Customer getCustomer() {
    	Customer c=new Customer(101,"anaghavijayan","anagha@gmail.com");
    	return c;
    }
    @GetMapping("/hello/{username}")
	public String greet(@PathVariable String username) {
		return"good afternoon "+username;
    }
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
    	return customer;
    }
    
}
