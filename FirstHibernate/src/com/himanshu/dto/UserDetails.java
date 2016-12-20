package com.himanshu.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id
	private int userId;
	private String userName;
	private String desca;
	private Date date;
	
	public String getDesc() {
		return desca;
	}
	public void setDesc(String desca) {
		this.desca = desca;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName
				+ ", desca=" + desca + ", date=" + date + "]";
	}
	
}
