package com.intern.project;

import java.util.ArrayList;

public class AddNewQuestionMain /*implements ServletRequestAware */{
	int question_Id;/* Auto Generated */
	String questions;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String optionE;
	String optionG;
	String correctans;
	String qmarks;
	int exam_id;/* Forigen Key of Exam */
	String msg;/* For Print Massage */

	ArrayList<AddNewQuestionMain> questionList;

	public ArrayList<AddNewQuestionMain> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(ArrayList<AddNewQuestionMain> questionList) {
		this.questionList = questionList;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

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

	public String addnewQuestion() {
		System.out.println("Here Exam Id -----------" + getExam_id());
		System.out.println("Here Option -----------" + getOptionA());
		System.out.println("Here Option -----------" + getOptionB());
		System.out.println("Here Option -----------" + getOptionC());
		System.out.println("Here Option -----------" + getOptionD());
		System.out.println("Here Option -----------" + getOptionE());
		System.out.println("Here Option -----------" + getOptionG());
		System.out.println("Here Option -----------" + getCorrectans());

		System.out.println("Exam Id is :" + exam_id);
		int i = DAONewQuestion.addnewQuestionall(this);
		if (i > 0) {
			msg = "<div class='alert alert-success'><strong>Success!</strong> Question Added Successfully.</div>";
			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Danger!</strong> Try Again Not Added Question.</div>";
			return "error";
		}

	}

	public String viewQuestion() {

		setQuestionList(DAONewQuestion.viewallQuestions());
		if (questionList.size() > 0) {

			msg = "<div class='alert alert-success'><strong>Success!</strong> Question Retrive Successfully.</div>";

			return "success";
		} else {
			msg = "<div class='alert alert-danger'><strong>Danger!</strong> Try Again!!!!!!!!!</div>";
			return "error";
		}

	}

	public String viewQuestionusingById() {
		System.out.println("Here Exam Id is +++++++++++++++++++++:" + getExam_id());
		AddNewQuestionMain M1 = DAONewQuestion.viewallQuestionsbyId(exam_id);
		if (M1.getExam_id() > 0) {
			System.out.println("here iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + M1.getExam_id());
			//request.setAttribute("myprevious", M1);
			return "success";
		} else {
			return "error";
		}

	}

	/*HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;

	}*/

}
