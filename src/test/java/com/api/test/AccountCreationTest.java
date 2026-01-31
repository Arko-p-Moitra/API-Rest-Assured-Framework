package com.api.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import com.api.model.request.SignUpRequest;
import com.api.model.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Listeners(com.api.listeners.TestListener.class)
public class AccountCreationTest {

	
	@Test(description = "Verify account creation")
	
	public void createaccountTest() {
		
		//Builder Design Pattern
		
		SignUpRequest signUpRequest= new SignUpRequest.Builder().userName("TestUser_Arko")
				.email("testUser@abcd.com")
				.firstName("Test")
				.lastName("User")
				.password("PassWord1234")
	        	.mobileNumber("7829100228").build();
		
		AuthService authService= new AuthService();
		Response res = authService.signup(signUpRequest);
		System.out.println(res.asPrettyString());
		Assert.assertEquals(res.asPrettyString(), "User registered successfully!");
		
	}
}
