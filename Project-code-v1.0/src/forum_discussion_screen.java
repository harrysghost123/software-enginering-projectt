public class forum_discussion_screen {
    public int temp;

    public void loadDiscussion(discussion disc,int origin){
        //code for loading selected discussion
        temp = origin;
    }

    public void returnButton(){
        //code for returning back to main screen
        forum_temp_storage tempStorage = new forum_temp_storage();
        tempStorage.openStorage(temp);
    }

    public void addComment(){
        //code for adding a comment on the discussion
        forum_database_manager dbManager = new forum_database_manager();
        dbManager.saveComment(temp);
    }
}
