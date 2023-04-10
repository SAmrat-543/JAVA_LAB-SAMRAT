package LAB4;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LAB4_Q5 extends JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/java_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
  
 

    private Connection conn;
    private Statement stmt;
    private ResultSet rs;

    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel districtLabel;
    private JTextField districtTextField;
    private JLabel ageLabel;
    private JTextField ageTextField;
    private JButton addButton;
    private JButton retrieveButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JTable studentTable;

    public LAB4_Q5() {
        setTitle("Student CRUD by Samrat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Initialize components
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        districtLabel = new JLabel("District:");
        districtTextField = new JTextField();
        ageLabel = new JLabel("Age:");
        ageTextField = new JTextField();
        addButton = new JButton("Add");
        retrieveButton = new JButton("Retrieve");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        studentTable = new JTable();

        // Add components to the UI
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameTextField);
        inputPanel.add(districtLabel);
        inputPanel.add(districtTextField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageTextField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(retrieveButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(studentTable), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retrieveStudents();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });
    }

    private void addStudent() {
        String name = nameTextField.getText();
        String district = districtTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());

        try {
            conn= DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String insertQuery = "INSERT INTO student (name, district, age) VALUES ('" + name + "', '" + district + "', " + age + ")";
            stmt.executeUpdate(insertQuery);
            JOptionPane.showMessageDialog(this, "Student added successfully!");
            clearFields();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private void retrieveStudents() {
        try {

            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String selectQuery = "SELECT * FROM student";
            rs = stmt.executeQuery(selectQuery);
            // Create custom table model to display ResultSet data in JTable
            StudentTableModel model = new StudentTableModel(rs);
            studentTable.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private void updateStudent() {
        String name = nameTextField.getText();
        String district = districtTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());

        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a student to update.");
            return;
        }

        int studentId = (int) studentTable.getValueAt(selectedRow, 0);

        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String updateQuery = "UPDATE student SET name = '" + name + "', district = '" + district + "', age = " + age + " WHERE id = " + studentId;
            stmt.executeUpdate(updateQuery);
            JOptionPane.showMessageDialog(this, "Student updated successfully!");
            clearFields();
            retrieveStudents();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private void deleteStudent() {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a student to delete.");
            return;
        }

        int studentId = (int) studentTable.getValueAt(selectedRow, 0);

        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
            String deleteQuery = "DELETE FROM student WHERE id = " + studentId;
            stmt.executeUpdate(deleteQuery);
            JOptionPane.showMessageDialog(this, "Student deleted successfully!");
            clearFields();
            retrieveStudents();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private void clearFields() {
        nameTextField.setText("");
        districtTextField.setText("");
        ageTextField.setText("");
    }

    private void closeResources() {
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new LAB4_Q5().setVisible(true);
                }
            });
        }

        // Custom table model for displaying ResultSet data in JTable
        private class StudentTableModel extends AbstractTableModel {
            private ResultSet rs;
            private int rowCount;
            private int columnCount;

            public StudentTableModel(ResultSet rs) {
                this.rs = rs;
                try {
                    ResultSetMetaData metaData = rs.getMetaData();
                    rowCount = 0;
                    columnCount = metaData.getColumnCount();
                    while (rs.next()) {
                        rowCount++;
                    }
                    rs.beforeFirst();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public int getRowCount() {
                return rowCount;
            }

            @Override
            public int getColumnCount() {
                return columnCount;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                try {
                    rs.absolute(rowIndex + 1);
                    return rs.getObject(columnIndex + 1);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    return null;
                }
            }
            @Override
    public String getColumnName(int column) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            return metaData.getColumnName(column + 1);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    }
}
            

