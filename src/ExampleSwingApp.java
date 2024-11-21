import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleSwingApp {
    public static void main(String[] args) {
        // Create the main JFrame for the application
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 1. JList with JScrollPane
        String[] listData = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(listData);
        JScrollPane scrollPane = new JScrollPane(list); // Make the JList scrollable
        panel.add(scrollPane, BorderLayout.CENTER);

        // 2. JComboBox for selection
        String[] comboItems = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);
        panel.add(comboBox, BorderLayout.NORTH);

        // 3. JMenu and JMenuItems with accelerators, mnemonics
        JMenuBar menuBar = new JMenuBar();

        // Create a File menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Set the mnemonic for File menu

        // Create Edit menu
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); // Set the mnemonic for Edit menu

        // Create File menu items
        JMenuItem newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); // Ctrl+N shortcut
        JMenuItem openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Ctrl+O shortcut
        fileMenu.add(newItem);
        fileMenu.add(openItem);

        // Create Edit menu items
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK)); // Ctrl+X shortcut
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK)); // Ctrl+C shortcut
        editMenu.add(cutItem);
        editMenu.add(copyItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // 4. JPopupMenu (Right-click menu)
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK)); // Ctrl+V shortcut
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
