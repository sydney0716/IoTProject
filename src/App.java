import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org .jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;



public class App {
    public static void main(String[] args) {
        final String crawlingEnterUrl = "https://www.hankyung.com/globalmarket/";
        Connection conn = Jsoup.connect(crawlingEnterUrl);

        try {
            Document document = conn.get();

            Elements newsTitleElements = document.getElementsByClass("news-tit");
            for (int i = 0; i < 36; i++) {
                if ((i < 11 && i !=5) || i == 14 || i == 16 || i == 18 || i == 20 || i == 23 || i == 25 || i == 27 || i == 29 || i == 31 || i == 33 || i == 35){
                    final String newsTitle = newsTitleElements.get(i).text();
                    System.out.println("News: " + i + " " + newsTitle);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
