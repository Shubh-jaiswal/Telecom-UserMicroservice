package com.stl.shubh.telecom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="recharge_plans")
public class RechargePlans {
	
	@Id
	@Column(name="recharge_id")
	private String rechargeId;
	
	@Column(name="recharge_plan_name")
	private String rechargePlanName;
	
	@Column(name="recharge_plan_details")
	private String rechargePlanDetails;
	
	@Column(name="recharge_price")
	private String rechargePrice;
	
	@Column(name="recharge_plan_validity")
	private String rechargePlanValidity;

	public RechargePlans() {
		super();
	}

	public RechargePlans(String rechargeId, String rechargePlanName, String rechargePlanDetails, String rechargePrice,
			String rechargePlanValidity) {
		super();
		this.rechargeId = rechargeId;
		this.rechargePlanName = rechargePlanName;
		this.rechargePlanDetails = rechargePlanDetails;
		this.rechargePrice = rechargePrice;
		this.rechargePlanValidity = rechargePlanValidity;
	}

	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getRechargePlanName() {
		return rechargePlanName;
	}

	public void setRechargePlanName(String rechargePlanName) {
		this.rechargePlanName = rechargePlanName;
	}

	public String getRechargePlanDetails() {
		return rechargePlanDetails;
	}

	public void setRechargePlanDetails(String rechargePlanDetails) {
		this.rechargePlanDetails = rechargePlanDetails;
	}

	public String getRechargePrice() {
		return rechargePrice;
	}

	public void setRechargePrice(String rechargePrice) {
		this.rechargePrice = rechargePrice;
	}

	public String getRechargePlanValidity() {
		return rechargePlanValidity;
	}

	public void setRechargePlanValidity(String rechargePlanValidity) {
		this.rechargePlanValidity = rechargePlanValidity;
	}

	@Override
	public String toString() {
		return "RechargePlans [rechargeId=" + rechargeId + ", rechargePlanName=" + rechargePlanName
				+ ", rechargePlanDetails=" + rechargePlanDetails + ", rechargePrice=" + rechargePrice
				+ ", rechargePlanValidity=" + rechargePlanValidity + "]";
	}
	
	
	
	
}
