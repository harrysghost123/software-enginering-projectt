package project_teams;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class approval_screen {
    private String confirmationMessage;

    public void display(String message) {
        //shows appproval message
        this.confirmationMessage = message;
        System.out.println("\n--- Approval Screen ---");
        System.out.println(message);
    }
    public boolean userconfirmation() {
        System.out.print("Approve? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        return input.equals("yes");
    }

    public boolean selectYes(approval_screen  screen, String message) {
        //user selects yes to the eddits he made
        System.out.println("User: Confirming 'Yes'...");
        screen.display(message);
        return screen.userconfirmation();
    }


}
