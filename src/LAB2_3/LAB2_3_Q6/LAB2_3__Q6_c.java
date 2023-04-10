package LAB2_3.LAB2_3_Q6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q6_c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Interest Calculator - GridBagLayout");

        // Create components
        JLabel principalLabel = new JLabel("Principal Amount:");
        JTextField principalTextField = new JTextField(10);
        JLabel rateLabel = new JLabel("Rate of Interest:");
        JTextField rateTextField = new JTextField(10);
        JLabel timeLabel = new JLabel("Time (in years):");
        JTextField timeTextField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Simple Interest: ");

        // Set layout manager as GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Add components to the frame with GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 0, 10);
        frame.add(principalLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 0, 10);
        frame.add(principalTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 0, 10);
        frame.add(rateLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 0, 10);
        frame.add(rateTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 10, 0, 10);
        frame.add(timeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 0, 0, 10);
        frame.add(timeTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 0, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(calculateButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(resultLabel, gbc);

         // Create new Label 
         JLabel myLabel = new JLabel("- Created by Samrat");
        gbc.gridx = 4;
        gbc.gridy = 5;
        frame.add(myLabel, gbc);

        // Add ActionListener to calculateButton
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double principal = Double.parseDouble(principalTextField.getText());
                double rate = Double.parseDouble(rateTextField.getText());
                double time = Double.parseDouble(timeTextField.getText());

                double simpleInterest = (principal * rate * time) / 100;
                resultLabel.setText("Simple Interest: " + simpleInterest);
            }
        });

        // Set default close operation and size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}
