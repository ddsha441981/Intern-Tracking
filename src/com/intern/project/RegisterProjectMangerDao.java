package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterProjectMangerDao {
	static Connection con;

	public RegisterProjectMangerDao() {
		
		
	}
	
	public static int registerProjectManger(ProjectMangerMain R1)
	{
		con =ConnectionProvider.getConnection();
		int status=0;
		try{
		PreparedStatement pstmt = con.prepareStatement("insert into projectmanger111(id,fname,lname,username,pass,cfpass,email,mob)"+"values(?,?,?,?,?,?,?,?)");
		pstmt.setInt(1, R1.getId());
		pstmt.setString(2, R1.getFname());
		pstmt.setString(3, R1.getLname());
		pstmt.setString(4, R1.getUsername());
		pstmt.setString(5, R1.getPass());
		pstmt.setString(6, R1.getCfpass());
		pstmt.setString(7, R1.getEmail());
		pstmt.setInt(8, R1.getMob());
		
		status = pstmt.executeUpdate();
		
		System.out.println("Record Added"+R1);
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	public static ArrayList<ProjectMangerMain> AlldataProjectManger(ProjectMangerMain AA1){
		ArrayList<ProjectMangerMain> list = new ArrayList<ProjectMangerMain>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{

			
			PreparedStatement pstmt = con.prepareStatement("select * from projectmanger111");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				ProjectMangerMain pm = new ProjectMangerMain();
				pm.setId(rs.getInt(1));
				pm.setFname(rs.getString(2));
				pm.setLname(rs.getString(3));
				pm.setUsername(rs.getString(4));
				pm.setPass(rs.getString(5));
				pm.setCfpass(rs.getString(6));
				pm.setEmail(rs.getString(7));
				pm.setMob(rs.getInt(8));
				list.add(pm);
			
			}
			System.out.println("All recorded Fetch"+list);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		System.out.println("Statusis++++++++++++++++++++"+status);
		return list;
		
	}

	public static ProjectMangerMain datafetchById(int id){
		con = ConnectionProvider.getConnection();
		int status=0;
		ProjectMangerMain pm1 = new ProjectMangerMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from projectmanger111 where id =?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				pm1.setId(rs.getInt(1));
				pm1.setFname(rs.getString(2));
				pm1.setLname(rs.getString(3));
				pm1.setUsername(rs.getString(4));
				pm1.setPass(rs.getString(5));
				pm1.setCfpass(rs.getString(6));
				pm1.setEmail(rs.getString(7));
				pm1.setMob(rs.getInt(8));
				
			
			}
			System.out.println("Record Fetch ByUsingId"+pm1);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return pm1;
		
	}
	
	
	public static int projectdelete(int id){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from projectmanger111 where id =?");
			pstmt.setInt(1, id);
			
			status=pstmt.executeUpdate();
			System.out.println("Records deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}	
	
	/*public static ProjectMangerMain editProjectManger(int id){
		con = ConnectionProvider.getConnection();
		int status=0;
		ProjectMangerMain pm2 = new ProjectMangerMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("update id,fname, from projectmanger111 where id =?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				pm2.setId(rs.getInt(1));
				pm2.setFname(rs.getString(2));
				pm1.setLname(rs.getString(3));
				pm1.setUsername(rs.getString(4));
				pm1.setPass(rs.getString(5));
				pm1.setCfpass(rs.getString(6));
				pm1.setEmail(rs.getString(7));
				pm1.setMob(rs.getInt(8));
				
			
			}
			System.out.println("Record Updated ByUsingId"+pm2);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return pm2;
		
	}*/
}
