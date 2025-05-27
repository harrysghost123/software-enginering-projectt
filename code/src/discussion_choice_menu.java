public class discussion_choice_menu {

    public void createButton(){
        //code for loading the window to select discussion type
    }

    public void createText(){
        //code to load a text discussion environment
        create_text_discussion textDiscussion = new create_text_discussion();
        textDiscussion.loadTextEditor();
    }

    public void createImageVideo(){
        //code to load an image/video discussion environment
        create_image_video_discussion imageVideoDiscussion = new create_image_video_discussion();
        imageVideoDiscussion.loadVideoImageEnvironment();
    }

    public void createPoll(){
        //code to load a poll discussion environment
        create_poll_discussion pollDiscussion = new create_poll_discussion();
        pollDiscussion.loadPollEnvironment();
    }
}
