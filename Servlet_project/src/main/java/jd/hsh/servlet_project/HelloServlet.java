package jd.hsh.servlet_project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

  @Override
  public void service(HttpServletRequest req, HttpServletResponse resp)
                                    throws ServletException, IOException{
    String who = req.getParameter("nickname");
    
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println(" <head><title>You called a Servlet</title></head>");
    out.println(" <body>");
    out.println("   Hello in Webtechnologien  " + who + "! <br>");
    out.println("  Heute ist  "+ new Date());
    out.println(" </body>");
    out.println("</html>");
  }
}