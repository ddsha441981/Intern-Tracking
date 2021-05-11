package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOProjectInterviewdetails {

	static Connection con;
	
	public static ArrayList<ProjectPlacementDepartment>  projectviewalldataofInterviewById(){
		con = ConnectionProvider.getConnection();
		ArrayList<ProjectPlacementDepartment> J1 = new ArrayList<ProjectPlacementDepartment>();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from interviewdata1111");
			
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				
				ProjectPlacementDepartment DJ2 = new ProjectPlacementDepartment();
				DJ2.setIntview_id(rs.getInt(1));
				DJ2.setCompany_name(rs.getString(2));
				DJ2.setLocation_name(rs.getString(3));
				DJ2.setAsked_ques(rs.getString(4));
				DJ2.setRemarks(rs.getString(5));
				DJ2.setGivendate(rs.getDate(6));
				DJ2.setInterview_status(rs.getString(7));
				DJ2.setId(rs.getInt(8));
						
				J1.add(DJ2);
				System.out.println("Data Fetch From Database Successfully");
			}
			
		}catch(SQLException d2){
			d2.printStackTrace();
		}
		return J1;
		
	}
	
	public static int deletealldataofInterviewById(int intview_id){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from interviewdata1111 where intview_id =?");
			pstmt.setInt(1, intview_id);
			
			status=pstmt.executeUpdate();
			System.out.println("Records deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}	
		
	
	public static  int editInterviewProject(int intview_id){
		con = ConnectionProvider.getConnection();
		
		int count2=0;
		try{
			PreparedStatement pstmt1 = con.prepareStatement("update interviewdata1111 set interview_status='Approved' where intview_id=?");
			pstmt1.setInt(1, intview_id);
			 count2 =pstmt1.executeUpdate();
				//J1.add(M1);
				System.out.println(count2+ " : Record update SuccessFully.................");
			
		}
		catch(SQLException e5){
			e5.printStackTrace();
		}
		return count2;
	
	}
}
