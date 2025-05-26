public class liveevents_starting_screen {

    private    List <manage_events> results ;
    public void showallEvents(manage_events  results) {
        if(results != null) {
            display();
        }else {
            System.out.println("No events found");
        }
        //to show all the events
        //return event_id;
    }
    public void display() {
        // code to render ui for the events
    }
    public void eventsearch() {
 // to search for filtered events
    }

}
