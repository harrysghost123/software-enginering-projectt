import java.util.ArrayList;
import java.util.List;
// Assuming news_article and news_provider_api are in accessible packages
// import com.yourdomain.model.news_article;
// import com.yourdomain.news.api.news_provider_api;

/**
 * Base screen for the news use case.
 */
public class starting_news_screen { 

    protected news_provider_api news_api; 
    protected List<news_article> displayed_articles; 

    public starting_news_screen(news_provider_api news_api) {
        this.news_api = news_api;
        this.displayed_articles = new ArrayList<>();
        System.out.println("starting_news_screen initialized.");
    }

    /**
     * Loads news articles. 
     */
    public void loadArticles() { 
        System.out.println("starting_news_screen.load_articles called.");
        if (news_api == null) {
            System.out.println("  news_provider_api not set. Cannot load articles.");
            return;
        }

        news_provider_api.news_load_response response = news_api.get_news_articles(); 
        this.displayed_articles = response.articles;

        switch (response.result_type) { 
            case SUCCESS:
                System.out.println("  Successfully loaded " + displayed_articles.size() + " articles for display.");
                display_content(); 
                break;
            case CONNECTION_ERROR_CACHE_LOADED:
                System.out.println("  Connection error, loaded " + displayed_articles.size() + " articles from cache.");
                System.out.println("  Transition to older_news_screen would occur here.");
                display_content();
                break;
            default:
                 System.out.println("  Some issue occurred: " + response.result_type);
                 display_content();
                 break;
        }
    }

    /**
     * Placeholder for displaying the content of this screen.
     */
    public void display_content() { 
        System.out.println("--- starting_news_screen Display ---");
        if (displayed_articles.isEmpty()) {
            System.out.println("No articles to display on this base screen.");
        } else {
            System.out.println("Displaying " + displayed_articles.size() + " articles:");
            for (news_article article : displayed_articles) {
                System.out.println("  - " + article.get_title() + " (Summary: " + article.get_summary() + ")");
            }
        }
        System.out.println("----------------------------------");
    }

    /**
     * Handles the selection of an article.
     */
    public void selectArticle(news_article article) { 
        if (article == null) {
            System.out.println("starting_news_screen.select_article called with null article.");
            return;
        }
        System.out.println("starting_news_screen.select_article called for: " + article.get_title());
        if (news_api != null) {
            news_api.open_article(article); 
        } else {
            System.out.println("  news_provider_api not available to open article.");
        }
    }

}