package com.yjl.entity;

import java.io.Serializable;
/**
 * 实体类需要实现Serializable接口，才能被redis识别
 * @author junliang.yi
 *
 */
public class User implements Serializable {

	private String userName;

	private String password;

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

	@Override
	public String toString() {
		return super.toString();
	}


}
