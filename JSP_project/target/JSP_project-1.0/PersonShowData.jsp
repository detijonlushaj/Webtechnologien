
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head> <title> Zeige Namen an </title> </head>
    <body>
        Dein Name ist: <%=request.getParameter("vorname")%> 
                       <%=request.getParameter("nachname")%>
    </body>
</html>

