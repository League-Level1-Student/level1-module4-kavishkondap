package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
JFrame frame = new JFrame ();
JTextField text = new JTextField (10);
JButton button = new JButton ();
JPanel panel = new JPanel ();
	public void setup () {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	button.setText("Search!");
	frame.setTitle("Search the Twitterverse!");
	button.addActionListener(this);
	frame.pack ();
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, Tweet!");
	}
}
