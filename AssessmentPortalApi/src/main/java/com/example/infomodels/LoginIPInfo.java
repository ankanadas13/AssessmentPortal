package com.example.infomodels;

import org.springframework.stereotype.Component;

@Component
public class LoginIPInfo {
	String EmailId;
	String Password;
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
