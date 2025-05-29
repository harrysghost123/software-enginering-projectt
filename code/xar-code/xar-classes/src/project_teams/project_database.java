package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
        posts.add(new Post("post1", "My First Project", "This is content for my first project.", "user1","web", new Date(), "published"));
        posts.add(new Post("post2", "Another Great Idea", "Details about my second project idea.", "user1","web", new Date(),  "draft"));
        posts.add(new Post("post3", "Team Project Alpha", "A collaborative project with team members.", "user2", "web",new Date(),  "pending approval"));
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
    // Checks if an post from the same owner for the same category already exists
    public boolean ifalreadyexists(Map<String, String> postData) {
        System.out.println("project_database: Ελέγχω αν υπάρχει ήδη ");
        String ownerId = postData.get(" AuthorId");
        String category = postData.get("category");

        for (Post p : posts) {
            if (p.getAuthorId().equals(ownerId) && p.getCategory().equals(category)) {
                System.out.println("project_database: Found existing post for " + authorId + " in " + category);
                return true;
            }
        }
        return false;
    }

    public boolean upload(Map<String, String> postData) {
        System.out.println("project_database: Ανεβάζω την αγγελία (upload)");
        String newPostId = "post" + String.format("%03d", nextpostId++);
        Post newPost = new Post(
                newPostId,
                postData.get("title"),
                postData.get("content"),
                postData.get("authorId"),
                postData.get("category"),
                new Date(),
                postData.get("status")
        );
        posts.add(newPost); // Renamed list
        System.out.println("project_database: Successfully uploaded post: " + newPost.getTitle());
        return true;
    }

    public List<Post> findsubprojects(String query) { // search for subj with projects
        System.out.println("project_database: Βρίσκω υπο-έργα  με query: " + query);
        List<Post> results = new ArrayList<>();
        for (Post p : posts) { // Renamed list

            if (p.getAuthorId().equals(query) || p.getContent().toLowerCase().contains(query.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }
}




