package com.action;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.Entity.User;
import com.dao.LoginDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 用户登录action,判断是否符合登录条件
 */
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 8013816027944871760L;
	private User user;
	private String prePage;// 登录前页面
	private LoginDAO loginDao = LoginDAO.getLoginDAO();

	@Override
	public String execute() throws UnsupportedEncodingException, SQLException {
		HttpServletRequest req = ServletActionContext.getRequest();
		String check = (String) req.getSession().getAttribute("rand");

		ActionContext ctx = ActionContext.getContext();
		Map<String, Object> session = ctx.getSession();

		if (!user.getCheck().equals(check)) {
			req.setAttribute("login_error", "验证码输入不正确，请重新输入");
			return "error";
		}
		if (user.getUsername().length() > 0) { 
			String username = new String(user.getUsername().getBytes(
					"ISO-8859-1"), "UTF-8");
			System.out.println("2" + username); 
			User loginUser = loginDao.getUserByName(username);
			if (loginUser != null) {
				if (loginUser.getPassword().equals(user.getPassword())) {
					session.put("NowLogining", username);
					prePage = (String) session.get("prePage");
					session.remove("prePage");
					if (null == prePage) {
						return SUCCESS;
					} else {
						return "aaa";
					}
				}

			}
		}
		req.setAttribute("login_error", "没有该用户请先去注册");
		return "error";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPrePage() {
		return prePage;
	}

	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}
}
