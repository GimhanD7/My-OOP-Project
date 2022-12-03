



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import MainMemberClass.Salary;
import Dao.SalaryDBUtil;
import java.io.IOException;
import java.io.PrintWriter;
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
public class SalaryServletUpdate extends HttpServlet {

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
                        PrintWriter out = response.getWriter();
                        
		String Did = request.getParameter("Did");
		String Dname = request.getParameter("Dname");
		String Dsalary = request.getParameter("Dsalary");
	
		
		boolean isTrue;
		
		isTrue = SalaryDBUtil.updateSalary(Did, Dname, Dsalary );
		
		if(isTrue == true) {
			
			List<Salary> SalaryDetails = SalaryDBUtil.getSalaryDetails(Did);
			request.setAttribute("SalaryDetails", SalaryDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("salary.jsp");
			dis.forward(request, response);
		}
		else {
			List<Salary> cusDetails = SalaryDBUtil.getSalaryDetails(Did);
			request.setAttribute("SalaryDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("salary.jsp");
			dis.forward(request, response);
		}
	}
}
