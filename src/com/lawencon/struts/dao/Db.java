package com.lawencon.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

	public static Connection conn;

	public static Connection getInstance() {
		if (conn == null) {
			return conn();
		}
		return conn;
	}

	public static Connection conn() {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dummy", "postgres", "postgres");
			System.out.println("Database connected");
		} catch (Exception e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}

		return conn;
	}

}
