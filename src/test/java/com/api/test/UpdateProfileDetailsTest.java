package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.request.ProfileRequestPojo;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class UpdateProfileDetailsTest {

	@Test(description = "Verify Update profile API")
	public void getProfileInfo() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("uday1234", "uday12345"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("---------------------------------------------------------------------");
		
		UserManagementService userManagementService= new UserManagementService();
		response = userManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");
		
		System.out.println("---------------------------------------------------------------------");
		ProfileRequestPojo profileRequestPojo = new ProfileRequestPojo.Builder().firstName("Arkoprovo").lastName("Moitra")
				.email("arkoprovo@moitra.com").mobileNumber("8739200119").build();
		
		
		response=userManagementService.updateProfile(loginResponse.getToken(), profileRequestPojo);
		System.out.println(response.asPrettyString());
		
	}

}
