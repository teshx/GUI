import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaApplication9 {
    public static void main(String[] args) {

        JFrame a = new JFrame("DDIT Advanced Programming");
        a.setSize(500, 200); 
        
        // Set FlowLayout with left alignment
        a.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        
        JButton bt = new JButton("Java One");
        a.add(bt);
        
        JButton bt1 = new JButton("Java Two"); 
        a.add(bt1);
        JButton b = new JButton("Java One");
        a.add(b);
        
        JButton b3 = new JButton("Java Two"); 
        a.add(b3);

        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
