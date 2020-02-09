package com.email.model;

import java.util.List;

public class EmailList {
	List<Email> emails;
	public EmailList() {
		
	}
	public EmailList(List<Email> emails) {
		super();
		this.emails = emails;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	
}
