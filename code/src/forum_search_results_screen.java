import java.util.List;

public class forum_search_results_screen {
    private List<discussion> discussions;
    private forum_manager_class manager;
    private forum_temp_storage tempStorage;

    public void loadSearchedDiscussions(List<discussion> Discussions){
        //code for loading discussions after searching
        System.out.println(Discussions);//print the discussions in the screen
    }

    public void selectSearchedDiscussion(){
        //code for selecting a discussion
        tempStorage.saveState();
        manager.chosenDiscussion(2);
    }

    public void loadState(){
        //code to load previous state of search results screen
    }
}
