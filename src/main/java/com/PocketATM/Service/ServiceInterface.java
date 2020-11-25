package com.PocketATM.Service;

import com.PocketATM.POJO.LoginData;
import com.PocketATM.POJO.User;

public interface ServiceInterface {
public String signup(User user);

public String login(LoginData login_data);
}
