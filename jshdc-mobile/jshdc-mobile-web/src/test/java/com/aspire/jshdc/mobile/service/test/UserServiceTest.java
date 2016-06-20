package com.aspire.jshdc.mobile.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.aspire.jshdc.mobile.domain.UserDomain;
import com.aspire.jshdc.mobile.service.UserService;
import com.aspire.jshdc.mobile.test.SpringTestCase;

public class UserServiceTest extends SpringTestCase {

	@Autowired
	private UserService userService;

	@Test
	public void selectUserByIdTest() {
		UserDomain user = userService.selectUserById(1);
		System.out.println(user.getUserName() + ":" + user.getUserPassword());
	}
}