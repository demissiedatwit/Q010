// Main.java
package hellofx;

import java.util.Scanner;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which application would you like to run? Use 'login', 'circle', or 'grid'.");
        String input = scanner.nextLine().trim().toLowerCase();

        switch (input) {
            case "login":
                Application.launch(LoginApp.class, args);
                break;
            case "circle":
                Application.launch(CircleApp.class, args);
                break;
            case "grid":
                Application.launch(GridApp.class, args);
                break;
            default:
                System.out.println("Application not recognized. Please ensure you use 'login', 'circle', or 'grid'.");
                break;
        }

        scanner.close();
    }
}
