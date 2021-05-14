package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;

public interface CustomerRepository {
	
	public Customer addCustomer(Customer Customer);
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer cancelCustomer(int CustomerId) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers();
	public List<Customer> showAllCustomers(int CustomerdId);

}
