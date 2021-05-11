package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ProjectPlacementDepartment implements SessionAware {
	int intview_id;
	String company_name;
	String location_name;
	Date givendate;
	String asked_ques;
	String remarks;
	String interview_status;
	int id;//Intern Id As a foreign key
	String msg;
	
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getIntview_id() {
		return intview_id;
	}
	public void setIntview_id(int intview_id) {
		this.intview_id = intview_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public Date getGivendate() {
		return givendate;
	}
	public void setGivendate(Date givendate) {
		this.givendate = givendate;
	}
	public String getAsked_ques() {
		return asked_ques;
	}
	public void setAsked_ques(String asked_ques) {
		this.asked_ques = asked_ques;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getInterview_status() {
		return interview_status;
	}
	public void setInterview_status(String interview_status) {
		this.interview_status = interview_status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	ArrayList<ProjectPlacementDepartment> J1;
		
	
	
	public ArrayList<ProjectPlacementDepartment> getJ1() {
		return J1;
	}
	public void setJ1(ArrayList<ProjectPlacementDepartment> j1) {
		J1 = j1;
	}
	
	public String projectviewinterview(){
		
		setJ1(DAOProjectInterviewdetails.projectviewalldataofInterviewById());
		if(J1.size() > 0){
			return "success";
		}
		return "error";
	}
	
	public String deleteInterview(){
		int d =  DAOProjectInterviewdetails.deletealldataofInterviewById(intview_id);
		if(d > 0){
			return "success";
		}
		return "error";
	}
	
	
	Map sessionno45;
	@Override
	public void setSession(Map arg0) {
		sessionno45 = arg0;
		
	}

}
