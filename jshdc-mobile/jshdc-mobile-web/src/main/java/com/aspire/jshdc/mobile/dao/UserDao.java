package com.aspire.jshdc.mobile.dao;

import com.aspire.jshdc.mobile.domain.UserDomain;

public interface UserDao {

	/**
	 * @param userId
	 * @return UserDomain
	 */
	public UserDomain selectUserById(Integer userId);
}