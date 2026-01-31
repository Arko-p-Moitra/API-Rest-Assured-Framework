package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.KYCControllerService;
import com.api.base.UserManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.response.KYCStatusResponse;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class GetKYCStatusTest {

	
	@Test(description = "Verify Get profile API")
	public void getProfileInfo() {
		
		AuthService authService = new AuthService();
		Response loginRequestResponse= authService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponse= loginRequestResponse.as(LoginResponse.class);
		
		//System.out.println(loginResponse.getToken());
		
		KYCControllerService kycControllerService = new KYCControllerService();
		Response kycStatusrespose = kycControllerService.getKYCStatus(loginResponse.getToken());
		System.out.println(kycStatusrespose.asPrettyString());
		KYCStatusResponse kycStatusResponse= kycStatusrespose.as(KYCStatusResponse.class);
		System.out.println(kycStatusResponse.getOverallStatus());
		
		Assert.assertEquals(kycStatusResponse.getOverallStatus(), "NOT_STARTED");
		
		
	}
	
}
