
import java.awt.*;

import javax.swing.* ;

public class mainFram {
    
    public static void main(String[] args) {
       JFrame myFrame =new JFrame("this is my frame");
       myFrame.setSize(500,500);
       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    myFrame.setLayout( new FlowLayout());// thisis layout
    //    myFrame.setLayout( new GridBagLayout());//  
    //    myFrame.setLayout( new BorderLayout());// thisis layout
    //    myFrame.setLayout(new BoxLayout(myFrame.getContentPane(), BoxLayout.Y_AXIS));
// thisis layout
JLabel l = new JLabel("Simple Calculator");
l.setBounds(150,100,200,40);
 l.setFont(new Font("Arial",Font.BOLD,18));
l.setForeground(Color.BLUE);
myFrame.add(l);


JLabel firstName =new JLabel("First name");
firstName.setBounds(150,140,200,40);
firstName.setFont(new Font("Arial",Font.BOLD,18));
firstName.setForeground(Color.BLUE);
myFrame.add(firstName);

JButton fristButton = new JButton("inter Number");
myFrame.add(fristButton);

fristButton.setBounds(200,140,20,40);
       myFrame.setVisible(true);
    }
}
