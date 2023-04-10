package LAB2_3;

import javax.swing.*;
import java.awt.*;

public class LAB2_3__Q5 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BorderLayout in Swing by Samrat");
        // Set the layout manager as BorderLayout
        frame.setLayout(new BorderLayout());
        
        JLabel Heading = new JLabel("Border Layout");
        // Create buttons for each BorderLayout region
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Add buttons to the respective BorderLayout regions
        frame.add(Heading);
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Set the default close operation and size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}
