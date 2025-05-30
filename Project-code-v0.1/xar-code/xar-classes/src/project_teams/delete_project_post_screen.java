package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class delete_project_post_screen {
    private String deleteConfirmationMessage;

    public void display(String message) {
        //dipplay delete screnn
        this.deleteConfirmationMessage = message;
        System.out.println("\n--- Delete Project Post Screen ---");
        System.out.println(message);
    }

    public boolean userconfirmation() {
        //display confirmation message
        System.out.print("Are you sure you want to delete? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input.equals("yes");
    }
    public boolean selectyesdelete(delete_project_post_screen screen, String message) {
        //user confirmeted ddelete
        System.out.println("User: Confirming delete...");
        screen.display(message);
        return screen.userconfirmation();
    }



}
