
package backsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class Login extends JFrame implements ActionListener {
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        
        setLayout(null);
        
        //Logo
        setTitle("AUTOMATED TELLER MACHINE ");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        //Title
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        //Card NO
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //Pin
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250  , 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,  220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //Sign in
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);  
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        //Clear
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);  
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        //Sign up
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        //Set display
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 400);
        setVisible(true);
        setLocation(350,200);


    }
    //Evnet
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if(ac.getSource() == login){
            
        } else if(ac.getSource() == signup){
            
        }
    }
    public static void main(String args[]){
        new Login();
    }
}

