// package com.yourdomain.ui; // Or com.yourdomain.news.ui

// import com.yourdomain.news.api.news_provider_api;

/**
 * A screen that is displayed when no news articles can be loaded.
 */
public class empty_news_screen extends starting_news_screen { 

    private String message;

    public empty_news_screen(news_provider_api news_api, String message) {
        super(news_api);
        this.message = message;
        System.out.println("empty_news_screen initialized.");
    }

    @Override
    public void display_content() { 
        System.out.println("--- empty_news_screen Display ---");
        System.out.println(message != null ? message : "Sorry, no news articles are available.");
        System.out.println("Please try again later.");
        System.out.println("-----------------------------");
    }
}