<%-- 
    Document   : salary
    Created on : 10-Nov-2022, 00:04:45
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
        	<table>
	<c:forEach var="cus" items="${SalaryDetails}">
	
	<c:set var="id" value="${cus.Did}"/>
	<c:set var="name" value="${cus.Dname}"/>
	<c:set var="email" value="${cus.Dsalary}"/>
	
	
	<tr>
		<td>Department ID</td>
		<td>${cus.Did}</td>
	</tr>
	<tr>
		<td>Department Name</td>
		<td>${cus.Dname}</td>
	</tr>
	<tr>
		<td>Salary of Member</td>
		<td>${cus.Dsalary}</td>
	</tr>

        <tr>
            <td></td>
                        <td>
                <c:url value="updatesalary.jsp" var="cusupdate">
		<c:param name="Did" value="${Did}"/>
		<c:param name="Dname" value="${Dname}"/>
		<c:param name="Dsalary" value="${Dsalary}"/>

	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update salary">
	</a></td>

        </tr>
            
	</c:forEach>
	</table>
	
	
	
	<br>
	<c:url value="deletesalary.jsp" var="cusdelete">
		<c:param name="id" value="${Did}" />
		<c:param name="name" value="${Dname}" />
		<c:param name="email" value="${Dsalary}" />
	
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete Salary Account">
	</a>
	
    </body>
</html>
