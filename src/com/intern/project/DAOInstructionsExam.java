package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOInstructionsExam {
	static Connection con;
	public static InstructionsExamMain questionInstructionById(int exam_id) {
		con=ConnectionProvider.getConnection();
		InstructionsExamMain obj1 = new InstructionsExamMain();
	
		try{
			
			PreparedStatement pstmt = con.prepareStatement("select * from exammodule111 where exam_id=?");
			pstmt.setInt(1, exam_id);
			System.out.println("here Exam Id is "+exam_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				obj1.setExam_id(rs.getInt(1));
				obj1.setExamname(rs.getString(2));
				obj1.setTotal_ques(rs.getInt(3));
				obj1.setTotal_marks(rs.getInt(4));
				obj1.setTimee(rs.getString(5));
			}
			
			
			System.out.println("Exam Module Data Retrive Successfully"+obj1);
		
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		
		return obj1;
	}
	

}
