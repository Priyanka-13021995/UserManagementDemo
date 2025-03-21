package com.UserMgmt.User;

import java.sql.Timestamp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "m_user")
public class user {

	@Id
	@Column(name = "uid")
	private String uid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_acc_Date")
	private Timestamp lastAccDate;
	
	@Column(name = "email")
	private String email;
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Timestamp getLastAccDate() {
		return lastAccDate;
	}

	public void setLastAccDate(Timestamp lastAccDate) {
		this.lastAccDate = lastAccDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
