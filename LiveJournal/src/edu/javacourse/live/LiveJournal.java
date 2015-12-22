package edu.javacourse.live;

import edu.javacourse.live.entity.LiveUser;
import edu.javacourse.live.logic.LiveJournalFacade;
import java.util.List;

public class LiveJournal
{
    public static void main(String[] args) {
        LiveJournalFacade facade = new LiveJournalFacade();
        
//        LiveUser user = new LiveUser();
//        user.setAlias("AliasUser");
//        user.setPassword("PasswordUser");
//        user.setEmail("user@pisem.net");
        
//        long userId = facade.addLiveUser(user);
        List<LiveUser> ls = facade.findLiveUsers(null);
//        if(ls.isEmpty()) {
//            System.out.println("Error - list is empty");
//        }
//        LiveUser userTmp = facade.getLiveUser(userId);
//        if(userTmp == null) {
//            System.out.println("Error - GET is not working");
//        }
//        userTmp.setAlias("CHECK");
//        facade.updateLiveUser(userTmp);
//        userTmp = facade.getLiveUser(userId);
//        if(userTmp == null || !userTmp.getAlias().equals("CHECK")) {
//            System.out.println("Error - UPDATE is not working");
//        }
//        facade.deleteLiveUser(userId);
//        ls = facade.findLiveUsers(null);
//        if(!ls.isEmpty()) {
//            System.out.println("Error - DELETE is not working");
//        }
    }
}
