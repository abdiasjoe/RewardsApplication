package com.retailer.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "customer")
	private Set<CustomerTransaction> transactions;
	//include jackson serialization
	@JsonInclude
	//marking the field as not persistable
	@Transient
	private long rewards;
	@JsonInclude
	@Transient
	private Double totalPurchases;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<CustomerTransaction> getTransaction() {
		return transactions;
	}
	public void setTransaction(Set<CustomerTransaction> transaction) {
		this.transactions = transaction;
	}
	public long getRewards() {
		if(transactions == null || transactions.isEmpty())
			return 0l;
		return transactions.stream().map(x -> x.getRewardPoints()).reduce(0l, (a,b) -> a + b).longValue();
	}
	public Double getTotalPurchases() {
		if(transactions == null || transactions.isEmpty())
			return 0d;
		return transactions.stream().map(x -> x.getTotal()).reduce(0d, (a,b) -> a + b).doubleValue();
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Customer() {
		super();
	}
	
	
}
