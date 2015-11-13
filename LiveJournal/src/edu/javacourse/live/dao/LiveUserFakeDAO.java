package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.Collections;
import java.util.List;

public class LiveUserFakeDAO implements LiveUserDAO
{
    @Override
    public long addLiveUser(LiveUser user) throws LiveJournalDAOException {
        try {
            System.out.println("addLiveUser");
        } catch(Exception ex) {
            throw new LiveJournalDAOException(ex);
        }
        return 99;
    }

    @Override
    public void updateLiveUser(LiveUser user) throws LiveJournalDAOException {
        System.out.println("updateLiveUser");
    }

    @Override
    public void deleteLiveUser(long userId) throws LiveJournalDAOException {
        System.out.println("deleteLiveUser:" + userId);
    }

    @Override
    public LiveUser getLiveUser(long userId) throws LiveJournalDAOException {
        System.out.println("getLiveUser");
        return new LiveUser();
    }

    @Override
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) throws LiveJournalDAOException {
        System.out.println("findLiveUsers");
        return Collections.emptyList();
    }

}
