public class create_image_video_discussion {

    public void loadVideoImageEnvironment(){
        //code for loading the environment for uploading files
        titleEditor();
    }

    public void loadFiles(){
        //code for selecting file to upload
        files_screen files = new files_screen();
        files.browseFiles();
    }

    public void titleEditor(){
        //code for the title editor
    }

    public void publish(){
        //code for publishing the discussion
        forum_database_manager dbManager = new forum_database_manager();
        dbManager.saveImageVideoDiscussion();
    }
}
