package edu.javacourse.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SecondServlet", urlPatterns = {"/second"})
public class SecondServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tmp = (String)request.getSession().getAttribute("NAME");
        
        response.getWriter().append(tmp);
    }
}
