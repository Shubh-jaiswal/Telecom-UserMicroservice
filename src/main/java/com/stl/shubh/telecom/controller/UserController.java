package com.stl.shubh.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.shubh.telecom.jwt.JwtUtil;
import com.stl.shubh.telecom.model.User;
import com.stl.shubh.telecom.repository.UserRepository;
import com.stl.shubh.telecom.security.UserLoginDetails;
import com.stl.shubh.telecom.security.UserLoginDetailsService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/v1/user/auth")
public class UserController {
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtils;
	
	@Autowired
	UserLoginDetailsService userLoginDetailsService;
	
	@PostMapping("/add")
	public String user(@RequestBody User user) {
		try {
			BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
			String encPass = encoder.encode(user.getUserPassword());
			user.setUserPassword(encPass);
			userRepository.save(user);
			return "User Added!";
			
		}catch (Exception e) {
			e.printStackTrace();
			return "Could not add user!";
		}
	}
	
	@PostMapping("/authenticate")
	public String authenticate(@RequestBody User user ) {
	    try {
	        Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(user.getUserEmail(), user.getUserPassword()));
	        if (authentication.isAuthenticated()) {
	            UserLoginDetails userLoginDetails = (UserLoginDetails) userLoginDetailsService.loadUserByUsername(user.getUserEmail());
	            String token = jwtUtils.generateJwtToken(userLoginDetails);
	            return token;
	        } else {
	            return "Authentication Failed!";
	        }
	    } catch (Exception e) {
	        return "Authentication Failed! Check username & password.";
	    }
	}
	

	
}
