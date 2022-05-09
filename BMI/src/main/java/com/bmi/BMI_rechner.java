package com.bmi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BMI", urlPatterns = {"/start"})
public class BMI_rechner extends HttpServlet {

  @Override
  public void service(HttpServletRequest req, HttpServletResponse resp)
                                    throws ServletException, IOException{
    int cm = Integer.parseInt(req.getParameter("cm"));
    int kg = Integer.parseInt(req.getParameter("kg"));
    
    double bmi = (double)kg/( ((double)cm/100)*((double)cm/100) );
    
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println(" <head><title>BMI Rechner</title></head>");
    out.println(" <body>");
    out.println("   Dein BMI ist " + Math.round(bmi * 100.0)/100.0 + "! <br>");
    out.println(" </body>");
    out.println("</html>");
  }
}