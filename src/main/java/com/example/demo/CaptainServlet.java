package com.example.demo;

import jakarta.servlet.http.HttpServlet;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "captainServlet", value = "/captain-question")
public class CaptainServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Who are you?";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String userName = (String)request.getSession(true).getAttribute("name");
        int countSession = (int)request.getSession(true).getAttribute("countSession");
        //
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
   //     out.println( " <a href=\"cabin-question\">Tell the truth</a>");
   //     out.println( "<a href=\"\">Reject</a>");
        out.println( " <button type=\"button\" onclick=\"window.location.href='cabin-question';\">Tell the truth</button>");
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
