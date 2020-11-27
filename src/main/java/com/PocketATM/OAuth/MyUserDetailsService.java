package com.PocketATM.OAuth;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.PocketATM.Dao.DaoInterface;
@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired
private DaoInterface dao;
	public MyUserDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		int pin = dao.getPin(username);
		String pin_string = String.valueOf(pin);
		
		return new User(username,pin_string,new ArrayList<>());
	}

}
