package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDOAExample {

	public static void main(String[] args) {
		
		//insertEmployee(3, "A", "a@a");
		//insertEmployee(2, "B", "a@a");
		updateEmployee(2, "B", "b@b");
		updateEmployee(3, "A", "a@a");
		//deleteEmployee(1);
		//findEmployeeById(2);
		//findEmployeeByName("A");
		
	}

	static void insertEmployee(int empNo, String name, String email) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
			
			PreparedStatement psmt = con.prepareStatement("insert into employee values(?,?)");
			
            psmt.setInt(1, empNo);
			psmt.setString(2, name);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " records are inserted");
			
		    psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void updateEmployee(int empNo, String name, String email) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
			
			PreparedStatement psmt = con.prepareStatement("update employee set empname=?,email=? where empno=?");
			
            psmt.setString(1, name);
			psmt.setString(2, email);
			psmt.setInt(3, empNo);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " records are updated");
			
		    psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void deleteEmployee(int empNo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
            PreparedStatement psmt = con.prepareStatement("delete from employee where empNo=?");
			
			psmt.setInt(1, empNo);
			
			int i = psmt.executeUpdate();
			System.out.println(i + " Record is Deleted");
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void findEmployeeById(int empNo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
            PreparedStatement psmt = con.prepareStatement("select * from employee where empno=?");
			 
            psmt.setInt(1, empNo);
            //psmt.executeUpdate();
            
            ResultSet rs = psmt.executeQuery();
			rs.next();
            System.out.println(rs.getInt(1)+ " " + " " + rs.getString(2));
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void findEmployeeByName(String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class is available");
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Workmysql");
            PreparedStatement psmt = con.prepareStatement("select * from employee where empName=?");
			 
            psmt.setString(1, name);
            //psmt.executeUpdate();
            
            ResultSet rs = psmt.executeQuery();
			rs.next();
            System.out.println(rs.getInt(1)+ " " + " " + rs.getString(2));
			
			psmt.close(); con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
