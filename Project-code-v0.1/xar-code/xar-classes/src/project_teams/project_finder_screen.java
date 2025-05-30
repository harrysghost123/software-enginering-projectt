package project_teams;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class project_finder_screen {
    private List<manage_projects> subjects;
    private List<Post> displayedPosts;
    private manage_projects manageProject;
    private create_project_screen createProjectScreen;
    public project_finder_screen(manage_projects manageProject) {
        this.manageProject = manageProject;
        this.displayedPosts = new ArrayList<>();
    }

    public List<Post> getDisplayedPosts() {
        return displayedPosts;
    }

    public void setDisplayedPosts(List<Post> displayedPosts) {
        this.displayedPosts = displayedPosts;
    }

    public void display(List<Post> posts) {
        //show all posts
        this.displayedPosts = posts;
        System.out.println("\n--- Project Finder Screen ---");
        if (posts.isEmpty()) {
            System.out.println("No posts found.");
        } else {
            System.out.println("Found posts:");
            for (int i = 0; i < posts.size(); i++) {
                System.out.println((i + 1) + ". " + posts.get(i).getTitle() + " (ID: " + posts.get(i).getPostId() + ")");
            }
        }
    }
        public Post selectYourPost() {
         //select your post to edit
            System.out.print("ProjectFinderScreen: Enter post ID to select: ");
            Scanner scanner = new Scanner(System.in);
            String postId = scanner.nextLine();
            for (Post post : displayedPosts) {
                if (post.getPostId().equals(postId)) {
                    System.out.println("ProjectFinderScreen: Post selected: " + post.getTitle());
                    return post;
                }
            }
            System.out.println("ProjectFinderScreen: Post not found.");
            return null;
        }


        public void showsubj (manage_projects subjects){
            System.out.println(subjects);
            //shows all the subjects with project to the user
        }
        public void searchprojects (String search){
            //user wants to see the pproojects oof this subject
        }
        /*public Post selectYourPost (ProjectFinderScreen screen){
            System.out.println("User: Selecting a post from Project Finder Screen.");
            return screen.selectYourPost();
        }*/
    public boolean selectcreateaproject() {
        System.out.println("project_finder_screen: User chose 'Create a Project'.");
        // Creates and shows the creation screen
        this.createProjectScreen = new create_project_screen(manageProject);
        createProjectScreen.showcreate();
        return true; // Indicates navigation
    }

    public void returntostartscreen() {
        System.out.println("project_finder_screen: Επιστροφή στην αρχική οθόνη της εφαρμογής.");
        //  clear current view and show initial screen
    }




    }



