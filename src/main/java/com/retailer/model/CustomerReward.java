package com.retailer.model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class CustomerReward {

	//include jackson serialization
		@JsonInclude
		//marking the field as not persistable
		@Transient
	protected long rewardPoints;
	public abstract long getRewardPoints();
}
