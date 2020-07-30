import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTestProject implements ActionListener {
JFrame frame = new JFrame ();
JPanel panel = new JPanel ();
JTextField answer = new JTextField (10);
JButton submit = new JButton ();
JButton hint = new JButton ();
JLabel label = new JLabel ();
	public void setup () {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(answer);
	panel.add(submit);
	panel.add(hint);
	panel.add(label);
	label.setText("If the green man lives in the green house, the blue man lives in the blue house, red man lives in the red house, black man in the black house, orange man in the orange house, who lives in the white house?");
	hint.setText("Hint!");
	submit.setText("Submit!");
	submit.addActionListener(this);
	hint.addActionListener(this);
	frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonclicked = (JButton) arg0.getSource();
		if (buttonclicked == submit) {
			if (answer.getText().equals("president")) {
				JOptionPane.showMessageDialog(null,"Correct!");
			}else {
				JOptionPane.showMessageDialog (null, "Wrong, it was the president");
			}
			frame.dispose();
		}else if (buttonclicked==hint) {
			JOptionPane.showMessageDialog(null, "Think about Washington D.C.");
		}
	}
}
