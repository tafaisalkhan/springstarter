package com.spring;
import com.spring.entities.Role;
public class UserSession {

	private int userId;
	private String username;
	private Role Role;
	
	public UserSession() {
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		Role = role;
	}

}
