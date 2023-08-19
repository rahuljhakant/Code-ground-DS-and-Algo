import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class webScraping {
    public static void main(String[] args) {
        String url = "https://google.com"; // Replace with the URL of the page you want to scrape

        try {
            // Connect to the URL and fetch the HTML content
            Document document = Jsoup.connect(url).get();

            // Extract specific data from the HTML using CSS selectors
            Elements links = document.select("a"); // Select all anchor tags
            for (Element link : links) {
                System.out.println("Link: " + link.attr("href"));
                System.out.println("Text: " + link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
