package com.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {

	
	// This is a POJO class where we are hiding our payload from end user
	@JsonProperty("username")
	private String userName;
	@JsonProperty("password")
	private String passWord;
	
	
	public LoginRequest(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@Override
	public String toString() {
		return "LoginRequest [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	

}

