package TourGuideApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseManager1 {
    private static final String URL = "jdbc:mysql://localhost:3306/bus_management1";  // Change to your database URL
    private static final String USER = "root";  // Your database username
    private static final String PASSWORD = "bancoro6";  // Your database password
    private static Connection connection;

    // Initialize the database connection
    public static void initializeDatabase() {
        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection to database successful.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Getter for the connection
    public static Connection getConnection() {
        if (connection == null || !isConnectionValid(connection)) {
            initializeDatabase();  // Re-initialize if the connection is closed
        }
        return connection;
    }

    // Check if the connection is still valid
    private static boolean isConnectionValid(Connection conn) {
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    // Close the connection when done
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
   