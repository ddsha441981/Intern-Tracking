package com.intern.project;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class AttemptQuestionMain/* implements ServletRequestAware*/ {
	int question_Id;/*Auto Generated*/
	String questions;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String optionE;
	String optionG;
	String correctans;
	String qmarks;
	int exam_id;/*Forigen Key of Exam */
	String msg;/*For Print Massage*/
	
	
	
	public int getQuestion_Id() {
		return question_Id;
	}



	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}



	public String getQuestions() {
		return questions;
	}



	public void setQuestions(String questions) {
		this.questions = questions;
	}



	public String getOptionA() {
		return optionA;
	}



	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}



	public String getOptionB() {
		return optionB;
	}



	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}



	public String getOptionC() {
		return optionC;
	}



	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}



	public String getOptionD() {
		return optionD;
	}



	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}



	public String getOptionE() {
		return optionE;
	}



	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}



	public String getOptionG() {
		return optionG;
	}



	public void setOptionG(String optionG) {
		this.optionG = optionG;
	}



	public String getCorrectans() {
		return correctans;
	}



	public void setCorrectans(String correctans) {
		this.correctans = correctans;
	}



	public String getQmarks() {
		return qmarks;
	}



	public void setQmarks(String qmarks) {
		this.qmarks = qmarks;
	}



	public int getExam_id() {
		return exam_id;
	}



	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	ArrayList<AttemptQuestionMain> mm1;
	
	

	public ArrayList<AttemptQuestionMain> getMm1() {
		return mm1;
	}



	public void setMm1(ArrayList<AttemptQuestionMain> mm1) {
		this.mm1 = mm1;
	}



	@Override
	public String toString() {
		return "AttemptQuestionMain [question_Id=" + question_Id + ", questions=" + questions + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", optionE=" + optionE
				+ ", optionG=" + optionG + ", correctans=" + correctans + ", qmarks=" + qmarks + ", exam_id=" + exam_id
				+ "]";
	}



	public String allattemptQuestion(){
		
		System.out.println("Here Exam Id is :"+exam_id);
		setMm1(DAOattemptQuestionExam.viewallQuesByUsingId(exam_id));
		if(mm1.size()>0){
			System.out.println("Here Data is "+mm1.toString());
			
			//req.setAttribute("attempt", mm1);
			return "success";
		}
		else{
			return "error";
		}
		
		
	}

	
	

	/*HttpServletRequest req;
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		req = arg0;
		
	}*/

}
