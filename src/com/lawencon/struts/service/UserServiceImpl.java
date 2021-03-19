package com.lawencon.struts.service;

import com.lawencon.struts.dao.UserDao;
import com.lawencon.struts.dao.UserDaoImpl;
import com.lawencon.struts.model.Users;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public Users getUserByUsernameAndPass(String username, String pass) throws Exception {
		return userDao.getUserByUsernameAndPass(username, pass);
	}

}
