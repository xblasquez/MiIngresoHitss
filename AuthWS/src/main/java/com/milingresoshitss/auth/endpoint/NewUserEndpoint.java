package com.milingresoshitss.auth.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.milingresoshitss.auth.proxies.user.NewUserRequest;
import com.milingresoshitss.auth.proxies.user.NewUserResponse;
import com.milingresoshitss.auth.service.AuthenticationService;

@Endpoint
public class NewUserEndpoint {

	private static final String NAME_SPACE="http://www.milingresos.org/User";
	@Autowired
	private AuthenticationService service;
	
	@PayloadRoot(namespace = NAME_SPACE,localPart = "NewUserRequest")
	@ResponsePayload
	public NewUserResponse registerUser(NewUserRequest request) {
		return service.newUser(request);
	}
}
