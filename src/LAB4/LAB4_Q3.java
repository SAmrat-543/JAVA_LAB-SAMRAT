package LAB4;

import java.sql.*;
import java.util.Scanner;

public class LAB4_Q3 {

    public static void main(String[] args) {
        // JDBC driver name, database URL, username and password
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/java_db";
        String username = "root";
        String password = "";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Register JDBC driver
            Class.forName(jdbcDriver);

            // Open a connection
            conn = DriverManager.getConnection(dbUrl, username, password);

            // Create a statement
            stmt = conn.createStatement();

            boolean running = true;
            while (running) {
                System.out.println("\n-- Choose an operation: --");
                System.out.println("1. Insert a student");
                System.out.println("2. View all students");
                System.out.println("3. Update a student");
                System.out.println("4. Delete a student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Insert a student
                        System.out.print("Enter student name: ");
                        String name = scanner.next();
                        System.out.print("Enter district: ");
                        String district = scanner.next();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();

                        String insertQuery = "INSERT INTO student (name, district, age) " +
                                "VALUES ('" + name + "', '" + district + "', " + age + ")";
                        stmt.executeUpdate(insertQuery);
                        System.out.println("Student inserted successfully!");
                        break;
                    case 2:
                        // View all students
                        String retrieveQuery = "SELECT * FROM student";
                        rs = stmt.executeQuery(retrieveQuery);

                        System.out.println("\nID\tName\tDistrict\tAge");
                        while (rs.next()) {
                            int id = rs.getInt("ID");
                            String studentName = rs.getString("name");
                            String studentDistrict = rs.getString("district");
                            int studentAge = rs.getInt("age");
                            System.out.println(id + "\t" + studentName + "\t" + studentDistrict + "\t" + studentAge);
                        }
                        break;
                    case 3:
                        // Update a student
                        System.out.print("Enter student ID to update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new student name: ");
                        String updateName = scanner.next();
                        System.out.print("Enter new district: ");
                        String updateDistrict = scanner.next();
                        System.out.print("Enter new age: ");
                        int updateAge = scanner.nextInt();

                        String updateQuery = "UPDATE student SET name='" + updateName + "', district='" + updateDistrict +
                                "', age=" + updateAge + " WHERE ID=" + updateId;
                        stmt.executeUpdate(updateQuery);
                        System.out.println("Student updated successfully!");
                        break;
                    case 4:
                        // Delete a student
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = scanner.nextInt();

                        String deleteQuery = "DELETE FROM student WHERE ID=" + deleteId;
                        stmt.executeUpdate(deleteQuery);
                        System.out.println("Student deleted successfully!");
                        break;
                    case 5:
                        // Exit
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                    }
                }
         } 
        catch (ClassNotFoundException e) {
                e.printStackTrace();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Close resources
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
                    if (scanner != null) {
                        scanner.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
}
        

