package com.stl.shubh.telecom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="broadband")
public class Broadband {
	
	@Id
	@Column(name="broadband_id")
	private String broadbandId;
	
	@Column(name="broadband_plan_name")
	private String broadbandPlanName;
	
	@Column(name="broadband_plan_details")
	private String broadbandPlanDetails;
	
	@Column(name="broadband_key")
	private String broadbandKey;
	
	@Column(name="broadband_price")
	private String broadbandPrice;
	
	@Column(name="broadband_plan_validity")
	private String broadbandPlanValidity;

	public Broadband() {
		super();
	}



	public Broadband(String broadbandId, String broadbandPlanName, String broadbandPlanDetails, String broadbandKey,
			String broadbandPrice, String broadbandPlanValidity) {
		super();
		this.broadbandId = broadbandId;
		this.broadbandPlanName = broadbandPlanName;
		this.broadbandPlanDetails = broadbandPlanDetails;
		this.broadbandKey = broadbandKey;
		this.broadbandPrice = broadbandPrice;
		this.broadbandPlanValidity = broadbandPlanValidity;
	}
	
	



	public String getBroadbandKey() {
		return broadbandKey;
	}



	public void setBroadbandKey(String broadbandKey) {
		this.broadbandKey = broadbandKey;
	}



	public String getBroadbandId() {
		return broadbandId;
	}

	public void setBroadbandId(String broadbandId) {
		this.broadbandId = broadbandId;
	}

	public String getBroadbandPlanName() {
		return broadbandPlanName;
	}

	public void setBroadbandPlanName(String broadbandPlanName) {
		this.broadbandPlanName = broadbandPlanName;
	}

	public String getBroadbandPlanDetails() {
		return broadbandPlanDetails;
	}

	public void setBroadbandPlanDetails(String broadbandPlanDetails) {
		this.broadbandPlanDetails = broadbandPlanDetails;
	}

	public String getBroadbandPrice() {
		return broadbandPrice;
	}

	public void setBroadbandPrice(String broadbandPrice) {
		this.broadbandPrice = broadbandPrice;
	}

	public String getBroadbandPlanValidity() {
		return broadbandPlanValidity;
	}

	public void setBroadbandPlanValidity(String broadbandPlanValidity) {
		this.broadbandPlanValidity = broadbandPlanValidity;
	}



	@Override
	public String toString() {
		return "Broadband [broadbandId=" + broadbandId + ", broadbandPlanName=" + broadbandPlanName
				+ ", broadbandPlanDetails=" + broadbandPlanDetails + ", broadbandKey=" + broadbandKey
				+ ", broadbandPrice=" + broadbandPrice + ", broadbandPlanValidity=" + broadbandPlanValidity + "]";
	}

	
	
	
}
