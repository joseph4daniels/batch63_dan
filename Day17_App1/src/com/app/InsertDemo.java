package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			
            psmt.setInt(1, 102);
			psmt.setString(2, "Samul");
			psmt.setString(3, "@gmail.com");
			
			int i = psmt.executeUpdate();
			System.out.println(i + " records are inserted");
			
			//"update student set stname=? where stno=?"
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
