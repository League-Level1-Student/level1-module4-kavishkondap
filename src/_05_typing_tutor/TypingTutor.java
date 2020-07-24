package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel ();
	Date timeAtStart = new Date();
char currentLetter;
JFrame frame = new JFrame ();
JPanel panel = new JPanel ();
public static void main(String[] args) {
	TypingTutor object = new TypingTutor();
	object.setup();

}
public void setup () {
	
	frame.setVisible(true);
	currentLetter = generateRandomLetter();
frame.add(panel);
	panel.add(label);
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.pack();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println( "You typed " + arg0.getKeyChar());
	if (arg0.getKeyChar () == currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.GREEN);
	}else {
		System.out.println("Wrong!");
		panel.setBackground (Color.RED);
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
//private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
//    Date timeAtEnd = new Date();
//    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
//    long gameInSeconds = (gameDuration / 1000) % 60;
//    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
//    int charactersPerMinute = (int) (charactersPerSecond * 60);
//    JOptionPane.showMessageDialog(null, charactersPerMinute + " characters per minute.");
//}
}
