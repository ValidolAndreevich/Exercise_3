package com.example.exercise_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = {"/firstServlet"})
public class ServletExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text = request.getParameter("textFromPage");
        request.setAttribute("textFromServlet", text);
        getServletContext().getRequestDispatcher("/jspExample.jsp").forward(request, response);
    }
}