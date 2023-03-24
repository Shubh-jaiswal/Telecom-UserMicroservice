package com.stl.shubh.telecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.shubh.telecom.model.UserBroadband;


import jakarta.transaction.Transactional;


public interface UserBroadbandRepository extends JpaRepository<UserBroadband, String> {
	
	@Transactional
	@Query(value="Select * from user_broadband where user_id=?",nativeQuery=true)
	public Optional<UserBroadband> findByEmailId(String email);
	
	@Transactional
	@Query(value="Select broadband_key from broadband where broadband_key=?",nativeQuery=true)
	public String findByKey(String key);
	
	@Transactional
	@Query(value="Select broadband_plan_name from broadband where broadband_key=?",nativeQuery=true)
	public String  findBroadbandPlanName(String key);
	
	@Transactional
	@Query(value="Select broadband_plan_details from broadband where broadband_key=?",nativeQuery=true)
	public String findBroadbandPlanDetails(String key);
	
	@Transactional
	@Query(value="Select broadband_price from broadband where broadband_key=?",nativeQuery=true)
	public String findBroadbandPrice(String key);
	
	@Transactional
	@Query(value="Select broadband_plan_validity from broadband where broadband_key=?",nativeQuery=true)
	public String findBroadbandPlanValidity(String key);
	
	

}
