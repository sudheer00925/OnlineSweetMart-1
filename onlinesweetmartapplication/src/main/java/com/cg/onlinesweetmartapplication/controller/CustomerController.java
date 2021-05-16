package com.cg.onlinesweetmartapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value="/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
	}
	/*@GetMapping(value="/viewCustomer/{id}")
	public CustomerDTO showCustomerById(@PathVariable int id)
	{
		return customerService.findCustomerById(id);
	}
	
	@PutMapping(value="/updateProduct")
	public ProductDTO updateProduct(@RequestBody Customer customer ) throws ProductNotFoundException
	{
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping(value="/deleteCustomer/{id}")
	public CustomerDTO deleteCustomer(@PathVariable int id)
	{
		return customerService.deleteCustomer(id);
	}*/
	
}
