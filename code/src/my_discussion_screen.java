public class my_discussion_screen {

    public void loadMyDiscussion(discussion disc){
        //code for load user's discussion
        mainBodyEditor();
    }

    public void mainBodyEditor(){
        //code for the main body editor
    }

    public void publish(){
        //code for publishing the discussion
        forum_database_manager dbManager = new forum_database_manager();
        dbManager.saveMyDiscussion();
    }
}
