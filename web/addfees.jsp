<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Fees</title>
         <style>
            
            input{
                alignment-adjust: central;
                font-size: 28px;
                width: auto;
                padding: 10px 10px;
                
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
        <h1>Add New Fees Record</h1>
        <form action="ControllerServlet" method="get">
            <input type="hidden" name="stid" value="<%=request.getParameter("stid") %>">
            <input type="text" name="month" placeholder="Month" >
            <br>
            <input type="number" name="amount" placeholder="Paid Amount">
            <br>
            <input type="date" name="paiddate" >
            <br>
            <input type="submit" name="action" value="addfees">
        </form>
    </body>
</html>
