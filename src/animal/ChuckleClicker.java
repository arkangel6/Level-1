package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	private JButton button1, button2;
	
	
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButton();
	}
	public void makeButton(){
		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		frame.setVisible(true);
		frame.add(panel1);
		frame.setSize(600, 400);
		button1 = new JButton();
		button2 = new JButton();
		button1.setText("joke");
		button2.setText("punchline");
		panel1.add(button1);
		panel1.add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "hi");
		if(arg0.getSource() == button1){
			
		}

	}
}
