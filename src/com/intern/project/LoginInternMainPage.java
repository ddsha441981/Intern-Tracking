package com.intern.project;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LoginInternMainPage implements SessionAware{
int id;
String Iusername;
String Ipass;
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
public String getIusername() {
	return Iusername;
}
public void setIusername(String iusername) {
	Iusername = iusername;
}

public String getIpass() {
	return Ipass;
}
public void setIpass(String ipass) {
	Ipass = ipass;
}
@Override
public String toString() {
	return "LoginInternMainPage [Iid=" + id + ", Iusername=" + Iusername + ", Ipass=" + Ipass + "]";
}
public String loginAsIntern() {
	int id=LoginInternDao.byLoginByIntern(this);
	if(id>0)
	{
		sessionmap.put("userId", id);
		return "success";
	}
	
		return "error";
	}
@Override
public void setSession(Map map) {
	  sessionmap=map;  
	  
}

public String logout(){
	//if(sessionmap.put("userId", id)!=null)
	if(sessionmap.remove("userId", id))
	
	{
		msg="<div class='alert alert-danger'><strong>Hello!</strong> Log Out Successfully.</div>";
		return "success";
	}
	msg="<div class='alert alert-danger'><strong>Hello!</strong> Error try Again!!!!!.</div>";
	return "error";
	
	
}
}
