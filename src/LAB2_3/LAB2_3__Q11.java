package LAB2_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LAB2_3__Q11 extends JFrame {
    private JTextArea textArea;

    public LAB2_3__Q11() {
        // Set window title
        setTitle("File Dialog - Created by Samrat");
        // Set window size
        setSize(400, 200);
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        // Create file menu
        JMenu fileMenu = new JMenu("File");

        // Create open menu item
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new OpenMenuItemListener());
        fileMenu.add(openMenuItem);

        // Create save menu item
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new SaveMenuItemListener());
        fileMenu.add(saveMenuItem);

        // Add file menu to the menu bar
        menuBar.add(fileMenu);
        // Set menu bar to the frame
        setJMenuBar(menuBar);

        // Create text area
        textArea = new JTextArea();
        add(textArea);
    }

    // ActionListener for Open menu item
    private class OpenMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            // Show open dialog
            int returnValue = fileChooser.showOpenDialog(LAB2_3__Q11.this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    // Read file contents
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    // Set file contents to text area
                    textArea.setText(content.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    // ActionListener for Save menu item
    private class SaveMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            // Show save dialog
            int returnValue = fileChooser.showSaveDialog(LAB2_3__Q11.this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    // Write text area contents to file
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create and show the LAB2_3__Q11 i.e FileDialog
        LAB2_3__Q11 fileDialogExample = new LAB2_3__Q11();
        fileDialogExample.setVisible(true);
    }
}
