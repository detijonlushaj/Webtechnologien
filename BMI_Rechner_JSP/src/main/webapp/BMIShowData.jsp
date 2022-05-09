
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head> <title> Zeige Namen an </title> </head>
    <body>
        <%
            int kg = Integer.parseInt(request.getParameter("kg"));
            int cm = Integer.parseInt(request.getParameter("cm"));
                  
            double bmi = (double)kg/( ((double)cm/100)*((double)cm/100) );
            bmi = Math.round(bmi * 100.0)/100.0;
        %>
        Ihr BMI ist: <%=bmi%> 
    </body>
</html>

