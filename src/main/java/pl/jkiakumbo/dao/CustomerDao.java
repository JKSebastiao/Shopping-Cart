package pl.jkiakumbo.dao;

import java.util.List;

import pl.jkiakumbo.model.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> getAllCustomers();

	Customer getCustomerByemailId(String emailId);

}
