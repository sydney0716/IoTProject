import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org .jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        final String crawlingEnterUrl = "https://www.hankyung.com/globalmarket/";
        Connection conn = Jsoup.connect(crawlingEnterUrl);

        try {
            Document document = conn.get();

            Elements newsTitleElements = document.getElementsByClass("news-tit");
            for (int i = 0; i < 30; i++) {
                final String newsTitle = newsTitleElements.get(i).text();


                System.out.println("News: " + i + " " + newsTitle);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
