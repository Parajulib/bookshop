package com.book.shop.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.book.shop.dao.CustomerDao;
import com.book.shop.domain.Customer;
import com.book.shop.util.ConnectionUtil;

@Repository
public class CustomerDaoImpl extends ConnectionUtil implements CustomerDao {

	@Override
	public Customer getCustomerById(int id) {

		return (Customer) getSession().get(Customer.class, id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		getSession().saveOrUpdate(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		return getSession().createQuery("From Customer").list();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		getSession().delete(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> searchCustomer(String query) {
		return getSession().createQuery("From Student s where s.firstName LIKE :fquery OR s.lastName LIKE :lquery")
				.setString("fquery", "%" + query + "%").setString("lquery", "%" + query + "%").list();
	}

}
