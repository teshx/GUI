import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PizzaOrder {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Pizza Order System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        // Create a label for instructions
        JLabel instructionLabel = new JLabel("Select your toppings:");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Create checkboxes for pizza toppings
        JCheckBox cheeseBox = new JCheckBox("Cheese ($2)");
        JCheckBox pepperoniBox = new JCheckBox("Pepperoni ($3)");
        JCheckBox mushroomsBox = new JCheckBox("Mushrooms ($1.5)");
        JCheckBox olivesBox = new JCheckBox("Olives ($1)");

        // Create a label to display the total price
        JLabel totalLabel = new JLabel("Total: $0.0");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        totalLabel.setForeground(Color.BLUE);

        // Add item listeners to checkboxes
        ItemListener listener = new ItemListener() {
            double total = 0.0; // Track the total cost

            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox source = (JCheckBox) e.getSource();

                // Update total cost based on the checkbox state
                double price = 0;
                if (source == cheeseBox) price = 2.0;
                else if (source == pepperoniBox) price = 3.0;
                else if (source == mushroomsBox) price = 1.5;
                else if (source == olivesBox) price = 1.0;

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    total += price;
                } else {
                    total -= price;
                }

                // Update the total label
                totalLabel.setText(String.format("Total: $%.2f", total));
            }
        };

        // Attach the listener to each checkbox
        cheeseBox.addItemListener(listener);
        pepperoniBox.addItemListener(listener);
        mushroomsBox.addItemListener(listener);
        olivesBox.addItemListener(listener);

        // Add components to the frame
        frame.add(instructionLabel);
        frame.add(cheeseBox);
        frame.add(pepperoniBox);
        frame.add(mushroomsBox);
        frame.add(olivesBox);
        frame.add(totalLabel);

        // Display the frame
        frame.setVisible(true);
    }
}
