<%-- 
    Document   : useraccount
    Created on : 07-Nov-2022, 02:32:37
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>useraccount Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="cus" items="${cusDetails}">
            ${cus.id}
            ${cus.name}
            ${cus.email}
            ${cus.phone}
            ${cus.userName}
            ${cus.password}
            
        </c:forEach>
        
    </body>
</html>
