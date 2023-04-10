package LAB2_3.LAB2_3_Q6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q6_a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Interest Calculator - FlowLayout By Samrat");

        // Create components
        JLabel principalLabel = new JLabel("Principal Amount:");
        JTextField principalTextField = new JTextField(10);
        JLabel rateLabel = new JLabel("Rate of Interest:");
        JTextField rateTextField = new JTextField(10);
        JLabel timeLabel = new JLabel("Time (in years):");
        JTextField timeTextField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Simple Interest: ");

        // Set layout manager as FlowLayout
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(principalLabel);
        frame.add(principalTextField);
        frame.add(rateLabel);
        frame.add(rateTextField);
        frame.add(timeLabel);
        frame.add(timeTextField);
        frame.add(calculateButton);
        frame.add(resultLabel);

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
        frame.setSize(500, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
