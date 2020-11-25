package com.PocketATM.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.PocketATM.Dao.DaoImpl;
import com.PocketATM.Dao.DaoInterface;
import com.PocketATM.Service.ServiceImpl;
import com.PocketATM.Service.ServiceInterface;

@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}
@Bean
public ServiceInterface service()
{
	return new ServiceImpl();
}

@Bean
public DaoInterface dao()
{
	return new DaoImpl();
}
}
