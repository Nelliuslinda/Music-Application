package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Account extends JFrame implements ActionListener
  { 
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField tf1, tf2, tf5, tf6;
    JButton btn1, btn2;
    JPasswordField p1;
     
 
    public Account()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Create Account in MAHS MUSIC");
 
        l1 = new JLabel("Create an account");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 20));
        
        
 
        l2 = new JLabel("First Name:");
        l3 = new JLabel("Last Name:");
        l4 = new JLabel("Username");
        l5 = new JLabel("Email");
        l6 = new JLabel("Password");
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        btn1 = new JButton("Sign up");
        btn2 = new JButton("Already have an account?");
 
      
 
        l1.setBounds(230, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 190, 200, 30);
        btn1.setBounds(100, 300, 100, 30);
        btn2.setBounds(300, 300, 300, 30);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf5);
        add(l5);
        add(tf6);
        add(l6);
        add(p1);
        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        
    }
 
 


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1){
			
			
			
			Signup c = new Signup();
			c.setVisible(true);
			this.setVisible(false);
		}
		
	}
  }

