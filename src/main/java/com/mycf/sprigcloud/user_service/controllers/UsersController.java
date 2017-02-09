package com.mycf.sprigcloud.user_service.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycf.sprigcloud.user_service.domain.User;

@RestController
public class UsersController {

	protected Logger logger = Logger.getLogger(UsersController.class.getName());

	@RequestMapping("/{userid}")
	public ResponseEntity<User> byNumber(@PathVariable("userid") int userId) {
		switch (userId) {
		case 1:
			return new ResponseEntity<User>(new User("Bob Dylan", userId,"bob.dylan@gmail.com","123-345-9999"), HttpStatus.OK);
		case 2:
			return new ResponseEntity<User>(new User("Neil Young", userId,"neil.young@email.com","456-111-2222"), HttpStatus.OK);
		default:
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

}
