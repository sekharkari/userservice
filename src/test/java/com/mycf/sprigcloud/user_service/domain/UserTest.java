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
	public void testConstructor2() {
		User u=new User("name2", 2,"name2@gmail.com");
		assertEquals("name2",u.getName());
		assertEquals(2,u.getUserId());
		assertEquals("name2@gmail.com",u.getEmailAddress());
	}
	
	@Test
	public void testEmptyConstructor() {
		User u=new User();
		String name="name";
		int userId=1;
		String emailAddress="email";
		String phoneNumber="111-222-3333";
		u.setName(name);
		u.setUserId(userId);
		u.setEmailAddress(emailAddress);
		assertEquals(name,u.getName());
		assertEquals(userId,u.getUserId());
		assertEquals(emailAddress,u.getEmailAddress());
		assertEquals(phoneNumber,u.getPhoneNumber());
	}

}
