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
import com.stl.shubh.telecom.model.Broadband;
import com.stl.shubh.telecom.repository.BroadbandRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/v1/broadband")
public class BroadbandController {
	
	@Autowired
	BroadbandRepository broadbandRepository;

	@Autowired
	IdGenerator idGenerator;
	
	@PostMapping("/add")
	public String addBroadbandPlan(@RequestBody Broadband broadband) {
		try {
			broadband.setBroadbandId(idGenerator.broadbandId());
			broadband.setBroadbandKey(idGenerator.broadbandKeyGenerator());
			broadbandRepository.save(broadband);
			return "Boradband Plan Added Successfully";
			
		}catch (Exception e) {
			e.printStackTrace();
			return "Could not add broadband plan!";
		}
	}
	
	@GetMapping("/all")
	public List<Broadband> getAllBroadbandPlans(){
	    List<Broadband> broadbandPlan = broadbandRepository.findAll();
	    return broadbandPlan;
	}


}
