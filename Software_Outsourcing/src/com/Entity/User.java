package com.Entity;

public class User {
	private String username;
	private String password;
	private String address;
	private String phone;
    private String check;
    
    public User(String name,String pwd){
    	username = name;
    	password = pwd;
    }
    public User(){
    	
    }
	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

}
