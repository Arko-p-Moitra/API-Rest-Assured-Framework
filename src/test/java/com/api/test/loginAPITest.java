package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class loginAPITest {

	@Test(description = "Verify the login API")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
		AuthService authService = new AuthService();
		Response resq = authService.login(loginRequest);
		LoginResponse loginResponse = resq.as(LoginResponse.class); // "as" method will convert your JSON object to java
																	// object of your type. Eg-LoginResponse type
		System.out.println(resq.asPrettyString());
		System.out.println(loginResponse.getToken());
	}

}
