package com.api.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class GetProfileDetailsTest {

	
	@Test(description = "Verify Get profile API")
	public void getProfileInfo() {
		
		//This following part is helping us get the authorization token after doing the login
		AuthService authService = new AuthService();
		Response res=authService.login(new LoginRequest("uday1234","uday12345")); //Here we will get the response for login request
		LoginResponse loginResponse= res.as(LoginResponse.class); //Here we are de-serealising the response
		//System.out.println(loginResponse.getToken());
		
		
		//In this section we are passing the token to get user details
		UserManagementService userManagementService = new UserManagementService();
		Response userResponse=userManagementService.getProfile(loginResponse.getToken());
		System.out.println(userResponse.asPrettyString());
		UserProfileResponse UserProfileResponse = userResponse.as(UserProfileResponse.class);
		System.out.println(UserProfileResponse.getMobileNumber());
		
	}
	
}
