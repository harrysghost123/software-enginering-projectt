import java.util.List;

public class main_forum_screen {
    //private List<discussion> discussions;
    private forum_manager_class manager;
    private forum_temp_storage tempStorage;

    public main_forum_screen(){
        this.manager = new forum_manager_class();
        this.tempStorage = new forum_temp_storage();
    }

    public void loadDiscussionsList(List<discussion> Discussions){
        //code for loading the discussions on the main screen
        System.out.println(Discussions);//print the discussions in the main screen
    }

    public void selectDiscussion(){
        //code for selecting a discussion
        tempStorage.saveState();
        manager.chosenDiscussion(1);
    }

    public void loadState(){
        //code to load previous state of main screen
    }

    public void selectSearchBar(){
        //code to select searchbar
        forum_search_bar searchBar = new forum_search_bar();
        searchBar.searchDiscussions();
    }


}
