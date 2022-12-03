



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Dao.SalaryDBUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIMHANA
 */
public class SalaryServletInsert extends HttpServlet {
    
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Dname = request.getParameter("Dname");
		String Dsalary = request.getParameter("Dsalary");
		
		
		boolean isTrue;
		
		isTrue = SalaryDBUtil.insertsalary(Dname, Dsalary );
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}
    
}
