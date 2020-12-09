package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Playlist extends JFrame implements ActionListener
  { 
    JLabel l1, l2, l3, l4, l5, l6;
    JButton btn1, btn2, btn3, btn4, btn5;

 
    public Playlist()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Playlist in MAHS MUSIC");
 
        l1 = new JLabel("Playlist");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 20));
        
        
 
        l2 = new JLabel("6LACK - Pretty Little Fears");
        l3 = new JLabel("Takeoff - Casper");
        l4 = new JLabel("Aitch - Safe to say");
        l5 = new JLabel("Dadju - Dieu Merci");
        l6 = new JLabel("Rema - Woman");

 
        btn1 = new JButton("Play");
        btn2 = new JButton("Play");
        btn3 = new JButton("Play");
        btn4 = new JButton("Play");
        btn5 = new JButton("Play");
        
 
         
        l1.setBounds(230, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        btn1.setBounds(300, 70, 200, 30);
        btn2.setBounds(300, 110, 200, 30);
        btn3.setBounds(300, 150, 200, 30);
        btn4.setBounds(300, 190, 200, 30);
        btn5.setBounds(300, 230, 200, 30);
     
        
        add(l1);
        add(l2);
        add(btn1);
        add(l3);
        add(btn2);
        add(l4);
        add(btn3);
        add(l5);
        add(btn4);
        add(l6);
        add(btn5);
        
        btn1.addActionListener(this);
        
    }
 
 	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1){
			
			
			
			Song t = new Song();
			t.setVisible(true);
			this.setVisible(false);
		}
		
	}
  }

