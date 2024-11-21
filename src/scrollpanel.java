import javax.swing.*;
import java.awt.*;

public class scrollpanel {
    public static void main(String[] args) {
        // Create the main JFrame for the application
        JFrame frame = new JFrame("Scrollable JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); // Use BorderLayout to place components

        // 1. JList with JScrollPane
        // Create an array of items for the JList
        String[] listData = {
            "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
            "Item 6", "Item 7", "Item 8", "Item 9", "Item 10",
            "Item 11", "Item 12", "Item 13", "Item 14", "Item 15"
        };

        // Create the JList with the listData array
        JList<String> list = new JList<>(listData);

        // Wrap the JList inside a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(list);

        // Set the preferred size of the JList (optional, but helps with layout)
        list.setPreferredSize(new Dimension(300, 150));

        // Add the JScrollPane (which contains the JList) to the panel
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add the panel to the JFrame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}