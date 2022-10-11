package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
            PreparedStatement psmt = con.prepareStatement("update student set stname=? where stno=?");
			
            psmt.setString(1, "Rijo");
			psmt.setInt(2, 102);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " Record is Updated");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
