package com.intern.project;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

public class ResultQuestionMain implements ServletRequestAware /*extends HttpServlet*/ {
	private String que;
	private String ua;//user Answer
	private String ca;//correct Answer
	int count = 0;
	
	/*public void init() throws ServletException{
		super.init();
		System.out.println("ResultQuestionMain.init()");
	}*/
	
	private String getQue() {
		return que;
	}
	private void setQue(String que) {
		this.que = que;
	}
	private String getUa() {
		return ua;
	}
	private void setUa(String ua) {
		this.ua = ua;
	}
	private String getCa() {
		return ca;
	}
	private void setCa(String ca) {
		this.ca = ca;
	}
	public String attemptedAnswerQuestion() /*throws IOException*/{
		
		/*String questionsId[]=req.getParameterValues("que");
		for(String s : questionsId){
			System.out.println(s);
			System.out.println(req.getParameter("ans"+s));
			System.out.println(req.getParameter("cs"+s));
		}*/
		
		String questionsId[]=req.getParameterValues("que");
		for(int j = 0; j<questionsId.length;j++){
			System.out.println("QUestion Id : "+questionsId[j]);
			String user[]=req.getParameterValues("ua"+questionsId[j]);
			for (int i = 0; i < user.length; i++) {
				System.out.println("Here Selected answer "+user[i]);
			}
			System.out.println("Correct answer : "+req.getParameter("ca"+questionsId[j]));
			System.out.println("---------------------------------------------");
			
			
			
			/*if(req.getParameter("ua"+questionsId[j]).equals(req.getParameter("ca"+questionsId[j]))){
				
				System.out.println("Here Correct Answer Is :"+count);
				count++;
			}
			if(req.getParameter("ua"+questionsId[j])!=null){
				System.out.println("Here Not Null Answer Is :"+count);
				count++;
			}
			System.out.println("Return For Loop :"+count);
			j++;*/
		}
		/*for(int i=0;i<questionsId.length;i++){
	
			System.out.println(questionsId[i]);
			System.out.println(req.getParameter("ua"+questionsId[i]));
			System.out.println(req.getParameter("ca"+questionsId[i]));
			System.out.println("------------------------------------");
			if(req.getParameter("ua"+questionsId[i]).equals(req.getParameter("ca"+questionsId[i]))){
				System.out.println("Here Correct Answer Is :"+count);
				count++;
			}
			if(req.getParameter("ua"+questionsId[i])!=null){
				System.out.println("Here Not Null Answer Is :"+count);
				count++;
			}
			System.out.println("Return For Loop :"+count);
			i++;
		}*/
		
		
		/*String questionId[]=req.getParameterValues("que");
		for(int i = 0; i<questionId.length;i++){
			
			System.out.println(questionId);
			System.out.println(req.getParameter("ua"+questionId[i]));
			System.out.println(req.getParameter("ua"+questionId[i]));
			System.out.println(req.getParameter("ca"+questionId[i]));
			System.out.println("------------------------------------");
			String userAnswer[]=req.getParameterValues("ca");
			
			for(int j = 0;j<userAnswer.length;j++){
				
				System.out.println(req.getParameter("ua"+userAnswer[j]));
				System.out.println(req.getParameter("ua"+userAnswer[j]));
				System.out.println(req.getParameter("ca"+userAnswer[j]));
				System.out.println("***********************************");	
				
				
			}
		}*/
		
		
//		System.out.println("Hello this is Example");
		
		return "success";
	}
	HttpServletRequest req;
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		
		req = arg0;
		
		
	}
	/*HttpServletRequest req;
	HttpServletResponse res;
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		req = arg0;
		res = arg1;
	}

	@Override*/
	
}
