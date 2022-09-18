package com.retailer.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
public class CustomerTransaction extends CustomerReward {
	@Id
	@GeneratedValue
	private long id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Customer customer;
	private double total;
	private String description;

	private Date date;
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	public CustomerTransaction(long id, Customer customer, double total, String description, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.total = total;
		this.description = description;
		this.date = date;
	}

	public CustomerTransaction() {
		super();
		
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public long getRewardPoints() {
		
		this.rewardPoints = 0l;
		if(this.total > 50 && this.total <= 100) {
			this.rewardPoints += (this.total - 50 ) * 1;
		}
		
		if(this.total > 100) {
			this.rewardPoints += 50;
			this.rewardPoints += (this.total - 100 ) * 2;
		}
		return this.rewardPoints;
	}
	
	@Override
	public String toString() {
		return String.format("Customer transaction: id=$s, customer=$s,"
				+ " total=$s, description=$s, date=$s", id, total, description, date);
	}

}
