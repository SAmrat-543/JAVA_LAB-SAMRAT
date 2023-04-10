package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q7 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LAB2_3__Q7() {
        // Set window title
        setTitle("Login Form - Created by Samrat");
        // Set window size
        setSize(600, 100);
        // Set layout manager
        setLayout(new FlowLayout());
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create username label
        JLabel usernameLabel = new JLabel("Username:");
        // Create username text field
        usernameField = new JTextField(20);

        // Create password label
        JLabel passwordLabel = new JLabel("Password:");
        // Create password field
        passwordField = new JPasswordField(20);

        // Create login button
        JButton loginButton = new JButton("Login");

        // Add action listener to login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get username and password from text fields
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());

                // Check if username and password are both "admin"
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Access granted");
                } else {
                    JOptionPane.showMessageDialog(null, "Access denied");
                }
            }
        });

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        // Set frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the login form
         new LAB2_3__Q7();
    }
}
