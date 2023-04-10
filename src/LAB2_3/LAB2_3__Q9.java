package LAB2_3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;


public class LAB2_3__Q9 extends JFrame implements ActionListener {
    
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem newItem, openItem, saveItem, exitItem;
    private JMenuItem undoItem, redoItem, cutItem, copyItem, pasteItem;
    private JMenuItem aboutItem;
    public JFrame f,Lspace,aboutFrame;

    public LAB2_3__Q9() {
    	
        f = new JFrame("Notepad Application - Created by Samrat");
       
        //create text area
        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        f.add(new JScrollPane(textArea), BorderLayout.CENTER);
        
        //create menu bar
        menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);

        //create menu
        menu1 = new JMenu(" File");
        menuBar.add(menu1);
 
        menu2 = new JMenu(" Edit");
        menuBar.add(menu2);
               
        menu3 = new JMenu(" Help");
        menuBar.add(menu3);
        
        
        //create menu items
        newItem = new JMenuItem(" New");
        openItem = new JMenuItem(" Open"); 
        saveItem = new JMenuItem(" Save");
        exitItem = new JMenuItem(" Exit");

        undoItem = new JMenuItem(" Undo           Ctrl + Z");
        redoItem = new JMenuItem(" Redo           Ctrl + Y");
        cutItem = new JMenuItem(" Cut              Ctrl + X");
        copyItem = new JMenuItem(" Copy           Ctrl + C");
        pasteItem = new JMenuItem(" Paste          Ctrl + V");

        aboutItem = new JMenuItem(" About");
        //add items to menu
        menu1.add(newItem);
        menu1.add(openItem);
        menu1.add(saveItem);
        menu1.add(exitItem);
        
        menu2.add(undoItem);
        menu2.add(redoItem);
        menu2.add(cutItem);
        menu2.add(copyItem);
        menu2.add(pasteItem);

        menu3.add(aboutItem);

        exitItem.addActionListener(this);
        newItem.addActionListener(this);
        saveItem.addActionListener(this);
        openItem.addActionListener(this);
        aboutItem.addActionListener(this);


        f.setSize(600, 400);    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true); 
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitItem)
        {
            System.exit(0);
        }

        if(e.getSource() == newItem)
        {
            new LAB2_3__Q9();
        }
        if(e.getSource() == aboutItem){
            JOptionPane.showMessageDialog(aboutFrame, "Welcome to Notepad Application!\n        Created by Samrat");
            //JLabel aboutinfo = new JLabel("This is a simple Notepad application made using Java. Created by Samrat");
           // aboutFrame.add(aboutinfo);
            
        }
	
	}	
	
    public static void main(String[] args) {
       new LAB2_3__Q9();
    }
}

