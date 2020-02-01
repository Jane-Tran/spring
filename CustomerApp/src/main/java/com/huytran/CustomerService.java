package com.huytran;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {
	@Autowired
	public CustomerResponsitory responsitory;

	public void test() {
		//Test add records
		// Customer newCustomer = new Customer();
		// newCustomer.setFisrtname("Hoang");
		// newCustomer.setLastname("Tran");
		//
		// responsitory.save(newCustomer);
		
		//Show all customer
		// Iterable<Customer> iterable = responsitory.findAll();
		// iterable.forEach(customer -> System.out.println(customer));
		
		//find by lastname
		List<Customer> result = responsitory.findByLastname("Tran");
		result.forEach(customer -> System.out.println(customer));
	}
}
