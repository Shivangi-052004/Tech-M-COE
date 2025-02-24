package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Set the content type to HTML
        response.setContentType("text/html");
        
        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();
        
        // Display the HTML content
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>HTML from Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Displayed using Java Servlet</h1>");
        out.println("<p>This content is served from the DisplayHtmlServlet.</p>");
        out.println("<a href='index.html'>Go to HTML Page</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
