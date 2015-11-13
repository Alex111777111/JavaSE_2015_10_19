package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.List;

public interface LiveUserDAO
{
    public long addLiveUser(LiveUser user) throws LiveJournalDAOException;
    public void updateLiveUser(LiveUser user) throws LiveJournalDAOException;
    public void deleteLiveUser(long userId) throws LiveJournalDAOException;
    public LiveUser getLiveUser(long userId) throws LiveJournalDAOException;
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) throws LiveJournalDAOException;
}
