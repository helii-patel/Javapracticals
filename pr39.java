import javax.swing.*;
import java.awt.event.*;

public class pr39 extends JFrame {
    
    public pr39() {
        // Set up the JFrame
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create 'File' menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);
        
        // Create 'Edit' menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        
        // Create 'Help' menu with a sub-menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem findItem = new JMenuItem("Find");
        JMenu searchSubMenu = new JMenu("Search");
        JMenuItem searchByNameItem = new JMenuItem("Search by Name");
        JMenuItem searchByExtensionItem = new JMenuItem("Search by Extension");
        
        searchSubMenu.add(searchByNameItem);
        searchSubMenu.add(searchByExtensionItem);
        helpMenu.add(findItem);
        helpMenu.add(searchSubMenu);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);
        
        // Create a pop-up menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupOpenItem = new JMenuItem("Open");
        JMenuItem popupSaveItem = new JMenuItem("Save");
        
        popupMenu.add(popupOpenItem);
        popupMenu.add(popupSaveItem);
        
        // Add mouse listener for pop-up menu
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        // Set the frame to be visible
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new pr39();
        });
    }
}
