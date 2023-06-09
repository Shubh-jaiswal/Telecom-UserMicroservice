package com.stl.shubh.telecom.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;


import com.stl.shubh.telecom.model.User;



public class UserLoginDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	User user = new User();

	    public UserLoginDetails(User user) {
	        super();
	        this.user = user;
	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return Collections.singleton(new SimpleGrantedAuthority("USER"));
	    }

	    @Override
	    public String getPassword() {
	        return user.getUserPassword();
	    }

	    @Override
	    public String getUsername() {
	        return user.getUserEmail();
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }


}
