import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Sum of Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel l = new JLabel("Simple Calculator");

        l.setBounds(150,100,200,40);
        l.setFont(new Font("Arial",Font.BOLD,18));
        l.setForeground(Color.BLUE);
        frame.add(l);
        
        JLabel firstNumber = new JLabel("First Number : ");



        firstNumber.setBounds(100,170,100,20);



        frame.add(firstNumber);
        
        JTextField firstNumberField = new JTextField();





        firstNumberField.setBounds(200,170,140,20);
        frame.add(firstNumberField);



        
        
        JLabel secondNumber = new JLabel("Second Number : ");
        secondNumber.setBounds(100,200,100,20);
        frame.add(secondNumber);
        
        JTextField secondNumberField = new JTextField();
        secondNumberField.setBounds(200, 200, 140, 20);
        frame.add(secondNumberField);
        
        JButton reset = new JButton("RESET");



        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                firstNumberField.setText("");
                secondNumberField.setText("");
            }
        });



        reset.setBackground(Color.CYAN);
        reset.setForeground(Color.BLUE);
        reset.setBounds(100, 230, 80, 20);


        frame.add(reset);
        
        JButton result = new JButton("ADD");
        result.setBackground(Color.LIGHT_GRAY);
        result.setForeground(Color.RED);
        
        JButton subButton = new JButton("sub");
        subButton.setBackground(Color.LIGHT_GRAY);
        subButton.setForeground(Color.RED);
        frame.add(subButton);
        JButton mul = new JButton("multi");
        mul.setBounds(400,230,100,20);
        mul.setFont( new Font("Arial",Font.BOLD,18));
        mul.setBackground(Color.LIGHT_GRAY);
        mul.setForeground(Color.RED);
        frame.add(mul);
        
        JLabel add = new JLabel();


        add.setBounds(200, 300, 100, 20);
        add.setFont(new Font("Arial",Font.BOLD,18)); 
        add.setForeground(Color.BLUE);
        frame.add(add);
        
        
        
        result.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent ae) {
                String firstNumber = firstNumberField.getText();
                String secondNumber = secondNumberField.getText();
                int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                System.out.println(sum);
                add.setText("SUM =" + sum);
            }
        });
        
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ea){
               
                String FirstNumber=firstNumberField.getText();
                String secondNumber=secondNumberField.getText();
                int multi= Integer.parseInt(FirstNumber) *Integer.parseInt(secondNumber);
                add.setText("multiple ="+ multi);

            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String firstNumber = firstNumberField.getText();
                String secondNumber = secondNumberField.getText();
                int sub = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                System.out.println(sub);
                add.setText("SUB =" + sub);
            }
        });
        result.setBounds(220,230,80,20);
        subButton.setBounds(300,230,80,20);
        frame.add(result);
        frame.add(subButton);
        frame.setVisible(true);
}} 