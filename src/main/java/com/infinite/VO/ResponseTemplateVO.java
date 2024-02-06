package com.infinite.VO;

import com.infinite.model.User;

public class ResponseTemplateVO {

	private User user;
	private SurveyPojo survey;
	private TicketPojo ticket;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(User user, SurveyPojo survey, TicketPojo ticket) {
		super();
		this.user = user;
		this.survey = survey;
		this.ticket = ticket;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SurveyPojo getSurvey() {
		return survey;
	}

	public void setSurvey(SurveyPojo survey) {
		this.survey = survey;
	}

	public TicketPojo getTicket() {
		return ticket;
	}

	public void setTicket(TicketPojo ticket) {
		this.ticket = ticket;
	}

}
