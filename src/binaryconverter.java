import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryconverter implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JTextField text3 = new JTextField(30);
	private JButton button;
	public static void main(String[] args) {
		binaryconverter bc = new binaryconverter();
		bc.makeButton();
	}
	void makeButton(){
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.add(panel);
		JButton button = new JButton();
		panel.add(text2);
		text2.addActionListener(this);
		panel.add(button);
		button.addActionListener(this);
		panel.add(text);
		text.addActionListener(this);
		panel.add(text3);
	}
	public void actionPerformed(ActionEvent arg0) {
		
		String bits = convert(text2.getText());
		text.setText(bits);
		
	}
 String convert(String text22) {
   	 int asciiValue = Integer.parseInt(text22, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }
	
}
