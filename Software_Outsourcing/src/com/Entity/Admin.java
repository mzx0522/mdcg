package com.Entity;

public class Admin {
     private String adminname;
     private String adminpassword;
     private boolean cancel;
     private String check;
     
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public boolean isCancel() {
		return cancel;
	}
	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}

      
     
}
