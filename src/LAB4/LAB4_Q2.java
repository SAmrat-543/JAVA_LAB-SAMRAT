package LAB4;

import java.sql.*;

public class LAB4_Q2 {

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
            
            // Create a table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS user_data " +
                                      "(id INT PRIMARY KEY AUTO_INCREMENT, " +
                                      "name VARCHAR(50), " +
                                      "district VARCHAR(50), " +
                                      "age INT)";
            stmt.executeUpdate(createTableQuery);
            System.out.println("Table created successfully!");
            
            // Insert data into the table
            String insertDataQuery = "INSERT INTO user_data (name, district, age) " +
                                      "VALUES ('Samrat', 'Kathmandu', 22), " +
                                             "('SAM', 'Pokhara', 22), " +
                                             "('Harry', 'Lalitpur', 19)";
            stmt.executeUpdate(insertDataQuery);
            System.out.println("Data inserted successfully!");
            
            // Retrieve data from the table
            String retrieveDataQuery = "SELECT * FROM user_data";
            rs = stmt.executeQuery(retrieveDataQuery);
            
            // Extract and print the retrieved data
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String district = rs.getString("district");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", District: " + district + ", Age: " + age);
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        finally {
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
