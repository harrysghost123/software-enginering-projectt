import java.util.List;

public class forum_manager_class {
    private forum_database_manager dbManager;

    public forum_manager_class(){this.dbManager = new forum_database_manager();}

    public void searchDiscussions(){
        List results = dbManager.fetchDiscussionsList();
    }
}
