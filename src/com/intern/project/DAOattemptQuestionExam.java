package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOattemptQuestionExam {
	static Connection con;
	public static ArrayList<AttemptQuestionMain>  viewallQuesByUsingId(int exam_id){
		con = ConnectionProvider.getConnection();
		ArrayList<AttemptQuestionMain> mm1 = new ArrayList<AttemptQuestionMain>();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from addQuestiontest1111 where exam_id=?");
			pstmt.setInt(1, exam_id);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				
				AttemptQuestionMain A2 = new AttemptQuestionMain();
				
				A2.setQuestion_Id(rs.getInt(1));
				A2.setQuestions(rs.getString(2));
				A2.setOptionA(rs.getString(3));
				A2.setOptionB(rs.getString(4));
				A2.setOptionC(rs.getString(5));
				A2.setOptionD(rs.getString(6));
				A2.setOptionE(rs.getString(7));
				A2.setOptionG(rs.getString(8));
				A2.setCorrectans(rs.getString(9));
				A2.setQmarks(rs.getString(10));
				A2.setExam_id(rs.getInt(11));		
				mm1.add(A2);
				System.out.println("Data Fetch From Database Successfully");
			}
			
		}catch(SQLException d2){
			d2.printStackTrace();
		}
		return mm1;
		
	}
}
