public class create_poll_discussion {

    public void loadPollEnvironment(){
        //code for loading environment for creating polls
        pollSelections();
        titleEditor();
    }

    public void pollSelections(){
        //code for adding selections to the poll
    }

    public void titleEditor(){
        //code for loading the title editor
    }

    public void publish(){
        //code for publishing the discussion
        forum_database_manager dbManager = new forum_database_manager();
        dbManager.savePollDiscussion();
    }
}
