package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class personal_project_posts_screen {
    private List<Post> personalPosts;
    private manage_projects manageProject; // Dependency

    public personal_project_posts_screen(manage_projects manageProject) {
        this.manageProject = manageProject;
        this.personalPosts = new ArrayList<>();
    }


    public List<Post> getPersonalPosts() { return personalPosts; }
    public void setPersonalPosts(List<Post> personalPosts) { this.personalPosts = personalPosts; }

    public void showPosts(List<Post> posts) {
        //show the posts that the user has uploaded and that he can edit
        this.personalPosts = posts;
        System.out.println("\n--- Personal Project Posts Screen ---");
        if (posts.isEmpty()) {
            System.out.println("No personal posts to display.");
        } else {
            System.out.println("Your personal posts:");
            for (int i = 0; i < posts.size(); i++) {
                System.out.println((i + 1) + ". " + posts.get(i).getTitle() + " (Status: " + posts.get(i).getStatus() + ")");
            }
        }
    }

    public Post selectPost() {
        //user selects a post to edit
        System.out.print("PersonalProjectPostsScreen: Enter post ID to select: ");
        Scanner scanner = new Scanner(System.in);
        String postId = scanner.nextLine();
        for (Post post : personalPosts) {
            if (post.getPostId().equals(postId)) {
                System.out.println("PersonalProjectPostsScreen: Post selected: " + post.getTitle());
                return post;
            }
        }
        System.out.println("PersonalProjectPostsScreen: Post not found.");
        return null;
    }

}
