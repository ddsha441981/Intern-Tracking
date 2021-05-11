package com.intern.project;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class InstructionsExamMain implements ServletRequestAware {
	int exam_id;/* Auto Gen */
	String examname;
	int total_ques;
	int total_marks;
	String timee;
	// String examstatus;
	/* int id;id is project manger id store in database As a foriegn key */

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
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

	@Override
	public String toString() {
		return "InstructionsExamMain [exam_id=" + exam_id + ", examname=" + examname + ", total_ques=" + total_ques
				+ ", total_marks=" + total_marks + ", timee=" + timee + "]";
	}

	public String instructionQuestion(/* int exam_id */) {
		System.out.println("-------------------------------------------------");
		System.out.println("Here Exam Id is : " + exam_id);
		InstructionsExamMain obj1 = DAOInstructionsExam.questionInstructionById(getExam_id());
		System.out.println("Here To String is ===========" + obj1.toString());
		if (obj1.getExam_id() > 0) {
			request.setAttribute("myinstruction", obj1);
			return "success";
		}
		return "error";

	}

	HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;

	}

}
