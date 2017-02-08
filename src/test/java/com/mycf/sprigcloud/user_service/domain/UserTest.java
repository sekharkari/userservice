package com.mycf.sprigcloud.user_service.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testConstructor() {
		User u=new User("name", 1,"name@gmail.com");
		assertEquals("name",u.getName());
		assertEquals(1,u.getUserId());
		assertEquals("name@gmail.com",u.getEmailAddress());
	}
	
	@Test
	public void testEmptyConstructor() {
		User u=new User();
		String name="name";
		int userId=1;
		String emailAddress="email";
		u.setName(name);
		u.setUserId(userId);
		u.setEmailAddress(emailAddress);
		assertEquals(name,u.getName());
		assertEquals(userId,u.getUserId());
		assertEquals(emailAddress,u.getEmailAddress());
	}

}
