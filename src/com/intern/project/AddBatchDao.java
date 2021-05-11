package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddBatchDao {
 static Connection con;
	public static int addBatchByProjectManger(AddBatchMain BB1)
	{
		con =ConnectionProvider.getConnection();
		int status=0;
		try{
			System.out.println("In Method addBatchByProjectManger");
		PreparedStatement pstmt = con.prepareStatement("insert into batch111(Bid,Bname,Bsrt,Bend,id)"+" values(?,?,?,?,?)");
		pstmt.setInt(1, BB1.getBid());
		pstmt.setString(2, BB1.getBname());
		pstmt.setDate(3, new java.sql.Date(BB1.Bstrt.getTime()));
		pstmt.setDate(4, new java.sql.Date(BB1.Bend.getTime()));
		pstmt.setInt(5, BB1.getId());
		status = pstmt.executeUpdate();
		System.out.println("Batch Added"+status);
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	
	public static ArrayList<AddBatchMain> Allfetchbatch(AddBatchMain Batch){
		ArrayList<AddBatchMain> b1 = new ArrayList<AddBatchMain>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{

			PreparedStatement pstmt = con.prepareStatement("select * from batch111");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				AddBatchMain obj = new AddBatchMain();
				
				obj.setBid(rs.getInt(1));
				obj.setBname(rs.getString(2));
				obj.setBstrt(rs.getDate(3));
				obj.setBend(rs.getDate(4));
				obj.setId(rs.getInt(5));
				
				
				b1.add(obj);
			
			}
			System.out.println("All recorded Fetch using by Object"+b1);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		
		return b1;
		
	}
	
	
	public static int batchDeleteById(int Bid){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from batch111 where Bid =?");
			pstmt.setInt(1, Bid);
			
			status=pstmt.executeUpdate();
			System.out.println("Batch deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}	
}
