package com.milingresoshitss.auth.service;

import org.springframework.stereotype.Service;

import com.milingresoshitss.auth.domain.User;
import com.milingresoshitss.auth.proxies.user.NewUserRequest;
import com.milingresoshitss.auth.proxies.user.NewUserResponse;

@Service
public class AuthenticationService {
	
	public NewUserResponse newUser(NewUserRequest request) {
		NewUserResponse newUserResponse = new NewUserResponse();
		try {
			User newUser = new User();
			newUser.setNumiduser(request.getUserNumId());
			newUser.setUserfullname(request.getUserFullName());
			newUser.setUserpassword(request.getUserPassword());
		
			newUserResponse.setIsCreateUser(true);
		}catch(Exception e){
			newUserResponse.setIsCreateUser(false);
		}
		return newUserResponse;
	}
}
