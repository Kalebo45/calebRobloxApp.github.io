import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class RobloxSimilarItemFinder {
    public static void main(String[] args) {
        String url = "https://www.roblox.com/catalog/97155233267945/BLOOD";

        try {
            // Scarica la pagina
            Document doc = Jsoup.connect(url).get();

            // Estrai il nome dell’oggetto
            String title = doc.title();
            System.out.println("Titolo dell'oggetto: " + title);

            // Estrapola keyword dal titolo
            String keyword = title.replaceAll(" - Roblox", "").split(" ")[0]; // es. BLOOD

            System.out.println("\nEsegui ricerca su Roblox con la parola chiave: " + keyword);
            System.out.println("Apri questo link nel browser: https://www.roblox.com/catalog?Keyword=" + keyword);

        } catch (IOException e) {
            System.out.println("Errore nel connettersi alla pagina: " + e.getMessage());
        }
    }
}