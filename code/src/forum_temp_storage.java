public class forum_temp_storage {

    public void saveState(){
        //code for saving the forum's current state
    }

    public void openStorage(int origin){
        //code for returning save state
        main_forum_screen mainScreen = new main_forum_screen();
        forum_search_results_screen resultsScreen = new forum_search_results_screen();

        if(origin==1)
            mainScreen.loadState();
        else if(origin==2)
            resultsScreen.loadState();
    }
}
