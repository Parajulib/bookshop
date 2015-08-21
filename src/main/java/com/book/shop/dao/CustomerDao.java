package com.book.shop.dao;

import java.util.List;

import com.book.shop.domain.Customer;

public interface CustomerDao {
	
	public  Customer getCustomerById(int id);
	public void saveCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public void deleteCustomer(Customer customer);
	public List<Customer> searchCustomer(String query);
	

}
