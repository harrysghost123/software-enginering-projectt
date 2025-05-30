import java.util.List;

public class library_manager {
    private List<discussion> discussions;
    private forum_database_manager dbManager;

    public library_manager(){this.dbManager = new forum_database_manager();}

    public void searchMyDiscussions(){
        //code for searching the discussions of the user
        forum_library_screen libraryScreen = new forum_library_screen();
        discussions = dbManager.fetchMyDiscussionsList();
        libraryScreen.loadMyDiscussionsList(discussions);
    }

    public void selectedDiscussion(int origin){
        //code to return the selected discussion
        if(origin == 1) {
            my_discussion_screen myScreen = new my_discussion_screen();
            myScreen.loadMyDiscussion(dbManager.fetchMyDiscussion());
        }
        else if(origin == 2)
            dbManager.deleteMyDiscussion();
    }
}
