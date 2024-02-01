package com.example.demo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    public static String userName = "Default User";
    private int countSession = 0;

    public void init() {
        message = "You've lost your memory. Accept the UFO challenge?";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        countSession++;
        HttpSession currentSession = request.getSession(true);
        currentSession.setAttribute("name", userName);
        currentSession.setAttribute("countSession",countSession);

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "  " + "</h1>");
        out.println("<h1>" + message + "</h1>");
       // out.println( " <a href=\"ufo-question\">Accept</a>");
       // out.println( "<a href=\"reject-result\">Reject</a>");
        out.println( " <button type=\"button\" onclick=\"window.location.href='ufo-question';\">Accept</button>");
        out.println( "<button type=\"button\" onclick=\"window.location.href='reject-result';\">Reject</button>");
        out.println("<h3> " +"-----------------------------------------" +"</h3>");
        out.println("<h3> " +" Session information:" +"</h3>");
        out.println("<h3>User name: " +userName+ "</h3>");
        out.println("<h3>Number of attempts: " +countSession+ "</h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }



}