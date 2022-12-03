<%-- 
    Document   : MemberAddDetailsShow
    Created on : 07-Nov-2022, 18:18:15
    Author     : GIMHANA
--%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Details</title>
                <style>
                    a {
                        background-color: #04AA6D;
                        border: none;
                        color: white;
                        padding: 8px 16px;
                        text-decoration: none;
                        margin: 2px 1px;
                        cursor: pointer;
                        }
                    #customers {
                      font-family: Arial, Helvetica, sans-serif;
                      border-collapse: collapse;
                      width: 100%;
                    }

                    #customers td, #customers th {
                      border: 1px solid #ff0000;
                      padding: 8px;
                    }

                    #customers tr:nth-child(even){background-color: #f59fdb;}

                    #customers tr:hover {background-color: #ddd;}

                    #customers th {
                      padding-top: 12px;
                      padding-bottom: 12px;
                      text-align: left;
                      background-color: #ff5e00;
                      color: white;
                    }
                </style>        
    </head>
    <body>
        <Center>
        <table border="1" id="customers">
            <tr>
                <th>Staff Member ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Age</th>
                <th>Phone Number</th>
                <th>Email</th>
                <th>Position</th>
                <th>Department ID</th>
                <th>UserName</th>
                <th>Password</th>
                <th>Action</th>
            </tr>
       
        
        <%
            try{
                    //here the retreve
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineStaffManager?zeroDateTimeBehavior=CONVERT_"
                    + "TO_NULL","root","0000");
                    //
                    Statement stmt =con.createStatement(); 
                    //now display
                    String st="select * from managerdetails";
                    ResultSet rs =stmt.executeQuery(st);
                    while(rs.next()){
                     %> 
                     <form action="update" method="post">
                        <tr>
                     <td><%=rs.getString("Mid")%></td>
                     <td><%=rs.getString("FirstName")%></td>
                     <td><%=rs.getString("LastName")%></td>
                     <td><%=rs.getString("Address")%></td>
                     <td><%=rs.getString("Age")%></td>
                     <td><%=rs.getString("PhoneNo")%></td>
                     <td><%=rs.getString("Email")%></td>
                     <td><%=rs.getString("Position")%></td>
                     <td><%=rs.getString("DepartmentID")%></td>
                     <td><%=rs.getString("UserName")%></td>
                     <td><%=rs.getString("Password")%></td>
                     <td>
           <input type="text" value="<%=rs.getString("Mid")%>">
                         <button type="submit" name="submit">Edit</button></td>
        </form>
                         
                    



                     
                        </tr>
                       
                       <%             }
                    
            }
            catch(Exception e){
            
            }
        %>
        </table>
        
        
    </Center>
    </body>
</html>
