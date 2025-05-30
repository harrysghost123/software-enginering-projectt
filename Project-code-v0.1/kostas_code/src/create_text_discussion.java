public class create_text_discussion {

    public void loadTextEditor(){
        //code for loading the text editor
        mainBodyEditor();
        titleEditor();
    }

    public void mainBodyEditor(){
        //code for the main body editor
    }

    public void titleEditor(){
        //code for the title editor
    }

    public void publish(){
        //code for publishing the discussion
        forum_database_manager dbManager = new forum_database_manager();
        dbManager.saveTextDiscussion();
    }
}
