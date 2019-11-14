package com.example.util;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Component;

import com.google.common.hash.Hashing;

@Component
public class CryptoUtil {
	 public String GetEncryptedString(String inputString) throws Exception
	 {	
		String sha256hex = Hashing.sha256()
				  .hashString(inputString, StandardCharsets.UTF_8)
				  .toString();
		return sha256hex.toUpperCase();
	 }
}
