package com.retailer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailer.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
