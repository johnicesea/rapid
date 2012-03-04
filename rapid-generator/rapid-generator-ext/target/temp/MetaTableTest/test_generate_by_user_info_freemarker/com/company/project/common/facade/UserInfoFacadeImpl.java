/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.common.facade;

import com.company.project.biz.service.UserInfoService;
import org.springframework.dao.DataAccessException;
import com.company.project.query.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;

/**
 *
 */
public class UserInfoFacadeImpl implements  UserInfoFacade{
	private UserInfoService userInfoService;
	
	public void setUserInfoService(UserInfoService Service) {
		this.userInfoService = Service;
	}
	

	public int update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId ) throws DataAccessException {
		return userInfoService.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId );
	}

	public int delete(Long userId ) throws DataAccessException {
		return userInfoService.delete(Long userId );
	}

	public UserInfo getById(Long userId ) throws DataAccessException {
		return userInfoService.getById(Long userId );
	}

	public PageList testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testOpenClose(TestOpenCloseQuery param) throws DataAccessException{
		return userInfoService.testOpenClose(param);
	}

	public PageList testOpenClose_with_list(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,Long r ) throws DataAccessException {
		return userInfoService.testOpenClose_with_list(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,Long r );
	}

}



