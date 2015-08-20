package com.book.shop.service;

import java.util.List;

import com.book.shop.domain.Customer;

public interface CustomerService {

	public Customer getCustomerById(int id);

	public void saveCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public void deleteCustomer(int id);

	public List<Customer> searchCustomer(String query);

}
