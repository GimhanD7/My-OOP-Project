<%-- 
    Document   : updatesalary
    Created on : 10-Nov-2022, 00:13:44
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
        <%
		String Did = request.getParameter("Did");
		String Dname = request.getParameter("Dname");
		String Dsalary = request.getParameter("Dsalary");
	
	%>
	
	
	<form action="SalaryServletUpdate" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cusid" value="<%= Did %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= Dname %>"></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email" value="<%= Dsalary %>"></td>
	</tr>
	
	</tr>		
	</table>
	<br>
	<input type="submit" name="submit" value="Update salary">
	</form>
    </body>
</html>
