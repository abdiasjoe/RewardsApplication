package com.retailer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailer.model.CustomerTransaction;

@Repository
public interface CustomerTransactionRepo extends JpaRepository<CustomerTransaction, Integer> {

}
