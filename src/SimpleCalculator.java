import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener{
	
	JButton buttona, buttons, buttonx, buttond;
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JLabel label = new JLabel();
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		sc.makeButtons();
		
	}
	
	public void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(325, 200);
		panel.add(text1);
		panel.add(text2);
		
		buttona = new JButton();
		buttons = new JButton();
		buttonx = new JButton();
		buttond = new JButton();
		
		panel.add(buttona);
		panel.add(buttons);
		panel.add(buttonx);
		panel.add(buttond);

		buttona.setText("add");
		buttons.setText("sub");
		buttonx.setText("mul");
		buttond.setText("div");
		
		buttona.addActionListener(this);
		buttons.addActionListener(this);
		buttonx.addActionListener(this);
		buttond.addActionListener(this);
		
		
		panel.add(label);
		
	}
public void actionPerformed(ActionEvent arg0) {
	
	int number = Integer.parseInt(text1.getText());
	int number2 = Integer.parseInt(text2.getText());
	
		if(arg0.getSource() == buttona ){
			
			int total = number + number2;
			label.setText(Integer.toString(total));
			System.out.println( total);
		}
		else if(arg0.getSource() == buttons ){
			
			int total = number - number2;
			label.setText(Integer.toString(total));
			System.out.println( total);
			
		}
		else if(arg0.getSource() == buttonx ){
			
			int total = number * number2;
			label.setText(Integer.toString(total));
			System.out.println( total);
			
		}
		else if(arg0.getSource() == buttond ){
			
			int total = number / number2;
			label.setText(Integer.toString(total));
			System.out.println( total);
			
		}




		
		
		
}
}
