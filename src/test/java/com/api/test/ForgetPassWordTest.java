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
public class ForgetPassWordTest {

	
	@Test(description = "Verify forgot password API")
	
	public void ForgetPassWordTest() {
		
		//Builder Design Pattern
		
		
		AuthService authService= new AuthService();
		Response res = authService.forgotPassword("testUser@abcd.com");
		System.out.println(res.asPrettyString());
		//Assert.assertEquals(res.asPrettyString(), "User registered successfully!");
		
	}
}
