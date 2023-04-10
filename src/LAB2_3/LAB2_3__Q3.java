package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q3 {
    private JFrame frame;
    private JTextField principalField;
    private JTextField rateField;
    private JTextField timeField;
    private JTextField resultField;

    public static void main(String[] args) {
        LAB2_3__Q3 calculator = new LAB2_3__Q3();
        calculator.createGUI();
    }

    private void createGUI() {
        // Create JFrame
        frame = new JFrame("Swing Simple Interest Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create input text fields
        principalField = new JTextField(10);
        rateField = new JTextField(10);
        timeField = new JTextField(10);

        // Create result text field
        resultField = new JTextField(10);
        resultField.setEditable(false);

         // Create new Label 
         JLabel myLabel = new JLabel("- Created by Samrat");

        // Create button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input values
                double principal = Double.parseDouble(principalField.getText());
                double rate = Double.parseDouble(rateField.getText());
                double time = Double.parseDouble(timeField.getText());

                // Calculate simple interest
                double interest = (principal * rate * time) / 100;

                // Display result in result text field
                resultField.setText(Double.toString(interest));
            }
        });

        // Create layout using GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add input text fields to the frame
        c.gridx = 0;
        c.gridy = 0;
        frame.add(new JLabel("Principal"), c);

        c.gridx = 1;
        c.gridy = 0;
        frame.add(principalField, c);

        c.gridx = 0;
        c.gridy = 1;
        frame.add(new JLabel("Rate"), c);

        c.gridx = 1;
        c.gridy = 1;
        frame.add(rateField, c);

        c.gridx = 0;
        c.gridy = 2;
        frame.add(new JLabel("Time"), c);

        c.gridx = 1;
        c.gridy = 2;
        frame.add(timeField, c);

        // Add button to the frame
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 2;
        frame.add(calculateButton, c);

        // Add result text field to the frame
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        frame.add(new JLabel("Simple Interest"), c);

        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 2;
        frame.add(resultField, c);

        // Add myLabel Label to the frame
        c.gridx = 3;
        c.gridy = 6;
        frame.add(myLabel,c);

        // Display the frame
        frame.setVisible(true);
    }
}
