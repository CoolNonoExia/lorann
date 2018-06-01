package view;

//Importations 
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Panel {
	public JFrame f;
	public JPanel p;
	
	//constructor
	public Panel() {
		f = new JFrame();
		f.setVisible(true);
		f.setTitle("LorannGame");
		f.setSize(1000, 800);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p= new JPanel();
		
	}
	
	public void paintComponent(Graphics g) {
		g.fillOval(100, 100, 200, 200);
	}
	
}












