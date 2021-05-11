package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginInternDao {

	static Connection con;
	
	public static int byLoginByIntern(LoginInternMainPage I1){
		con = ConnectionProvider.getConnection();
		int status = 0;
		try{
		PreparedStatement pstmt = con.prepareStatement("select * from Intern where Iusername=? and Ipass=?");
		pstmt.setString(1, I1.getIusername());
		pstmt.setString(2, I1.getIpass());
		ResultSet rs =pstmt.executeQuery();
		rs.next();
		status=rs.getInt("id");
		
		System.out.println("Login As Intern "+status);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Login Data "+I1);
		return status;
		
	}
}
