package com.lawencon.struts.controller;

import org.apache.struts2.ServletActionContext;

import com.lawencon.struts.model.Users;
import com.lawencon.struts.service.AuthService;
import com.opensymphony.xwork2.ActionSupport;

public class HomeController extends ActionSupport {

	private String username;

	public String home() {
		Users valUser = AuthService.validateUser(ServletActionContext.getRequest());
		if (valUser != null) {
			username = valUser.getUsername();
			return valUser != null ? "success" : "error";
		} else
			return "error";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
