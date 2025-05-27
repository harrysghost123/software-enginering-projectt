import java.util.List;

public class forum_database_manager {
    private List results;
    private discussion disc;
    private forum_manager_class manager;

    public forum_database_manager(){
        this.disc = new discussion(disc.title,disc.main_body);
        this.manager = new forum_manager_class();
    }

    public List fetchDiscussionsList(){
        //code for fetching discussions list
        return results;
    }

    public discussion fetchDiscussion(){
        //code for fetching a discussion
        return disc;
    }

    public void saveComment(int origin){
        //code for saving comments
        manager.chosenDiscussion(origin);
    }

    public List fetchSearchedDiscussions(){
        //code for fetching discussions that have been searched
        return results;
    }

    public void saveTextDiscussion(){
        //code for saving a text discussion
        manager.searchDiscussions();
    }

    public void saveImageVideoDiscussion(){
        //code for saving an image/video discussion
        manager.searchDiscussions();
    }

    public void savePollDiscussion(){
        //code for saving a poll discussion
        manager.searchDiscussions();
    }

    public void fetchMyDiscussionsList(){
        //code for fetching discussions of the user
    }

    public void fetchMyDiscussion(){
        //code for fetching a discussion of a user
    }

    public void saveMyDiscussion(){
        //code for saving a discussion of the user
    }

    public void deleteMyDiscussion(){
        //code for deleting a discussion of the user
    }
}
