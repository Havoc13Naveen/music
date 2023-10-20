package com.yourcompany;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/YourAudioServlet")
public class YourAudioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h1>List of Audio Files:</h1>");
        out.println("<audio controls>");
        out.println("<source src='audio/audio1.mp3' type='audio/mpeg'>");
        out.println("Your browser does not support the audio element.");
        out.println("</audio>");
        out.println("<audio controls>");
        out.println("<source src='audio/audio2.mp3' type='audio/mpeg'>");
        out.println("Your browser does not support the audio element.");
        out.println("</audio>");
        out.println("</body></html>");
    }
}

