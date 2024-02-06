package com.infinite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Represents a table in a database
public class User {

	// @Id // Primary key for the entity
	private String fullname;
	private String email;
	private String mobile;
	@Id
	private Long username;
	private String password;

	public User() {
		super();
	}

	public User(String fullname, String email, String mobile, Long username, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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
