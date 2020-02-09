package com.email.model;


public class Email {
	private String email_address;

	public Email() {
		
	}
	public Email(String email_address) {
		super();
		this.email_address = email_address;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email_address == null) ? 0 : email_address.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (email_address == null) {
			if (other.email_address != null)
				return false;
		} else if (!email_address.equalsIgnoreCase(other.email_address))
			return false;
		return true;
	}
	
	
}
