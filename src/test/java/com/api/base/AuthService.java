package com.api.base;

import io.restassured.response.Response;

import java.util.HashMap;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignUpRequest;

public class AuthService extends BaseService {
	private static final String BASE_PATH = "/api/auth";

	public Response login(LoginRequest payload) {

		return postRequest(payload, BASE_PATH + "/login");

	}

	public Response signup(SignUpRequest payload) {

		return postRequest(payload, BASE_PATH + "/signup");

	}
	
	public Response forgotPassword(String emailAddess) {
		

		HashMap<String, String> payload=new HashMap<String, String>();
		payload.put("email", emailAddess);
		return postRequest(payload, BASE_PATH + "/forgot-password");

	}

}
