package com.stl.shubh.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.shubh.telecom.model.User;


public interface UserRepository extends JpaRepository<User, String> {

}
