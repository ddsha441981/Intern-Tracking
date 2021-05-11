package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOApprovedLeaveByProject {
	static Connection con;
	public static ArrayList<ApprovedLeaveByProject> approvedleavebyProject(){
		con = ConnectionProvider.getConnection();
		ArrayList<ApprovedLeaveByProject> JP =  new ArrayList<ApprovedLeaveByProject>();
		try{
			
			PreparedStatement pstmt = con.prepareStatement("select * from internLeave");
			
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				ApprovedLeaveByProject L1 = new ApprovedLeaveByProject();
				L1.setLeave_Id(rs.getInt(1));
				L1.setStartleave(rs.getDate(2));
				L1.setEndleave(rs.getDate(3));
				L1.setLeaveReason(rs.getString(4));
				L1.setLeaveType(rs.getString(5));
				L1.setTypeLeave(rs.getString(6));
				L1.setLeaveStatus(rs.getString(7));
				L1.setLeaveApplydate(rs.getDate(8));
				L1.setId(rs.getInt(9));
				JP.add(L1);
				System.out.println("Record Fetch SuccessFully.................");
			}
			
		}catch(SQLException e1){
			e1.printStackTrace();
		}
		return JP;
		
	}

	public static  int editLeaveProject(int leave_Id){
		con = ConnectionProvider.getConnection();
		//ArrayList<ApprovedLeaveByProject> J1 = new ArrayList<ApprovedLeaveByProject>();
		//ApprovedLeaveByProject M1 = new ApprovedLeaveByProject();
		int count=0;
		try{
			PreparedStatement pstmt1 = con.prepareStatement("update internLeave set leaveStatus='Approved' where leave_Id=?");
			pstmt1.setInt(1, leave_Id);
			 count =pstmt1.executeUpdate();
				//J1.add(M1);
				System.out.println(count+ " : Record update SuccessFully.................");
			
		}
		catch(SQLException e5){
			e5.printStackTrace();
		}
		return count;
	
	}
	
	public static  int removedataLeaveProject(int leave_Id){
		
			con=ConnectionProvider.getConnection();
			int status=0;
			try{
				PreparedStatement pstmt = con.prepareStatement("delete from internLeave where leave_Id =?");
				pstmt.setInt(1, leave_Id);
				
				status=pstmt.executeUpdate();
				System.out.println("Records deleted "+status);
			}catch(SQLException e){
				e.printStackTrace();	
			}
			return status;
		}	
}
