import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class RobloxGroupSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a keyword to search for Roblox groups:");
        String keyword = scanner.nextLine().trim().replace(" ", "%20");

        String searchUrl = "https://www.roblox.com/search/groups?keyword=" + keyword;

        System.out.println("Generated search link: " + searchUrl);

        // Try opening the browser with the search link
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(searchUrl));
            System.out.println("Browser opened with search results.");
        } catch (IOException | URISyntaxException e) {
            System.out.println("Failed to open the browser: " + e.getMessage());
        }

        scanner.close();
    }
}