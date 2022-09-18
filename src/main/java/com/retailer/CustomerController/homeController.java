package com.retailer.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.model.Customer;
import com.retailer.model.CustomerTransaction;
import com.retailer.service.CustomerService;

@RestController
public class homeController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer id) {
		Customer customer = service.getById(id);
		if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/transactions")
	public List<CustomerTransaction> getCustomerTransactions(){
		return service.getAllTransaction();
	}
	
}
