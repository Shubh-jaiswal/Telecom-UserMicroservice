package com.stl.shubh.telecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.shubh.telecom.model.UserRechargePlans;

import jakarta.transaction.Transactional;


public interface UserRechargePlansRepository extends JpaRepository<UserRechargePlans, String> {

	@Transactional
	@Query(value="Select * from user_plans where user_id=?",nativeQuery=true)
	public Optional<UserRechargePlans> findByEmailId(String email);
}
