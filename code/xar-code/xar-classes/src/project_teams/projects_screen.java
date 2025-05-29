package project_teams;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class projects_screen {
    private List<manage_projects> projects
    public void showprojects(manage_projects projects) {
        System.out.print(projects);
        //load the  user all the projects for this subject
    }
    public void slectproject(){
        //user selects project
    }

    public void showprojects(List<Post> posts) { // Renamed parameter
        System.out.println("\n--- projects_screen: Εμφανίζω αγγελίες  ---");
        if (posts.isEmpty()) {
            System.out.println("No posts to display.");
        } else {
            for (Post post : posts) { // Renamed variable
                System.out.println("- " + post.getTitle() + " (Category: " + post.getCategory() + ")"); // Renamed from Course
            }
        }
    }
}
