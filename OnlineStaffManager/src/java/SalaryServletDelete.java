



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
public class SalaryServletDelete extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Did = request.getParameter("Did");
		boolean isTrue;
		
		isTrue = SalaryDBUtil.deleteSalary(Did);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("salaryinsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Salary> SalaryDetails = SalaryDBUtil.getSalaryDetails(Did);
			request.setAttribute("cusDetails", SalaryDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("salary.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}


}
