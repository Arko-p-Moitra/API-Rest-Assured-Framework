package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

	
	//This method can be added using "Add method button"
	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {

		logRequest(requestSpec); // This "requestSpec" contains all the request information
		Response resp = ctx.next(requestSpec, responseSpec);// This "responseSpec" contains all the response information
															// and the request will get executed here
		logResponse(resp);

		return resp; //Test for assertion
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {

		logger.info("BASE URI :" + requestSpec.getBaseUri());
		logger.info("Request Header :" + requestSpec.getHeaders());
		logger.info("Request Body :" + requestSpec.getBody());
	}

	public void logResponse(Response response) {

		logger.info("Status Code :" + response.getStatusCode());
		logger.info("Response Header :" + response.getHeaders());
		logger.info("Response Body :" + response.getBody().prettyPrint());
	}

}
