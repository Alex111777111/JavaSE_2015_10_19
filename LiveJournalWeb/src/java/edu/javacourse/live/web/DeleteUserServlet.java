package edu.javacourse.live.web;

import edu.javacourse.live.logic.LiveUserManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long userId = Long.parseLong(request.getParameter("userId"));
        LiveUserManager lum = new LiveUserManager();
        lum.deleteLiveUser(userId);
        
        response.sendRedirect(request.getContextPath()+"/list");
    }

}
