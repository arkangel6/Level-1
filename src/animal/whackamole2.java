package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole2 implements ActionListener{

JButton button, button2;	
int hit = 0;
int number;
JFrame frame = new JFrame();
JPanel panel = new JPanel();

	public static void main(String[] args) {
		whackamole2 mole = new whackamole2();
		int number = new Random().nextInt(24)+1;
		mole.drawButtons(number);
}

	public void drawButtons(int number){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if( i == number){
				button.setText("mole!");
				button2 = button;
			
			}
		}
		
		
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() != button2){
			System.out.println( "u r bad");
			
		}
		
		if(arg0.getSource() == button2){
			frame.dispose();
			for (int i = 0; i < 10; i++) {
			number = new Random().nextInt(24)+1;
			}
			drawButtons(number);
			hit++;
			if(hit==10){
				endGame(hit);
			}
			
		}
		
	}
		
	

	private void endGame(int molesWhacked) {
		JOptionPane.showMessageDialog(null, "you whacked 10 moles- game over");
		
}
}



	
	

