<%@page import="student.FeesBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fees Details</title>
        <style>
             h1,body{
                text-align: center;
                font-size: 25px;
                
                
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
        <h1>Paid Fees Details</h1>
        <table border="1">
            <tr>
            <th>Fees Month</th>
            <th>Fees Amount</th>
            <th>Paid Date</th>
            <td>Delete</td>
            <td>Update</td>
            </tr>
              <% 
                  ArrayList feeslist =(ArrayList)request.getAttribute("list");
                 FeesBean fees = new FeesBean();
                 String sttid=request.getParameter("stid");
                for(int i=0; i<feeslist.size();i++){
                fees=(FeesBean)feeslist.get(i);              
                %>
            <tr>
                <td><%=fees.getMonth() %></td>
                <td><%=fees.getAmount()%></td>
                <td><%=fees.getPaiddate()%></td>
                 <td><a href="ControllerServlet?action=deletefees&id=<%=fees.getId() %>">Delete</a></td>
                 <td><a href="ControllerServlet?action=updatefees&id=<%=fees.getId() %>">Update</a></td>
                

            </tr>
                
            
                <%}
                %>
            
            
        </table>
                <br>
                                <a href="addfees.jsp?stid=<%=fees.getStid() %>" >Add Fees Record</a>    

    </body>
</html>
