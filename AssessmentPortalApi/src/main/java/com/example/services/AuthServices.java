package com.example.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.example.beans.MATUser;
import com.example.infomodels.LoginIPInfo;
import com.example.infomodels.LoginUserInfo;
import com.example.util.CryptoUtil;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class AuthServices {
	
	@Autowired
	LoginUserInfo loginUserInfo;
	@Autowired
	CryptoUtil cryptoUtil;
	@Resource(name="mongoTemplate")
	MongoTemplate mongoTemplate;
	@Autowired
	MATUser matUser;
	
	public String login(LoginIPInfo loginIPInfo) throws Exception
	{
		loginUserInfo=null;
		loginIPInfo.setPassword(cryptoUtil.GetEncryptedString(loginIPInfo.getPassword()));
		Query query = new Query();
		query.addCriteria(
		    new Criteria().andOperator(
		        Criteria.where("password").is(loginIPInfo.getPassword()),
		        Criteria.where("emailId").is(loginIPInfo.getEmailId())
		    )
		);
		matUser=mongoTemplate.findOne(query, MATUser.class);
		System.out.println("matUser--->"+matUser.getFirstName());
		System.out.println(loginIPInfo.getPassword());
		return loginIPInfo.getPassword();
		

	}
	
}
