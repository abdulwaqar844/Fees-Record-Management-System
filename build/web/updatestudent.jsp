<%-- 
    Document   : addstudent
    Created on : Sep 5, 2020, 12:23:28 PM
    Author     : ABDUL WAQAR
--%>

<%@page import="student.StudentBean"%>
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
            <%
            StudentBean sBean = (StudentBean)request.getAttribute("student");
            
            
            %>
            <h2>Update Student</h2>
            <form action="ControllerServlet" method="post"  >
                <input type="hidden"  name="id" value="<%=sBean.getId()%>" >
                <input type="text" name="sname" placeholder="Student Name" value="<%=sBean.getName() %>">
                <br>
                <input type="text" name ="fname" placeholder="Father Name" value ="<%=sBean.getFname() %>" >
                <br>
                <input type="text" name="rollno" placeholder="Roll No" value ="<%=sBean.getRollno()%>">
                <br>
                <input type="text" name="class" placeholder="Class" value ="<%=sBean.getSclass()%>">
                <br>
                <input type="submit" name="action" value="updating">
                
            
                
            </form>
            </div>
    </body>
</html>
