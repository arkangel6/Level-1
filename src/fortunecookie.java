import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener{
	
	 JButton butt;
	public static void main(String[] args) {
		
		fortunecookie fortune = new fortunecookie();
		fortune.showButton();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		fortune.butt = new JButton();
		frame.add(fortune.butt);
		fortune.butt.addActionListener(fortune);
		
	}

	private void showButton() {
		// TODO Auto-generated method stub
		
		
	}
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(butt)){
			JOptionPane.showMessageDialog(null, "Woohoo");
			int num = new Random().nextInt(5);
			if(num == 1){
				 JOptionPane.showMessageDialog(null, "You will be rich");
			}
			else if(num == 2){
				JOptionPane.showMessageDialog(null, "You will have ");
			
			}
			else if(num == 3){
				JOptionPane.showMessageDialog(null, "u wil be ric");
			
			}
			else if(num == 4){
				JOptionPane.showMessageDialog(null, "u wil be ric");
				
			}
		}
		
		
	}
}


