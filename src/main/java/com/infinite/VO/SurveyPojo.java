package com.infinite.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class SurveyPojo {

	private Long username;

	private String email;

	private String profession;

	private String interest;

	private String domain;

	public SurveyPojo(Long username, String email, String profession, String interest, String domain) {
		super();
		this.username = username;
		this.email = email;
		this.profession = profession;
		this.interest = interest;
		this.domain = domain;
	}

	public SurveyPojo() {
		super();
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
