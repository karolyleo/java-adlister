package albums;

import java.util.Date;

public class Album {
    private int id;
    private String artist;
    private String name;
    private Date release_date;
    private int sales;
    private String genre;

    public Album () {}

    public Album(String artist, String name, int sales, String genre) {
        this.artist = artist;
        this.name = name;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
/**
 * Referring back to the MySQL Tables lesson, create a bean, Album, for the albums table.
 *+--------------+--------------+------+-----+---------+----------------+
 * | Field        | Type         | Null | Key | Default | Extra          |
 * +--------------+--------------+------+-----+---------+----------------+
 * | id           | int unsigned | NO   | PRI | NULL    | auto_increment |
 * | artist       | char(100)    | NO   |     | NULL    |                |
 * | name         | char(100)    | NO   |     | NULL    |                |
 * | release_date | int unsigned | YES  |     | NULL    |                |
 * | sales        | float        | YES  |     | NULL    |                |
 * | genre        | varchar(100) | YES  |     | NULL    |                |
 * +--------------+--------------+------+-----+---------+----------------+
 *
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
 */
