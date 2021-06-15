package com.myBank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myBank.app.model.Customer;
import com.myBank.app.service.LogInService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	LogInService logInService;
	/**
	*	Login api 
	*/
	@GetMapping(value = "/logIn",headers = "Accept=application/json,application/xml")
	public ResponseEntity<Customer> getCustomer(@RequestBody Customer customer){
		try{
			Customer customerObj = logInService.logInCustomer(customer);
			return new ResponseEntity<Customer>(customerObj,HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
}
