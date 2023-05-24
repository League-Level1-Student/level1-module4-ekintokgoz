package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		b1.setText("joke");
		b2.setText("punchline");
		b1.addActionListener(this);
		b2.addActionListener(this);
			}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes?");
		}else if(e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "Because he doesn't want to be spotted!");
		}

	}
}
