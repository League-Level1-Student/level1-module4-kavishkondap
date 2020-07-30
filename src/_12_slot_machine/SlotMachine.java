package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame ();
JPanel panel = new JPanel ();
JButton button = new JButton ();
JLabel image1 = new JLabel ();
JLabel image2 = new JLabel ();
JLabel image3 = new JLabel ();
int ran = new Random().nextInt(3);
int rand = new Random().nextInt (3);
int random = new Random().nextInt (3);
	public void setup () {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);

	try {
		image1 = createLabelImage ("emoji8.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		image2 = createLabelImage ("emoji9.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		image3 = createLabelImage ("emoji10.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	image1.setPreferredSize(new Dimension (256,256));
	image2.setPreferredSize(new Dimension (256,256));
	image3.setPreferredSize(new Dimension (256,256));
	panel.add(image1);
	panel.add(image2);
	panel.add(image3);
	panel.add(button);
	button.setText("Randomize!");
	frame.pack();
}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ran = new Random ().nextInt (3);
		rand = new Random ().nextInt (3);
		random = new Random ().nextInt (3);
		panel.remove(image1);
		panel.remove(image2);
		panel.remove(image3);
		if (ran==0) {
			try {
				JLabel image1 = createLabelImage ("emoji8.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (ran==1) {
			try {
				image1 = createLabelImage ("emoji9.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (ran == 2) {
			try {
				image1 = createLabelImage ("emoji10.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (rand==0) {
			try {
				image2 = createLabelImage ("emoji8.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (rand==1) {
			try {
				image2 = createLabelImage ("emoji9.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (rand == 2) {
			try {
				image2 = createLabelImage ("emoji10.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (random==0) {
			try {
				image3 = createLabelImage ("emoji8.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (random==1) {
			try {
				image3 = createLabelImage ("emoji9.png");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (random == 2) {
			try {
				image3 = createLabelImage ("emoji10.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		panel.add(image1);
		panel.add(image2);
		panel.add(image3);
		frame.pack();
		
		if ((ran==rand)&&(rand==random)) {
			JOptionPane.showMessageDialog(null, "You Win");
			frame.dispose();
		}
	}

}
