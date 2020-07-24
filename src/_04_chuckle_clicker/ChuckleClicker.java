package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton ();
	JButton punchline = new JButton ();
public void makeButtons () {
	JFrame frame = new JFrame ();
	frame.setVisible(true);
	JPanel panel = new JPanel ();
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
	joke.setText("Joke");
	punchline.setText("Punchline");
	frame.pack();
	joke.addActionListener(this);
	punchline.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonclicked = (JButton) arg0.getSource();
	if (buttonclicked == joke) {
		JOptionPane.showMessageDialog(null, "Why was 6 afraid of 7?");
	}else if (buttonclicked == punchline) {
		JOptionPane.showMessageDialog(null, "Because 7,8,9!");
	}
}
}
