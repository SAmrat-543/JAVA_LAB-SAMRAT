package LAB4;

import java.sql.*;

public class LAB4_Q1 {

    public static void main(String[] args) {
        // JDBC driver name, database URL, username and password
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "";
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            // Register JDBC driver
            Class.forName(jdbcDriver);
            
            // Open a connection
            conn = DriverManager.getConnection(dbUrl, username, password);
            
            // Create a statement
            stmt = conn.createStatement();
            
            // Execute a query to retrieve students who live in Kathmandu district
            String query = "SELECT * FROM student WHERE district='Kathmandu'";
            rs = stmt.executeQuery(query);
            
            // Extract and print the names of students
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("\nName: " + name);
                System.out.println("Age: " + age);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
