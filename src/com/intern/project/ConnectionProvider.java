package com.intern.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	 static Connection con = null;

    public static Connection getConnection() {
        if (con != null)
            return con;
        else {
            try {
                
            	Class.forName("oracle.jdbc.driver.OracleDriver");
    			System.out.println("driver loaded");
    			String url="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
                
                con = DriverManager.getConnection(url, "HR", "password");
                System.out.println("Connection Established Successfully");
            } catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe);
            } catch (SQLException sqe) {
                System.out.println(sqe);
            } 
            return con;
        }

    }
}
