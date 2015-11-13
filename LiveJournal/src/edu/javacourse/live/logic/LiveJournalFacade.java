package edu.javacourse.live.logic;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.exception.LiveJournalBusinessException;
import edu.javacourse.live.filter.LiveUserFilter;
import java.util.List;

public class LiveJournalFacade
{
    private final LiveUserManager userManager;
    private final LivePostManager postManager;
    private final LiveCommentManager commentManager;

    public LiveJournalFacade() {
        userManager = new LiveUserManager();
        postManager = new LivePostManager();
        commentManager = new LiveCommentManager();
    }
    
    public long addLiveUser(LiveUser user) {
        try {
            return userManager.addLiveUser(user);
        } catch (LiveJournalBusinessException ex) {
        }
        return 0;
    }
    
    public void updateLiveUser(LiveUser user) {
        userManager.updateLiveUser(user);
    }

    public void deleteLiveUser(long userId) {
        userManager.deleteLiveUser(userId);
    }
    
    public LiveUser getLiveUser(long userId) {
        return userManager.getLiveUser(userId);
    }
    
    public List<LiveUser> findLiveUsers(LiveUserFilter filter) {
        return userManager.findLiveUsers(filter);
    }
    
}
