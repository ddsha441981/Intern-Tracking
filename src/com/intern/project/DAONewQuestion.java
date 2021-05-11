package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAONewQuestion {
	static Connection con;
	public static int addnewQuestionall(AddNewQuestionMain AQ){
		con = ConnectionProvider.getConnection();
		int status = 0;
			
			System.out.println("inside method");
			
			for(int i=0; i<AQ.correctans.length(); i++){
				if(AQ.correctans.charAt(i)==','){
					AQ.correctans = AQ.correctans.substring(0,i)+AQ.correctans.substring(i+1,AQ.correctans.length());
					break; // this statement should be eliminated in case of multiple dots checking.
				}
			}
			System.out.println("After Remove Comma"+AQ.correctans);
			
		
		try{
			PreparedStatement pstmt = con.prepareStatement("insert into addQuestiontest1111 values(seq5.nextval,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, AQ.questions);
			pstmt.setString(2, AQ.optionA);
			pstmt.setString(3, AQ.optionB);
			pstmt.setString(4, AQ.optionC);
			pstmt.setString(5, AQ.optionD);
			pstmt.setString(6, AQ.optionE);
			pstmt.setString(7, AQ.optionG);
			pstmt.setString(8, AQ.correctans);
			pstmt.setString(9, AQ.qmarks);
			pstmt.setInt(10, AQ.getExam_id());
			status = pstmt.executeUpdate();
			System.out.println("Data Inserted Successfully"+status);
		}catch(SQLException e2){
			e2.printStackTrace();
		}
		return status;
		
	}
	
	public static ArrayList<AddNewQuestionMain> viewallQuestions(){
		con = ConnectionProvider.getConnection();
		ArrayList<AddNewQuestionMain> questionList = new ArrayList<AddNewQuestionMain>();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from addQuestiontest1111");
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				AddNewQuestionMain ANQM = new AddNewQuestionMain();
				ANQM.setQuestion_Id(rs.getInt(1));
				ANQM.setQuestions(rs.getString(2));
				ANQM.setOptionA(rs.getString(3));
				ANQM.setOptionB(rs.getString(4));
				ANQM.setOptionC(rs.getString(5));
				ANQM.setOptionD(rs.getString(6));
				ANQM.setOptionE(rs.getString(7));
				ANQM.setOptionG(rs.getString(8));
				ANQM.setCorrectans(rs.getString(9));
				ANQM.setQmarks(rs.getString(10));
				ANQM.setExam_id(rs.getInt(11));		
				questionList.add(ANQM);
				System.out.println("Data Fetch From Database Successfully"+ANQM.toString());
			}
			
		}catch(SQLException d2){
			d2.printStackTrace();
		}
		return questionList;
		
	}
	
	
	public static AddNewQuestionMain  viewallQuestionsbyId(int exam_id){
		con = ConnectionProvider.getConnection();
		AddNewQuestionMain M1 = new AddNewQuestionMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from addQuestiontest1111 where exam_id=?");
			pstmt.setInt(1, exam_id);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				
				M1.setQuestion_Id(rs.getInt(1));
				M1.setQuestions(rs.getString(2));
				M1.setOptionA(rs.getString(3));
				M1.setOptionB(rs.getString(4));
				M1.setOptionC(rs.getString(5));
				M1.setOptionD(rs.getString(6));
				M1.setOptionE(rs.getString(7));
				M1.setOptionG(rs.getString(8));
				M1.setCorrectans(rs.getString(9));
				M1.setQmarks(rs.getString(10));
				M1.setExam_id(rs.getInt(11));		
				System.out.println("Data Fetch From Database Successfully"+M1.toString());
			}
			
		}catch(SQLException d2){
			d2.printStackTrace();
		}
		return M1;
		
	}


}
