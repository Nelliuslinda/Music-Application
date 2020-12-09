package guiwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class Song extends JFrame implements ActionListener
  { 
   JLabel l1;
   JButton btn1, btn2, btn3, btn4, btn5;
 
 class Image extends JFrame{
    private ImageIcon image1;
    private JLabel label1;
    
    Image(){
        setLayout(new FlowLayout());
        
        image1 = new ImageIcon(getClass().getResource("album.jpg"));
        label1 = new JLabel(image1);
        add(label1);
        
    }
 }
 
 
    public Song()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Playing in MAHS MUSIC");
        
        
        //image
        l1 = new JLabel("Pretty Little fears");
        l1.setForeground(Color.red);
        l1.setFont(new Font("Monospaced", Font.BOLD, 20));
        Image gui = new Image();
        gui.setVisible(true);
        gui.pack();
                    
        btn1 = new JButton("Pause");
        btn2 = new JButton("Skip");
        btn3 = new JButton("Next");
        btn4 = new JButton("Previous");
        btn5 = new JButton("Remove from liked songs");
        
        l1.setBounds(230, 30, 400, 30);
        btn1.setBounds(300, 70, 200, 30);
        btn2.setBounds(300, 110, 200, 30);
        btn3.setBounds(300, 150, 200, 30);
        btn4.setBounds(300, 190, 200, 30);
        btn5.setBounds(300, 230, 200, 30);
     
        add(l1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
      
        btn1.addActionListener(this);
        
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1){
			
			
			
			Home c = new Home();
			c.setVisible(true);
			this.setVisible(false);
		}
		
	}
        
     
     
  }


   
