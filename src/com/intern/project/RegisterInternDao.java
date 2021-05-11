package com.intern.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RegisterInternDao {
	static Connection con;

	public RegisterInternDao() {
		
		
	}
	
	public static int registerIntern(InternMain V1)
	{
		con =ConnectionProvider.getConnection();
		int status=0;
		try{
		PreparedStatement pstmt = con.prepareStatement("insert into Intern(id,Ifname,Ilname,Iusername,Ipass,Icfpass,Iemail,Imob)"+"values(?,?,?,?,?,?,?,?)");
		pstmt.setInt(1, V1.getId());
		pstmt.setString(2, V1.getIfname());
		pstmt.setString(3, V1.getIlname());
		pstmt.setString(4, V1.getIusername());
		pstmt.setString(5, V1.getIpass());
		pstmt.setString(6, V1.getIcfpass());
		pstmt.setString(7, V1.getIemail());
		pstmt.setInt(8, V1.getImob());
		
		status = pstmt.executeUpdate();
		
		System.out.println("Record Added"+V1);
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	public static ArrayList<InternMain> AlldataIntern(InternMain BA1){
		ArrayList<InternMain> list1 = new ArrayList<InternMain>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{

			
			PreparedStatement pstmt = con.prepareStatement("select * from Intern");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				InternMain Ipm = new InternMain();
				Ipm.setId(rs.getInt(1));
				Ipm.setIfname(rs.getString(2));
				Ipm.setIlname(rs.getString(3));
				Ipm.setIusername(rs.getString(4));
				Ipm.setIpass(rs.getString(5));
				Ipm.setIcfpass(rs.getString(6));
				Ipm.setIemail(rs.getString(7));
				Ipm.setImob(rs.getInt(8));
				Ipm.setBid(rs.getInt(9));
				Ipm.setGroupId(rs.getInt(10));
				list1.add(Ipm);
			
			}
			System.out.println("All recorded Fetch"+list1);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		System.out.println("Statusis++++++++++++++++++++"+status);
		return list1;
		
	}

	public static InternMain internFetchById(int id){
		con = ConnectionProvider.getConnection();
		int status=0;
		InternMain Ipm1 = new InternMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from intern where id =?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				Ipm1.setId(rs.getInt(1));
				Ipm1.setIfname(rs.getString(2));
				Ipm1.setIlname(rs.getString(3));
				Ipm1.setIusername(rs.getString(4));
				Ipm1.setIpass(rs.getString(5));
				Ipm1.setIcfpass(rs.getString(6));
				Ipm1.setIemail(rs.getString(7));
				Ipm1.setImob(rs.getInt(8));
				
				
			
			}
			System.out.println("Record Fetch ByUsingId"+Ipm1);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return Ipm1;
		
	}
	
	public static int batchidforIntern(int Bid,String internId){/* batch id get and list get of all batch assign as intern by project manger*/
		int status = 0;
		System.out.println("To Update Intern : "+internId);/*here internId is a (intern Id) which retrive all data of intern like(id,name,....) */
		con = ConnectionProvider.getConnection();
		//InternMain Ipm1 = new InternMain();
		try{
			 internId = new String(internId);
			 String ret[]=internId.split(",");
			// PreparedStatement pstmt = con.prepareStatement("update intern set Bid=? from intern where id=?");
			 Statement stmt=con.createStatement();
			for(String s : ret){
				System.out.println("After Splits String of Batch"+s);
				status=stmt.executeUpdate("update intern set Bid="+Bid+" where id="+Integer.parseInt(s.trim()));
				//pstmt.setInt(1, Bid);
				//pstmt.setInt(2, Integer.parseInt(s.trim()));
				//pstmt.addBatch();
			}
					//stmt.executeBatch();
					
		}catch(SQLException e1){
			e1.printStackTrace();	
		}
		return status;
	}
	
	
	public static int groupidforIntern(int groupId,String myinternId){/* group id get and list of all interns and  assign group to intern by project manger*/
		int status = 0;
		System.out.println("To Update Intern : "+myinternId);/*here myinternId is a (Bid) which  retrive all data of batch like(bid,name,....) */
		con = ConnectionProvider.getConnection();
		
		try{
			myinternId = new String(myinternId);
			 String R1[]=myinternId.split(",");
			
			 Statement stmt=con.createStatement();
			for(String sp : R1){
				System.out.println("After Splits String of Group and Adding intern"+sp);
				status=stmt.executeUpdate("update intern set groupId=seq1.currval where id="+Integer.parseInt(sp.trim()));
				System.out.println("After All Procssing Completed Status"+status);
			}
					
					
		}catch(SQLException e1){
			e1.printStackTrace();	
		}
		return status;
	}
	
		
	public static int interndelete(int id){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from intern where id =?");
			pstmt.setInt(1, id);
			
			status=pstmt.executeUpdate();
			System.out.println("Records deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}	
		
	public static int saveresume(InternMain C1)
	{
		con =ConnectionProvider.getConnection();
		int status=0;
		try{
		PreparedStatement pstmt = con.prepareStatement("insert into myresume values(seq7.nextval,?)");
		pstmt.setString(1, C1.getResumedata());
		
		
		status = pstmt.executeUpdate();
		
		System.out.println("Resume Save SuccessFully..............."+C1);
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	
	/*public static ProjectMangerMain editProjectManger(int id){
		con = ConnectionProvider.getConnection();
		int status=0;
		ProjectMangerMain pm2 = new ProjectMangerMain();
		try{
			PreparedStatement pstmt = con.prepareStatement("update id,fname from projectmanger111 where id =?");
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
