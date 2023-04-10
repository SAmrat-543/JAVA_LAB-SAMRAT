package LAB2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LAB2_3__Q13 extends JFrame {
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField ageTextField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JComboBox<String> facultyComboBox;
    private JComboBox<String> semesterComboBox;
    private JTextArea remarksTextArea;

    public LAB2_3__Q13() {
        // Set window title
        setTitle("Student Form - by Samrat");
        // Set window size
        setSize(600, 500);
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create file menu
        JMenu fileMenu = new JMenu("File");

        // Create save menu item
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new SaveMenuItemListener());
        fileMenu.add(saveMenuItem);

        // Create reset menu item
        JMenuItem resetMenuItem = new JMenuItem("Reset");
        resetMenuItem.addActionListener(new ResetMenuItemListener());
        fileMenu.add(resetMenuItem);

        // Create exit menu item
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ExitMenuItemListener());
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        // Create help menu
        JMenu helpMenu = new JMenu("Help");

        // Create about menu item
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new AboutMenuItemListener());
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        // Set menu bar to the frame
        setJMenuBar(menuBar);

        // Create toolbar
        JToolBar toolBar = new JToolBar();

        // Create save toolbar button
        JButton saveToolBarButton = new JButton(new ImageIcon("src/LAB2_3/Files/save.png"));
        saveToolBarButton.setToolTipText("Save");
        saveToolBarButton.addActionListener(new SaveMenuItemListener());
        toolBar.add(saveToolBarButton);

        // Create reset toolbar button
        JButton resetToolBarButton = new JButton(new ImageIcon("src/LAB2_3/Files/reset.png"));
        resetToolBarButton.setToolTipText("Reset");
        resetToolBarButton.addActionListener(new ResetMenuItemListener());
        toolBar.add(resetToolBarButton);

        // Create exit toolbar button
        JButton exitToolBarButton = new JButton(new ImageIcon("src/LAB2_3/Files/exit.png"));
        exitToolBarButton.setToolTipText("Exit");
        exitToolBarButton.addActionListener(new ExitMenuItemListener());
        toolBar.add(exitToolBarButton);

        add(toolBar, BorderLayout.NORTH);

        // Create form panel with GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create GridBagConstraints for form components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add form components to the form panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("First Name:"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Last Name:"), gbc);

        gbc.gridy = 2;
        formPanel.add(new JLabel("Age:"), gbc);

        gbc.gridy = 3;
        formPanel.add(new JLabel("Gender:"), gbc);

        gbc.gridy = 4;
        formPanel.add(new JLabel("Faculty:"), gbc);

        gbc.gridy = 5;
        formPanel.add(new JLabel("Semester:"), gbc);

        gbc.gridy = 6;
        formPanel.add(new JLabel("Remarks:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        firstNameTextField = new JTextField(20);
        formPanel.add(firstNameTextField, gbc);

        gbc.gridy = 1;
        lastNameTextField = new JTextField(20);
        formPanel.add(lastNameTextField, gbc);

        gbc.gridy = 2;
        ageTextField = new JTextField(20);
        formPanel.add(ageTextField, gbc);

        gbc.gridy = 3;
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        formPanel.add(genderPanel, gbc);

        gbc.gridy = 4;
        String[] facultyOptions = {"Faculty of CSIT", "Faculty of Management", "Faculty of BCA"};
        facultyComboBox = new JComboBox<>(facultyOptions);
        formPanel.add(facultyComboBox, gbc);

        gbc.gridy = 5;
        String[] semesterOptions = {"Semester 1", "Semester 2", "Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};
        semesterComboBox = new JComboBox<>(semesterOptions);
        formPanel.add(semesterComboBox, gbc);

        gbc.gridy = 6;
        remarksTextArea = new JTextArea(5, 20);
        JScrollPane remarksScrollPane = new JScrollPane(remarksTextArea);
        formPanel.add(remarksScrollPane, gbc);

        add(formPanel, BorderLayout.CENTER);

        gbc.gridy = 7;
        JLabel myLabel1 = new JLabel("Copyright © 2023");
        formPanel.add(myLabel1, gbc);

        gbc.gridy = 8;
        JLabel myLabel2 = new JLabel("All rights reserved by Samrat");
        formPanel.add(myLabel2, gbc);
        }

        // ActionListener for Save menu item and Save toolbar button
        private class SaveMenuItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
                        writer.write("First Name: " + firstNameTextField.getText() + "\n");
                        writer.write("Last Name: " + lastNameTextField.getText() + "\n");
                        writer.write("Age: " + ageTextField.getText() + "\n");
                        writer.write("Gender: " + (maleRadioButton.isSelected() ? "Male" : "Female") + "\n");
                        writer.write("Faculty: " + facultyComboBox.getSelectedItem() + "\n");
                        writer.write("Semester: " + semesterComboBox.getSelectedItem() + "\n");
                        writer.write("Remarks: " + remarksTextArea.getText() + "\n");
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Form data saved successfully!", "Save", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error saving form data!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        // ActionListener for Reset menu item and Reset toolbar button
        private class ResetMenuItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameTextField.setText("");
                lastNameTextField.setText("");
                ageTextField.setText("");
                maleRadioButton.setSelected(true);
                femaleRadioButton.setSelected(false);
                facultyComboBox.setSelectedIndex(0);
                semesterComboBox.setSelectedIndex(0);
                remarksTextArea.setText("");
            }
        }

        // ActionListener for Exit menu item and Exit toolbar button
        private class ExitMenuItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }

        // ActionListener for About menu item
        private class AboutMenuItemListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Student Form \nVersion 1.0\nCopyright © 2023\nAll rights reserved.\n - Created by Samrat", "About", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                LAB2_3__Q13 studentForm = new LAB2_3__Q13();
                studentForm.setVisible(true);
            });
        }
}

