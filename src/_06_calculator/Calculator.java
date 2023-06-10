package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	public int add() {
		String n1 = text1.getText();
		String n2 = text2.getText();
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int addNum = num1 += num2;
		System.out.println(addNum);
		return addNum;
	}
	public int subtract() {
		String n1 = text1.getText();
		String n2 = text2.getText();
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int subNum = num1-= num2;
		System.out.println(subNum);
		return subNum;
	}
	public int multiply() {
		String n1 = text1.getText();
		String n2 = text2.getText();
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int mulNum = num1 * num2;
		System.out.println(mulNum);
		return mulNum;
	}
	public int divide() {
		String n1 = text1.getText();
		String n2 = text2.getText();
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int divNum = num1/num2;
		System.out.println(divNum);
		return divNum;
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton b1 = new JButton("add");
	JButton b2 = new JButton("sub");
	JButton b3 = new JButton("mul");
	JButton b4 = new JButton("div");
		
	public void setup() {
		frame.setVisible(true);
		panel.add(text1);
		panel.add(text2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			add();
		}else if(e.getSource() == b2) {
			subtract();
		}else if(e.getSource() == b3) {
			multiply();
		}else if(e.getSource() == b4) {
			divide();
		}
		
	
	
	
	}
}
