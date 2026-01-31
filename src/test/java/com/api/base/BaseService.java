package com.api.base;

import com.api.filters.LoggingFilter;
import com.api.model.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	/*This class will be responsible for -
	 * Base URI
	 * Creating the request
	 * Handling the response  
	 */
	
	private final String BASE_URI = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	//If you create a static block then it will gonna execute for one time only
	static {
		RestAssured.filters(new LoggingFilter());
	}
	
	
	public BaseService()
	{
		requestSpecification=RestAssured.given().baseUri(BASE_URI);
	}

	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization", "Bearer "+token);
	}
	
	protected Response postRequest(Object payload, String endpoint) 
	/*
	 * We are using "Object" beside "loginRequest" cozz 
	 * Object is the parent class of every request class
	 * later we will use this method to call other APIs as well, 
	 * for that we just need to change the "ëndpoint" and the method will work
	 * 
	 * Prime example of Polymorphism
	 */
	
	
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected Response getResquest(String endpoint)
	{
	
		return requestSpecification.contentType(ContentType.JSON).get(endpoint);
	}
	
	protected Response putRequest(Object payload,String endpoint) 
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
	
}
