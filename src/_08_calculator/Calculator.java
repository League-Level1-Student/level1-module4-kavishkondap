package _08_calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame  = new JFrame ();
JPanel panel = new JPanel ();
JButton add = new JButton ();
JButton subtract = new JButton ();
JButton multiply = new JButton ();
JButton divide  = new JButton ();
JTextField number1 = new JTextField (10);
JTextField number2 = new JTextField (10);
JLabel answer = new JLabel ();
	public void setup () {
	frame.setVisible(true);
frame.add(panel);
panel.add(number1);
panel.add(number2);
panel.add(add);
panel.add(subtract);
panel.add(multiply);
panel.add(divide);
panel.add(answer);
add.addActionListener(this);
subtract.addActionListener(this);
multiply.addActionListener(this);
divide.addActionListener(this);
add.setText("ADD");
subtract.setText("SUBTRACT");
multiply.setText ("MULTIPLY");
divide.setText("DIVIDE");
frame.setTitle("Simple Calculator");
answer.setFont(new Font("Arial", Font.PLAIN, 60));
frame.pack();

}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String value1 = number1.getText();
		String value2 = number2.getText();
		double entry1 = Double.parseDouble(value1);
		double entry2 = Double.parseDouble(value2);
		JButton buttonclicked = (JButton) arg0.getSource();
		if (buttonclicked == add) {
			answer.setText((entry1+entry2) + "");
		}
		if (buttonclicked == subtract) {
			answer.setText ((entry1-entry2) + "");
		}
		if (buttonclicked == multiply) {
			answer.setText ((entry1*entry2) + "");
		}
		if (buttonclicked == divide) {
			answer.setText ((entry1/entry2) + "");
		}
		frame.pack();
	}
}

