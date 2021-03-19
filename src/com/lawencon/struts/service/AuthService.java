package com.lawencon.struts.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.lawencon.struts.model.Users;

public class AuthService {

	public static Boolean isLogin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String s = (String) session.getAttribute("login");
		return s != null && !s.trim().equals("");
	}

	public static Users validateUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String s = (String) session.getAttribute("login");
		if (s != null && !s.trim().equals("")) {
			String username = (String) session.getAttribute("username");
			Users u = new Users();
			u.setUsername(username);
			return u;
		} else
			return null;
	}
}
