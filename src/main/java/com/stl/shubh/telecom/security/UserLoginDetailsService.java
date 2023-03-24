package com.stl.shubh.telecom.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stl.shubh.telecom.model.User;
import com.stl.shubh.telecom.repository.UserRepository;

@Service
public class UserLoginDetailsService implements UserDetailsService {

	 @Autowired
	    UserRepository userRepository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userRepository.findById(username).get();
	        return new UserLoginDetails(user);
	    }

}
