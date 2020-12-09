package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Signup extends JFrame implements ActionListener
  { 
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;
   
 
    public Signup()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Create Account in MAHS MUSIC");
 
        l1 = new JLabel("Sign in with email");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 20));   
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password:");

        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Sign in");
        
        
        l1.setBounds(230, 30, 400, 60);
        l2.setBounds(80, 150, 200, 30);
        l3.setBounds(80, 190, 200, 30);
        tf1.setBounds(300, 150, 200, 30);
        p1.setBounds(300, 190, 200, 30);
        btn1.setBounds(200, 310, 100, 30);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(p1);
        add(btn1);

        btn1.addActionListener(this);
        
    }
 
 


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1){
			
			
			
			Mainpage d = new Mainpage();
			d.setVisible(true);
			this.setVisible(false);
		}
		
	}
  }

