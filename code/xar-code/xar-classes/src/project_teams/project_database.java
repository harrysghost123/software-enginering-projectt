package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class project_database {
    public findallsubjproj(String subjects) {
        //find all the subj with projects
        return subjects;
    }

    public findsubjproojects(String results) {
        //find all the proojects of the selected subj
        return results;
    }

    public finddetails(String details) {
        //find the details for this project
        return details;
    }

    public getpersonalinfoo(String pinfo) {
        //find personal info and return them
        return pinfo;
    }

    private List<Post> posts;

    public project_database() {
        this.posts = new ArrayList<>();
        // Add some dummy data
        posts.add(new Post("post1", "My First Project", "This is content for my first project.", "user1", new Date(), "published"));
        posts.add(new Post("post2", "Another Great Idea", "Details about my second project idea.", "user1", new Date(),  "draft"));
        posts.add(new Post("post3", "Team Project Alpha", "A collaborative project with team members.", "user2", new Date(),  "pending approval"));
    }

    public List<Post> findposts(String query) {
        System.out.println("ProjectDatabase: Searching for posts matching '" + query + "'...");
        List<Post> results = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    post.getContent().toLowerCase().contains(query.toLowerCase()) ||
                    post.getStatus().toLowerCase().contains(query.toLowerCase())) {
                results.add(post);
            }
        }
        return results;
    }

    public boolean savechangespost(Post post) {
        System.out.println("ProjectDatabase: Saving changes for post ID: " + post.getPostId());
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getPostId().equals(post.getPostId())) {
                posts.set(i, post); // Replace old post with updated one
                System.out.println("ProjectDatabase: Post updated successfully.");
                return true;
            }
        }
        System.out.println("ProjectDatabase: Post not found for update.");
        return false;
    }

    public boolean deletepost(Post post) {
        System.out.println("ProjectDatabase: Deleting post ID: " + post.getPostId());
        boolean removed = posts.remove(post);
        if (removed) {
            System.out.println("ProjectDatabase: Post deleted successfully.");
        } else {
            System.out.println("ProjectDatabase: Post not found for deletion.");
        }
        return removed;
    }
}
