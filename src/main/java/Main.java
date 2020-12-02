import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    public static void main(String[] args) throws Exception {
        con = DriverManager.getConnection(url, user, password);

    }
}
