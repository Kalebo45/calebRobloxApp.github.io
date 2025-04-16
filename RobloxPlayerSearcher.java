import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class RobloxPlayerSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first letter of the username to search for Roblox users:");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Please enter only a single letter (A–Z).");
            return;
        }

        String searchUrl = "https://www.roblox.com/search/users?keyword=" + input;

        System.out.println("Generated user search link: " + searchUrl);

        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(searchUrl));
            System.out.println("Browser opened with user search results.");
        } catch (IOException | URISyntaxException e) {
            System.out.println("Failed to open the browser: " + e.getMessage());
        }

        scanner.close();
    }
}
