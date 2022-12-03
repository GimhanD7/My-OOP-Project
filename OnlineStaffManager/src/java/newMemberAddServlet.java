
import Dao.DBUtil;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author GIMHANA
 */
public class newMemberAddServlet extends HttpServlet {
private static Connection con = null;
  

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                        response.setContentType("text/html;charset=UTF-8");
                        PrintWriter out = response.getWriter();
//                        try{
//                            String Mid =request.getParameter("Mid");
//                            String FirstName =request.getParameter("FirstName");
//                            String LastName =request.getParameter("LastName");
//                            String Address =request.getParameter("Address");
//                            String PhoneNo =request.getParameter("PhoneNo");
//                            String Email =request.getParameter("Email");
//                            String Position =request.getParameter("Position");
//                            String Department =request.getParameter("Department");
//                            String UserName =request.getParameter("UserName");
//                            String Password =request.getParameter("Password");
//
////                            Class.forName("com.mysql.cj.jdbc.Driver");
////                            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineStaffManager?zeroDateTimeBehavior=CONVERT_TO_NULL","root","0000");                
////                            con = DBConnect.getConnection();
////                            stmt = con.createStatement();
////                            String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
//                            
//                            con = DBConnect.getConnection();
//                            Statement stmt = con.createStatement();
//                           
//                            String sql = "insert into onlinestaffmanager.managerdetails values ('"+Mid+"','"+FirstName+"','"+LastName+"','"+Address+"','"+PhoneNo+"',"+ "'"+Email+"','"+Position+"','"+Department+"','"+UserName+"','"+Password+"')";
//        
//                         int v=stmt.executeUpdate(sql);
//                         if(v>0){
//                             out.println("<h1>Successful Add Details </h1>");
//                         }else{
//                             out.println("<h1>Hello Errors</h1>");
//                         }
//                         
//                            } catch (SQLException ex) {
//                                    Logger.getLogger(newMemberAddServlet.class.getName()).log(Level.SEVERE, null, ex);
//                                }                       
//                                finally{
//                                    out.close();
//                                }
                        
                            String Mid =request.getParameter("Mid");
                            String FirstName =request.getParameter("FirstName");
                            String LastName =request.getParameter("LastName");
                            String Address =request.getParameter("Address");
                            String Age =request.getParameter("Age");
                            String PhoneNo =request.getParameter("PhoneNo");
                            String Email =request.getParameter("Email");
                            String Position =request.getParameter("Position");
                            String DepartmentID =request.getParameter("DepartmentID");
                            String UserName =request.getParameter("UserName");
                            String Password =request.getParameter("Password");
                            
                            boolean isTure;
                            isTure = DBUtil.insertmember(Mid, FirstName, LastName, Address,Age, PhoneNo, Email, Position, 
                                  DepartmentID, UserName, Password);
                            if(isTure==true){
                                 RequestDispatcher dis=request.getRequestDispatcher("MemberAddDetailsShow.jsp");
                                    dis.forward(request, response);
                            }else{
                                out.println("unsucccccc");
                            }
        
    }

    

}
