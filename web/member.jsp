<%-- 
    Document   : member
    Created on : Jul 13, 2016, 11:31:28 PM
    Author     : thilina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SaveMember">
            Name<br>
            <input type="text" name="memberName"><br>
            Address<br>
            <textarea name="address"></textarea><br>
            Father's Name<br>
            <input type="text" name="father"><br>
            Father's contact<br>
            <input type="text" name="fContact"><br>
            Mother's Name<br>
            <input type="text" name="mother"><br>
            Mother's contact<br>
            <input type="text" name="mContact"><br>
            <input type="Submit" value="Add Member" />
        </form>
    </body>
</html>
