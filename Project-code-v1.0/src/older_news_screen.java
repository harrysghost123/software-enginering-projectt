// package com.yourdomain.ui; // Or com.yourdomain.news.ui

// import com.yourdomain.news.api.news_provider_api;

/**
 * A screen that displays older news.
 */
public class older_news_screen extends starting_news_screen { 

    public older_news_screen(news_provider_api news_api) {
        super(news_api);
        System.out.println("older_news_screen initialized.");
    }

    @Override
    public void display_content() { 
        System.out.println("--- older_news_screen Display (Cached News) ---");
        if (displayed_articles.isEmpty()) {
            System.out.println("No older news articles found in cache to display.");
        } else {
            System.out.println("Displaying " + displayed_articles.size() + " older articles from cache:");
            for (news_article article : displayed_articles) { 
                System.out.println("  - " + article.get_title() + " (Summary: " + article.get_summary() + ")");
            }
        }
        System.out.println("Note: These articles might be outdated.");
        System.out.println("-------------------------------------------");
    }
}