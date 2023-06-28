package _10_slot_machine;

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
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton spinner = new JButton("SPIN");
	
	public void run(){	
	panel.add(spinner);
	frame.add(panel);
	spinner.addActionListener(this);
	frame.setSize(300,600);
	frame.setVisible(true);
	spin();
	}
	
	
	void randomImage() throws MalformedURLException {
		int ran = new Random().nextInt(3);
		if(ran == 0) {
			label1 = createLabelImage("cherry.jpeg");
			panel.add(label1);
			frame.pack();
		}else if(ran == 1) {
			label1 = createLabelImage("orange.jpeg");
			panel.add(label1);
			frame.pack();
		}else if(ran == 2) {
			label1 = createLabelImage("lime.jpeg");
			panel.add(label1);
			frame.pack();
		}
		
		int rob = new Random().nextInt(2);
		if(rob == 0) {
			label2 = createLabelImage("cherry.jpeg");
			panel.add(label2);
			frame.pack();
		}else if(rob == 1) {
			label2 = createLabelImage("orange.jpeg");
			panel.add(label2);
			frame.pack();
		}else if(rob == 2) {
			label2 = createLabelImage("lime.jpeg");
			panel.add(label2);
			frame.pack();
		}
		
		int roy = new Random().nextInt(2);
		if(roy == 0) {
			label3 = createLabelImage("cherry.jpeg");
			panel.add(label3);
			frame.pack();
		}else if(roy == 1) {
			label3 = createLabelImage("orange.jpeg");
			panel.add(label3);
			frame.pack();
		}else if(roy == 2) {
			label3 = createLabelImage("lime.jpeg");
			panel.add(label3);
			frame.pack();
		}

	}
	
	void spin() {
		try {
			panel.remove(label1);
			panel.remove(label2);
			panel.remove(label3);
			randomImage();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == spinner) {
			spin();
		}
	}

}
