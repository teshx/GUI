import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInformationApp {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("User Information Form");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField(20);

        JLabel departmentLabel = new JLabel("Department:");
        String[] departments = {"Computer Science", "Software Engineering", "Information Systems", "Electrical Engineering"};
        JComboBox<String> departmentComboBox = new JComboBox<>(departments);

        JButton insertButton = new JButton("Insert");
        JTextArea displayArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Disable text area for direct editing
        displayArea.setEditable(false);

        // Add action listener to the insert button
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user inputs
                String name = nameField.getText();
                String id = idField.getText();
                String department = (String) departmentComboBox.getSelectedItem();

                // Validate inputs
                if (name.isEmpty() || id.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Name and ID cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Append information to the text area
                    displayArea.append("Name: " + name + ", ID: " + id + ", Department: " + department + "\n");
                    displayArea.append("Name: " + name + ", ID: " + id + ", Department: " + department + "\n");

                    // Clear input fields
                    nameField.setText("");
                    idField.setText("");
                    departmentComboBox.setSelectedIndex(0);
                }
            }
        });

        // Set layout and add components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(idLabel);
        frame.add(idField);
        frame.add(departmentLabel);
        frame.add(departmentComboBox);
        frame.add(insertButton);
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
