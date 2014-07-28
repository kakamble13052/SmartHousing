package com.weekendr.User;

import com.weekendr.Society.Society;

public class User implements Society{
	protected String userId;
	protected String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
