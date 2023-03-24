package com.stl.shubh.telecom.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="telecom_user")
public class User {
	@Id
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String userPassword;
	
	@Column(name="user_phone_number")
	private String userPhoneNumber;
	
	@Column(name="user_address")
	private String userAddress;
	
	@Column(name="user_aadhar_number")
	private String userAadharNumber;
	
	
	@Column(name="user_gender")
	private String userGender;

	public User() {
		super();
	}

	public User(String userEmail, String userName, String userPassword, String userPhoneNumber, String userAddress,
			String userAadharNumber, String userGender) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
		this.userAadharNumber = userAadharNumber;
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAadharNumber() {
		return userAadharNumber;
	}

	public void setUserAadharNumber(String userAadharNumber) {
		this.userAadharNumber = userAadharNumber;
	}


	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userPhoneNumber=" + userPhoneNumber + ", userAddress=" + userAddress + ", userAadharNumber="
				+ userAadharNumber + ", userGender=" + userGender + "]";
	}

	
	
	
	
	
	


}
