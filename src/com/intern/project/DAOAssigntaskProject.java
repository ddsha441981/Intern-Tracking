package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOAssigntaskProject {
	
	static Connection con;
	public static int addtakassigntaskofPrject(ProjecttaskMain PTM){
		con=ConnectionProvider.getConnection();
		int flag=0;
		try{
			
		
		PreparedStatement pstmt = con.prepareStatement("insert into assigntask111 values(seq10.nextval,?,?,?,?,?,?,?)");
		pstmt.setDate(1, new java.sql.Date(PTM.startassigntask.getTime()));
		pstmt.setDate(2, new java.sql.Date(PTM.endassigntask.getTime()));
		pstmt.setString(3, PTM.getStatus());
		pstmt.setString(4, PTM.getMinieditor());
		pstmt.setString(5, PTM.getBatch_name());
		pstmt.setString(6, PTM.getGroup_name());
		pstmt.setString(7, PTM.getIntern_name());
		flag=pstmt.executeUpdate();
		System.out.println("Records of Assign Task Added"+flag);
		
		}
		catch(SQLException e1){
			e1.printStackTrace();
			
		}
		return flag;
		
	}

}
