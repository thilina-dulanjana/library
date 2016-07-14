<%-- 
    Document   : book
    Created on : Jul 10, 2016, 7:22:09 PM
    Author     : thilina
--%>

<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SaveBook">
        Book Name <br>
        <input type="text" name="book_name" id="book_name"/><br>
        Author<br>
        <select name="author_id">
        <%            
            Map<String, String> authors = (Map) request.getAttribute("authors");            
            for(Map.Entry<String,String> auth : authors.entrySet()){
                %>
                <option value="<%= auth.getKey() %>">
                    <%= auth.getValue() %>
                </option>
                <%
            }
         %>
        </select>
        <br>
        <input type="submit" value="Save Book">
        </form>
    </body>
</html>
