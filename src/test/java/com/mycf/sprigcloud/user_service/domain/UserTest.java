package com.mycf.sprigcloud.user_service.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UserTest {

	@Test
	public void testDefaultConstructor() {
		User u = new User();
		assertNull(u.getName());
		assertEquals(0, u.getUserId());
		assertNull(u.getEmailAddress());
		assertNull(u.getPhoneNumber());
	}

	@Test
	public void testConstructor() {
		User u = new User("name", 1, "name@gmail.com");
		assertEquals("name", u.getName());
		assertEquals(1, u.getUserId());
		assertEquals("name@gmail.com", u.getEmailAddress());
	}

	@Test
	public void testConstructor2() {
		String name = "name";
		int userId = 1;
		String emailAddress = "email";
		String phoneNumber = "111-222-3333";
		User u = new User(name, userId, emailAddress, phoneNumber);
		assertEquals(name, u.getName());
		assertEquals(userId, u.getUserId());
		assertEquals(emailAddress, u.getEmailAddress());
		assertEquals(phoneNumber, u.getPhoneNumber());
	}

	@Test
	public void testEmptyConstructor() {
		User u = new User();
		String name = "name";
		int userId = 1;
		String emailAddress = "email";
		String phoneNumber = "111-222-3333";
		u.setName(name);
		u.setUserId(userId);
		u.setEmailAddress(emailAddress);
		u.setPhoneNumber(phoneNumber);
		assertEquals(name, u.getName());
		assertEquals(userId, u.getUserId());
		assertEquals(emailAddress, u.getEmailAddress());
		assertEquals(phoneNumber, u.getPhoneNumber());
	}

}
