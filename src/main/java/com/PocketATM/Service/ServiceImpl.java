package com.PocketATM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.PocketATM.Dao.DaoInterface;
import com.PocketATM.POJO.LoginData;
import com.PocketATM.POJO.User;

public class ServiceImpl implements ServiceInterface{
@Autowired
private DaoInterface dao;
	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public String signup(User user) {
	
	
		 return dao.signup(user);
	}

	@Override
	@Transactional
	public String login(LoginData login_data) {
		return dao.login(login_data);
	}

}
