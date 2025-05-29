package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class edit_project_post_screen {
    private Post currentPost;
    private String newTitle;
    private String newContent;

    public void display(Post post) {
        //show the post to be edited
        this.currentPost = post;
        System.out.println("\n--- Edit Project Post Screen ---");
       // System.out.println("Editing Post ID: " + post.getPostId());
        System.out.println("Current Title: " + post.getTitle());
        System.out.println("Current Content:\n" + post.getContent());

        // Simulate user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new title (or press Enter to keep current): ");
        String titleInput = scanner.nextLine();
        this.newTitle = titleInput.isEmpty() ? post.getTitle() : titleInput;

        System.out.print("Enter new content (or press Enter to keep current): ");
        String contentInput = scanner.nextLine();
        this.newContent = contentInput.isEmpty() ? post.getContent() : contentInput;
    }
    public void editpost1(edit_project_post_screen    screen, Post post) {
        //useredits the post
        System.out.println("User: Editing post: " + post.getTitle());
        screen.display(post);
        Map<String, String> editedData = screen.getEditedPostData();
        post.setTitle(editedData.get("title"));
        post.setContent(editedData.get("content"));
        System.out.println("User: Finished editing.");
    }
    //in ttesting
    public Map<String, String> getEditedPostData() {
        Map<String, String> editedData = new HashMap<>();
        editedData.put("title", newTitle);
        editedData.put("content", newContent);
        return editedData;
    }

    public boolean selectsave(approval_screen screen, String message) {
        //user selects save
        System.out.println("User: Selecting to save...");
        screen.display(message);
        return screen.userconfirmation();
    }
    public void deletePost(Post postToDelete) {
        // users selcts to delte a project of his
        System.out.println("PersonalProjectPostsScreen: Confirming delete for " + postToDelete.getTitle());
        // This would typically involve an ApprovalScreen
        delete_project_post_screen deleteScreen = new delete_project_post_screen();
        if (deleteScreen.userconfirmation()) {
            boolean success = manage_projects.deletepostfrom_db(postToDelete);
            if (success) {
                personal_project_posts_screen.remove(postToDelete);
                System.out.println("PersonalProjectPostsScreen: Post deleted successfully.");
            } else {
                System.out.println("PersonalProjectPostsScreen: Failed to delete post.");
            }
        } else {
            System.out.println("PersonalProjectPostsScreen: Delete cancelled.");
        }
    }




}
