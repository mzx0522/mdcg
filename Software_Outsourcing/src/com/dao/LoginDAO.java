package com.dao;

import com.Entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginDAO {
	private static LoginDAO loginDao = null;
	private static final String LOGIN_TABLE_NAME = "login";
	private Statement stmt;

	public static LoginDAO getLoginDAO() {
		if (loginDao == null) {
			loginDao = new LoginDAO();
			try {
				loginDao.stmt = JdbcUtils.getStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return loginDao;
	}

	private static User ORM(ResultSet res) throws SQLException {
		return new User(res.getString("username"), res.getString("password"));
	}

	public ArrayList<User> getAllUsers() throws SQLException
	{
		String sql = "SELECT * FROM " + LOGIN_TABLE_NAME; 
		ResultSet res = stmt.executeQuery(sql); 
		ArrayList<User> users = new ArrayList<User>();
		while (res.next()) { User author = ORM(res); users.add(author); } 
		return users;
	} 

	public User getUserByName(String name) throws SQLException {
		String sql = "SELECT * FROM " + LOGIN_TABLE_NAME + " WHERE username = '"
				+ name + "'";
		ResultSet res = stmt.executeQuery(sql);
		if (res.next())
			return ORM(res);
		return null;
	}

	public void addUser(User user) throws SQLException {
		String sql = "INSERT INTO " + LOGIN_TABLE_NAME + " values('"
				+ user.getUsername() + "','" + user.getPassword() + "')";
		System.out.println("注册用户的SQL语句" + sql);
		stmt.executeUpdate(sql);
	}

	public void updateUser(User newUser) throws SQLException {
		String sql = "UPDATE " + LOGIN_TABLE_NAME + " SET " + "username = '"
				+ newUser.getUsername() + "'," + "password = '"
				+ newUser.getPassword() + "'";
		System.out.println("更新用户名和密码SQL语句:" + sql);
		stmt.executeUpdate(sql);
	}
}