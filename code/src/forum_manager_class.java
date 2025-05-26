import java.util.List;

public class forum_manager_class {
    private forum_database_manager dbManager;
    private forum_discussion_screen discussionScreen;

    public forum_manager_class(){this.dbManager = new forum_database_manager();}

    public void searchDiscussions(){
        //code for searching for discussions
        List results = dbManager.fetchDiscussionsList();
        System.out.println(results);//print the discussions in the main screen
    }

    public void chosenDiscussion(){
        //code for searching for the chosen discussion
        discussionScreen.loadDiscussion(dbManager.fetchDiscussion());
    }
}
