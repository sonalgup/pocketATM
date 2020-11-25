package com.PocketATM.Dao;

import org.springframework.data.repository.CrudRepository;

import com.PocketATM.POJO.LoginData;
import com.PocketATM.POJO.User;

public interface DaoInterface{
	public String signup(User user);

	public String login(LoginData login_data);

}
