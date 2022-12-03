<%-- 
    Document   : UpdateMemberDetails
    Created on : 09-Nov-2022, 11:05:03
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpdateMemberDetails</title>
    </head>
    <body>
        
        <%
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
        %>
        
    <center>
        <form action="UpdateMemberDetailsServlet" method="get">
            <table><tr>
                    <th><label >Staff Member Registered Id</label></th>
                    <th><input type="text"  name="Mid" value="<%= Mid %>" readonly="<%= Mid %>"></th>
                </tr>
                <tr>
                    <th><label >First Name</label></th>
                    <th><input type="text"  name="FirstName" value="<%= FirstName%>"></th>
                </tr>
                <tr>    
                    <th><label >Last Name</label></th>
                    <th><input type="text"  name="LastName" value="<%= LastName%>"></th>
                </tr>
               <tr>     
                   <th><label >Address</label></th>
                    <th><input type="text"  name="Address" value="<%= Address%>"></th>
               </tr>
               <tr>     
                   <th><label >Age</label></th>
                    <th><input type="text"  name="Age" value="<%= Age%>"></th>
               </tr>
                 <tr>   
                     <th><label >Phone No</label></th>
                    <th><input type="text"  name="PhoneNo" value="<%= PhoneNo%>"></th>
                 </tr>
                 <tr>   
                     <th><label >Email</label></th>
                    <th><input type="email"  name="Email" value="<%= Email%>"></th>
                 </tr>
                <tr>    
                    <th><label >Position</label></th>
                    <th><input type="text"  name="Position" value="<%= Position%>"></th>
                </tr>
                <tr>    
                    <th><label >Department ID</label></th>
                    <th><input type="text"  name="DepartmentID" value="<%= DepartmentID%>"></th>
                </tr>
                 <tr>   
                     
                    <th><label >UserName</label></th>
                    <th><input type="text"  name="UserName" value="<%= UserName%>"></th>
                 </tr>
                 <tr>   
                     <th><label >Password</label></th>
                    <th><input type="text"  name="Password" value="<%= Password%>"></th>
                 </tr>
                
                 <tr>
                     <th><input type="submit" name="submit" value="Update New Data"/>  
                 </tr></table>
        </form>
    </center>
    </body>
</html>
