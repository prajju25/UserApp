package com.example.SpringBootExample.Model;

public class LoginRequest {

	private String username;
	private String encPassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEncPassword() {
		return encPassword;
	}
	public void setEncPassword(String encPassword) {
		this.encPassword = encPassword;
	}
}
