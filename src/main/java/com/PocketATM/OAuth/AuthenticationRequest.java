package com.PocketATM.OAuth;

public class AuthenticationRequest {
 
	private String email_mobile;
	private int pin;
	
	public AuthenticationRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail_mobile() {
		return email_mobile;
	}

	public void setEmail_mobile(String email_mobile) {
		this.email_mobile = email_mobile;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public AuthenticationRequest(String email_mobile, int pin) {
		super();
		this.email_mobile = email_mobile;
		this.pin = pin;
	}

}
