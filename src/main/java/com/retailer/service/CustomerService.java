package com.retailer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailer.model.Customer;
import com.retailer.model.CustomerTransaction;
import com.retailer.repo.CustomerRepo;
import com.retailer.repo.CustomerTransactionRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private CustomerTransactionRepo repos;
	
	
	public List<Customer> getAll(){
		return repo.findAll();
	}
	
	public List<CustomerTransaction> getAllTransaction(){
		return repos.findAll();
	}
	
	public Customer getById(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
