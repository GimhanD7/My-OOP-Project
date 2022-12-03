<%-- 
    Document   : index
    Created on : 07-Nov-2022, 10:47:54
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Maneger Option</title>
                <style>
            body {
              margin: 0;
              font-family: Arial, Helvetica, sans-serif;
            }

            .topnav {
              overflow: hidden;
              background-color: #333;
            }

            .topnav a {
              float: right;
              color: #f2f2f2;
              text-align: center;
              padding: 14px 16px;
              text-decoration: none;
              font-size: 17px;
            }

            .topnav a:hover {
              background-color: #ddd;
              color: black;
            }

            .topnav a.active {
              background-color: #04AA6D;
              color: white;
            }
</style>
    </head>
    <body>
        
        <div class="topnav">
                 <a class="active" href="newMemberAdd.jsp">Add New Staff Manager</a>
                <a href="MemberAddDetailsShow.jsp">All Member Details</a>
                <a href="insertsalary.jsp">Salary Details</a>
                <a href="#about">Leave Details</a>
        
        </div>
        
<!--    <center>
        <form action="loginServletManager" method="POST">
            <table>
                <tr>
                    <th>Username : </th><th><input type="text" name="username"/></th>
                        
                </tr>
                <tr>
                    <th>Password :</th><th><input type="password" name="password"/></th>
                        
                </tr>
                <tr>
                    <th><input type="submit" value="login"/></th>
                    <th><input type="reset" value="Reset"></th>
                </tr>
            
            </table>
        </form></center>-->
    </body>
</html>
