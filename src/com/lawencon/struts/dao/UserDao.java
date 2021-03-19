package com.lawencon.struts.dao;

import com.lawencon.struts.model.Users;

public interface UserDao {

	Users getUserByUsernameAndPass(String username, String pass) throws Exception;
}
