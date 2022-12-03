



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author GIMHANA
 */
@WebServlet(urlPatterns = {"/Myservlet"})
public class Myservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //action preform
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        //accept values
        String name =request.getParameter("name");
        
        
        //now 
        out.print("Enter text is : "+name);
        
        
    }


    
}

