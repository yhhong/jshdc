package com.aspire.jshdc.mobile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspire.jshdc.mobile.dao.UserDao;
import com.aspire.jshdc.mobile.domain.UserDomain;
import com.aspire.jshdc.mobile.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDomain selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}

}