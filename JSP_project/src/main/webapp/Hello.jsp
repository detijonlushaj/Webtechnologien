<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>

<html>
    <title> First JSP </title>
    <body>
        <h3> Hello World <br>
            heute ist:  <%= new Date()%>
        </h3>
    </body>
</html>
