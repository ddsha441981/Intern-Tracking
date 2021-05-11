package com.intern.project;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginMainProjectManger implements SessionAware{
int id;
String username;
String pass;
String fname;
String msg;
Map sessionmap;


public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
@Override
public String toString() {
	return "LoginDaoProjectManger [username=" + username + ", pass=" + pass + ", fname=" + fname + "]";
}

public String loginproject() {
	int id=LoginDaoProjectmanger.projectMlogin(this);
	if(id>0)
	{
		sessionmap.put("userId", id);
		msg="<div class='alert alert-danger'><strong>success!</strong> Project Manger Login Successfully.</div>";
		return "success";
	}
	msg="<div class='alert alert-danger'><strong>Danger!</strong> Error try Again!!!!!.</div>";
		return "error";
	}
@Override
public void setSession(Map map) {
	  sessionmap=map;  
	  
}
public String logout(){
	if(sessionmap.put("userId", id) != null){
		msg="<div class='alert alert-danger'><strong>Hello!</strong> Log Out Successfully.</div>";
		return "success";
	}
	msg="<div class='alert alert-danger'><strong>Hello!</strong> Error try Again!!!!!.</div>";
	return "error";
	
	
}
}
