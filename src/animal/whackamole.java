package animal;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	
	private JButton button1, button2, button3, molee;
	public static void main(String[] args) {
		whackamole mole = new whackamole();
		mole.drawButtons();
	}
	
	int number = new Random().nextInt(2)+1;
	
public void drawButtons(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.setSize(200, 300);
	frame.add(panel);
	button1 = new JButton();
	button2 = new JButton();
	button3 = new JButton();
	molee = new JButton();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(molee);
	
	molee.setText("mole!");
	
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	molee.addActionListener(this);
	
	
}
	
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource() == molee){
		JOptionPane.showMessageDialog(null, "yay!");
	}
	
}
}	

