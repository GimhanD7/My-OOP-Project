package Connection;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIMHANA
 */
public class DBConnect {
        private static String url = "jdbc:mysql://localhost:3306/OnlineStaffManager?zeroDateTimeBehavior=CONVERT_TO_NULL";
	private static String userU = "root";
	private static String passU = "0000";
	private static Connection con;
        
        public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userU, passU);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
        }
    
}
