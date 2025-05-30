import java.util.ArrayList;
import java.util.List;

public class discussion {
    public String title;
    public String main_body;
    private List<comment> comments;

    public discussion(String title,String main_body){
        this.title = title;
        this.main_body = main_body;
        this.comments = new ArrayList<>();
    }
}
