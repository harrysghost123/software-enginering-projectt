//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class starting_tab_screen {
    private manage_events searchallEvents;
    public manage_events( manage_events searchallEvents manage_events searchallEvents){
        this.searchallEvents = searchallEvents;
    }
    public void loadevents(){
        //for loading the live events on the events screen
    }
        // }
        public void loadlivevents(String allevents) {
            //use manage_events to fetch the event screen
            manage_events.searchallEvents(allevents);
        }
        public void displaynews(){

        }
            public void loadUniinfo(){

            }
}