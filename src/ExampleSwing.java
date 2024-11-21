import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleSwing {
    public static void main(String[] args) {
        // Create the main JFrame for the application
        JFrame frame = new JFrame("Swing Components Example");
       
        frame.setSize(400, 300);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // 1. JList with JScrollPane
        String[] listData = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5","Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList list = new JList(listData);
        JScrollPane scrollPane = new JScrollPane(list); // Make the JList scrollable



        panel.add(scrollPane, BorderLayout.CENTER);

        // 2. Editable JComboBox for selection
        String[] comboItems = {"Option 1", "Option 2", "Option 3"};
        JComboBox comboBox = new JComboBox(comboItems);
        comboBox.setEditable(true); // Make the combo box editable
        panel.add(comboBox);

        // 3. JMenu and JMenuItems with accelerators, mnemonics
        JMenuBar menuBar = new JMenuBar();

        // Create a File menu
        JMenu fileMenu = new JMenu("File");
        // fileMenu.setMnemonic(KeyEvent.VK_F); // Set the mnemonic for File menu

        // Create Edit menu
        JMenu editMenu = new JMenu("Edit");
        // editMenu.setMnemonic(KeyEvent.VK_E); // Set the mnemonic for Edit menu
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        // Create File menu items
        JMenuItem newItem = new JMenuItem("New");
     
        JMenuItem openItem = new JMenuItem("Open");

        fileMenu.add(newItem);
        fileMenu.add(openItem);

        // Create Edit menu items
        JMenuItem cutItem = new JMenuItem("Cut");
        
        JMenuItem copyItem = new JMenuItem("Copy");
     
        editMenu.add(cutItem);
        editMenu.add(copyItem);

        // Add menus to the menu bar
      
        
        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // 4. JPopupMenu (Right-click menu)
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem pasteItem = new JMenuItem("Paste");
        
        popupMenu.add(pasteItem);

        // Add a MouseListener to show the popup menu on right-click
        list.addMouseListener(new MouseAdapter() {
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

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
