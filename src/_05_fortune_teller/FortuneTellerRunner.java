package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	String name = JOptionPane.showInputDialog("What is your name?");
    	JOptionPane.showMessageDialog(null, "Welcome to the fortune teller " + name + ". I live near the bottom");
    }
}
