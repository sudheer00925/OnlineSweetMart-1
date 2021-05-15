package com.cg.onlinesweetmartapplication.repository;

import java.util.List;

<<<<<<< HEAD
import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;

public interface CustomerRepository {
	
	public Customer addCustomer(Customer Customer);
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer cancelCustomer(int CustomerId) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers();
	public List<Customer> showAllCustomers(int CustomerdId);
=======
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;
import com.cg.onlinesweetmartapplication.model.CustomerDTO;

public interface CustomerRepository {
	
	public CustomerDTO addCustomer(CustomerDTO Customer);
	public CustomerDTO updateCustomer(CustomerDTO Customer) throws CustomerNotFoundException;
	public CustomerDTO cancelCustomer(int CustomerId) throws CustomerNotFoundException;
	public List<CustomerDTO> showAllCustomers();
	public List<CustomerDTO> showAllCustomers(int CustomerdId);
>>>>>>> branch 'master' of https://github.com/sudheer00925/OnlineSweetMart-1.git

}
