import java.util.List;

public class main_forum_screen {
    private List<discussion> discussions;
    private forum_manager_class manager;
    private forum_temp_storage tempStorage;

    public main_forum_screen(){this.manager = new forum_manager_class();}

    public void loadDiscussionsList(){
        //code for loading the discussions on the main screen
        manager.searchDiscussions();
    }

    public void selectDiscussion(){
        //code for selecting a discussion
        tempStorage.saveState();
        manager.chosenDiscussion();
    }

    public void loadState(){
        //code to load previous state of main screen
    }

    public void selectSearchBar(){
        //code to select searchbar
    }


}
