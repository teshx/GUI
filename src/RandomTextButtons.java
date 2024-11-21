import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomTextButtons {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Random Text Buttons");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout to GridLayout (3 rows, 2 columns)
        frame.setLayout(new GridLayout(3, 2));

        // Create an array of random texts
        String[] randomTexts = {"Click Me!", "Hello", "Press", "Button", "Java", "Swing", "Random", "Text", "Fun"};
        Random random = new Random();

        // Add 5 buttons with random text
        for (int i = 0; i < 5; i++) {
            String buttonText = randomTexts[random.nextInt(randomTexts.length)];
            JButton button = new JButton(buttonText);
            frame.add(button);
        }

        // Add an empty panel for the sixth grid cell
        frame.add(new JPanel());

        // Make the frame visible
        frame.setVisible(true);
    }
}
