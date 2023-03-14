package albums;

public class Quote {
    private int id;
    private String author;
    private String content;

    public Quote(){}

    public Quote(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
/**
 * Referring back to the Database Design lesson, create beans for the quotes and authors tables (Quote and Author). Instead of including a foreign key property in the Quote class, include an Author property.
 * +---------+--------------+------+-----+---------+----------------+
 * | Field   | Type         | Null | Key | Default | Extra          |
 * +---------+--------------+------+-----+---------+----------------+
 * | id      | int          | NO   | PRI | NULL    | auto_increment |
 * | author  | varchar(50)  | NO   |     | NULL    |                |
 * | content | varchar(240) | NO   |     | NULL    |                |
 * +---------+--------------+------+-----+---------+----------------+
 *
 * Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.
 *
 * In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.
 *
 */