package edu.javacourse.live;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.logic.LiveJournalFacade;

public class LiveJournal
{
    public static void main(String[] args) {
        LiveJournalFacade facade = new LiveJournalFacade();
        
        LiveUser user = new LiveUser();
        user.setAlias("AliasUser");
        user.setPassword("PasswordUser");
        user.setEmail("user@pisem.net");
        
        long userId = facade.addLiveUser(user);
        user.setUserId(userId);
        facade.updateLiveUser(user);
        LiveUser userTmp = facade.getLiveUser(userId);
        facade.findLiveUsers(null);
        facade.deleteLiveUser(userId);
    }
}
