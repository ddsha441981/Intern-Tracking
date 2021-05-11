package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class PlacementDepartmentMain implements SessionAware {
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
	
	ArrayList<PlacementDepartmentMain> P1;
		
	public ArrayList<PlacementDepartmentMain> getP1() {
		return P1;
	}
	public void setP1(ArrayList<PlacementDepartmentMain> p1) {
		P1 = p1;
	}
	
	public String saveinterview(){
		id = (int) sessionno.get("userId");
		System.out.println("Here Intern Id is :"+id);
		int jk = DAOInterviewdetails.saveallinterviewdata(this);
		if(jk > 0){
			msg = "<div class='alert alert-success'><strong>Hello!</strong> Data Successfully. Added</div>";
			return "success";
		}
		else{
			msg = "<div class='alert alert-danger'><strong>Hello!</strong> Try Again...............</div>";
			return "error";
		}
		
	}
	
	public String viewinterview(){
		id = (int) sessionno.get("userId");
		System.out.println("Here Intern Id Is"+id);
		setP1(DAOInterviewdetails.viewalldataofInterviewById(getId()));
		if(P1.size() > 0){
			return "success";
		}
		return "error";
	}
	
	public String updatebyProjectofInterview() {
		System.out.println("Heare Leave Id Is After Ajax Call :"+intview_id);

		// System.out.println("Here Intern Id is :" + id);
		int count2 = DAOProjectInterviewdetails.editInterviewProject(intview_id);
		if (count2 > 0) {
			//System.out.println("Here Data is " + M1.toString());
			// request.setAttribute("samsungof", M1);
			msg = "<div class='alert alert-success'><strong>Success!</strong> Record Retrive  Successfully.......</div>";

			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Error!</strong> Try Again..........</div>";
			return "error";
		}

	}
	
	
	Map sessionno;
	@Override
	public void setSession(Map arg0) {
		sessionno = arg0;
		
	}

}
