package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprises implements ActionListener {
	JButton button1 = new JButton ();
	JButton button2 = new JButton ();
public void TrickOrTreat () {
	JFrame frame = new JFrame ();
		JPanel panel = new JPanel ();
		frame.setVisible(true);
		frame.add(panel);
		panel.add (button1);
		panel.add (button2);
		frame.setTitle("Trick or Treat!");
		button1.setText("Trick!");
		button2.setText ("Treat!");
		button1.setSize(300, 300);
		button2.setSize(300,300);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonclicked = (JButton) arg0.getSource();
	if (buttonclicked == button1) {
showPictureFromTheInternet ("https://cdn.vox-cdn.com/thumbor/W8a8MY0wtvFI_4OWq30Yq_qC6x0=/1400x1050/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/9503967/tp.candycornbowl.0.0.0.jpg");
	}else if (buttonclicked == button2) {
		showPictureFromTheInternet ("https://www.history.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTY3ODYyNDA1ODUyODMzMDQx/jackolantern-gettyimages-162252827.jpg");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}
