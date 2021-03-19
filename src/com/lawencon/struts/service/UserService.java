package com.lawencon.struts.service;

import com.lawencon.struts.model.Users;

public interface UserService {

	Users getUserByUsernameAndPass(String username, String pass) throws Exception;
}
