package com.action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.Entity.User;
import com.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private LoginDAO loginDao = LoginDAO.getLoginDAO();

	@Override
	public String execute() throws UnsupportedEncodingException, SQLException {
		HttpServletRequest req = ServletActionContext.getRequest();
		if (user.getUsername().length() > 0) {
			String username = new String(user.getUsername());
			System.out.println("1" + username);
			User registUser = loginDao.getUserByName(username);
			if (registUser != null) {
				req.setAttribute("register_error", "用户已经存在不需要注册,请直接登录!");
				return "error";
			}
			loginDao.addUser(user);
			return "success";
		}
		req.setAttribute("register_error", "没输入用户呢!");
		return "error";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
