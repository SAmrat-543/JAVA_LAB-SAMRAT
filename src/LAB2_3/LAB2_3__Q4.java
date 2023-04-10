package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q4 {
    private JFrame frame;
    private JTextField inputField;
    private JLabel outputLabel;

    public static void main(String[] args) {
        LAB2_3__Q4 stringOperations = new LAB2_3__Q4();
        stringOperations.createGUI();
    }

    private void createGUI() {
        // Create JFrame
        frame = new JFrame("String Operations: Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        // Create input text field
        inputField = new JTextField(10);

        // Create output text label
        outputLabel = new JLabel("");
        outputLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create new Label 
        JLabel myLabel = new JLabel("- Created by Samrat");

        // Create buttons
        JButton palindromeButton = new JButton("Check Palindrome");
        palindromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                boolean isPalindrome = checkPalindrome(input);
                if (isPalindrome) {
                    outputLabel.setText("'" + input + "' is a palindrome.");
                } else {
                    outputLabel.setText("'" + input + "' is not a palindrome.");
                }
            }
        });

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String reversed = reverseString(input);
                outputLabel.setText("Reversed string: " + reversed);
            }
        });

        JButton vowelsButton = new JButton("Find Vowels");
        vowelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String vowels = findVowels(input);
                outputLabel.setText("Vowels: " + vowels);
            }
        });

        // Create layout using GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add input text field to the frame
        c.gridx = 0;
        c.gridy = 0;
        frame.add(new JLabel("Input any string"), c);

        c.gridx = 1;
        c.gridy = 0;
        frame.add(inputField, c);

        // Add buttons to the frame
        c.gridx = 0;
        c.gridy = 1;
        frame.add(palindromeButton, c);

        c.gridx = 1;
        c.gridy = 1;
        frame.add(reverseButton, c);

        c.gridx = 2;
        c.gridy = 1;
        frame.add(vowelsButton, c);

        // Add output text label to the frame
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        frame.add(outputLabel, c);

        // Add myLabel Label to the frame
        c.gridx = 3;
        c.gridy = 3;
        frame.add(myLabel,c);

        // Display the frame
        frame.setVisible(true);
    }

    // Method to check if a string is a palindrome
    private boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    // Method to reverse a string
    private String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // Method to find vowels in a string
    private String findVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".contains(String.valueOf(c))) {
                sb.append(c);
                }
            }
                return sb.toString();
        }
    }
