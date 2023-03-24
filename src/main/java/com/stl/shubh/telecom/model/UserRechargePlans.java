package com.stl.shubh.telecom.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_plans")
public class UserRechargePlans {
	
	@Id
	@Column(name="user_recharge_id")
	private String userRechargeId;
	
	@Column(name="user_recharge_plan_name")
	private String userRechargePlanName;
	
	@Column(name="user_recharge_plan_details")
	private String userRechargePlanDetails;
	
	@Column(name="user_recharge_price")
	private String userRechargePrice;
	
	@Column(name="user_recharge_date")
	private Date userRechargeDate;
	
	
	@Column(name="user_recharge_plan_validity")
	private String userRechargePlanValidity;
	
	@Column(name="user_id")
	private String userId;

	public UserRechargePlans() {
		super();
	}

	

	public UserRechargePlans(String userRechargeId, String userRechargePlanName, String userRechargePlanDetails,
			String userRechargePrice, Date userRechargeDate, String userRechargePlanValidity, String userId) {
		super();
		this.userRechargeId = userRechargeId;
		this.userRechargePlanName = userRechargePlanName;
		this.userRechargePlanDetails = userRechargePlanDetails;
		this.userRechargePrice = userRechargePrice;
		this.userRechargeDate = userRechargeDate;
		this.userRechargePlanValidity = userRechargePlanValidity;
		this.userId = userId;
	}

	

	public Date getUserRechargeDate() {
		return userRechargeDate;
	}



	public void setUserRechargeDate(Date userRechargeDate) {
		this.userRechargeDate = userRechargeDate;
	}



	public String getUserRechargeId() {
		return userRechargeId;
	}

	public void setUserRechargeId(String userRechargeId) {
		this.userRechargeId = userRechargeId;
	}

	public String getUserRechargePlanName() {
		return userRechargePlanName;
	}

	public void setUserRechargePlanName(String userRechargePlanName) {
		this.userRechargePlanName = userRechargePlanName;
	}

	public String getUserRechargePlanDetails() {
		return userRechargePlanDetails;
	}

	public void setUserRechargePlanDetails(String userRechargePlanDetails) {
		this.userRechargePlanDetails = userRechargePlanDetails;
	}

	public String getUserRechargePrice() {
		return userRechargePrice;
	}

	public void setUserRechargePrice(String userRechargePrice) {
		this.userRechargePrice = userRechargePrice;
	}

	public String getUserRechargePlanValidity() {
		return userRechargePlanValidity;
	}

	public void setUserRechargePlanValidity(String userRechargePlanValidity) {
		this.userRechargePlanValidity = userRechargePlanValidity;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "UserRechargePlans [userRechargeId=" + userRechargeId + ", userRechargePlanName=" + userRechargePlanName
				+ ", userRechargePlanDetails=" + userRechargePlanDetails + ", userRechargePrice=" + userRechargePrice
				+ ", userRechargeDate=" + userRechargeDate + ", userRechargePlanValidity=" + userRechargePlanValidity
				+ ", userId=" + userId + "]";
	}

	
	
	



	

}
