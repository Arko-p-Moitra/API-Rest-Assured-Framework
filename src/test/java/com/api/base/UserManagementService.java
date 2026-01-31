package com.api.base;

import com.api.model.request.ProfileRequestPojo;

import io.restassured.response.Response;

public class UserManagementService extends BaseService{
	
	private static final String BASE_PATH="/api/users/";

	public Response getProfile(String token)
	{
		setAuthToken(token);
		return getResquest(BASE_PATH+"profile");
	}
	
	public Response updateProfile(String token, ProfileRequestPojo payload)
	{
		setAuthToken(token);
		return putRequest(payload, BASE_PATH+"profile");
	}
}
