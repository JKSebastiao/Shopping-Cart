package pl.jkiakumbo.service;

import java.util.List;

import pl.jkiakumbo.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
