package com.PocketATM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PocketATM.POJO.LoginData;
import com.PocketATM.POJO.User;
import com.PocketATM.Service.ServiceInterface;

@RestController
public class Restcontroller {
@Autowired 
private ServiceInterface service;
	public Restcontroller() {
		
	}
	

@RequestMapping("/signup")
public String signup(@RequestBody User user)
{
return service.signup(user);	
}

@RequestMapping("/login")
public String login(@RequestBody LoginData login_data)
{
	return service.login(login_data);
}
}
