package com.intern.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class CreateExamMain implements SessionAware {
	int exam_id;/* Auto Gen */
	String examname;
	int total_ques;
	int total_marks;
	String timee;
	Date examdate;
	String examstatus;
	int id;/* id is project manger id store in database As a foriegn key */

	CreateExamMain obj;


	public CreateExamMain getObj() {
		return obj;
	}

	public void setObj(CreateExamMain obj) {
		this.obj = obj;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExamname() {
		return examname;
	}

	public void setExamname(String examname) {
		this.examname = examname;
	}

	public int getTotal_ques() {
		return total_ques;
	}

	public void setTotal_ques(int total_ques) {
		this.total_ques = total_ques;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public String getTimee() {
		return timee;
	}

	public void setTimee(String timee) {
		this.timee = timee;
	}

	public Date getExamdate() {
		return examdate;
	}

	public void setExamdate(Date examdate) {
		this.examdate = examdate;
	}

	public String getExamstatus() {
		return examstatus;
	}

	public void setExamstatus(String examstatus) {
		this.examstatus = examstatus;
	}

	ArrayList<CreateExamMain> examlist;

	public ArrayList<CreateExamMain> getExamlist() {
		return examlist;
	}

	public void setExamlist(ArrayList<CreateExamMain> examlist) {
		this.examlist = examlist;
	}

	@Override
	public String toString() {
		return "CreateExamMain [exam_id=" + exam_id + ", examname=" + examname + ", total_ques=" + total_ques
				+ ", total_marks=" + total_marks + ", timee=" + timee + ", examdate=" + examdate + ", examstatus="
				+ examstatus + ", id=" + id + "]";

	}

	public String addexam() {
		int id = (int) session.get("userId");
		setId(id);
		System.out.println("Here Project Manger Id is : " + id);

		int i = DAOCreateExam.alladdexam(this);
		if (i > 0) {

			return "success";
		}
		return "error";

	}

	public String allviewExam() {

		setExamlist(DAOCreateExam.viewMyExamdata(this));
		if (examlist.size() > 0) {

			System.out.println("Here Arraylist Size is  : " + examlist.toString());
			System.out.println("Here Arraylist Size is  : " + examlist.size());
			return "success";
		}
		return "error";

	}

	public String addexamUsingById() {
		System.out.println("Here Exam Id is : " + exam_id);
		CreateExamMain obj = DAOCreateExam.examQuestionAddById(getExam_id());
		System.out.println("Here To String is ===========" + obj.toString());
		if (obj.getExam_id() > 0) {
			
			return "success";
		}
		return "error";

	}

	public String removeexambyIdbyProject(){
		System.out.println("Here Exam Id is On Delete"+exam_id);
		int dd =  DAOCreateExam.removebyprojectExam(exam_id);
		if(dd > 0){
			return "success";
		}
		return "error";
	}
	
	Map session;

	@Override
	public void setSession(Map arg0) {
		session = arg0;

	}
	
}
