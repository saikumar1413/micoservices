package com.infinite.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Represents a table in a database
public class TicketPojo {

	private Long username;
	private String email;
	private String issue;

	public TicketPojo() {
		super(); // calls the constructor for the parent class
	}

	public TicketPojo(Long username, String email, String issue) {
		super();
		this.username = username;
		this.email = email;
		this.issue = issue;
	}

	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

}
