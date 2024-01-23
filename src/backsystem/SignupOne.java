

package backsystem;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author baonguyen
 */
public class SignupOne extends JFrame{
       
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L) + 1000L;
        
        JLabel formo = new JLabel("APPLICATION FORM NO. " + random);
        formo.setFont(new Font("Raleway", Font.BOLD , 38));
        formo.setBounds(140, 20, 600, 40);
        add(formo);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD , 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD , 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD , 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD , 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD , 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD , 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD , 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD , 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD , 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD , 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        JLabel pincode = new JLabel("Pin code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD , 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
}