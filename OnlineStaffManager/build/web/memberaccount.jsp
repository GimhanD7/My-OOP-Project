<%-- 
    Document   : memberaccount
    Created on : 09-Nov-2022, 09:16:48
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:forEach var="mem" items="$(memberDetails)">
            
            <c:set var="Mid" value="${mem.Mid}"/>
            <c:set var="FirstName" value="${mem.FirstName}"/>
            <c:set var="LastName" value="${mem. LastName}"/>
            <c:set var="Address" value="${mem.Address}"/>
            <c:set var="Age" value="${mem.Age}"/>
            <c:set var="PhoneNo" value="${mem.PhoneNo}"/>
            <c:set var="Email" value="${mem. Email}"/>
            <c:set var="Position" value="${mem. Position}"/>
            <c:set var="DepartmentID" value="${mem.DepartmentID}"/>
            <c:set var="UserName" value="${mem. UserName}"/>
            <c:set var="Password" value="${mem.Password}"/>
            
            
            
            
            ${mem.Mid}
            ${mem.FirstName}
            ${mem. LastName}
            ${mem.Address}
            ${mem.Age}
            ${mem.PhoneNo}
            ${mem. Email}
            ${mem. Position}
            ${mem.DepartmentID}
            ${mem. UserName}
            ${mem.Password}
            
            <c:url value="UpdateMemberDetails.jsp" var="memupdate">
                <c:param name="Mid" value="${Mid}"/>
                <c:param name="FirstName" value="${FirstName}"/>
                <c:param name="LastName" value="${LastName}"/>
                <c:param name="Address" value="${Address}"/>
                <c:param name="Age" value="${Age}"/>
                <c:param name="PhoneNo" value="${PhoneNo}"/>
                <c:param name="Email" value="${Email}"/>
                <c:param name="Position" value="${Position}"/>
                <c:param name="DepartmentID" value="${DepartmentID}"/>
                <c:param name="UserName" value="${UserName}"/>
                <c:param name="Password" value="${Password}"/>
            </c:url>
                
            
            <a href="${memupdate}">
            <input type="button" name="update" value="Update Member Data"></a>
              
        </c:forEach>
    </body>
</html>
