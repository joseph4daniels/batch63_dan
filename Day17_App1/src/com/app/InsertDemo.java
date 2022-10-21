package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
            PreparedStatement psmt = con.prepareStatement("insert into student values(?,?,?)");
			
            psmt.setInt(1, 107);
			psmt.setString(2, "e");
			psmt.setString(3, "e@e");
			
            ResultSet rs = psmt.executeQuery("select * from student");
            
            /*ResultSetMetaData md = rs.getMetaData();
			int x  = md.getColumnCount();
			
			for(int i = 1; i <= x; i++) {
				System.out.println(md.getColumnName(i) + "  ");
			}*/
            
            while(rs.next())
			{
				System.out.println(rs.getString(1) + "   " + rs.getString(2)
								  + "   " + rs.getString(3));
			}
			
            int i = psmt.executeUpdate();
            
            if(i>0)
            	con.commit();
            else
            	con.rollback();
            
            System.out.println(i + " records are inserted");
            
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
