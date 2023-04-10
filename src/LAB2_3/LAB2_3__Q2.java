package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q2  {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;

    public static void main(String[] args) {
        LAB2_3__Q2 multiply = new LAB2_3__Q2();
        multiply.createGUI();
    }

    private void createGUI() {
        // Create JFrame
        frame = new JFrame("Swing Multiplication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create input text fields
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        // Create result text field
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create new Label 
        JLabel myLabel = new JLabel("- Created by Samrat");

        // Create button
        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input values
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                // Perform multiplication
                int product = num1 * num2;

                // Display result in result text field
                resultField.setText(Integer.toString(product));
            }
        });

        // Create layout using GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add input text fields to the frame
        c.gridx = 0;
        c.gridy = 0;
        frame.add(textField1, c);

        c.gridx = 2;
        c.gridy = 0;
        frame.add(textField2, c);

        // Add button to the frame
        c.gridx = 1;
        c.gridy = 1;
        frame.add(multiplyButton, c);

        // Add result text field to the frame
        c.gridx = 1;
        c.gridy = 2;
        frame.add(resultField, c);

         // Add myLabel Label to the frame
         c.gridx = 2;
         c.gridy = 3;
         frame.add(myLabel,c);

        // Display the frame
        frame.setVisible(true);
    }
}
