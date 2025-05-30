package live_events;
public class manage_events {
    public String id;
    public String title;
    public String description;
    public Date date;
    public String location;
    public String category;
    public String status;
    private List<liveevents_starting_screen> events;
    private liveevents_api liv_api;

    public manage_events() {
        this.liv_api = new liveevents_api();
    }

    public void searchallEvents(String eventsinfo, liveevents_starting_screen event) {
        List results = liveevents_api.findLiveevents(event ids);
        String selectedeventId = event.showallEvents(results);
       // to show all the liveevents
    }

    public void searchEvents() {
// to search for filtered events
  if(number of ids>0){

        }
        else{ error_no_events_screen noevents = new noevents();
        noevents.displayresults();
        }
    }
    public void searchinfoofevent() {
        // to find info from the event
    }
}

