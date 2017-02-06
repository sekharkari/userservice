package com.mycf.sprigcloud.user_service.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mycf.sprigcloud.user_service.domain.User;

public class UsersControllerTest {
	@Spy
	UsersController controller;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void byNumber1() {
		ResponseEntity<User> response = controller.byNumber(1);
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals(1, response.getBody().getUserId());
		assertNotNull(response.getBody().getName());
	}

	@Test
	public void byNumber3() {
		ResponseEntity<User> response = controller.byNumber(3);
		assertNotNull(response);
		assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
		assertNull(response.getBody());
	}

}
