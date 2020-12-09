package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

   JLabel l1, l2, l3;
   JButton btn1, btn2, btn3, btn4;
    


    public Home() {
         
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MAHS MUSIC Page");
        
     
        l1 = new JLabel("MAHS MUSIC");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 34));
        l2 = new JLabel("Welcome");
        btn1 = new JButton("Connect with Facebook");
        btn2 = new JButton("Connect with Google");
        btn3 = new JButton("Connect with Spotify");
        btn4 = new JButton("Create new account");
        
        
        l1.setBounds(230, 110, 400, 30);
        l2.setBounds(290, 160, 200, 30);
        btn1.setBounds(100, 270, 220, 30);
        btn2.setBounds(300, 270, 220, 30);
        btn3.setBounds(100, 350, 220, 30);
        btn4.setBounds(300, 350, 220, 30);
        
        
        add(l1);
        add(l2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);


    
        btn4.addActionListener(this);

    }

    public static void main(String args[]) {
        Home home = new Home();
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		
        if (e.getSource() == btn4) {

            Account a = new Account();
            a.setVisible(true);
            this.setVisible(false);
        }
    }

}