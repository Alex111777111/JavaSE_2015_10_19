package edu.javacourse.live.dao;

import edu.javacourse.live.config.LiveJournalSettings;
import edu.javacourse.live.logic.DaoAnnotation;

@DaoAnnotation(daoName = "edu.javacourse.live.dao.LiveUserFakeDAO")
public class LiveUserDAOFactory
{
    public static LiveUserDAO getLiveUserDAO() {
        LiveUserDAO dao = null;

        String className = LiveJournalSettings.getDaoClassName();
        if (className == null) {
            DaoAnnotation daoAn = LiveUserDAOFactory.class.getAnnotation(DaoAnnotation.class);
            if (daoAn != null) {
                className = daoAn.daoName();
                System.out.println("DAO from annotation");
            }
        }
        if (className != null) {
            System.out.println("DAO from reflection");
            try {
                Class cd = Class.forName(className);
                dao = (LiveUserDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new LiveUserFakeDAO();
        }

        return dao;
    }
}
