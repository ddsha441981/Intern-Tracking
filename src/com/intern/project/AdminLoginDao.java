package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLoginDao {
	static Connection con;

	public static int adminLogin(AdminLoginMain A1) {
		con = ConnectionProvider.getConnection();
		int status = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from Admin111 where userA=? and pwd=?");
			pstmt.setString(1, A1.getUserA());
			pstmt.setString(2, A1.getPwd());
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			status = rs.getInt("id");
			System.out.println("Admin Login Data" + status);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}
}
