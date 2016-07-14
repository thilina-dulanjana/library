<%-- 
    Document   : transaction
    Created on : Jul 14, 2016, 5:20:02 PM
    Author     : thilinad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addTransaction">
            Name<br>
            <input type="number" name="memberId"><br>
            Book<br>
            <input type="number" name="bookId"><br>            
            <input type="submit" value="Add Transaction">
        </form>
    </body>
</html>
