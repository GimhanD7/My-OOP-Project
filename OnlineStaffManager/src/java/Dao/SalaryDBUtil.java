package Dao;


import MainMemberClass.Salary;

import Connection.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIMHANA
 */
public class SalaryDBUtil {
    private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
        
        public static List<Salary> getCustomer(String DName) {
		
		ArrayList<Salary> salary = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from salarydetails where DName='"+DName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int Did = rs.getInt(1);
				String Dname = rs.getString(2);
				String Dsalary = rs.getString(3);
			
				
				Salary cus = new Salary(Did,Dname,Dsalary);
				salary.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return salary;	
	}
        
        public static boolean insertsalary(String Dname, String Dsalary) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into salarydetails values (0,'"+Dname+"','"+Dsalary+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
        
        public static boolean updateSalary(String Did, String Dname, String Dsalary) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update salarydetails set name='"+Dname+"',email='"+Dsalary+"';";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
        
        
        public static List<Salary> getSalaryDetails(String DId) {
    	
    	int convertedID = Integer.parseInt(DId);
    	
    	ArrayList<Salary> salary = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from salarydetails where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int Did = rs.getInt(1);
    			String Dname = rs.getString(2);
    			String Dsalary = rs.getString(3);
    		
    			
    			Salary c = new Salary(Did,Dname,Dsalary);
    			salary.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return salary;	
    }
        
        public static boolean deleteSalary(String Did) {
    	
    	int convId = Integer.parseInt(Did);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from salarydetails where Did='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
    
}
