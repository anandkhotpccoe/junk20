package com.crud.path.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.path.entity.Customer;
import com.crud.path.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@PostMapping("/customer")
	public Customer add(@RequestBody Customer customer)
	{
		return customerRepository.save(customer);
	}

}
