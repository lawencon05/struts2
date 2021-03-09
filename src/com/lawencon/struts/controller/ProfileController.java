package com.lawencon.struts.controller;

import com.opensymphony.xwork2.ActionSupport;

public class ProfileController extends ActionSupport {

	private static final long serialVersionUID = 869462405906400120L;

	@Override
	public String execute() throws Exception {
		System.out.println("executed profilecontroller called");
		return SUCCESS;
	}

}
