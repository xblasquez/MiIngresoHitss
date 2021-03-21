package com.milingresoshitss.auth.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numiduser;

	private String userfullname;

	private String userpassword;

	public User() {
	}

	public int getNumiduser() {
		return this.numiduser;
	}

	public void setNumiduser(int numiduser) {
		this.numiduser = numiduser;
	}

	public String getUserfullname() {
		return this.userfullname;
	}

	public void setUserfullname(String userfullname) {
		this.userfullname = userfullname;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

}