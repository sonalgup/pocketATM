package com.PocketATM.Dao;

import java.util.List;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.PocketATM.POJO.LoginData;
import com.PocketATM.POJO.User;

public class DaoImpl implements DaoInterface{
@Autowired
private EntityManager entityManager;
	public DaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String signup(User user) {
		try {
		entityManager.merge(user);
		}catch(Exception e)
		{
			System.out.println(e);
			return "Failure";
		}
		return "Success";
	}

	@Override
	public String login(LoginData login_data) {
		String mobile_email = login_data.getMobile_email();
		int pin = login_data.getPin();
		 
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
      Pattern pat = Pattern.compile(emailRegex); 
       boolean isEmail = pat.matcher(mobile_email).matches(); 
		
		List<User>  users = entityManager.createQuery(
				 "FROM User u WHERE u.email = :email_address OR u.mobile_no = :mobile" ,User.class)
				 .setParameter("email_address", mobile_email)
				 .setParameter("mobile",mobile_email)
				 .getResultList();
		 
		 if(users.size()==1)
		 {
		 User user = users.get(0);
		 System.out.println(user.getEmail() + " "+ user.getMobile_no());
		 if(user.getPin() == pin)
			 return "success";
		 else
			 return "failure";
		 
				 }
	else
		return "failure";
	
	}

}
