package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel();
	JButton mole = new JButton("mole!");
	int whacker = 0;
	
	public WhackAMole() {
		mole.addActionListener(this);
	}
	public void run() {
		frame.add(panel);
		drawButtons(new Random().nextInt(24));
		frame.setSize(350,350);
		frame.setVisible(true);		
	}
	
	void drawButtons(int i) { 
		for(int b= 0; b<24; b++) {
			if(b == i) {
				panel.add(mole);
				//mole.addActionListener(this);
			} else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}
		
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mole) {
			whacker+=1;
			panel.removeAll();
			run();
		}else {
			speak("wrong");
			panel.removeAll();
			run();
		}
		
	}
}
