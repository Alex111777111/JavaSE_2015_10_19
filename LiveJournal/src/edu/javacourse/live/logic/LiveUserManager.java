package edu.javacourse.live.logic;

import edu.javacourse.live.dao.LiveUserDAO;
import edu.javacourse.live.dao.LiveUserDAOFactory;
import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalBusinessException;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.Collections;
import java.util.List;

public class LiveUserManager
{
    private LiveUserDAO dao = LiveUserDAOFactory.getLiveUserDAO();
    
    public long addLiveUser(LiveUser user) throws LiveJournalBusinessException {
        try {
            return dao.addLiveUser(user);
        } catch (LiveJournalDAOException ex) {
            throw new LiveJournalBusinessException(ex);
        }
    }
    
    public void updateLiveUser(LiveUser user) {
        try {
            dao.updateLiveUser(user);
        } catch (LiveJournalDAOException ex) {
        }
    }

    public void deleteLiveUser(long userId) {
        try {
            dao.deleteLiveUser(userId);
        } catch (LiveJournalDAOException ex) {
        }
    }
    
    public LiveUser getLiveUser(long userId) {
        try {
            return dao.getLiveUser(userId);
        } catch (LiveJournalDAOException ex) {
        }
        return null;
    }
    
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) {
        try {
            return dao.findLiveUsers(filter);
        } catch (LiveJournalDAOException ex) {
        }
        return Collections.emptyList();
    }
}
