/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIMHANA
 */
@WebServlet(urlPatterns = {"/loginServlet1"})
public class loginServlet1 extends HttpServlet {

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username =request.getParameter("uid");
        String password =request.getParameter("pass");
        
        try{
            List<Customer> cusDetails =  CustomerDBUtil.validate(username, password);
        request.setAttribute("cusDetails", cusDetails);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
        dis.forward(request, response);
    



    }}
