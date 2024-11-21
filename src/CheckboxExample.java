import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");
        checkBox3.setSelected(true); // Pre-select Option 3

        // Customize a checkbox
        JCheckBox customCheckBox = new JCheckBox("Custom Styled");
        customCheckBox.setForeground(Color.BLUE); // Set text color
        customCheckBox.setFont(new Font("Arial", Font.BOLD, 14)); // Set font style
        customCheckBox.setBackground(Color.LIGHT_GRAY); // Set background color

        // Create a label to display the selected options
        JLabel resultLabel = new JLabel("Selected: None");

        // Add item listeners to checkboxes
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                StringBuilder selectedOptions = new StringBuilder("Selected: ");
                if (checkBox1.isSelected()) selectedOptions.append("Option 1 ");
                if (checkBox2.isSelected()) selectedOptions.append("Option 2 ");
                if (checkBox3.isSelected()) selectedOptions.append("Option 3 ");
                if (customCheckBox.isSelected()) selectedOptions.append("Custom Styled ");
                
                resultLabel.setText(selectedOptions.toString().trim());
            }
        };

        // Attach the listener to all checkboxes
        checkBox1.addItemListener(listener);
        checkBox2.addItemListener(listener);
        checkBox3.addItemListener(listener);
        customCheckBox.addItemListener(listener);

        // Add components to the frame
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(customCheckBox);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
