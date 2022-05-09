<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>

<html>
    <title> BMI Rechner JSP </title>
    <body>
            <form action ="BMIShowData.jsp" method="post">
            BMI Rechner: <br/>

            Koerpergroesse: <input type="number" name="cm" placeholder="in cm" min="100" max="300" required/> <br/>
            Koerpergewicht: <input type="number" name="kg" placeholder="in kg" min="30" max="300" required /> <br/> 


            <input type="submit" value="Berechne" />
        </form>
    </body>
</html>
