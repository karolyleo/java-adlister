package adLister;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

//    public Ads getA
    public MySQLAdsDao() {
        try {
            Config sql = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(sql.getUrl(), sql.getUsername(), sql.getPassword());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void insert(Ad ad){
        // id   ,   user_id ,   title,  description (column names);
        // long id, long userId, title, description
        long id = ad.getId();
        long userId = ad.getUserId();
        String title = ad.getTitle();
        String description = ad.getDescription();
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO ads(id, user_id, title, description) VALUES ("+id+", "+userId+", 'test-"+title+"', 'database-"+description+"')");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> result = new ArrayList<Ad>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM ads");
            while(rst.next()){
                Ad adMaker = new Ad(rst.getLong("id"), rst.getLong("user_id"), rst.getString("title"), rst.getString("description"));
                result.add(adMaker);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;
    }

}
