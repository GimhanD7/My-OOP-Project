



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Dao.DBUtil;
import MainMemberClass.newMember;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIMHANA
 */
public class UpdateMemberDetailsServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                        PrintWriter out = response.getWriter();
        
            String Mid=request.getParameter("Mid");       
            String FirstName=request.getParameter("FirstName");
            String LastName=request.getParameter("LastName");
            String Address=request.getParameter("Address");
            String Age=request.getParameter("Age");
            String PhoneNo=request.getParameter("PhoneNo");
            String Email=request.getParameter("Email");
            String Position=request.getParameter("Position");
            String DepartmentID=request.getParameter("DepartmentID");
            String UserName=request.getParameter("UserName");
            String Password=request.getParameter("Password");
            
            boolean isTure;
            String s="Mid";  
            //Converting String into int using Integer.parseInt()  
                int Mid1=Integer.parseInt(s);  
            isTure=DBUtil.updateMemberDetails(Mid1, FirstName, LastName, Address,Age, PhoneNo, Email, Position, DepartmentID, UserName, Password);
            if(isTure==true){
                List<newMember> memberDetails = DBUtil.getupdateMemberDetails(Mid);
		request.setAttribute("memberDetails", memberDetails);
                        
                RequestDispatcher dis =request.getRequestDispatcher("MemberAddDetailsShow.jsp");
                dis.forward(request, response);
            }else{
                List<newMember> memberDetails = DBUtil.getupdateMemberDetails(Mid);
			request.setAttribute("memberDetails", memberDetails);
                RequestDispatcher dis =request.getRequestDispatcher("MemberAddDetailsShow.jsp");
                dis.forward(request, response);
            }
    }

    
}
