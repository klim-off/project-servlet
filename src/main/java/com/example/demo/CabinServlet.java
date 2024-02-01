package com.example.demo;

import jakarta.servlet.http.HttpServlet;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "cabinServlet", value = "/cabin-question")
public class CabinServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "They believed you !  Time to return Home";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String userName = (String)request.getSession(true).getAttribute("name");
        int countSession = (int)request.getSession(true).getAttribute("countSession");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "  " + "</h1>");
        out.println("<h1>" + message + "</h1>");
        // out.println( " <a href=\"index.jsp\">Restart</a>");
        out.println( " <button type=\"button\" onclick=\"window.location.href='index.jsp';\">Restart</button>");
        out.println("<h3> " +"-----------------------------------------" +"</h3>");
        out.println("<h3> " +" Session information:" +"</h3>");
        out.println("<h3>User name: " +userName+ "</h3>");
        out.println("<h3>Number of attempts: " +countSession+ "</h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
