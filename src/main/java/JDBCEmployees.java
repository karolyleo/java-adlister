import java.sql.*;
import com.mysql.jdbc.Driver;

public class JDBCEmployees {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
        Statement stmt = connection.createStatement();
        ResultSet rst = stmt.executeQuery("select first_name from employees limit 10");
        int i = 1;
        while(rst.next()) {
            System.out.println(i + ": " + rst.getString("first_name"));
            i++;
        }
    }
}
/**
 *      In this class, create a main method that prints the first 10 employee first name names from the employees DB
 *   a specific table from a given database can be queried directly with the syntax database_name.table_name
 *
 *      Refactor the code to print out each name to instead store each of the 10 names in an array list
 */