<%-- 
    Document   : newMemberAdd
    Created on : 07-Nov-2022, 10:32:34
    Author     : GIMHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add new mebmer Detais</title>
        
        <style> 
                    input[type=text],input[type=email] {
                      width: 300px;
                      padding: 12px 20px;
                      margin: 8px 0;
                      box-sizing: border-box;
                      border: 2px solid red;
                      border-radius: 4px;
                    }input[type=reset] {
                      background-color: red;
                        border: none;
                        color: white;
                        padding: 16px 32px;
                        text-decoration: none;
                        margin: 4px 2px;
                        cursor: pointer;
                    }
                    select{width: 300px;
                      padding: 12px 20px;
                      margin: 8px 0;
                      box-sizing: border-box;
                      border: 2px solid red;
                      border-radius: 4px;}
                    center{
                        margin:1%;
                    }
                    input[type=submit] {
                        background-color: #04AA6D;
                        border: none;
                        color: white;
                        padding: 16px 32px;
                        text-decoration: none;
                        margin: 4px 2px;
                        cursor: pointer;
                        }
                        table{
                            margin:10px;
                            padding: 20px;
                            
                            border:solid;
                            border-radius:20px;
                        }
                        
            </style>
    </head>
    <body>
    <center>
            
        <form action="newMemberAddServlet" method="POST">
            <table><tr>
                    <th><label >Staff Member Registered Id</label></th>
                    <th><input type="text"  name="Mid" required></th>
                </tr>
                <tr>
                    <th><label >First Name</label></th>
                    <th><input type="text"  name="FirstName" required></th>
                </tr>
                <tr>    
                    <th><label >Last Name</label></th>
                    <th><input type="text"  name="LastName" required></th>
                </tr>
               <tr>     
                   <th><label >Address</label></th>
                    <th><input type="text"  name="Address" required></th>
               </tr>
               <tr>     
                   <th><label >Age</label></th>
                    <th><input type="text"  name="Age" required></th>
               </tr>
                 <tr>   
                     <th><label >Phone No</label></th>
                    <th><input type="text"  name="PhoneNo" required></th>
                 </tr>
                 <tr>   
                     <th><label >Email</label></th>
                    <th><input type="email"  name="Email" required></th>
                 </tr>
                <tr>    
                    <th><label >Position</label></th>
                    <th><input type="text"  name="Position" required></th>
                </tr>
                <tr>    
                    <th><label >Department ID</label></th>
                    <th><select  name="DepartmentID" required>
                            <option value="1">Admin</option>
                            <option value="2">Manager</option>
                            <option value="3">IT</option>
                            <option value="4">Finance </option></select>
                    </th>
                </tr>
                 <tr>   
                     
                    <th><label for="lname">UserName</label></th>
                    <th><input type="text"  name="UserName" required></th>
                 </tr>
                 <tr>   
                     <th><label for="lname">Password</label></th>
                    <th><input type="text"  name="Password" required></th>
                 </tr>
                
                 <tr>
                     <th><input type="submit" name="save"/>  <th><input type="reset" value="Reset"></th>
                 </tr></table> 
        </form></center>
    </body>
</html>
