package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

    class Post {
        private String postId;
        private String title;
        private String content;
        private String authorId;
        private String category;
        private Date creationDate;
        private String status;


        public Post(String postId, String title, String content, String authorId,String category, Date creationDate,  String status) {
            this.postId = postId;
            this.title = title;
            this.content = content;
            this.authorId = authorId;
            this.category = category;
            this.creationDate = creationDate;
            this.status = status;
        }

        // Getters
        public String getPostId() { return postId; }
        public String getTitle() { return title; }
        public String getContent() { return content; }
        public String getAuthorId() { return authorId; }
        public String getCategory() { return category; }
        public Date getCreationDate() { return creationDate; }
        public String getStatus() { return status; }

        //  attributes that can be changed
        public void setTitle(String title) { this.title = title; }
        public void setContent(String content) { this.content = content; }
        public void setStatus(String status) { this.status = status; }


        public void updateContent(String newTitle, String newContent) {
            this.title = newTitle;
            this.content = newContent;

            System.out.println("Post: Content updated for " + title);
        }

        public void markAsApproved() {
            this.status = "published";
            System.out.println("Post: Marked as Approved.");
        }

        public void markAsDeleted() {
            this.status = "deleted";
            System.out.println("Post: Marked as Deleted (logically).");
        }
    }


