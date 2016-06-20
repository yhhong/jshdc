package com.aspire.jshdc.mobile.service;

import com.aspire.jshdc.mobile.domain.UserDomain;

public interface UserService {

	UserDomain selectUserById(Integer userId);
}