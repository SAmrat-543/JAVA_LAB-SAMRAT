package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q10 extends JFrame {
    private JButton[][] buttons; // 2D array to hold buttons
    private boolean isPlayerX; // boolean to keep track of current player (X or O)

    public LAB2_3__Q10() {
        // Set window title
        setTitle("Tic-Tac-Toe - Created by Samrat");
        // Set window size
        setSize(400, 400);
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 3));
        // Initialize buttons array
        buttons = new JButton[3][3];

        // Loop to create buttons and add them to the panel
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.PLAIN, 60));
                button.addActionListener(new ButtonClickListener());
                panel.add(button);
                buttons[i][j] = button;
            }
        }

        // Add panel to the frame
        add(panel);
        // Initialize current player as X
        isPlayerX = true;
    }

    // ActionListener for button clicks
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            // Disable the clicked button
            button.setEnabled(false);

            // Set button text as X or O based on current player
            if (isPlayerX) {
                button.setText("X");
            } else {
                button.setText("O");
            }

            // Toggle current player
            isPlayerX = !isPlayerX;
        }
    }

    public static void main(String[] args) {
        // Create and show the LAB2_3__Q10 ie Tic Tac Toe
        LAB2_3__Q10 ticTacToeApp = new LAB2_3__Q10();
        ticTacToeApp.setVisible(true);
    }
}
