import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class newapp {
    public static void main(String[] args){

JFrame myFrame=new JFrame("simple Artimatic Calculator");
myFrame.setLayout(null);
myFrame.setSize(600,400);
        
JLabel art=new JLabel("Artimatic Calculator");

art.setBounds(10,50,189,20);
myFrame.add(art);

myFrame.setVisible(true);
}
}
