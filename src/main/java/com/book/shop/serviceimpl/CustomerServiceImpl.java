package com.book.shop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.shop.dao.CustomerDao;
import com.book.shop.domain.Customer;
import com.book.shop.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public void deleteCustomer(int id) {
		Customer customer = getCustomerById(id);
		if (customer != null)
			customerDao.deleteCustomer(customer);
	}

	@Override
	public List<Customer> searchCustomer(String query) {
		return customerDao.searchCustomer(query);
	}

}
