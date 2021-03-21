package com.milingresoshitss.auth.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private Long numIdUser;
	
	private String userFullName;
	
	private String UserPassword;

	public Long getNumIdUser() {
		return numIdUser;
	}

	public void setNumIdUser(Long numIdUser) {
		this.numIdUser = numIdUser;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "User [numIdUser=" + numIdUser + ", name=" + userFullName + ", pwd=" + UserPassword + "]";
	}
}
