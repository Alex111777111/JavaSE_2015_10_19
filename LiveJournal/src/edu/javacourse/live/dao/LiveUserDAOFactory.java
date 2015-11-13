package edu.javacourse.live.dao;

public class LiveUserDAOFactory
{
    private static final String className = "edu.javacourse.live.dao.LiveUserFakeDAO";
    
    public static LiveUserDAO getLiveUserDAO() {
        LiveUserDAO dao = null;
        try {
            Class cd = Class.forName(className);
            dao = (LiveUserDAO)cd.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dao;
    }
}
