package com.lawencon.struts.controller;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.lawencon.struts.model.Users;
import com.lawencon.struts.service.AuthService;
import com.lawencon.struts.service.UserService;
import com.lawencon.struts.service.UserServiceImpl;

public class AuthController implements SessionAware {

	private Users user;
	private UserService userService = new UserServiceImpl();

	SessionMap<String, String> sessionmap;

	public String init() {
		Boolean isLogin = AuthService.isLogin(ServletActionContext.getRequest());
		return isLogin ? "success" : "error";
	}

	public String login() {
		try {
			Users userDb = userService.getUserByUsernameAndPass(user.getUsername(), user.getPass());
			if (userDb != null) {
				sessionmap.put("login", "true");
				sessionmap.put("username", user.getUsername());
				return "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap) session;
	}

	public String logout() {
		sessionmap.invalidate();
		return "success";
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}
