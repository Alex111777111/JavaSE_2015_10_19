package edu.javacourse.live.web;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.logic.LiveUserManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet
{
    private void process(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        LiveUserManager lum = new LiveUserManager();
        List<LiveUser> users = lum.findLiveUsers(null);
        request.setAttribute("USER_LIST", users);
        getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        process(request, response);
    }
}
