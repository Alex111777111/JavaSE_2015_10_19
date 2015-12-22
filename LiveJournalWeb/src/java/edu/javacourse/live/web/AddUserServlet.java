package edu.javacourse.live.web;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.logic.LiveUserManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUserServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userId = request.getParameter("userId");
        String alias = request.getParameter("alias");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        LiveUser lu = new LiveUser();
        lu.setAlias(alias);
        lu.setEmail(email);
        lu.setPassword(password);

        try {
            LiveUserManager lum = new LiveUserManager();
            if(userId == null || userId.trim().isEmpty()) {
                lum.addLiveUser(lu);
            } else {
                Long id = Long.parseLong(userId);
                lu.setUserId(id);
                lum.updateLiveUser(lu);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/list");
    }

}
