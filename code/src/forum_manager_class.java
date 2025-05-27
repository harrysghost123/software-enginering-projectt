import java.util.List;

public class forum_manager_class {
    private forum_database_manager dbManager;

    public forum_manager_class(){this.dbManager = new forum_database_manager();}

    public void searchDiscussions(){
        //code for searching for discussions
        main_forum_screen mainScreen = new main_forum_screen();
        List results = dbManager.fetchDiscussionsList();
        mainScreen.loadDiscussionsList(results);
    }

    public void chosenDiscussion(int origin){
        //code for searching for the chosen discussion

        forum_discussion_screen discussionScreen = new forum_discussion_screen();
        discussionScreen.loadDiscussion(dbManager.fetchDiscussion(),origin);
    }
}
