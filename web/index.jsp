<%-- 
    Document   : index
    Created on : Sep 5, 2020, 12:17:58 PM
    Author     : ABDUL WAQAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome To SChool System</title>
        <style>
            body{
                
                text-align: center;
                font-size: 22px;
                color: greenyellow;
                background-color: appworkspace;
            }
            
            
        </style>
    </head>
    <body>
        <h1>WelCome to School System </h1>
        <a href="ControllerServlet?action=newrecord" >Add Person</a>
        <br>
        <a href="ControllerServlet?action=list" >Student List</a>
    </body>
</html>
