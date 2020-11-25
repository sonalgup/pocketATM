package com.PocketATM.POJO;

public class LoginData {

	private String mobile_email;
	private int pin;
	
	
	public String getMobile_email() {
		return mobile_email;
	}


	public void setMobile_email(String mobile_email) {
		this.mobile_email = mobile_email;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public LoginData(String mobile_email, int pin) {
		super();
		this.mobile_email = mobile_email;
		this.pin = pin;
	}


	public LoginData() {
		// TODO Auto-generated constructor stub
	}

}
