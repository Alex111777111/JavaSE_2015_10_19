package edu.javacourse.live.dao;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalDAOException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

abstract public class LiveUserFileDAO implements LiveUserDAO
{
    protected List<LiveUser> users;

    @Override
    public long addLiveUser(LiveUser user) throws LiveJournalDAOException {
        if(users == null) {
            loadCollection();
        }
        long userId = generateUserId();
        try {
            user.setUserId(userId);
            LiveUser lu = (LiveUser)user.clone();
            users.add(lu);
            saveCollection();
        } catch (Exception ex) {
            throw new LiveJournalDAOException(ex);
        }
        return userId;
    }

    @Override
    public void updateLiveUser(LiveUser user) throws LiveJournalDAOException {
        if(users == null) {
            loadCollection();
        }
        LiveUser result = getUserInternal(user.getUserId());
        result.setAlias(user.getAlias());
        result.setEmail(user.getEmail());
        result.setPassword(user.getPassword());
        saveCollection();
    }

    @Override
    public void deleteLiveUser(long userId) throws LiveJournalDAOException {
        if(users == null) {
            loadCollection();
        }
        for(Iterator<LiveUser> it = users.iterator(); it.hasNext();) {
            LiveUser lu = it.next();
            if(lu.getUserId() == userId) {
                it.remove();
                break;
            }
        }
        saveCollection();
    }

    @Override
    public LiveUser getLiveUser(long userId) throws LiveJournalDAOException {
        if(users == null) {
            loadCollection();
        }
        LiveUser result = null;
        LiveUser tmp = getUserInternal(userId);
        if(tmp != null) {
            result = (LiveUser) tmp.clone();
        }
        return result;
    }

    @Override
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) throws LiveJournalDAOException {
        if(users == null) {
            loadCollection();
        }
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
    
    abstract protected void saveCollection() throws LiveJournalDAOException;
    
    abstract protected void loadCollection() throws LiveJournalDAOException;
}
