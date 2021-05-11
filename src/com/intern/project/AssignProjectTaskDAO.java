package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AssignProjectTaskDAO {

	static Connection con;
	public static int assignprojecttask(AssignProjectTaskMain AS){
		con =ConnectionProvider.getConnection();
		int status=0;
		try{
			System.out.println("In Method");
			PreparedStatement pstmt = con.prepareStatement("insert into assignproject1111 values(seq9.nextval,?,?,?,?,?,?,?,?)");
	
			pstmt.setString(1, AS.getProject_topic());
			pstmt.setDate(2, new java.sql.Date(AS.Tstrt.getTime()));
			pstmt.setDate(3, new java.sql.Date(AS.Tend.getTime()));
			pstmt.setString(4, AS.getEditor1());
			pstmt.setString(5, AS.getBatchlist());/* this Batch id As foreign key*/
			pstmt.setString(6,AS.getGrouplist());/* this Group Id id As foreign key*/
			pstmt.setInt(7,AS.getId());/* this Project Manger id As foreign key*/
			//pstmt.setString(8, AS.getStatus());
			pstmt.setString(8, "padding");
			
			System.out.println("Batch Id :- "+AS.getBatchlist());
			System.out.println("Group Id :- "+AS.getGrouplist());
			System.out.println("Project Manger Id :- "+AS.getId());
			
			
		status = pstmt.executeUpdate();
		System.out.println("Assign Task Added"+status);
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	
	public static AssignProjectTaskMain viewtaskbyproject(int id){
		con =ConnectionProvider.getConnection();
		
		AssignProjectTaskMain ATM = new AssignProjectTaskMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from assignproject1111 where id =?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				ATM.setProject_topic(rs.getString(1));
				ATM.setEditor1(rs.getString(2));
				ATM.setTstrt(rs.getDate(3));
				ATM.setTend(rs.getDate(4));
				ATM.setBatchlist(rs.getString(5));
				ATM.setGrouplist(rs.getString(6));
				ATM.setId(rs.getInt(7));
				ATM.setStatus(rs.getString(8));
				
				
			
			}
			System.out.println("Record Fetch ByUsingId"+ATM.toString());
			
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		
		return ATM;
		
	}
}

