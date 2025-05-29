package project_teams;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class create_project_screen {
private manage_projects manageProject;
private String projectTitleInput;
private String projectContentInput;
private String courseSelection;

public create_project_screen(manage_projects manageProjects) {
    this.manageProject = manageProjects;
}

public void showcreate() {
    //tto show the screen to make and upload post
    System.out.println(" Εμφανίζω πλαίσιο δημιουργίας αγγελίας ");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Project Title: ");
    this.projectTitleInput = scanner.nextLine();
    System.out.print("Enter Project Content: ");
    this.projectContentInput = scanner.nextLine();
    System.out.print("Enter Course : ");
    this.courseSelection = scanner.nextLine();
}

// Method to simulate user creating a post
public boolean createpostforproj(Map<String, String> projectData) {
    //writes his post
    System.out.println("create_project_screen: User inputting data and submitting.");
    projectData.put("title", this.projectTitleInput);
    projectData.put("content", this.projectContentInput);
    projectData.put("course", this.courseSelection);

    // Call the manager to handle the upload
    return project_database.upload(projectData);
}

public void cancel() {
    System.out.println("create_project_screen: Ακύρωση δημιουργίας κειμένου (cancel)");
    // clear inputs and return to previous state
}
}