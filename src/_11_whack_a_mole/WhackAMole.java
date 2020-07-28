package _11_whack_a_mole;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame = new JFrame ();
JPanel panel = new JPanel ();
JButton [] button = new JButton [40];
	public void setup () {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(panel);
	for (int i = 0; i < button.length; i++) {
		button[i] = new JButton ();
		button[i].setPreferredSize(new Dimension(50,30));
	}
for (int i = 0; i < button.length; i++) {
	panel.add(button[i]);
}
frame.setSize(300, 340);
}
	
}
