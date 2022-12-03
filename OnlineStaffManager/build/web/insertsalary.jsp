<%-- 
    Document   : insertsalary
    Created on : 09-Nov-2022, 23:55:26
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
        <form action="SalaryServletInsert" method="post">
		Department Name <input type="text" name="Dname"><br>
		Salary of Member <input type="text" name="Dsalary"><br>
		
		
		<input type="submit" name="submit" value="Create Salary">
	</form>
    </body>
</html>
