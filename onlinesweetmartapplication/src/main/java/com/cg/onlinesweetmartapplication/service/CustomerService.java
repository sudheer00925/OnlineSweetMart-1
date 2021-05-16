package com.cg.onlinesweetmartapplication.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;

public interface CustomerService {

	public Customer addCustomer(Customer Customer);
	
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	
	public String deleteCustomer(int CustomerId) throws CustomerNotFoundException;
	
	public List<Customer> showAllCustomers() throws CustomerNotFoundException;
	
	public List<Customer> showAllCustomers(int CustomerdId) throws CustomerNotFoundException;

	Optional<Customer> findCustomerById(int CustomerId) throws CustomerNotFoundException;	


	
}
