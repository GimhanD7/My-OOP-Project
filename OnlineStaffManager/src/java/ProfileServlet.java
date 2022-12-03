



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author GIMHANA
 */
@WebServlet(urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getsession
        HttpSession session =request.getSession();
        //check if session is null
        if(session.getAttribute("user") != null){
            ///if session not null than go to profilepage
            response.sendRedirect("ProfilePage.html");
        }else{
            response.sendRedirect("index.html");
        }
    }

   

}
