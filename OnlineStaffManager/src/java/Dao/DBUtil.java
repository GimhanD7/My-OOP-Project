package Dao;


import MainMemberClass.newMember;
import Connection.DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class DBUtil {
    
    private static boolean isSuccess;
    private static Connection con=null;
    private static Statement stmt=null;
    private static ResultSet rs=null;
    
    public static List<newMember> getupdateMemberDetails(String Mid){
        ArrayList<newMember> newmember =new ArrayList<>();
        
         String url = "jdbc:mysql://localhost:3306/OnlineStaffManager?zeroDateTimeBehavior=CONVERT_TO_NULL";
	 String userU = "root";
	 String passU = "0000"; 
         
         
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  con=DriverManager.getConnection(url,userU,passU);
             Statement stmt =con.createStatement();
             
             String sql="select * from managerdetails where Mid='"+Mid+"' ;";
               
             ResultSet rs=stmt.executeQuery(sql);
             
             if(rs.next()){
                 String Mid1=rs.getString(1);
                 String FirstName =rs.getString(2);
                 String LastName =rs.getString(3);
                 String Address =rs.getString(4);
                 String Age =rs.getString(5);
                 String PhoneNo=rs.getString(6);
                 String Email=rs.getString(7);
                 String Position=rs.getString(8);
                 String DepartmentID=rs.getString(9);
                 String UserName =rs.getString(10);
                 String Password =rs.getString(11);
                 
                 newMember M=new newMember( Mid1, FirstName, LastName, Address,Age, PhoneNo,  Email,  Position,  DepartmentID,  UserName,  Password);
                 newmember.add(M);
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        
        return newmember;
        
        
        
        
    }
    
    public static boolean insertmember(String Mid, String FirstName, String LastName, String Address,String Age, String PhoneNo, String Email, 
            String Position, String DepartmentID, String UserName, String Password){
            boolean isSuccess=false; 
         
         try{
                con=DBConnect.getConnection();
                stmt=con.createStatement();
                
             
               String sql = "insert into onlinestaffmanager.managerdetails values ('"+Mid+"','"+FirstName+"','"+LastName+"','"+Address+"','"+Age+"',"
                       + "'"+PhoneNo+"','"+Email+"','"+Position+"','"+DepartmentID+"','"+UserName+"','"+Password+"')";
                
               int rs = stmt.executeUpdate(sql);
               if(rs>0){
                   isSuccess =true;
               }else{
                   isSuccess=false;
               }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
            return isSuccess;
    }
    
    public static boolean updateMemberDetails(int Mid, String FirstName, String LastName, String Address,String Age, String PhoneNo,
            String Email, String Position, String DepartmentID, String UserName, String Password ){
        
        try{
            con =DBConnect.getConnection();
            stmt=con.createStatement();
            String sql ="update managerdetails set Mid='"+Mid+"',FirstName='"+FirstName+"',LastName='"+LastName+"',Address='"+Address+"',Age='"+Age+"',PhoneNo='"+PhoneNo+"',"
                    + "Email='"+Email+"',Position='"+Position+"',DepartmentID='"+DepartmentID+"',UserName='"+UserName+"',Password='"+Password+"' where Mid='"+Mid+"'" ;
            int rs=stmt.executeUpdate(sql);
            if(rs>0){
                isSuccess=true;
            }
            else{
                isSuccess=false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return isSuccess;
    }
    
    public class deleteDao {
	 public int deletedata(newMember cus) throws ClassNotFoundException {
	    	
	        int result = 0;
	   
	        String Mid = cus.getMid();

			try 
			{   
                            con =DBConnect.getConnection();
                            stmt=con.createStatement();
                            con = DBConnect.getConnection();
				java.sql.Statement stmt;
				String query="delete from customer where id = " +Mid;
				stmt=con.createStatement();
				stmt.execute(query);
				
				
				
					
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
	        return result;
	

	}}

    
    
    
//    private static final String upsql="update managerdetails set  FirstName=?, LastName=?, Address=?,Age=?, PhoneNo=?,  Email=?,"
//            + "  Position=?,  DepartmentID=?,  UserName=?,  Password=?;";
//
//    public boolean updateMember(newMember newmember)throws SQLException{
//        boolean rowMember = false;
//        try(Connection con=DBConnect.getConnection(); PreparedStatement statement=con.prepareStatement(upsql);){
//        
//            
//           
//           statement.setString(1, newmember.getFirstName());
//           statement.setString(2, newmember.getLastName());
//           statement.setString(3, newmember.getAddress());
//           statement.setString(4, newmember.getAge());
//           statement.setString(5, newmember.getPhoneNo());
//           statement.setString(6, newmember.getEmail());
//           statement.setString(7, newmember.getPosition());
//           statement.setString(8, newmember.getDepartmentID());
//           statement.setString(9, newmember.getUserName());
//           statement.setString(10, newmember.getPassword());
//           
//           rowMember =statement.executeUpdate()>0;
//           
//           
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        return rowMember;
//    }
//    private static final String selectsql="select Mid, FirstName, LastName, Address,Age, PhoneNo,  Email,  Position,  DepartmentID,  UserName,  Password from managerdetails where Mid=?;";
//    public newMember selectMember(String Mid){
//        newMember newmember=null;
//                try(Connection con=DBConnect.getConnection(); PreparedStatement statement=con.prepareStatement(selectsql);){
//                    statement.setString(1,Mid);
//                    System.out.println(statement);
//                   DBUtil.rs=statement.executeQuery();
//                   
//                   while(rs.next()){
//                       String FirstName=rs.getString("FirstName");
//                       String LastName=rs.getString("LastName");
//                       String Address=rs.getString("Address");
//                       String Age=rs.getString("Age");
//                       String PhoneNo=rs.getString("PhoneNo");
//                       String Email=rs.getString("Email");
//                       String Position=rs.getString("Position");
//                       String DepartmentID=rs.getString("DepartmentID");
//                       String UserName=rs.getString("UserName");
//                       String Password=rs.getString("Password");
//                       newmember =new newMember(Mid, FirstName, LastName, Address,Age, PhoneNo,  Email,  Position,  DepartmentID,  UserName,  Password);
//                   }
//                   
//                   
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//        
//        return newmember;
//    }
//
//    private static final String allesql="select * from managerdetails ;";
//    public newMember selectAllMember(){
//        List<newMember> newmembers =new ArrayList<>();
//                try(Connection con=DBConnect.getConnection(); PreparedStatement statement=con.prepareStatement(allesql);){
//                    
//                    System.out.println(statement);
//                   rs=statement.executeQuery();
//                   
//                   while(rs.next()){
//                       String Mid=rs.getString("Mid");
//                       String FirstName=rs.getString("FirstName");
//                       String LastName=rs.getString("LastName");
//                       String Address=rs.getString("Address");
//                       String Age=rs.getString("Age");
//                       String PhoneNo=rs.getString("PhoneNo");
//                       String Email=rs.getString("Email");
//                       String Position=rs.getString("Position");
//                       String DepartmentID=rs.getString("DepartmentID");
//                       String UserName=rs.getString("UserName");
//                       String Password=rs.getString("Password");
//                       newmembers.add(new newMember(Mid, FirstName, LastName, Address,Age, PhoneNo,  Email,  Position,  DepartmentID,  UserName,  Password));
//                   }
//                   
//                   
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//        
//        return (newMember) newmembers;
//    }
//    
//        private static final String deletesql="delete from managerdetails where Mid=?;";
//        public boolean deletemember(String Mid)throws SQLException{
//            boolean rowDelete;
//            try(Connection con=DBConnect.getConnection(); PreparedStatement statement=con.prepareStatement(deletesql);){
//                statement.setString(1, Mid);
//                rowDelete=statement.executeUpdate()>0;
//            }
//            return rowDelete;
//        }
//        
//    
}
