package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaveGroupDAO {

	static Connection con;

	public static int savedataOfGroup(SaveGroupMain group) {
		con = ConnectionProvider.getConnection();
		int status = 0;
		try {
			System.out.println("In Method");
			PreparedStatement pstmt = con.prepareStatement("insert into group111 values(seq3.nextval,?,?,?)");
			/* pstmt.setInt(1, group.getGroupId()); *//*
														 * Auto Generated id for
														 * group
														 */
			pstmt.setString(1, group.group_name);
			pstmt.setString(2,group.getBatchlist());/* this Batch id As foreign key */
			pstmt.setInt(3,group.getId());/* this project manger id As foreign key */

			System.out.println("Group Name :- " + group.getGroup_name());
			System.out.println("Batch Id :- " + group.getBatchlist());
			System.out.println("Project Manger Id :- " + group.getId());
			status = pstmt.executeUpdate();
			System.out.println("Group Added" + status);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public static ArrayList<SaveGroupMain> viewdataOfGroup(SaveGroupMain Vi) {
		ArrayList<SaveGroupMain> view = new ArrayList<SaveGroupMain>();
		con = ConnectionProvider.getConnection();
		int status = 0;
		try {

			PreparedStatement pstmt = con.prepareStatement("select * from group111");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				SaveGroupMain vi = new SaveGroupMain();
				vi.setGroupId(rs.getInt(1));
				vi.setGroup_name(rs.getString(2));
				vi.setBatchlist(rs.getString(3));/* batchlist is nothing but its Bid of Batch111 */
				vi.setId(rs.getInt(4));

				view.add(vi);

			}
			System.out.println("All recorded Fetch of Group" + view);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Status is" + status);
		return view;

	}

}
