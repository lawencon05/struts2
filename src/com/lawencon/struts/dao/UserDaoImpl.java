package com.lawencon.struts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lawencon.struts.model.Users;

public class UserDaoImpl implements UserDao {

	@Override
	public Users getUserByUsernameAndPass(String username, String pass) throws Exception {
		String sql = "SELECT * FROM tb_m_users WHERE username = ? AND pass = ? ";
		PreparedStatement ps = Db.getInstance().prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();

		Users user = null;
		if (rs.next()) {
			user = new Users();
			user.setId(rs.getLong("id"));
			user.setUsername(rs.getString("username"));
			user.setPass(rs.getString("pass"));
		}

		return user;
	}

}
