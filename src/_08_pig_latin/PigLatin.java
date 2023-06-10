package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatin implements ActionListener {
	public static void main(String[] args) {
		new PigLatin().run();
	}

	JFrame frame = new JFrame("Pig Latin Translator");
	JPanel panel = new JPanel();
	JTextField english = new JTextField(25);
	JButton b1 = new JButton(">>");
	JButton b2 = new JButton("<<");
	JTextField pigLatin = new JTextField(25);
	JButton b3 = new JButton("speak");
	
	private void run() {
		frame.setVisible(true);
		panel.add(english);
		panel.add(b1);
		panel.add(b2);
		panel.add(pigLatin);
		panel.add(b3);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String newLatin = PigLatinTranslator.translateEnglishToPigLatin(english.getText());
			pigLatin.setText(newLatin);
		}else if(e.getSource() == b2) {
			String newEnglish = PigLatinTranslator.translatePigLatinToEnglish(pigLatin.getText());
			english.setText(newEnglish);
		}else if(e.getSource() == b3) {
			Sound.speak(pigLatin.getText());
		}
		
	}
}
