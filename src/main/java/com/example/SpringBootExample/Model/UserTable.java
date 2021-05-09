package com.example.SpringBootExample.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "userTable")
public class UserTable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long user_id;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="password")
    private String password;
    
    @Column(name="created_at")
    private Date createdAt;
    
    @Column(name ="is_admin")
    private int isAdmin;
    
    protected UserTable(){}
    
	public UserTable(Long user_id, String userName, String password, int isAdmin, Date createdAt) {
		this.user_id = user_id;
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.createdAt = createdAt;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int isAdmin() {
		return isAdmin;
	}

	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
    
}