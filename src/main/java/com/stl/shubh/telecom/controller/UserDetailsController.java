package com.stl.shubh.telecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.shubh.telecom.model.User;
import com.stl.shubh.telecom.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/v1/user")
public class UserDetailsController {

	@Autowired
    UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
	    List<User> users = userRepository.findAll();
	    return users;
	}

	//Fetching Customers By ID
	@GetMapping("/{email}")
	public Optional<User> getUserByEmail(@PathVariable("email") String email) {
	    return userRepository.findById(email);
	}
}
