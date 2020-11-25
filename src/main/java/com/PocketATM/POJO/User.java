package com.PocketATM.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="email")
private String email;
@Column(name="mobile_number")
private String mobile_no;
@Column(name="country_code")
private String country_code;
@Column(name="gender")
private String gender;
@Column(name="address")
private String address;
@Column(name="language")
private String language;
@Column(name="pin")
private int pin;
	
	
	
	public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getMobile_no() {
	return mobile_no;
}



public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}



public String getCountry_code() {
	return country_code;
}



public void setCountry_code(String country_code) {
	this.country_code = country_code;
}



public String getGender() {
	return gender;
}



public void setGender(String gender) {
	this.gender = gender;
}



public String getAddress() {
	return address;
}



public void setAddress(String address) {
	this.address = address;
}



public String getLanguage() {
	return language;
}



public void setLanguage(String language) {
	this.language = language;
}



public int getPin() {
	return pin;
}



public void setPin(int pin) {
	this.pin = pin;
}



	public User() {
		// TODO Auto-generated constructor stub
	}



	public User(String email, String mobile_no, String country_code, String gender, String address, String language,
			int pin) {
		super();
		this.email = email;
		this.mobile_no = mobile_no;
		this.country_code = country_code;
		this.gender = gender;
		this.address = address;
		this.language = language;
		this.pin = pin;
	}

}
