package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOCreateExam {

	static Connection con;
	
	public static int alladdexam(CreateExamMain CEM){
		con=ConnectionProvider.getConnection();
		int flag=0;
		try{
			
			PreparedStatement pstmt = con.prepareStatement("insert into exammodule111 values(seq4.nextval,?,?,?,?,?,?,?)");
			pstmt.setString(1, CEM.getExamname());
			pstmt.setInt(2, CEM.getTotal_ques());
			pstmt.setInt(3, CEM.getTotal_marks());
			pstmt.setString(4, CEM.getTimee());
			pstmt.setDate(5, new java.sql.Date(CEM.examdate.getTime()));
			pstmt.setString(6, CEM.getExamstatus());
			pstmt.setInt(7, CEM.getId());
			flag=pstmt.executeUpdate();
			
			System.out.println("Exam Module Data Added Successfully"+CEM);
		
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		
		return flag;
	}
	
	public static ArrayList<CreateExamMain>  viewMyExamdata(CreateExamMain EM){
		ArrayList<CreateExamMain> examlist = new  ArrayList<CreateExamMain>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{

			
			PreparedStatement pstmt = con.prepareStatement("select * from exammodule111");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				CreateExamMain A1 = new CreateExamMain();
				A1.setExam_id(rs.getInt(1));
				A1.setExamname(rs.getString(2));
				A1.setTotal_ques(rs.getInt(3));
				A1.setTotal_marks(rs.getInt(4));
				A1.setTimee(rs.getString(5));
				A1.setExamdate(rs.getDate(6));
				A1.setExamstatus(rs.getString(7));
				A1.setId(rs.getInt(8));
				examlist.add(A1);
			
			}
			System.out.println("All recorded Fetch of Exam"+examlist);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		System.out.println("Status is"+status);
		return examlist;
		
	}

	public static CreateExamMain examQuestionAddById(int exam_id) {
		con=ConnectionProvider.getConnection();
		CreateExamMain obj = new CreateExamMain();
	
		try{
			
			PreparedStatement pstmt = con.prepareStatement("select * from exammodule111 where exam_id=?");
			pstmt.setInt(1, exam_id);
			System.out.println("here Exam Id is "+exam_id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				obj.setExam_id(rs.getInt(1));
				obj.setExamname(rs.getString(2));
			}
			
			
			System.out.println("Exam Module Data Retrive Successfully"+obj);
		
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		
		return obj;
	}
	
	
	public static int removebyprojectExam(int exam_id){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from exammodule111 where exam_id=?");
			pstmt.setInt(1, exam_id);
			
			status=pstmt.executeUpdate();
			System.out.println("Records deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}	
		
	
}
