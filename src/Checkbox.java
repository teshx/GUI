import javax.swing.*;
import java.awt.*;

public class Checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Class");

        // Create checkboxes
        JCheckBox emptyBox = new JCheckBox();
        JCheckBox dditBox = new JCheckBox("DDIT");
        JCheckBox dditCheckedBox = new JCheckBox("DDIT", true);
        dditCheckedBox.setBorderPainted(true);

        // Set layout
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // Add checkboxes to frame
        frame.add(emptyBox);
        frame.add(dditBox);
        frame.add(dditCheckedBox);

        // Frame settings
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
