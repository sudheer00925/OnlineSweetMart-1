package com.cg.onlinesweetmartapplication.repository;

import java.util.List;
import java.util.Optional;

import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;

public interface CustomerRepository {
	
	public Customer addCustomer(Customer Customer);
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer cancelCustomer(int CustomerId) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers();
	public List<Customer> showAllCustomers(int CustomerdId);
	public Customer save(Customer customer);
	public boolean existsById(int customerId);
	public Optional<Customer> findById(int customerId);
	public void saveAndFlush(Customer customer1);
	public void deleteById(int customerId);
	public List<Customer> findAll();
	public Optional<Customer> findCustomerByName(String customerName);



}
