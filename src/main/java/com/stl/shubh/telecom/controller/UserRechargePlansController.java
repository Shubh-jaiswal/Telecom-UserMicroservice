package com.stl.shubh.telecom.controller;

import java.util.Date;
import java.util.List;
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
import com.stl.shubh.telecom.model.UserRechargePlans;
import com.stl.shubh.telecom.repository.RechargePlansRepository;
import com.stl.shubh.telecom.repository.UserRechargePlansRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/v1/user/recharge-plan")
public class UserRechargePlansController {
	
	@Autowired
	RechargePlansRepository rechargePlansRepository;
	
	@Autowired
	UserRechargePlansRepository userRechargePlansRepository;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	IdGenerator idGenerator;
	
	@PostMapping("/add/{email}")
	public String user(@RequestBody UserRechargePlans userRechargePlans, @PathVariable("email") String email) {
		try {
			userRechargePlans.setUserRechargeDate(new Date());
			userRechargePlans.setUserId(jwtUtil.getUsernameFromToken(email));
			userRechargePlans.setUserRechargeId(idGenerator.planId());
			userRechargePlansRepository.save(userRechargePlans);
			return "Recharge Successful!";
			
		}catch (Exception e) {
			e.printStackTrace();
			return "Recharge Failed!";
		}
	}
	
	@GetMapping("/all")
	public List<UserRechargePlans> getAllUserRechargePlans(){
	    List<UserRechargePlans> userRechargePlan = userRechargePlansRepository.findAll();
	    return userRechargePlan;
	}


	@GetMapping("/{email}")
	public Optional<UserRechargePlans> getUserRechargePlansByEmail(@PathVariable("email") String email) {
	    return userRechargePlansRepository.findByEmailId(jwtUtil.getUsernameFromToken(email));
	}
	

}
