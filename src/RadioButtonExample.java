import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        // Group radio buttons to allow only one selection
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        // Add ActionListener to each button
        ActionListener radioListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton aButton = (AbstractButton) actionEvent.getSource();
                System.out.println("Selected: " + aButton.getText());
            }
        };

        option1.addActionListener(radioListener);
        option2.addActionListener(radioListener);
        option3.addActionListener(radioListener);

        // Add radio buttons to the frame
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);

        frame.setVisible(true);
    }
}
