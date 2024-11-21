import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {
        // Create frame for the application
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel for organizing components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Example of JPasswordField
        // JPasswordField is used to get sensitive data like passwords
        JLabel passwordLabel = new JLabel("Enter Password:");
        JPasswordField passwordField = new JPasswordField(20); // Creates a field to enter password
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Example of JSpinner
        // JSpinner is used to create a number selection field
        JLabel spinnerLabel = new JLabel("Select Number:");
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1)); // Allows number selection within a range
        panel.add(spinnerLabel);
        panel.add(spinner);

        // Example of JSlider
        // JSlider is used for creating a slider to select a value within a given range
        JLabel sliderLabel = new JLabel("Adjust Volume:");
        JSlider slider = new JSlider(0, 100, 0); // Volume control slider with min 0, max 100, and initial value 50
        // slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true); // Displays labels for ticks
        panel.add(sliderLabel);
        panel.add(slider);

        // Example of JProgressBar
        // JProgressBar is used to display the progress of a task
        JLabel progressBarLabel = new JLabel("Progress:");
        JProgressBar progressBar = new JProgressBar(0, 100); // Progress bar ranging from 0 to 100
        progressBar.setValue(49); // Setting initial progress to 50%
        progressBar.setStringPainted(true); // Shows the percentage text on the bar
        panel.add(progressBarLabel);
        panel.add(progressBar);

        // Example of JTable
        // JTable is used to display tabular data in rows and columns
        JLabel tableLabel = new JLabel("Student Table:");
        String[] columnNames = {"ID", "Name", "Grade"};
        Object[][] data = {
            {1, "Alice", "A"},
            {2, "Bob", "B"},
            {3, "Charlie", "C"}
        };
        JTable table = new JTable(data, columnNames); // Creates a table with the given data and column names
        JScrollPane tablePane = new JScrollPane(table); // Adds scrolling functionality to the table
        panel.add(tableLabel);
        panel.add(tablePane);

        // Example of JTree
        // JTree is used to display hierarchical data in a tree structure
        JLabel treeLabel = new JLabel("Tree Example:");
        JTree tree = new JTree(); // Creates an empty tree (it can be populated with nodes)
        JScrollPane treePane = new JScrollPane(tree); // Adds scrolling functionality to the tree
        panel.add(treeLabel);
        panel.add(treePane);

        // Example of JToolBar
        // JToolBar is used to create a toolbar with buttons for actions
        JToolBar toolBar = new JToolBar();
        JButton toolButton1 = new JButton("Tool 1");
        JButton toolButton2 = new JButton("Tool 2");
        toolBar.add(toolButton1); // Adds a button to the toolbar
        toolBar.add(toolButton2); // Adds another button to the toolbar
        frame.add(toolBar, BorderLayout.NORTH); // Places the toolbar at the top of the frame

        // Example of JColorChooser
        // JColorChooser is used to open a dialog for selecting a color
        JButton colorButton = new JButton("Choose Color");
        colorButton.addActionListener(e -> {
            Color color = JColorChooser.showDialog(frame, "Choose a Color", Color.RED); // Opens the color chooser dialog
            if (color != null) {
                colorButton.setBackground(color); // Sets the button's background color to the selected color
            }
        });
        panel.add(colorButton);

        // Example of JRadioButtonMenuItem
        // JRadioButtonMenuItem is used for adding radio-style items to a menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JRadioButtonMenuItem menuItem = new JRadioButtonMenuItem("Option 1"); // Adds a radio button menu item
        JRadioButtonMenuItem menuItem2 = new JRadioButtonMenuItem("Option 2"); // Adds a radio button menu item
        JRadioButtonMenuItem menuItem3 = new JRadioButtonMenuItem("Option 2"); // Adds a radio button menu item
        menu.add(menuItem); // Adds it to the menu
        menu.add(menuItem2); // Adds it to the menu
        menu.add(menuItem3); // Adds it to the menu
        menuBar.add(menu);
        frame.setJMenuBar(menuBar); // Sets the menu bar for the frame

        // Example of JSeparator
        // JSeparator is used to visually separate components in the layout
        JSeparator separator = new JSeparator(); // Creates a horizontal separator
        panel.add(separator);

        // Example of JOptionPane
        // JOptionPane is used for displaying messages, alerts, and dialogs
        JButton showMessageButton = new JButton("Show Message");
        showMessageButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hello from JOptionPane!"); // Shows a message dialog
        });
        panel.add(showMessageButton);

        // Example of JSplitPane
        // JSplitPane is used to divide the window into two adjustable sections
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(table), new JScrollPane(tree));
        splitPane.setDividerLocation(400); // Sets the initial location of the divider
        frame.add(splitPane, BorderLayout.CENTER); // Adds the split pane to the center of the frame

        // Example of JTablePane (integrating JTable within JScrollPane)
        panel.add(new JScrollPane(table)); // Adds the table inside a scroll pane for better scrolling functionality

        // Example of JToolTip
        // JToolTip is used to show a small popup with helpful information when the user hovers over a component
        JButton toolTipButton = new JButton("Hover for Info");
        toolTipButton.setToolTipText("This is a tooltip message."); // Sets the tooltip text
        panel.add(toolTipButton);

        // Add the main panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Show frame
        frame.setVisible(true);
    }
}
