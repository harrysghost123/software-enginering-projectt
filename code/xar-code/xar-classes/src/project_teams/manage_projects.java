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
}



}
