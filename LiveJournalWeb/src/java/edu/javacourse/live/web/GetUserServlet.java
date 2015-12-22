package edu.javacourse.live.web;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.logic.LiveUserManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long userId = Long.parseLong(request.getParameter("userId"));
        LiveUserManager lum = new LiveUserManager();
        LiveUser user = lum.getLiveUser(userId);
        request.setAttribute("USER", user);
        
        getServletContext().getRequestDispatcher("/edituser.jsp").forward(request, response);
    }
}
