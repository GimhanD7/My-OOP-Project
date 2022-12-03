
import Connection.DBConnect;
import MainMemberClass.newMember;
import java.sql.Connection;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIMHANA
 */
public class deleteDao {
    public int deletedata(newMember cus) throws ClassNotFoundException {
	    	
	        int result = 0;
	   
	        String Mid = cus.getMid();

			try 
			{  
                Connection con = DBConnect.getConnection();
                Statement stmtt = con.createStatement();
                            con = DBConnect.getConnection();
				//java.sql.Statement stmtt;
				String query="delete from customer where id = " +Mid;
				stmtt=con.createStatement();
				stmtt.execute(query);
				
				
				
					
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
	        return result;
	

}}
