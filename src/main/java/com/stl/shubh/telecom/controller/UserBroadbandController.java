package com.stl.shubh.telecom.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.shubh.telecom.idgenerator.IdGenerator;
import com.stl.shubh.telecom.jwt.JwtUtil;
import com.stl.shubh.telecom.model.Broadband;
import com.stl.shubh.telecom.model.UserBroadband;
import com.stl.shubh.telecom.repository.BroadbandRepository;
import com.stl.shubh.telecom.repository.UserBroadbandRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/v1/user/broadband")
public class UserBroadbandController {
	
	@Autowired
	BroadbandRepository broadbandRepository;
	
	@Autowired
	UserBroadbandRepository userBroadbandRepository;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	IdGenerator idGenerator;
	
	Broadband broadband =new Broadband();
	
	@PostMapping("/add/{email}/{key}")
	public String user(@RequestBody UserBroadband userBroadband, @PathVariable("email") String email, @PathVariable("key") String key) {
		try {
			userBroadband.setUserBroadbandRechargeDate(new Date());
			userBroadband.setUserId(jwtUtil.getUsernameFromToken(email));
			userBroadband.setUserBroadbandId(idGenerator.broadbandId());
			userBroadband.setBroadbandKey(userBroadbandRepository.findByKey(key));
			userBroadband.setUserBroadbandPlanName(userBroadbandRepository.findBroadbandPlanName(key));
			userBroadband.setUserBroadbandPlanDetails(userBroadbandRepository.findBroadbandPlanDetails(key));
			userBroadband.setUserBroadbandPrice(userBroadbandRepository.findBroadbandPrice(key));
			userBroadband.setUserBroadbandPlanValidity(userBroadbandRepository.findBroadbandPlanValidity(key));
			userBroadbandRepository.save(userBroadband);
			return "Recharge Successful!";
			
		}catch (Exception e) {
			e.printStackTrace();
			return "Recharge Failed!";
		}
	}
	
	@GetMapping("/{email}")
	public Optional<UserBroadband> getUserBroadbandDetailsByEmail(@PathVariable("email") String email) {
	    return userBroadbandRepository.findByEmailId(jwtUtil.getUsernameFromToken(email));
	}
	
}
