package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOInterviewdetails {

	static Connection con;
	public static int  saveallinterviewdata(PlacementDepartmentMain PDM){
		con = ConnectionProvider.getConnection();
		System.out.println(PDM.getId());
		int status = 0;
		try{
			PreparedStatement pstmt = con.prepareStatement("insert into interviewdata1111 values(seq8.nextval,?,?,?,?,?,?,?)");
			pstmt.setString(1, PDM.getCompany_name());
			pstmt.setString(2, PDM.getLocation_name());
			pstmt.setString(3, PDM.getAsked_ques());
			pstmt.setString(4, PDM.getRemarks());
			pstmt.setDate(5,new java.sql.Date(PDM.givendate.getTime()));
			pstmt.setString(6, PDM.getInterview_status());
			pstmt.setInt(7, PDM.getId());
			status = pstmt.executeUpdate();
			System.out.println("Data Insert Successfully");
		}catch (SQLException e8) {
			e8.printStackTrace();
		}
		return status;
	}
	
	public static ArrayList<PlacementDepartmentMain>  viewalldataofInterviewById(int id){
		con = ConnectionProvider.getConnection();
		ArrayList<PlacementDepartmentMain> P1 = new ArrayList<PlacementDepartmentMain>();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from interviewdata1111 where id=?");
			pstmt.setInt(1, id);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				
				PlacementDepartmentMain D2 = new PlacementDepartmentMain();
				D2.setIntview_id(rs.getInt(1));
				D2.setCompany_name(rs.getString(2));
				D2.setLocation_name(rs.getString(3));
				D2.setAsked_ques(rs.getString(4));
				D2.setRemarks(rs.getString(5));
				D2.setGivendate(rs.getDate(6));
				D2.setInterview_status(rs.getString(7));
				D2.setId(rs.getInt(8));
						
				P1.add(D2);
				System.out.println("Data Fetch From Database Successfully");
			}
			
		}catch(SQLException d2){
			d2.printStackTrace();
		}
		return P1;
		
	}
	
		
}
