package com.example.SpringBootExample.Model;

public class UserResponse {

	private Long userID;
	private String userName;
	private boolean isAdmin;
	private boolean isloggedIn;
	private String sessionKey;
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public boolean isIsloggedIn() {
		return isloggedIn;
	}
	public void setIsloggedIn(boolean isloggedIn) {
		this.isloggedIn = isloggedIn;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
}
