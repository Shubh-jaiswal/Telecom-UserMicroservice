package com.stl.shubh.telecom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.shubh.telecom.model.Broadband;

import jakarta.transaction.Transactional;

public interface BroadbandRepository extends JpaRepository<Broadband, String> {
	
	
	

}
