package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton[] button = new JButton[42];
	Random rand = new Random();
	int number = rand.nextInt(button.length);
	int score = 0;
	int missCounter = 0;
	JLabel label = new JLabel();
Date date = new Date ();
	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setTitle("WHACK-A-MOLE!!!");
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			button[i].setPreferredSize(new Dimension(200, 70));// 50,30
			button[i].addActionListener(this);
			
		}

		button[number].setText("Mole!");
		for (int i = 0; i < button.length; i++) {
			panel.add(button[i]);
		}
		panel.add(label);
		label.setText("Your Score is: " + score + "");
		JOptionPane.showMessageDialog (null,"Hit the moles to get points. 10 points wins! But don't mess up!");
		frame.setSize(1000, 1000);// 300,340
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object buttonclicked = arg0.getSource();
		if (buttonclicked == button[number]) {
			score++;
			label.setText("Your Score is: " + score + "");
		} else if (buttonclicked != button[number]) {
			JOptionPane.showMessageDialog(null, "Wrong, 3 misses and you will be out!");
			score--;
			label.setText("Your Score is: " + score + "");
			missCounter++;

		}
		if (missCounter == 3) {
			speak("You Lose, Try Again Next Time");
frame.dispose();
		}
		if (score == 10) {
			speak ("You Win! Congratulations");
			frame.dispose();
		}
//		//frame.dispose();
//		frame.removeAll();
//		button[number].setText("Mole!");
//		for (int i = 0; i < button.length; i++) {
//			panel.add(button[i]);
//		}
//		frame.pack();
//		frame.setSize(1000,1000);
		button[number].setText(null);
		rand = new Random();
		number = rand.nextInt(button.length);
		button[number].setText("Mole!");
	
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
}
