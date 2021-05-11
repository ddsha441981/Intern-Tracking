package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOLeaveofIntern {
	static Connection con;

	public static int leaveofInternsave(LeaveofInternMain L1) {
		con = ConnectionProvider.getConnection();
		int status = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into internLeave values (seq6.nextval,?,?,?,?,?,?,?,?)");

			pstmt.setDate(1, new java.sql.Date(L1.getStartleave().getTime()));
			pstmt.setDate(2, new java.sql.Date(L1.getEndleave().getTime()));
			pstmt.setString(3, L1.getLeaveReason());
			pstmt.setString(4, L1.getLeaveType());
			pstmt.setString(5, L1.getTypeLeave());
			pstmt.setString(6, L1.getLeaveStatus());
			pstmt.setDate(7, new java.sql.Date(L1.getLeaveApplydate().getTime()));
			pstmt.setInt(8, L1.getId());
			status = pstmt.executeUpdate();
			System.out.println("Record Added Successfully.........."+status);

		} catch (SQLException e4) {
			e4.printStackTrace();
		}
		return status;

	}
	
	public static  ArrayList<LeaveofInternMain> viewLeaveallInternById(int id){
		con = ConnectionProvider.getConnection();
		ArrayList<LeaveofInternMain> MH1 = new ArrayList<LeaveofInternMain>();
		try{
			PreparedStatement pstmt1 = con.prepareStatement("select * from internLeave where id=?");
			pstmt1.setInt(1, id);
			ResultSet rs =pstmt1.executeQuery();
			while(rs.next()){
				LeaveofInternMain LM = new LeaveofInternMain();
				LM.setLeave_Id(rs.getInt(1));
				LM.setStartleave(rs.getDate(2));
				LM.setEndleave(rs.getDate(3));
				LM.setLeaveReason(rs.getString(4));
				LM.setLeaveType(rs.getString(5));
				LM.setTypeLeave(rs.getString(6));
				LM.setLeaveStatus(rs.getString(7));
				LM.setLeaveApplydate(rs.getDate(8));
				LM.setId(rs.getInt(9));
				MH1.add(LM);
				System.out.println("Record Fetch SuccessFully.................");
			}
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		return MH1;
		
	}

}
