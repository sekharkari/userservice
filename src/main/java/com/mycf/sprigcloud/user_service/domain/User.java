package com.mycf.sprigcloud.user_service.domain;

public class User {
	private String name;
	private int userId;
	private String emailAddress;

	public User(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
		
	}
	
	public User(String name, int userId,String emailAddress) {
		super();
		this.name = name;
		this.userId = userId;
		this.emailAddress=emailAddress;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
