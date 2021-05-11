package com.intern.project;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class AdminLoginMain implements SessionAware {
	int id;
	String userA;
	String pwd;
	Map session;

	public String getUserA() {
		return userA;
	}

	public void setUserA(String userA) {
		this.userA = userA;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AdminLoginMain [userA=" + userA + ", pwd=" + pwd + "]";
	}

	public String saveadmin() {
		int d1 = AdminLoginDao.adminLogin(this);
		if (d1 > 0) {
			session.put("adminId", id);
			return "success";
		}
		return "error";

	}

	@Override
	public void setSession(Map map) {
		session = map;
	}

}
