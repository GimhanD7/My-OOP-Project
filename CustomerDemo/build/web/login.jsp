<%-- 
    Document   : login
    Created on : 07-Nov-2022, 01:45:10
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="loginServlet1" method="post">
            Username : <input type="text" name="uid">
            Password : <input type="password" name="pass">
            
            <input type="submit" value="Login">
            
        </form>
    </body>
</html>
