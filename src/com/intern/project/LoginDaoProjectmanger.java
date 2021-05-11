package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoProjectmanger {

	static Connection con;
	
	public static int projectMlogin(LoginMainProjectManger L1){
		con = ConnectionProvider.getConnection();
		int status = 0;
		try{
		PreparedStatement pstmt = con.prepareStatement("select * from Projectmanger111 where username=? and pass=?");
		pstmt.setString(1, L1.getUsername());
		pstmt.setString(2, L1.getPass());
		
		ResultSet rs =pstmt.executeQuery();
		rs.next();
		status=rs.getInt("id");
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddddddd"+status);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
		
		
	}
}
