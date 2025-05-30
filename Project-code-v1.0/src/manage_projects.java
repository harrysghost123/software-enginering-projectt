package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class manage_projects {
    private String subjects;
    private String details;
    private List projects;
    private manage_projects dbManagerproj;

    public manage_projects(){this.dbManagerproj = new manage_projects();}

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
    private project_database projectDatabase; // Composition

    public manage_projects(project_database projectDatabase) {
        this.projectDatabase = projectDatabase;
    }

    public List<Post> searchposts(String query) {
        System.out.println("ManageProject: Searching database for posts with query: " + query);
        return projectDatabase.findposts(query);
    }

    public boolean savechanges(Post post) {
        System.out.println("ManageProject: Saving changes for post: " + post.getTitle());
        // Here you might have business logic for validation before saving
        return projectDatabase.savechangespost(post);
    }

    public static boolean deletepostfrom_db(Post post) {
        System.out.println("ManageProject: Attempting to delete post: " + post.getTitle());
        // Business logic before deletion
        return projectDatabase.deletepost(post);
    }


    private upload_succes_project_screen uploadSuccessScreen; // Dependency
    private duplicate_project_error_screen duplicateErrorScreen; // Dependency

    public manage_projects(project_database projectDatabase, upload_succes_project_screen uploadSuccessScreen, duplicate_project_error_screen duplicateErrorScreen) {
        this.projectDatabase = projectDatabase;
        this.uploadSuccessScreen = uploadSuccessScreen;
        this.duplicateErrorScreen = duplicateErrorScreen;
    }
    public boolean searchforuploaded(Map<String, String> projectData) {
        System.out.println("manage_projects: Αναλαμβάνω την αγγελία ");

        //  Check for duplicates
        System.out.println("manage_projects: Ψάχνω για υπάρχουσες ανεβασμένες αγγελίες ");
        if (projectDatabase.ifalreadyexists(projectData)) { // Condition 'alreadyllexist'
            System.out.println("manage_projects: Υπάρχει ήδη αγγελία από τον ίδιο φοιτητή για το συγκεκριμένο μάθημα.");
            duplicateErrorScreen.display("Έχετε ήδη αναρτήσει αγγελία για αυτό το μάθημα.");
            duplicateErrorScreen.showsite(); //display error screen
            return false;
        } else {
            //  Upload if not existing
            System.out.println("manage_projects: Ανεβάζω την αγγελία του φοιτητή στην βάση ");
            if (projectDatabase.upload(projectData)) {
                uploadSuccessScreen.display("Η αγγελία σας αναρτήθηκε.");
                uploadSuccessScreen.showsite(); // Display success screen
                return true;
            } else {
                // This case handles a generic upload failure, not a duplicate
                System.out.println("manage_projects: Αποτυχία στην αναρτήση αγγελίας.");
                // Potentially display a generic error screen or log
                return false;
            }
        }
    }

    public List<Post> searchforproj(String query) {
        System.out.println("manage_projects: Αναζητώ υπο-έργα ");
        return projectDatabase.findsubprojects(query);
    }

}




