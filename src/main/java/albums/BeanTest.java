package albums;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album  album1 = new Album("Michael Jackson", "Beat it", 135, "Pop");
        Album  album2 = new Album("Billie Joel", "Piano Women", 222, "Rock");
        Album  album3 = new Album("AC/DC", "Balls", 143, "Rock");
        Album  album4 = new Album("Pink Floyd", "Dark Side of the Sun", 92, "Rock");
        ArrayList<Album> albums = new ArrayList<>(List.of(album1, album2, album3, album4));

        Quote quote1 = new Quote("Shakespear", "To be or not to be. That is the true question!");
        Quote quote2 = new Quote("Thomas Jefferson", "Early to bed, early to rise. Makes a man healthy, wealthy, and wise.");
        Quote quote3 = new Quote("El Chavo del 8", "Pi pi pi pi piiiii!");
        Quote quote4 = new Quote("Heinrich Heine", "Ich weiß nicht, was soll es bedeuten, dass ich so traurig bin. Ein Märchen aus alten Zeiten, das kommt mir nicht aus dem Sinn.");
        ArrayList<Quote> quotes = new ArrayList<>(List.of(quote1, quote2, quote3, quote4));

        for(Quote quote: quotes){
            System.out.println(quote.getContent() + "  -" + quote.getAuthor());
        }
    }
}
/**
 * Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.
 *
 * In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.
 */