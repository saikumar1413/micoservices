package com.infinite.model;

public class LoginFront {
	Long username;
	String password;

	public LoginFront() {
		super();
	}

	public LoginFront(Long username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
