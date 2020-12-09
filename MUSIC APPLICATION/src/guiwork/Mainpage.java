package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainpage extends JFrame implements ActionListener {

   JLabel l1, l2, l3;
   JButton btn1, btn2, btn3, btn4, btn5;


    public Mainpage() {
        
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MAHS MUSIC Page");
        
        
        l1 = new JLabel("MAHS MUSIC");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 34));
        l2 = new JLabel("Welcome");
        l2.setForeground(Color.black);
        l2.setFont(new Font("Monospaced", Font.BOLD, 26));
        
             

        btn1 = new JButton("DOWNLOADS");
        btn2 = new JButton("PLAYLIST");
        btn3 = new JButton("ALBUMS");
        btn4 = new JButton("LIKED SONGS");
        btn5 = new JButton("ARTISTS");
        
        l1.setBounds(230, 110, 400, 30);
        l2.setBounds(280, 160, 200, 30);
        btn1.setBounds(230, 250, 220, 30);
        btn2.setBounds(230, 280, 220, 30);
        btn3.setBounds(230, 310, 220, 30);
        btn4.setBounds(230, 340, 220, 30);
        btn5.setBounds(230, 370, 220, 30);
      
        
        add(l1);
        add(l2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
      

       
        btn2.addActionListener(this);

    }

    public static void main(String args[]) {
        Home home = new Home();
        home.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
        if (e.getSource() == btn2) {

            Playlist m = new Playlist();
            m.setVisible(true);
            this.setVisible(false);
        }
    }

}