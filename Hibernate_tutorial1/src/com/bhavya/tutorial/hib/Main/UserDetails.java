package com.bhavya.tutorial.hib.Main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails { //pogo//
	@Id
	private int userID;
	private String userName;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
