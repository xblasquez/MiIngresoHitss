package com.milingresoshitss.auth.service;

import org.springframework.stereotype.Service;

import com.milingresoshitss.auth.proxies.user.NewUserRequest;
import com.milingresoshitss.auth.proxies.user.NewUserResponse;

@Service
public class AuthenticationService {
	
	public NewUserResponse newUser(NewUserRequest request) {
		NewUserResponse newUserResponse = new NewUserResponse();
			
		
		return newUserResponse;
	}
}
