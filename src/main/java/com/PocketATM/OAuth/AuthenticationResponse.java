package com.PocketATM.OAuth;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable{

	private final String jwt;
	
	public String getJwt() {
		return jwt;
	}
	public AuthenticationResponse(String jwt) {
		
		this.jwt = jwt;
	}

}
