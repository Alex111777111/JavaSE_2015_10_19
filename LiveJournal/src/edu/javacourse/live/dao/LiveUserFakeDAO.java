package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiveUserFakeDAO implements LiveUserDAO
{
    private List<LiveUser> users = new ArrayList<LiveUser>();

    @Override
    public long addLiveUser(LiveUser user) throws LiveJournalDAOException {
        long userId = generateUserId();
        try {
            user.setUserId(userId);
            LiveUser lu = (LiveUser)user.clone();
            users.add(lu);
        } catch (Exception ex) {
            throw new LiveJournalDAOException(ex);
        }
        return userId;
    }

    @Override
    public void updateLiveUser(LiveUser user) throws LiveJournalDAOException {
        LiveUser result = getUserInternal(user.getUserId());
        result.setAlias(user.getAlias());
        result.setEmail(user.getEmail());
        result.setPassword(user.getPassword());
    }

    @Override
    public void deleteLiveUser(long userId) throws LiveJournalDAOException {
        for(Iterator<LiveUser> it = users.iterator(); it.hasNext();) {
            LiveUser lu = it.next();
            if(lu.getUserId() == userId) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public LiveUser getLiveUser(long userId) throws LiveJournalDAOException {
        LiveUser result = null;
        LiveUser tmp = getUserInternal(userId);
        if(tmp != null) {
            result = (LiveUser) tmp.clone();
        }
        return result;
    }

    @Override
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) throws LiveJournalDAOException {
        List<LiveUser> result = new ArrayList<LiveUser>();
        for(LiveUser lu : users) {
            result.add((LiveUser) lu.clone());
        }
        return result;
    }

    private LiveUser getUserInternal(long userId) {
        LiveUser result = null;
        for(LiveUser lu : users) {
            if(lu.getUserId() == userId) {
                result = lu;
                break;
            }
        }
        return result;
    }
    
    private long generateUserId() {
        long userId = Math.round(Math.random() * 1000000);
        boolean found = true;
        while (found) {
            found = false;
            for (LiveUser lu : users) {
                if (lu.getUserId() == userId) {
                    found = true;
                    break;
                }
            }
            userId = Math.round(Math.random() * 1000000);
        }
        return userId;
    }
}
