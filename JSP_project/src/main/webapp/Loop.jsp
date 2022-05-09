<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>  <title> Loop </title>    </head>

    <body>
        <%
            for (int i = 0; i < 10; i++) {
        %>
        Schleife i= ( <%= i%>)<BR>
        <% } %>
    
    </body>

</html>
