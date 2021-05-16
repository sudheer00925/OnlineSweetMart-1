package com.cg.onlinesweetmartapplication.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlinesweetmartapplication.entity.Customer;
import com.cg.onlinesweetmartapplication.exceptions.CustomerNotFoundException;
import com.cg.onlinesweetmartapplication.model.ProductDTO;
import com.cg.onlinesweetmartapplication.repository.CustomerRepository;
import com.cg.onlinesweetmartapplication.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	@Override
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException {
		int customerId = Customer.getUserId();
		boolean found = customerRepository.existsById(customerId);
		Optional<Customer> customer = customerRepository.findById(customerId);
		if (found) {
			Customer customer1 = customer.get();
			customer1.setUsername(Customer.getUsername());
			customer1.setAddress(Customer.getAddress());
			customerRepository.saveAndFlush(customer1);
			return customer1;
		} else {
			throw new CustomerNotFoundException("No such customer found to update");
		}
	}
	@Override
	public String deleteCustomer(int CustomerId) throws CustomerNotFoundException {
		boolean customer_found = customerRepository.existsById(CustomerId);
		if (customer_found) {
			customerRepository.deleteById(CustomerId);
			return "Successfully deleted";
		} else {
			throw new CustomerNotFoundException("No such customer found to delete with id: " + CustomerId);
		}

	}

	@Override
	public List<Customer> showAllCustomers() throws CustomerNotFoundException {
		List<Customer> customerList = customerRepository.findAll();
		if (customerList.size() == 0) {
			throw new CustomerNotFoundException("No such customers found");
		} else {
			return customerList;
		}
	}

	@Override
	public Optional<Customer> findCustomerById(int CustomerId) throws CustomerNotFoundException {
		Optional<Customer> customer = customerRepository.findById(CustomerId);
		if (customer.isPresent()) {
			return customer;
		} else {
			throw new CustomerNotFoundException("No such customer found with id: " + CustomerId);
		}
	}

	public Customer updateAddress(Address address, int customerId) throws CustomerNotFoundException {
		Optional<Customer> customer2 = customerRepository.findById(customerId);
		if (customer2.isPresent()) {
			Customer cust1 = customer2.get();
			cust1.setAddress(address);
			customerRepository.saveAndFlush(cust1);
			return cust1;
		} else {
			throw new CustomerNotFoundException("Address cannot be updated as there is no such customer");
		}
	}

	public Optional<Customer> findCustomerByName(String CustomerName) throws CustomerNotFoundException {
		Optional<Customer> customer = customerRepository.findCustomerByName(CustomerName);
		if (customer.isPresent()) {
			return customer;
		} else {
			throw new CustomerNotFoundException("No customer record with the name= " + CustomerName);
		}
	}
	@Override
	public List<Customer> showAllCustomers(int CustomerdId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
