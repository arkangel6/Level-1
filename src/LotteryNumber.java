import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumber implements ActionListener {
	int number;
	int number2;
	int number3;
	int number4;
	int number5;
	int number6;
	private JButton button;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		LotteryNumber ln = new LotteryNumber();
		ln.makeButton();
		
	}
	public void makeButton(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.add(panel);
		button = new JButton();
		panel.add(button);
		button.setText("click here");
		button.addActionListener(this);
		
		}
	public void actionPerformed(ActionEvent arg0) {
		number = new Random().nextInt(100);
		number2 = new Random().nextInt(100);
		number3 = new Random().nextInt(100);
		number4 = new Random().nextInt(100);
		number5 = new Random().nextInt(100);
		number6 = new Random().nextInt(100);
		
		panel.add(label);
		label.setText("Lottery Ticket"+"\n"+ Integer.toString(number)+" "+Integer.toString(number2)+" "+Integer.toString(number3)+" "+Integer.toString(number4)+" "+Integer.toString(number5)+" "+Integer.toString(number6));
	
			
		}


}
