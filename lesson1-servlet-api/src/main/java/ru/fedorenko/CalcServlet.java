package ru.fedorenko;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/CalcServlet")
public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int param1 = Integer.parseInt(request.getParameter("param1"));
        int param2 = Integer.parseInt(request.getParameter("param2"));
        int sum = param1 + param2;
        response.getWriter().println("<p>" + sum + "</p>");
    }
}
