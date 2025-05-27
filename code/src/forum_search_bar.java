import java.util.List;

public class forum_search_bar {

    public void searchDiscussions(){
        //code to search for discussions based ont title
        forum_database_manager dbManager = new forum_database_manager();
        forum_search_results_screen resultsScreen = new forum_search_results_screen();
        List results = dbManager.fetchSearchedDiscussions();
        resultsScreen.loadSearchedDiscussions(results);
    }
}
