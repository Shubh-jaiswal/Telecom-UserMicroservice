package com.stl.shubh.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.shubh.telecom.idgenerator.IdGenerator;
import com.stl.shubh.telecom.model.RechargePlans;
import com.stl.shubh.telecom.repository.RechargePlansRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/v1/recharge-plans")
public class RechargePlansController {
	 
	 @Autowired
	 RechargePlansRepository rechargePlansRepository;
	 
	 
	 @Autowired
		IdGenerator idGenerator;
		
		@PostMapping("/add")
		public String addRechargePlan(@RequestBody RechargePlans rechargePlans) {
			try {
				rechargePlans.setRechargeId(idGenerator.planId());
				rechargePlansRepository.save(rechargePlans);
				return "Recharge Plan Added Successfully";
				
			}catch (Exception e) {
				e.printStackTrace();
				return "Could not add recharge plan!";
			}
		}
		
		@GetMapping("/all")
		public List<RechargePlans> getAllRechargePlans(){
		    List<RechargePlans> rechargePlan = rechargePlansRepository.findAll();
		    return rechargePlan;
		}

}
