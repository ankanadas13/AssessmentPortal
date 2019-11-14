package com.example.infomodels;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoginUserInfo {
	String MATUserId;
	String ADId;
	String EmailId;
	String FirstName;
	String LastName;
	List<String> Roles;
	public String getMATUserId() {
		return MATUserId;
	}
	public void setMATUserId(String mATUserId) {
		MATUserId = mATUserId;
	}
	public String getADId() {
		return ADId;
	}
	public void setADId(String aDId) {
		ADId = aDId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public List<String> getRoles() {
		return Roles;
	}
	public void setRoles(List<String> roles) {
		Roles = roles;
	}
}
