
<%@page import="student.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Lis</title>
        <style>
            h1{
                text-align: center;
                
                
            }
            table{
                color: goldenrod;
                margin-left: auto;
                margin-right: auto;
                font-size: 20px;        
                }
           </style>
    </head>
    <body>
        <h1>Record of Students</h1>
        <table border="1" >
            <tr>
                <th>Name</th>
                <th>Father Name</th>
                <th>Roll No</th>
                <th>Class</th>
                <th>Delete</th>
                <th>Update</th>
                <th>Fees Details</th>
            </tr>
                <% 
                  ArrayList studentlist =(ArrayList)request.getAttribute("list");
                 StudentBean student= new StudentBean();
                for(int i=0; i<studentlist.size();i++){
                student=(StudentBean)studentlist.get(i);
                
                %>
            <tr>
                <td><%=student.getName() %></td>
                <td><%=student.getFname()%></td>
                <td><%=student.getRollno()%></td>
                <td><%=student.getSclass()%></td>
                <td><a href="ControllerServlet?action=delete&stid=<%=student.getId() %>">Delete</a></td>
                <td><a href="ControllerServlet?action=update&stid=<%=student.getId() %>">Update</a></td>
                <td><a href="ControllerServlet?action=feesdetail&stid=<%=student.getId() %>">Fees Details</a></td>


            </tr>
                
                
                <%}
                %>
                
                
           
            
            
            
            
        </table>
    </body>
</html>
