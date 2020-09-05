<%-- 
    Document   : addstudent
    Created on : Sep 5, 2020, 12:23:28 PM
    Author     : ABDUL WAQAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Record</title>
        <style>
            
            input{
                alignment-adjust: central;
                font-size: 28px;
            }
            
            body{
                
                color: blue;
                font-size: 22px;
                text-align: center;
                background-color: whitesmoke;
            }
        </style>
    </head>
    <body>
       
        <div class="header">
            <h2>Welcome to Fees Record Management System</h2>
            <h2>Add New Record</h2>
            <form action="ControllerServlet" method="post"  >
                <input type="text" name="sname" placeholder="Student Name">
                <br>
                <input type="text" name ="fname" placeholder="Father Name">
                <br>
                <input type="text" name="rollno" placeholder="Roll No">
                <br>
                <input type="text" name="class" placeholder="Class">
                <br>
                <input type="submit" name="action" value="addstudent">
                
            
                
            </form>
            </div>
    </body>
</html>
