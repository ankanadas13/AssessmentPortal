package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.infomodels.LoginIPInfo;
import com.example.infomodels.LoginUserInfo;
import com.example.services.AuthServices;
import com.example.util.CryptoUtil;

@RestController
@RequestMapping("/api")
public class AuthController {
	 
	@Autowired
	CryptoUtil crypt;
	@Autowired
	AuthServices authSrv;
	@Autowired
	LoginIPInfo loginIPInfo;
	
	@RequestMapping(value = "/Auth/Login", method = RequestMethod.POST)
	public String login(@RequestParam("emailId") String emailId,@RequestParam("password") String password) throws Exception 
	{
		
		loginIPInfo.setEmailId(emailId);
		loginIPInfo.setPassword(password);
		String loginUserInfo=authSrv.login(loginIPInfo);  
		
		if(loginUserInfo.equalsIgnoreCase("FF116A0DA496B68346B4C3C8B6150F35ACB3AB4174D7465A4DE44BCF4FFABEC1"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	  return "hello";
	}
}
