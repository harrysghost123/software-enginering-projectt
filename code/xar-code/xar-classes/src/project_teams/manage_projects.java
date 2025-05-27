package project_teams;

import java.util.List;

public class manage_projects {
    private String subjects;
    private String details;
    private List projects;
    public void showallsubjects() {

        //show the user request all the subjects that have projects
    }
    public void searchforproj (String subject) {
        // search for projects that need people
        if( subject != null) {

        }
        else
        { no_project_screen noProjectScreen = new no_project_screen();
        noProjectScreen.display();}
    }
    public void searchfordetails(String details) {

        //find the details for this post tto find team for the project
     if (details!=null){
         project_details_screen detailsScreen = new project_details_screen();
         detailsScreen.display(details);

        }
    }
 public void returntoprojectscreen() {
        //retrun to projectfinder screen
 }

}
