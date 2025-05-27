import java.util.List;

public class forum_library_screen {
    //private List<discussion> discussions;
    private library_manager manager;

    public forum_library_screen(){this.manager = new library_manager();}

    public void loadMyDiscussionsList(List<discussion> myDiscussions){
        //code for loading a list of user's discussions
        System.out.println(myDiscussions); //print discussions of user
    }

    public void selectEditDiscussions(){
        //code for selecting a discussion to be edited
        manager.selectedDiscussion(1);
    }

    public void selectDeleteDiscussion(){
        //code for deleting the selected discussion
        confirmation_window confirmationWindow = new confirmation_window();
        confirmationWindow.loadConfirmationWindow();
    }
}
