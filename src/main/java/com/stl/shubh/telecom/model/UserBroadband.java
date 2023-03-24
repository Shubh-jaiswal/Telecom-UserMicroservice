package com.stl.shubh.telecom.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_broadband")
public class UserBroadband {
	
	@Id
	@Column(name="user_broadband_id")
	private String userBroadbandId;
	
	@Column(name="user_broadband_plan_name")
	private String userBroadbandPlanName;
	
	@Column(name="user_broadband_plan_details")
	private String userBroadbandPlanDetails;
	
	@Column(name="user_broadband_price")
	private String userBroadbandPrice;
	
	@Column(name="user_broadband_recharge_date")
	private Date userBroadbandRechargeDate;
	
	@Column(name="user_broadband_plan_validity")
	private String userBroadbandPlanValidity;
	
	@Column(name="broadband_key")
	private String broadbandKey;
	
	@Column(name="user_id")
	private String userId;

	public UserBroadband() {
		super();
	}
	



	public UserBroadband(String userBroadbandId, String userBroadbandPlanName, String userBroadbandPlanDetails,
			String userBroadbandPrice, Date userBroadbandRechargeDate, String userBroadbandPlanValidity,
			String broadbandKey, String userId) {
		super();
		this.userBroadbandId = userBroadbandId;
		this.userBroadbandPlanName = userBroadbandPlanName;
		this.userBroadbandPlanDetails = userBroadbandPlanDetails;
		this.userBroadbandPrice = userBroadbandPrice;
		this.userBroadbandRechargeDate = userBroadbandRechargeDate;
		this.userBroadbandPlanValidity = userBroadbandPlanValidity;
		this.broadbandKey = broadbandKey;
		this.userId = userId;
	}

	public String getBroadbandKey() {
		return broadbandKey;
	}


	public void setBroadbandKey(String broadbandKey) {
		this.broadbandKey = broadbandKey;
	}

	public Date getUserBroadbandRechargeDate() {
		return userBroadbandRechargeDate;
	}



	public void setUserBroadbandRechargeDate(Date userBroadbandRechargeDate) {
		this.userBroadbandRechargeDate = userBroadbandRechargeDate;
	}



	public String getUserBroadbandId() {
		return userBroadbandId;
	}

	public void setUserBroadbandId(String userBroadbandId) {
		this.userBroadbandId = userBroadbandId;
	}

	public String getUserBroadbandPlanName() {
		return userBroadbandPlanName;
	}

	public void setUserBroadbandPlanName(String userBroadbandPlanName) {
		this.userBroadbandPlanName = userBroadbandPlanName;
	}

	public String getUserBroadbandPlanDetails() {
		return userBroadbandPlanDetails;
	}

	public void setUserBroadbandPlanDetails(String userBroadbandPlanDetails) {
		this.userBroadbandPlanDetails = userBroadbandPlanDetails;
	}

	public String getUserBroadbandPrice() {
		return userBroadbandPrice;
	}

	public void setUserBroadbandPrice(String userBroadbandPrice) {
		this.userBroadbandPrice = userBroadbandPrice;
	}

	public String getUserBroadbandPlanValidity() {
		return userBroadbandPlanValidity;
	}

	public void setUserBroadbandPlanValidity(String userBroadbandPlanValidity) {
		this.userBroadbandPlanValidity = userBroadbandPlanValidity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}




	@Override
	public String toString() {
		return "UserBroadband [userBroadbandId=" + userBroadbandId + ", userBroadbandPlanName=" + userBroadbandPlanName
				+ ", userBroadbandPlanDetails=" + userBroadbandPlanDetails + ", userBroadbandPrice="
				+ userBroadbandPrice + ", userBroadbandRechargeDate=" + userBroadbandRechargeDate
				+ ", userBroadbandPlanValidity=" + userBroadbandPlanValidity + ", broadbandKey=" + broadbandKey
				+ ", userId=" + userId + "]";
	}




	
	

	
}
