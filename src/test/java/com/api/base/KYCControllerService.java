package com.api.base;

import io.restassured.response.Response;

public class KYCControllerService extends BaseService {
	
	private static final String BASE_PATH= "/api/kyc/";
	
	public Response getKYCStatus(String token) {
		
		setAuthToken(token);
		return getResquest(BASE_PATH+"status");
		
	}

}
