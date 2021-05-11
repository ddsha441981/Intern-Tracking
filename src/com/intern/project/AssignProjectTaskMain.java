package com.intern.project;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class AssignProjectTaskMain implements SessionAware {
String batchlist;/* Batch Id As Foreign Key*/
String grouplist;/* GroupId Id As Foreign Key*/
int id;/* Project Manger Id As Foreign Key*/
String project_topic;
Date Tstrt;
Date Tend;
String editor1;
String status;
String ATM;

AssignProjectTaskMain  obj;


public AssignProjectTaskMain getObj() {
	return obj;
}
public void setObj(AssignProjectTaskMain obj) {
	this.obj = obj;
}
public String getATM() {
	return ATM;
}
public void setATM(String aTM) {
	ATM = aTM;
}
public String getBatchlist() {
	return batchlist;
}
public void setBatchlist(String batchlist) {
	this.batchlist = batchlist;
}
public String getGrouplist() {
	return grouplist;
}
public void setGrouplist(String grouplist) {
	this.grouplist = grouplist;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProject_topic() {
	return project_topic;
}
public void setProject_topic(String project_topic) {
	this.project_topic = project_topic;
}
public Date getTstrt() {
	return Tstrt;
}
public void setTstrt(Date tstrt) {
	Tstrt = tstrt;
}
public Date getTend() {
	return Tend;
}
public void setTend(Date tend) {
	Tend = tend;
}
public String getEditor1() {
	return editor1;
}
public void setEditor1(String editor1) {
	this.editor1 = editor1;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return "AssignProjectTaskMain [batchlist=" + batchlist + ", grouplist=" + grouplist + ", id=" + id
			+ ", project_topic=" + project_topic + ", Tstrt=" + Tstrt + ", Tend=" + Tend + ", editor1=" + editor1
			+ ", status=" + status + "]";
}
public String saveAssignProjectTask(){
	int id = (int) sessionmap.get("userId");
	setId(id);
	System.out.println("Here Batch Id get is :"+batchlist);
	System.out.println("Here GroupId Id get is :"+grouplist);
	System.out.println("Here Project Manger Id get is :"+id);
	int i = AssignProjectTaskDAO.assignprojecttask(this);
	if(i>0){
	
	return "success";
	}
	return "error";
}

public String viewTask(){
	int id = (int) sessionmap.get("userId");
	setId(id);
	System.out.println("Here Project Manger Id get is :"+id);
	  obj= AssignProjectTaskDAO.viewtaskbyproject(id);
	if(obj.getId()>0){
		
		System.out.println("Here after processing data is"+obj.getId());
		return "success";
	}
	return "error";
}

 Map sessionmap;
@Override
public void setSession(Map arg0) {
	
	sessionmap=arg0;
}

}
