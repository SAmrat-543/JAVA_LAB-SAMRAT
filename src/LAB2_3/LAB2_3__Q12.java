package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LAB2_3__Q12 extends JFrame {
    public LAB2_3__Q12() {
        // Set window title
        setTitle("Menu by Samrat");
        // Set window size
        setSize(400, 300);
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create file menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        // Create help menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new AboutMenuItemListener());
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);

        // Set menu bar to the frame
        setJMenuBar(menuBar);

        // Add a label to display content
        JLabel label = new JLabel("-- Welcome to the Menu by Samrat --");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

    }

    // ActionListener for About menu item
    private class AboutMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Create and show the AboutDialog
            AboutDialog aboutDialog = new AboutDialog(LAB2_3__Q12.this);
            aboutDialog.setVisible(true);
        }
    }

    // Custom AboutDialog class
    private class AboutDialog extends JDialog {
        public AboutDialog(JFrame parent) {
            super(parent, "About", true);
            // Set dialog size
            setSize(300, 200);
            // Set layout manager
            setLayout(new BorderLayout());

            // Create label for app name
            JLabel appNameLabel = new JLabel("App Name: Application by Samrat");
            appNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(appNameLabel, BorderLayout.NORTH);

            // Create label for version
            JLabel versionLabel = new JLabel("Version: 1.0");
            versionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(versionLabel, BorderLayout.CENTER);

            // Create label for copyright information
            JLabel copyrightLabel = new JLabel("Copyright © 2023. All rights reserved.");
            copyrightLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(copyrightLabel, BorderLayout.SOUTH);

            // Create close button
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the dialog
                    dispose();
                }
            });
            add(closeButton, BorderLayout.PAGE_END);

            // Set dialog to be centered on parent frame
            setLocationRelativeTo(parent);
        }
    }

    public static void main(String[] args) {
        // Create and show the LAB2_3__Q12 i.e Menu
        LAB2_3__Q12 menuExample = new LAB2_3__Q12();
        menuExample.setVisible(true);
    }
}
