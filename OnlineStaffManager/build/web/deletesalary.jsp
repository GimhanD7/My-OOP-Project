<%-- 
    Document   : deletesalary
    Created on : 09-Nov-2022, 23:58:51
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
		String Did = request.getParameter("Did");
		String Dname = request.getParameter("Dname");
		String Dsalary = request.getParameter("Dsalary");
	
	%>

	<h1>Salary Account Delete</h1>

	<form action="SalaryServletDelete" method="post">
	<table>
		<tr>
			<th>Department ID</th>
			<th><input type="text" name="cusid" value="<%= Did %>" readonly></th>
		</tr>
		<tr>
			<th>Department Name</td>
			<th><input type="text" name="name" value="<%= Dname %>" readonly></th>
		</tr>
		<tr>
		<th>Department of Salary</th>
		<th><input type="text" name="email" value="<%= Dsalary %>" readonly></th>
	</tr>

			
	</table>
	<br>
	<input type="submit" name="submit" value="Delete Salary Department">
	</form>

    </body>
</html>
